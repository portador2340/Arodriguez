package edu.ilp.Arodriguez.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="direccion")
public class Direccion extends Persona {
    private String calle;
    private String ciudad;
    private String estado;
    private int codigoPostal;
    private String pais;

    public Direccion() {
    }

    public Direccion(String calle, String ciudad, String estado, int codigoPostal, String pais) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.estado = estado;
        this.codigoPostal = codigoPostal;
        this.pais = pais;
    }

    public Direccion(Long idpersona, String calle, String ciudad, String estado, int codigoPostal, String pais) {
        super(idpersona);
        this.calle = calle;
        this.ciudad = ciudad;
        this.estado = estado;
        this.codigoPostal = codigoPostal;
        this.pais = pais;
    }

    public Direccion(Long idpersona, String nombre, String telefono, String email, String calle, String ciudad, String estado, int codigoPostal, String pais) {
        super(idpersona, nombre, telefono, email);
        this.calle = calle;
        this.ciudad = ciudad;
        this.estado = estado;
        this.codigoPostal = codigoPostal;
        this.pais = pais;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
