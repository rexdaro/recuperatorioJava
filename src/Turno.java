import java.util.Date;

public class Turno {
    private Date fecha;
    private String hora;
    private Veterinario veterinario;
    private Animal animal;
    private boolean confirmado;

    public Turno(Date fecha, String hora, Veterinario veterinario, Animal animal, boolean confirmado) {
        this.fecha = fecha;
        this.hora = hora;
        this.veterinario = veterinario;
        this.animal = animal;
        this.confirmado = confirmado;
    }

    public String toString() {
        return fecha + " " + hora + " - " + animal + " - " + confirmado;
    }
}
