package edu.ilp.Arodriguez.dao;

import edu.ilp.Arodriguez.entity.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IEstudianteDao extends JpaRepository<Estudiante,Long> {
Estudiante finByCodigoEstudiante(String codigo);

    @Query("SELECT e FROM Estudiante e WHERE e.codigoEstudiante = :codigo")
    Estudiante obtenerEstudiantePorParam(@Param("codigo") String codigo);

}
