import java.util.ArrayList;
import java.util.List;

public class GestionRestaurantes {
    private static GestionRestaurantes instancia;
    private List<Restaurante> restaurantes;

    private GestionRestaurantes() {
        restaurantes = new ArrayList<>();
    }

    public static GestionRestaurantes getInstancia() {
        if (instancia == null) {
            instancia = new GestionRestaurantes();
        }
        return instancia;
    }

    public void agregarRestaurante(Restaurante restaurante) {
        restaurantes.add(restaurante);
    }

    public List<Restaurante> getRestaurantes() {
        return restaurantes;
    }
}