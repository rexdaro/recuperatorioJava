import java.util.Date;

public class Consulta {
    private Date fecha;
    private String diagnostico;
    private Tratamiento tratamiento;
    private Veterinario veterinario;

    public Consulta(Date fecha, String diagnostico, Tratamiento tratamiento, Veterinario veterinario) {
        this.fecha = fecha;
        this.diagnostico = diagnostico;
        this.tratamiento = tratamiento;
        this.veterinario = veterinario;
    }

    public Tratamiento getTratamiento() {
        return tratamiento;
    }

    public boolean requiereInternacion() {
        return diagnostico.toLowerCase().contains("internar");
    }

    public String toString() {
        return fecha + " - " + diagnostico + " - " + tratamiento;
    }
}
