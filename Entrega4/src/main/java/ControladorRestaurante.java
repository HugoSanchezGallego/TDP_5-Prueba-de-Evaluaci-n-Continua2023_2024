public class ControladorRestaurante {
    private ModeloRestaurante modelo;
    private VistaRestaurante vista;

    public ControladorRestaurante(ModeloRestaurante modelo, VistaRestaurante vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void setNombre(String nombre) {
        modelo.setNombre(nombre);
    }

    public String getNombre() {
        return modelo.getNombre();
    }

    public void actualizarVista() {
        vista.mostrarNombre(modelo.getNombre());
    }
}