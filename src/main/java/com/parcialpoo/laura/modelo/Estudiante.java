package com.parcialpoo.laura.modelo;

public class Estudiante extends Persona {
    private String codigo, programa;

    public Estudiante(String nombre, String direccion, String telefono, String fechaNacimiento,
                      String codigo, String programa) {
        super(nombre, direccion, telefono, fechaNacimiento);
        this.codigo = codigo;
        this.programa = programa;
    }

    public String getCodigo() { return codigo; }
}