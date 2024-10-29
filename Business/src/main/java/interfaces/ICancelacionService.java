/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

import java.time.LocalDateTime;
import models.Reservacion;

/**
 *
 * @author angelsn
 */
public interface ICancelacionService {
    void crearCancelacion(Reservacion reservacion, LocalDateTime fechaCancelacion, double multa);
}
