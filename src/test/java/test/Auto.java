package test;

import java.util.ArrayList;

public class Auto {
    String modelo;
    int precio;
    ArrayList<Asiento> asientos; 
    String marca;
    Motor motor;
    int registro;
    static int cantidadCreados;

    public int cantidadAsientos() {
        int cantidad = 0;
        for (Asiento asiento : asientos) {
            if (asiento != null) {
                cantidad++;
            }
        }
        return cantidad;
    }


    public String verificarIntegridad() {
        if (this.registro != motor.registro) {
            return "Las piezas no son originales";
        }
        for (Asiento asiento : asientos) {
            if (asiento != null && asiento.registro != this.registro) {
                return "Las piezas no son originales";
            }
        }
        return "Auto original";
    }
}
