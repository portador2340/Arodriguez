package edu.ilp.Arodriguez.Controller;

import edu.ilp.Arodriguez.entity.Estudiante;
import edu.ilp.Arodriguez.entity.Persona;
import edu.ilp.Arodriguez.entity.Profesor;
import edu.ilp.Arodriguez.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RequestMapping("/login")
public class Controlador {

    @Autowired
    private IPersonaService personaService;

    @GetMapping("/listarPersona")
    public List<Persona> lsitarPersona(){
        return this.personaService.listarPersona();
    }

    @GetMapping("/listarEstudiantePorCodigo")
    public Estudiante buscarEstudianeByIdAndCodigo(@RequestParam String codigo) {
        return this.personaService.buscarEstudianeByIdAndCodigo(codigo);

    }

    @GetMapping("/listarProfesorPorAsignatura")
    public Profesor listarProfesorByIdAndCodigo(@RequestParam String codigo){
        return  this.personaService.buscarProfesorByIdAndCodigo(codigo);
    }
}
