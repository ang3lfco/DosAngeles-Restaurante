package services;

import dao.ReservacionDAO;
import dto.ReservacionDTO;
import models.Cliente;
import models.Mesa;
import models.Reservacion;
import java.time.LocalDateTime;

public class ReservacionService {

    private ReservacionDAO reservacionDAO;

    public ReservacionService() {
        this.reservacionDAO = new ReservacionDAO();
    }

    public void crearReservacion(ReservacionDTO reservacionDTO) {

        Cliente cliente = new Cliente();
        cliente.setId(reservacionDTO.getClienteId());

        Mesa mesa = new Mesa();
        mesa.setId(reservacionDTO.getMesaId());

        Reservacion reservacion = new Reservacion();
        reservacion.setCliente(cliente);
        reservacion.setMesa(mesa);
        reservacion.setFechaHora(reservacionDTO.getFechaHora());
        reservacion.setNumeroPersonas(reservacionDTO.getNumeroPersonas());
        reservacion.setCostoReservacion(reservacionDTO.getCostoReservacion());

        reservacionDAO.crearReservacion(reservacion);
    }
    
}
