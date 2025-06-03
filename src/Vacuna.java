import java.util.Date;

public class Vacuna {
    private String nombre;
    private Date fechaAplicacion;

    public Vacuna(String nombre, Date fechaAplicacion) {
        this.nombre = nombre;
        this.fechaAplicacion = fechaAplicacion;
    }

    public String toString() {
        return nombre + " (" + fechaAplicacion + ")";
    }
}
