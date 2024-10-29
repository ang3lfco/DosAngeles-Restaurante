package GeneradorPDF;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import javax.swing.JFileChooser;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class GeneradorPDF {

    private static final float[] COLUMN_WIDTHS = {390, 60, 90}; // Anchos de las columnas

    private Object[][] datos1;
    private String[] encabezado1;
    private Object[][] datos2;
    private String[] encabezado2;

    public GeneradorPDF(Object[][] datos1, String[] encabezado1, Object[][] datos2, String[] encabezado2) {
        this.datos1 = datos1;
        this.encabezado1 = encabezado1;
        this.datos2 = datos2;
        this.encabezado2 = encabezado2;
    }

    public void guardarPDF() {
        Document document = new Document();
        try {
            // Crear el archivo PDF
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Guardar PDF");
            LocalDateTime now = LocalDateTime.now();
            String hoy = String.format("%02d-%02d-%04d-%02d-%02d",
                    now.getDayOfMonth(),
                    now.getMonthValue(),
                    now.getYear(),
                    now.getHour(),
                    now.getMinute()
            );
            fileChooser.setSelectedFile(new File("Reporte-DosAngeles-Restaurante" + hoy + ".pdf"));

            int userSelection = fileChooser.showSaveDialog(null);
            if (userSelection == JFileChooser.APPROVE_OPTION) {
                File fileToSave = fileChooser.getSelectedFile();
                PdfWriter.getInstance(document, new FileOutputStream(fileToSave));
                document.open();

                // Agregar encabezado "Dos Ángeles Restaurante"
                Paragraph header = new Paragraph("Dos Ángeles Restaurante", FontFactory.getFont(FontFactory.HELVETICA_BOLD, 16));
                header.setAlignment(Element.ALIGN_CENTER);
                document.add(header);

                // Agregar título del documento
                Paragraph title = new Paragraph("Reporte Generado: " + hoy, FontFactory.getFont(FontFactory.HELVETICA_BOLD, 14));
                title.setAlignment(Element.ALIGN_CENTER);
                document.add(title);

                // Espacio entre título y tablas
                Paragraph nline = new Paragraph("  ", FontFactory.getFont(FontFactory.HELVETICA, 10));
                document.add(nline);

                // Agregar primera tabla
                Paragraph subtitle1 = new Paragraph("Tabla 1: Reservaciones", FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12));
                subtitle1.setAlignment(Element.ALIGN_LEFT);
                document.add(subtitle1);
                document.add(nline); // Espacio entre subtítulo y tabla
                PdfPTable tabla1 = crearTabla(datos1, encabezado1);
                document.add(tabla1);

                // Espacio entre tablas
                document.add(nline);

                // Agregar segunda tabla
                Paragraph subtitle2 = new Paragraph("Tabla 2: Cancelaciones", FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12));
                subtitle2.setAlignment(Element.ALIGN_LEFT);
                document.add(subtitle2);
                document.add(nline); // Espacio entre subtítulo y tabla
                PdfPTable tabla2 = crearTabla(datos2, encabezado2);
                document.add(tabla2);

                // Cerrar el documento
                document.close();
                System.out.println("PDF guardado con éxito en: " + fileToSave.getAbsolutePath());

                // Abrir el archivo PDF generado automáticamente
                if (Desktop.isDesktopSupported()) {
                    Desktop desktop = Desktop.getDesktop();
                    if (fileToSave.exists()) {
                        desktop.open(fileToSave);
                    }
                } else {
                    System.out.println("El sistema no soporta la funcionalidad de abrir archivos automáticamente.");
                }
            } else {
                System.out.println("Guardado cancelado por el usuario.");
            }
        } catch (DocumentException | IOException e) {
            e.printStackTrace();
        }
    }

    private PdfPTable crearTabla(Object[][] data, String[] columns) throws DocumentException {
        PdfPTable table = new PdfPTable(COLUMN_WIDTHS.length);
        table.setWidths(COLUMN_WIDTHS);

        // Agregar encabezados
        for (String column : columns) {
            PdfPCell cell = new PdfPCell(new Phrase(column, FontFactory.getFont(FontFactory.HELVETICA_BOLD, 8)));
            cell.setBackgroundColor(BaseColor.LIGHT_GRAY);
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(cell);
        }

        // Agregar datos
        for (Object[] row : data) {
            for (Object cell : row) {
                PdfPCell pdfCell = new PdfPCell(new Phrase(cell.toString(), FontFactory.getFont(FontFactory.HELVETICA, 8)));
                pdfCell.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(pdfCell);
            }
        }

        return table;
    }
}

