public class Perro extends Animal {
    private String raza;

    public Perro(String nombre, int edad, EstadoAnimal estado, Duenio duenio, String raza) {
        super(nombre, edad, estado, duenio);
        this.raza = raza;
    }

    public String toString() {
        return super.toString() + " - Raza: " + raza;
    }
}
