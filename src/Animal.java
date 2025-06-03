public abstract class Animal {
    private String nombre;
    private int edad;
    private EstadoAnimal estado;
    private FichaMedica fichaMedica;
    private Duenio duenio;

    public Animal(String nombre, int edad, EstadoAnimal estado, Duenio duenio) {
        this.nombre = nombre;
        this.edad = edad;
        this.estado = estado;
        this.duenio = duenio;
        this.fichaMedica = new FichaMedica(this);
    }

    public boolean estaGrave() {
        return estado == EstadoAnimal.GRAVE;
    }

    public FichaMedica getFichaMedica() {
        return fichaMedica;
    }

    public String toString() {
        return nombre + " (" + edad + " años) - Estado: " + estado + " - Dueño: " + duenio;
    }
}
