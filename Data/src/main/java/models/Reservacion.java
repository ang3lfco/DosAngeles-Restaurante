/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;

/**
 *
 * @author martinez
 */
@Entity
@Table(name="reservaciones")
public class Reservacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name="cliente_id")
    private Cliente cliente;
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name="mesa_id")
    private Mesa mesa;
    @Column(name="timestamp")
    private LocalDateTime fechaHora;
    @Column(name="numeroPersonas")
    private int numeroPersonas;
    @Column(name="costoReservacion")
    private double costoReservacion;

    public Reservacion() {
    }

    public Reservacion(Cliente cliente, Mesa mesa, LocalDateTime fechaHora, int numeroPersonas, double costoReservacion) {
        this.cliente = cliente;
        this.mesa = mesa;
        this.fechaHora = fechaHora;
        this.numeroPersonas = numeroPersonas;
        this.costoReservacion = costoReservacion;
    }

    public Reservacion(Long id, Cliente cliente, Mesa mesa, LocalDateTime fechaHora, int numeroPersonas, double costoReservacion) {
        this.id = id;
        this.cliente = cliente;
        this.mesa = mesa;
        this.fechaHora = fechaHora;
        this.numeroPersonas = numeroPersonas;
        this.costoReservacion = costoReservacion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
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
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Reservacion other = (Reservacion) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Reservacion{" + "id=" + id + ", cliente=" + cliente + ", mesa=" + mesa + ", fechaHora=" + fechaHora + ", numeroPersonas=" + numeroPersonas + ", costoReservacion=" + costoReservacion + '}';
    }
}