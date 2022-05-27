package edu.ilp.Arodriguez.service.Impl;

import edu.ilp.Arodriguez.dao.AsignaturaDao;
import edu.ilp.Arodriguez.entity.Asignatura;
import edu.ilp.Arodriguez.service.IAsignaturaService;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AsignaturaServiceImpl implements IAsignaturaService {

    @Autowired
    public AsignaturaDao asignaturaDao;

  @Override
    public List<Asignatura> listarProfesor(Asignatura idPersona){return  this.asignaturaDao.finByAsignatura(idPersona);}
}
