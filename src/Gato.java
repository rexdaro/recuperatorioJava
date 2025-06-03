public class Gato extends Animal {
    private String pelaje;

    public Gato(String nombre, int edad, EstadoAnimal estado, Duenio duenio, String pelaje) {
        super(nombre, edad, estado, duenio);
        this.pelaje = pelaje;
    }

    public String toString() {
        return super.toString() + " - Pelaje: " + pelaje;
    }
}
