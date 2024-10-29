
package GeneradorPDF;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;

/**
 *
 * @author angelsn
 */
public class GeneradorPDF {
    
    private static final float[] COLUMN_WIDTHS = {390, 60, 90}; // Anchos de las columnas
    private static final float INIT_X = 50;
    private static final float INIT_Y_OFFSET = 50;
    
    private Object[][] datos1; 
    private String[] encabezado1;
    private Object[][] datos2;
    private String[] encabezado2;
    
    public GeneradorPDF(Object[][] datos1, String[] encabezado1, Object[][] datos2, String[] encabezado2){
        this.datos1=datos1;
        this.encabezado1=encabezado1;
        this.datos2=datos2;
        this.encabezado2=encabezado2;
    }
    
    public void guardarPDF(){
        
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
