package edu.ilp.Arodriguez.dao;

import edu.ilp.Arodriguez.entity.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AsignaturaDao extends JpaRepository<AsignaturaDao,Long> {

    //listar asignatura por docente
    @Query("SELECT e FROM Estudiante e WHERE e.codigoEstudiante = :codigo")
    Estudiante buscarProfesorByIdAndCodigo(@Param("codigo") String codigo);
}
