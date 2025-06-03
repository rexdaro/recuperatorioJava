import java.util.List;

public class Tratamiento {
    private String descripcion;
    private EstadoTratamiento estado;
    private List<Medicamento> medicamentos;

    public Tratamiento(String descripcion, EstadoTratamiento estado, List<Medicamento> medicamentos) {
        this.descripcion = descripcion;
        this.estado = estado;
        this.medicamentos = medicamentos;
    }

    public EstadoTratamiento getEstado() {
        return estado;
    }

    public String toString() {
        return descripcion + " - " + estado + " - Medicamentos: " + medicamentos;
    }
}
