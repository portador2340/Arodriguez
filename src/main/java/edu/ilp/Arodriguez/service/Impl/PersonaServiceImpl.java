package edu.ilp.Arodriguez.service.Impl;

import edu.ilp.Arodriguez.dao.IPersonaDao;
import edu.ilp.Arodriguez.entity.Estudiante;
import edu.ilp.Arodriguez.entity.Persona;
import edu.ilp.Arodriguez.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PersonaServiceImpl implements IPersonaService {

    @Autowired
    private IPersonaDao personaDao;
    @Override
    public List<Persona> listarPersona() {
        return this.personaDao.findAll();
    }

    @Override
    public Estudiante buscarEstudianeByIdAndCodigo(String codigo) {
        return null;
    }


}
