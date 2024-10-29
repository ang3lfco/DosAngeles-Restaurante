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
@Table(name="cancelaciones")
public class Cancelacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @JoinColumn(name="reservacion_id")
    private Reservacion reservacion;
    @Column(name="fechaCancelacion")
    private LocalDateTime fechaCancelacion;
    @Column(name="multa")
    private double multa;

    public Cancelacion() {
    }

    public Cancelacion(Reservacion reservacion, LocalDateTime fechaCancelacion, double multa) {
        this.reservacion = reservacion;
        this.fechaCancelacion = fechaCancelacion;
        this.multa = multa;
    }

    public Cancelacion(Long id, Reservacion reservacion, LocalDateTime fechaCancelacion, double multa) {
        this.id = id;
        this.reservacion = reservacion;
        this.fechaCancelacion = fechaCancelacion;
        this.multa = multa;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Reservacion getReservacion() {
        return reservacion;
    }

    public void setReservacion(Reservacion reservacion) {
        this.reservacion = reservacion;
    }

    public LocalDateTime getFechaCancelacion() {
        return fechaCancelacion;
    }

    public void setFechaCancelacion(LocalDateTime fechaCancelacion) {
        this.fechaCancelacion = fechaCancelacion;
    }

    public double getMulta() {
        return multa;
    }

    public void setMulta(double multa) {
        this.multa = multa;
    }

    @Override
    public int hashCode() {
        int hash = 5;
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
        final Cancelacion other = (Cancelacion) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Cancelacion{" + "id=" + id + ", reservacion=" + reservacion + ", fechaCancelacion=" + fechaCancelacion + ", multa=" + multa + '}';
    }
}
