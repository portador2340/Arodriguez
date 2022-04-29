package edu.ilp.Arodriguez.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="profesor")
public class Profesor extends Persona{
    private  int salario;


    public Profesor() {
    }

    public Profesor(int salario) {
        this.salario = salario;
    }

    public Profesor(Long idpersona, int salario) {
        super(idpersona);
        this.salario = salario;
    }

    public Profesor(Long idpersona, String nombre, String telefono, String email, int salario) {
        super(idpersona, nombre, telefono, email);
        this.salario = salario;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}
