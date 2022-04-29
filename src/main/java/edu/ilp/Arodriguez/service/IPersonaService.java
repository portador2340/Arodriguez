package edu.ilp.Arodriguez.service;

import edu.ilp.Arodriguez.entity.Estudiante;
import edu.ilp.Arodriguez.entity.Persona;

import java.util.List;

public interface IPersonaService {
    //listar persona
    List<Persona> listarPersona();
//obtener persona por codigo
    Estudiante buscarEstudianeByIdAndCodigo(String codigo);
}
