import java.util.Date;

public class HistorialPeso {
    private Date fecha;
    private double peso;

    public HistorialPeso(Date fecha, double peso) {
        this.fecha = fecha;
        this.peso = peso;
    }

    public String toString() {
        return fecha + " - " + peso + "kg";
    }
}
