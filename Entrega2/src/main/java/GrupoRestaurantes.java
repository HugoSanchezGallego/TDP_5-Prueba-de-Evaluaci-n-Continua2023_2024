import java.util.ArrayList;
import java.util.List;

public class GrupoRestaurantes implements Restaurante {
    private List<Restaurante> restaurantes = new ArrayList<>();

    public void agregarRestaurante(Restaurante restaurante) {
        restaurantes.add(restaurante);
    }

    public void eliminarRestaurante(Restaurante restaurante) {
        restaurantes.remove(restaurante);
    }

    @Override
    public void describir() {
        for (Restaurante restaurante : restaurantes) {
            restaurante.describir();
        }
    }
}