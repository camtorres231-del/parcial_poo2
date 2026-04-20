package com.parcialpoo.laura.principal;
// Clase principal de ejecución del sistema

import com.parcialpoo.laura.controlador.Colegio;
import com.parcialpoo.laura.vista.VentanaPrincipal;

public class Main {

    public static void main(String[] args) {

        Colegio c = new Colegio();
        VentanaPrincipal v = new VentanaPrincipal(c);
        v.setVisible(true);
    }
}