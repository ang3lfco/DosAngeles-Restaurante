/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

import java.util.List;
import models.Mesa;

/**
 *
 * @author angelsn
 */
public interface IMesaService {
    void crearMesa(String tipo, String ubicacion, int capacidad, String codigoMesa);
    List<Mesa> getMesas();
}
