package com.parcialpoo.laura.modelo;
// Clase Profesor con herencia de Persona

public class Profesor extends Persona {

    private String cedula;
    private String area;
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

    @Override
public String mostrarDatos() {
    double salarioBase = salarioHora * horasMes;
    double salarioTotal = calcularSalario();
    double prestaciones = calcularPrestaciones();

    return "Nombre: " + getNombre() +
           "\nDirección: " + getDireccion() +
           "\nTeléfono: " + getTelefono() +
           "\nFecha Nacimiento: " + getFechaNacimiento() +
           "\nCédula: " + cedula +
           "\nÁrea: " + area +
           "\nSalario por hora: " + salarioHora +
           "\nHoras del mes: " + horasMes +
           "\nSalario base: " + salarioBase +
           "\nSalario total (con 30%): " + salarioTotal +
           "\nPrestaciones (19%): " + prestaciones +
           "\n----------------------";
}

    public double calcularSalario() {
        double base = salarioHora * horasMes;
        return base + (base * 0.30);
        // Cálculo de salario con 30% adicional por preparación
    }
    
    public double calcularSalario(int horasExtra) {
    return calcularSalario() + (horasExtra * salarioHora);
    // Aplicación de polimorfismo (sobrescritura y sobrecarga)
}

    public double calcularPrestaciones() {
        return calcularSalario() * 0.19;
        // Cálculo de prestaciones sociales (19%)
    }
    
    public String getCedula() {
        return cedula;
    }

    
}