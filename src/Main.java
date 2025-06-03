import java.util.*;

public class Main {
    public static void main(String[] args) {
        Duenio d1 = new Duenio("Gabi", "Calle Carola lorenzini 150", "261158930");
        Duenio d2 = new Duenio("Manu", "Calle Feliciani 135", "2617047380");

        Animal perro = new Perro("Teemo", 4, EstadoAnimal.SANO, d1, "Caniche");
        Animal gato = new Gato("Juansito", 1, EstadoAnimal.GRAVE, d2, "Corto");

        perro.getFichaMedica().agregarPeso(new HistorialPeso(new Date(), 20.5));
        gato.getFichaMedica().agregarPeso(new HistorialPeso(new Date(), 4.3));

        Veterinario vet = new Veterinario("Dr. Juan", "M123");
        vet.agregarEspecialidad("Cirugía");
        vet.agregarEspecialidad("Traumatología");

        Tratamiento t1 = new Tratamiento("Tratamiento A", EstadoTratamiento.ACTIVO, Arrays.asList(new Medicamento("Med1", "1xDía"), new Medicamento("Med2", "2xDía")));
        Tratamiento t2 = new Tratamiento("Tratamiento B", EstadoTratamiento.FINALIZADO, Arrays.asList(new Medicamento("Med3", "1xDía"), new Medicamento("Med4", "3xDía")));

        perro.getFichaMedica().agregarConsulta(new Consulta(new Date(), "Control", t1, vet));
        gato.getFichaMedica().agregarConsulta(new Consulta(new Date(), "Dolor - internar", t2, vet));

        Agenda agenda = new Agenda(vet);
        Turno turno1 = new Turno(new Date(), "10:00", vet, perro, true);
        Turno turno2 = new Turno(new Date(), "11:00", vet, gato, true);
        agenda.agregarTurno(turno1);
        agenda.agregarTurno(turno2);

        Habitacion hab = new Habitacion(1, "Aislada");
        Internacion internacion = new Internacion(new Date(), "Observación", true, hab, vet, gato);
        List<Internacion> internaciones = Arrays.asList(internacion);

        vet.mostrarInternacionesActivas(internaciones);
    }
}
