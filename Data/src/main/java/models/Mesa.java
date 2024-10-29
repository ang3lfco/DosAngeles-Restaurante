/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.io.Serializable;
import java.util.Objects;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getCodigoMesa() {
        return codigoMesa;
    }

    public void setCodigoMesa(String codigoMesa) {
        this.codigoMesa = codigoMesa;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.id);
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
        final Mesa other = (Mesa) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Mesa{" + "id=" + id + ", tipo=" + tipo + ", ubicacion=" + ubicacion + ", capacidad=" + capacidad + ", codigoMesa=" + codigoMesa + '}';
    }
}