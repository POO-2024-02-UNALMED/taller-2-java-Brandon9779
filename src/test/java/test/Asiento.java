package test;

public class Asiento {
    String color;
    int precio;
    int registro;

    void cambiarColor(String nuevoColor) {
        if (nuevoColor.equalsIgnoreCase("rojo") || 
            nuevoColor.equalsIgnoreCase("verde") || 
            nuevoColor.equalsIgnoreCase("amarillo") || 
            nuevoColor.equalsIgnoreCase("negro") || 
            nuevoColor.equalsIgnoreCase("blanco")) {
            this.color = nuevoColor;
        } else {
            System.out.println("Color no válido. No se cambió el color.");
        }
    }
}
