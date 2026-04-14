package com.parcialpoo.laura.principal;

import com.parcialpoo.laura.modelo.*;
import com.parcialpoo.laura.controlador.*;
import com.parcialpoo.laura.vista.VentanaPrincipal;

public class Main {
    public static void main(String[] args) {

        Colegio c = new Colegio();

        Profesor p1 = new Profesor("Juan","Cali","123","2000",
                "111","Matematicas",10000,100);

        Estudiante e1 = new Estudiante("Ana","Cali","321","2005","01","Ingenieria");

        c.agregarProfesor(p1);
        c.agregarEstudiante(e1);

        VentanaPrincipal v = new VentanaPrincipal(c);
        v.setVisible(true);
    }
}