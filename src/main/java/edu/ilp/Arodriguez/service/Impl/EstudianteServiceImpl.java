package edu.ilp.Arodriguez.service.Impl;

import edu.ilp.Arodriguez.dao.IEstudianteDao;
import edu.ilp.Arodriguez.entity.Estudiante;
import edu.ilp.Arodriguez.service.IEstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstudianteServiceImpl  implements IEstudianteService {

    @Autowired
    private IEstudianteDao estudianteDao;
    public Estudiante obtenerEstudiantePorCodigo(String codigo){

        return this.estudianteDao.obtenerEstudiantePorParam(codigo);
    }
}
