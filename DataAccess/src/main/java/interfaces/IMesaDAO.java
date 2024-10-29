/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import java.util.List;
import models.Mesa;

/**
 *
 * @author angelsn
 */
public interface IMesaDAO {
    void crearMesa(Mesa mesa);
    List<Mesa> getMesas();
//    public void leerMesa(int id);
//    public void editarMesa(Mesa mesa);
//    public void eliminarMesa(int id);
}
