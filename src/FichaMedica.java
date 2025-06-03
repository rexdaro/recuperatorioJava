import java.util.ArrayList;
import java.util.List;

public class FichaMedica {
    private Animal animal;
    private List<Consulta> consultas;
    private List<HistorialPeso> historialPeso;
    private List<Vacuna> vacunas;

    public FichaMedica(Animal animal) {
        this.animal = animal;
        this.consultas = new ArrayList<>();
        this.historialPeso = new ArrayList<>();
        this.vacunas = new ArrayList<>();
    }

    public void agregarConsulta(Consulta c) {
        consultas.add(c);
    }

    public void agregarPeso(HistorialPeso hp) {
        historialPeso.add(hp);
    }

    public void agregarVacuna(Vacuna v) {
        vacunas.add(v);
    }

    public List<Tratamiento> getTratamientosActivos() {
        List<Tratamiento> activos = new ArrayList<>();
        for (Consulta c : consultas) {
            Tratamiento t = c.getTratamiento();
            if (t != null && t.getEstado() == EstadoTratamiento.ACTIVO) {
                activos.add(t);
            }
        }
        return activos;
    }

    public String toString() {
        return "Consultas: " + consultas + ", Pesos: " + historialPeso + ", Vacunas: " + vacunas;
    }
}
