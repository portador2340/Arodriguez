package edu.ilp.Arodriguez.service;

import edu.ilp.Arodriguez.entity.Estudiante;

public interface IAsignaturaService {
    //listar asignatura por docente
    Estudiante buscarEstudianeByIdAndCodigo(String codigo);
}
