import java.util.ArrayList;
import java.util.List;

public class Veterinario {
    private String nombre;
    private String matricula;
    private List<Especialidad> especialidades;

    public Veterinario(String nombre, String matricula) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.especialidades = new ArrayList<>();
    }

    public void agregarEspecialidad(String nombreEspecialidad) {
        for (Especialidad e : especialidades) {
            if (e.getNombre().equalsIgnoreCase(nombreEspecialidad)) {
                return;
            }
        }
        especialidades.add(new Especialidad(nombreEspecialidad));
    }

    public void mostrarInternacionesActivas(List<Internacion> internaciones) {
        for (Internacion i : internaciones) {
            if (i.isActiva() && i.getVeterinario().equals(this)) {
                System.out.println(i);
            }
        }
    }

    public String toString() {
        return nombre + " - " + matricula + " - Especialidades: " + especialidades;
    }
}
