package test;

public class Motor {
    int numeroCilindros;
    String tipo;
    int registro;

    public void cambiarRegistro(int nuevoRegistro) {
        this.registro = nuevoRegistro;
    }

    public void asignarTipo(String nuevoTipo) {
        if (nuevoTipo.equalsIgnoreCase("electrico") || nuevoTipo.equalsIgnoreCase("gasolina")) {
            this.tipo = nuevoTipo;
        } else {
            System.out.println("Tipo no válido. El tipo solo puede ser eléctrico o gasolina.");
        }
    }
}
