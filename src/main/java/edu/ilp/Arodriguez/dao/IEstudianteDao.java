package edu.ilp.Arodriguez.dao;

import edu.ilp.Arodriguez.entity.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEstudianteDao extends JpaRepository<Estudiante,Long> {
}
