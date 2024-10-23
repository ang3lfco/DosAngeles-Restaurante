/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import java.time.LocalDateTime;

/**
 *
 * @author angelsn
 */
public class ReservacionDTO {
    private Long mesaId;
    private LocalDateTime fechaHora;
    private int numeroPersonas;
    private double costoReservacion;

    public ReservacionDTO(Long mesaId, LocalDateTime fechaHora, int numeroPersonas, double costoReservacion) {
        this.mesaId = mesaId;
        this.fechaHora = fechaHora;
        this.numeroPersonas = numeroPersonas;
        this.costoReservacion = costoReservacion;
    }

    public ReservacionDTO(LocalDateTime fechaHora, int numeroPersonas, double costoReservacion) {
        this.fechaHora = fechaHora;
        this.numeroPersonas = numeroPersonas;
        this.costoReservacion = costoReservacion;
    }

    public ReservacionDTO() {
    }

    public Long getMesaId() {
        return mesaId;
    }

    public void setMesaId(Long mesaId) {
        this.mesaId = mesaId;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public int getNumeroPersonas() {
        return numeroPersonas;
    }

    public void setNumeroPersonas(int numeroPersonas) {
        this.numeroPersonas = numeroPersonas;
    }

    public double getCostoReservacion() {
        return costoReservacion;
    }

    public void setCostoReservacion(double costoReservacion) {
        this.costoReservacion = costoReservacion;
    }

    @Override
    public String toString() {
        return "ReservacionDTO{" + "mesaId=" + mesaId + ", fechaHora=" + fechaHora + ", numeroPersonas=" + numeroPersonas + ", costoReservacion=" + costoReservacion + '}';
    }
    
}
