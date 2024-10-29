/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import java.time.LocalDateTime;
import java.util.List;
import models.Cliente;
import models.Mesa;
import models.Reservacion;

/**
 *
 * @author martinez
 */
public interface IReservacionService {
    void crearReservacion(Cliente cliente, Mesa mesa, LocalDateTime fechaHora, int numeroPersonas, double costoReservacion);
    List<Reservacion> obtenerReservaciones();
}
