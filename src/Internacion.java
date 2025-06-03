import java.util.Date;

public class Internacion {
    private Date fechaIngreso;
    private String motivo;
    private boolean activa;
    private Habitacion habitacion;
    private Veterinario veterinario;
    private Animal animal;

    public Internacion(Date fechaIngreso, String motivo, boolean activa, Habitacion habitacion, Veterinario veterinario, Animal animal) {
        this.fechaIngreso = fechaIngreso;
        this.motivo = motivo;
        this.activa = activa;
        this.habitacion = habitacion;
        this.veterinario = veterinario;
        this.animal = animal;
    }

    public boolean isActiva() {
        return activa;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public String toString() {
        return animal + " - " + motivo + " - " + fechaIngreso + " - " + habitacion;
    }
}
