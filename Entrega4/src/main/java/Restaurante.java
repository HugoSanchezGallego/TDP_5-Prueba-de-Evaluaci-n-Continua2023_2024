public class Restaurante implements ComponenteRestaurante {
    private String nombre;
    private String menu;

    public Restaurante(String nombre, String menu) {
        this.nombre = nombre;
        this.menu = menu;
    }

    @Override
    public void operacion() {
        System.out.println("Operando el restaurante: " + nombre);
    }

    public String getMenu() {
        return menu;
    }

    public String getNombre() {
        return nombre;
    }
}