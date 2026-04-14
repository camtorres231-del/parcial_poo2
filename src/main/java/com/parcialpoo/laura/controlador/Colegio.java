package com.parcialpoo.laura.controlador;

import java.util.*;
import com.parcialpoo.laura.modelo.*;

public class Colegio {
    private List<Profesor> profesores = new ArrayList<>();
    private List<Estudiante> estudiantes = new ArrayList<>();

    public void agregarProfesor(Profesor p) {
        profesores.add(p);
    }

    public void agregarEstudiante(Estudiante e) {
        estudiantes.add(e);
    }

    public void reporteEstudiantes() {
        for (Estudiante e : estudiantes) {
            System.out.println(e.getNombre());
        }
    }

    public void reporteProfesores() {
        profesores.sort((a,b) -> Double.compare(b.calcularSalario(), a.calcularSalario()));

        double totalPrestaciones = 0;

        for (Profesor p : profesores) {
            System.out.println(p.getNombre() + " - Salario: " + p.calcularSalario());
            totalPrestaciones += p.calcularPrestaciones();
        }

        System.out.println("Total prestaciones: " + totalPrestaciones);
    }
}