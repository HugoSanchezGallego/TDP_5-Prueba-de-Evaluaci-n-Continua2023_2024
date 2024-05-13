import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Demostración del patrón Composite
        GrupoRestaurantes grupoRestaurantes = new GrupoRestaurantes();
        grupoRestaurantes.agregar(new Restaurante("Restaurante 1", "Menu 1"));
        grupoRestaurantes.agregar(new Restaurante("Restaurante 2", "Menu 2"));
        grupoRestaurantes.agregar(new Restaurante("Restaurante 3", "Menu 3"));
        grupoRestaurantes.operacion();

        // Demostración del patrón MVC
        ModeloRestaurante modelo = new ModeloRestaurante();
        VistaRestaurante vista = new VistaRestaurante();
        ControladorRestaurante controlador = new ControladorRestaurante(modelo, vista);

        controlador.setNombre("Restaurante 3");
        controlador.actualizarVista();

        // Agregar los restaurantes a la vista
        for (ComponenteRestaurante componente : grupoRestaurantes.getComponentes()) {
            Restaurante restaurante = (Restaurante) componente;
            vista.agregarRestaurante(restaurante.getNombre());
        }

        // Mostrar el menú del restaurante seleccionado
        vista.getComboBox().addActionListener(e -> {
            JComboBox<String> comboBox = (JComboBox<String>) e.getSource();
            String nombreRestaurante = (String) comboBox.getSelectedItem();

            for (ComponenteRestaurante componente : grupoRestaurantes.getComponentes()) {
                Restaurante restaurante = (Restaurante) componente;
                if (restaurante.getNombre().equals(nombreRestaurante)) {
                    vista.mostrarMenu(restaurante.getMenu());
                    break;
                }
            }
        });
    }
}