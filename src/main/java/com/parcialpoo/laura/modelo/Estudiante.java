package com.parcialpoo.laura.modelo;
// Clase Estudiante que hereda de Persona
public class Estudiante extends Persona {

    private String codigo;
    private String programa;

    public Estudiante(String nombre, String direccion, String telefono, String fechaNacimiento,
                      String codigo, String programa) {
        super(nombre, direccion, telefono, fechaNacimiento);
        this.codigo = codigo;
        this.programa = programa;
    }

  @Override
public String mostrarDatos() {
    return "Nombre: " + getNombre() +
           "\nDirección: " + getDireccion() +
           "\nTeléfono: " + getTelefono() +
           "\nFecha Nacimiento: " + getFechaNacimiento() +
           "\nCódigo: " + codigo +
           "\nPrograma: " + programa +
           "\n----------------------";
} 

    public String getCodigo() {
        return codigo;
    }

    private String getEdad() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}