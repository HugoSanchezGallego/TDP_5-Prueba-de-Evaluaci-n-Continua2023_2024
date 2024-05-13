/**
 * Clase GestionRestaurantes que se utiliza para gestionar los restaurantes.
 * Esta clase sigue el patrón de diseño Singleton, lo que significa que solo puede haber una instancia de esta clase.
 */
public class GestionRestaurantes {
    // La única instancia de la clase GestionRestaurantes
    private static GestionRestaurantes instancia;
    // Lista de restaurantes gestionados por esta clase
    private List<Restaurante> restaurantes;

    /**
     * Constructor privado para asegurar que solo se pueda crear una instancia de esta clase a través del método getInstancia.
     */
    private GestionRestaurantes() {
        restaurantes = new ArrayList<>();
    }

    /**
     * Método para obtener la única instancia de la clase GestionRestaurantes.
     * Si la instancia no existe, se crea.
     * @return La única instancia de la clase GestionRestaurantes.
     */
    public static GestionRestaurantes getInstancia() {
        if (instancia == null) {
            instancia = new GestionRestaurantes();
        }
        return instancia;
    }

    /**
     * Método para agregar un restaurante a la lista de restaurantes gestionados.
     * @param restaurante El restaurante que se va a agregar.
     */
    public void agregarRestaurante(Restaurante restaurante) {
        restaurantes.add(restaurante);
    }

    /**
     * Método para obtener la lista de restaurantes gestionados.
     * @return La lista de restaurantes gestionados.
     */
    public List<Restaurante> getRestaurantes() {
        return restaurantes;
    }
}