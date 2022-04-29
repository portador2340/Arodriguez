package edu.ilp.Arodriguez.entity;


import javax.persistence.*;

@Entity
@Table(name="estudiante")
@PrimaryKeyJoinColumn(referencedColumnName = "idpersona")
public class Estudiante extends Persona {
    @Column(name="codigo",length = 10,nullable = false)
    private String codigo;

    @Column(name="calle",length = 20)
    private  String calle;
    //relacion unidireccional
    @ManyToOne(optional = false,cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private  Direccion direccion;

    public Estudiante() {
    }

    public Estudiante(String codigo, String calle, Direccion direccion) {
        this.codigo = codigo;
        this.calle = calle;
        this.direccion = direccion;
    }

    public Estudiante(Long idpersona, String codigo, String calle, Direccion direccion) {
        super(idpersona);
        this.codigo = codigo;
        this.calle = calle;
        this.direccion = direccion;
    }

    public Estudiante(Long idpersona, String nombre, String telefono, String email, String codigo, String calle, Direccion direccion) {
        super(idpersona, nombre, telefono, email);
        this.codigo = codigo;
        this.calle = calle;
        this.direccion = direccion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
}
