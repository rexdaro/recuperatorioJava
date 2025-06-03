public class Duenio {
    private String nombre;
    private String direccion;
    private String telefono;

    public Duenio(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String toString() {
        return nombre + " - " + direccion + " - " + telefono;
    }
}
