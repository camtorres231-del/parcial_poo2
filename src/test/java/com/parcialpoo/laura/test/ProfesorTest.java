package com.parcialpoo.laura.test;
// Pruebas de integración para Profesor
import com.parcialpoo.laura.modelo.Profesor;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProfesorTest {

    @Test
    public void testCalcularSalario() {
        Profesor p = new Profesor("Juan","Cali","123","2000",
                "111","Matematicas",10000,100);

        double esperado = 1300000.0;
        assertEquals(esperado, p.calcularSalario());
    }

    @Test
    public void testPrestaciones() {
        Profesor p = new Profesor("Juan","Cali","123","2000",
                "111","Matematicas",10000,100);

        double esperado = 247000.0;
        assertEquals(esperado, p.calcularPrestaciones());
    }
}