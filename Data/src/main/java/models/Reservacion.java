/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.io.Serializable;
import java.time.LocalDateTime;
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
    
    @ManyToOne
    @JoinColumn(name="cliente_id")
    private Cliente cliente;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reservacion)) {
            return false;
        }
        Reservacion other = (Reservacion) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.Reservacion[ id=" + id + " ]";
    }
    
}
