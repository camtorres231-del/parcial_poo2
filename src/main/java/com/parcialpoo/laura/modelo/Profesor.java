package com.parcialpoo.laura.modelo;

public class Profesor extends Persona {
    private String cedula, area;
    private double salarioHora;
    private int horasMes;

    public Profesor(String nombre, String direccion, String telefono, String fechaNacimiento,
                    String cedula, String area, double salarioHora, int horasMes) {
        super(nombre, direccion, telefono, fechaNacimiento);
        this.cedula = cedula;
        this.area = area;
        this.salarioHora = salarioHora;
        this.horasMes = horasMes;
    }

    public double calcularSalario() {
        double base = salarioHora * horasMes;
        return base + (base * 0.30);
    }

    public double calcularPrestaciones() {
        return calcularSalario() * 0.19;
    }

    public String getCedula() { return cedula; }
}