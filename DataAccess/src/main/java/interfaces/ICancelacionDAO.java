/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

import java.util.List;
import models.Cancelacion;

/**
 *
 * @author angelsn
 */
public interface ICancelacionDAO {
    void crearCancelacion(Cancelacion cancelacion);
    List<Cancelacion> getCancelaciones();
//    public void leerCancelacion(int id);
//    public void editarCancelacion(Cancelacion cancelacion);
//    public void eliminarCancelacion(int id);
}
