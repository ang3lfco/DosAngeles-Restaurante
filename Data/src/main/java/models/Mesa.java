/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author martinez
 */
@Entity
@Table(name="mesas")
public class Mesa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name="tipo")
    private String tipo;
    @Column(name="ubicacion")
    private String ubicacion;
    @Column(name="capacidad")
    private int capacidad;
    @Column(name="codigoMesa")
    private String codigoMesa;

    public Mesa() {
    }

    public Mesa(String tipo, String ubicacion, int capacidad, String codigoMesa) {
        this.tipo = tipo;
        this.ubicacion = ubicacion;
        this.capacidad = capacidad;
        this.codigoMesa = codigoMesa;
    }

    public Mesa(Long id, String tipo, String ubicacion, int capacidad, String codigoMesa) {
        this.id = id;
        this.tipo = tipo;
        this.ubicacion = ubicacion;
        this.capacidad = capacidad;
        this.codigoMesa = codigoMesa;
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
        if (!(object instanceof Mesa)) {
            return false;
        }
        Mesa other = (Mesa) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.Mesa[ id=" + id + " ]";
    }
    
}
