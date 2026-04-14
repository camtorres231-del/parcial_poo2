package com.parcialpoo.laura.test;

import com.parcialpoo.laura.controlador.Colegio;
import com.parcialpoo.laura.modelo.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ColegioTest {

    @Test
    public void testAgregarDatos() {

        Colegio c = new Colegio();

        Profesor p = new Profesor("Juan","Cali","123","2000",
                "111","Matematicas",10000,100);

        Estudiante e = new Estudiante("Ana","Cali","321","2005","01","Ing");

        c.agregarProfesor(p);
        c.agregarEstudiante(e);

        assertNotNull(c);
    }
}