package com.ExamenSemana9DDTB.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ExamenSemana9DDTB.Alumno.Alumno;

@RestController
@RequestMapping("/api/alumno")
public class Controller {
    
    @GetMapping("/uno")
    public Alumno getAlumno() {
        Alumno alumno = new Alumno();
        alumno.setId(1L);
        alumno.setNombre("Denny David");
        alumno.setApellido("Tenorio Bautista");
        return alumno;
    }
}

