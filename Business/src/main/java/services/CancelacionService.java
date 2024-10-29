/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import dao.CancelacionDAO;
import interfaces.ICancelacionDAO;
import interfaces.ICancelacionService;
import java.time.LocalDateTime;
import java.util.List;
import models.Cancelacion;
import models.Reservacion;

/**
 *
 * @author angelsn
 */
public class CancelacionService implements ICancelacionService{
    private final ICancelacionDAO cancelacionDAO;
    
    public CancelacionService(){
        this.cancelacionDAO = new CancelacionDAO();
    }
    
    @Override
    public void crearCancelacion(Reservacion reservacion, LocalDateTime fechaCancelacion, double multa){
        Cancelacion cancelacion = new Cancelacion(reservacion, fechaCancelacion, multa);
        cancelacionDAO.crearCancelacion(cancelacion);
    }
    
    public List<Cancelacion> getCancelaciones(){
        return cancelacionDAO.getCancelaciones();
    }
}
