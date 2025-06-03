public class Habitacion {
    private int numero;
    private String tipo;

    public Habitacion(int numero, String tipo) {
        this.numero = numero;
        this.tipo = tipo;
    }

    public String toString() {
        return "Habitación " + numero + " - " + tipo;
    }
}
