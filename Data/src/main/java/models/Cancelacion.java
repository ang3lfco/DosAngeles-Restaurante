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
@Table(name="cancelaciones")
public class Cancelacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cancelacion)) {
            return false;
        }
        Cancelacion other = (Cancelacion) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.Cancelacion[ id=" + id + " ]";
    }
    
}
