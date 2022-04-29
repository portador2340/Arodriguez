package edu.ilp.Arodriguez.dao;

import edu.ilp.Arodriguez.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPersonaDao extends JpaRepository<Persona,Long> {
}
