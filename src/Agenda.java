import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private Veterinario veterinario;
    private List<Turno> turnos;

    public Agenda(Veterinario veterinario) {
        this.veterinario = veterinario;
        this.turnos = new ArrayList<>();
    }

    public void agregarTurno(Turno turno) {
        turnos.add(turno);
    }

    public String toString() {
        return "Agenda de " + veterinario + " - Turnos: " + turnos;
    }
}
