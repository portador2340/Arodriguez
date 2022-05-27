package edu.ilp.Arodriguez.entity;

import javax.persistence.*;

@Entity
@Table(name="asignatura")
@PrimaryKeyJoinColumn(referencedColumnName = "idpersona")
public class Asignatura extends Profesor{
    @Column(name="codigo",length = 10,nullable = false)
    private String codigo;

    @Column(name="nombre",length = 50,nullable = false)
    private  String nombre;

    @Column(name="creditos",length = 20,nullable = false)
    private String creditos;

    @ManyToOne(optional = false,cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private  Direccion direccion;

    public Asignatura() {
    }

    public Asignatura(String codigo, String nombre, String creditos, Direccion direccion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos = creditos;
        this.direccion = direccion;
    }

    public Asignatura(int salario, String codigo, String nombre, String creditos, Direccion direccion) {
        super(salario);
        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos = creditos;
        this.direccion = direccion;
    }

    public Asignatura(Long idpersona, int salario, String codigo, String nombre, String creditos, Direccion direccion) {
        super(idpersona, salario);
        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos = creditos;
        this.direccion = direccion;
    }

    public Asignatura(Long idpersona, String nombre, String telefono, String email, int salario, String codigo, String nombre1, String creditos, Direccion direccion) {
        super(idpersona, nombre, telefono, email, salario);
        this.codigo = codigo;
        this.nombre = nombre1;
        this.creditos = creditos;
        this.direccion = direccion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCreditos() {
        return creditos;
    }

    public void setCreditos(String creditos) {
        this.creditos = creditos;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
}
