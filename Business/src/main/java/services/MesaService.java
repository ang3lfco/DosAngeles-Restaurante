/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import dao.MesaDAO;
import interfaces.IMesaDAO;
import interfaces.IMesaService;
import models.Mesa;

/**
 *
 * @author angelsn
 */
public class MesaService implements IMesaService{
    private final IMesaDAO mesaDAO;
    
    public MesaService(){
        this.mesaDAO = new MesaDAO();
    }
    
    @Override
    public void crearMesa(String tipo, String ubicacion, int capacidad, String codigoMesa)
    {
        Mesa mesa = new Mesa(tipo, ubicacion, capacidad, codigoMesa);
        mesaDAO.crearMesa(mesa);
    }
}
