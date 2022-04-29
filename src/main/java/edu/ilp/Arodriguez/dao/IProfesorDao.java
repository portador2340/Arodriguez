package edu.ilp.Arodriguez.dao;

import edu.ilp.Arodriguez.entity.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProfesorDao extends JpaRepository<Profesor,Long> {
}
