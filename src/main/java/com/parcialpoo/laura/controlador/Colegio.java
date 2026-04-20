package com.parcialpoo.laura.controlador;
// Gestión de listas de estudiantes y profesores

import java.util.ArrayList;
import java.util.List;
import com.parcialpoo.laura.modelo.Estudiante;
import com.parcialpoo.laura.modelo.Profesor;

public class Colegio {

    private List<Profesor> profesores;
    private List<Estudiante> estudiantes;

    public Colegio() {
        profesores = new ArrayList<>();
        estudiantes = new ArrayList<>();
    }

    public void agregarProfesor(Profesor p) {
        profesores.add(p);
    }

    public void agregarEstudiante(Estudiante e) {
        estudiantes.add(e);
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public List<Profesor> getProfesoresOrdenados() {
        profesores.sort((a, b) -> Double.compare(b.calcularSalario(), a.calcularSalario()));
        return profesores;
        // Ordenamiento de profesores por salario de mayor a menor
    }

    public double getTotalPrestaciones() {
        double total = 0;
        for (Profesor p : profesores) {
            total += p.calcularPrestaciones();
            // Cálculo del total de prestaciones sociales
        }
        return total;
    }
}