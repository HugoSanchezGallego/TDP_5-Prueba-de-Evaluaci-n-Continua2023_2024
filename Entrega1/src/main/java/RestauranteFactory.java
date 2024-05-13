/**
 * Clase RestauranteFactory que se utiliza para crear diferentes tipos de restaurantes.
 */
public class RestauranteFactory {
    /**
     * Método para crear un restaurante de un tipo específico.
     * @param tipo El tipo de restaurante que se desea crear. Puede ser "rapido", "tematico" o "lujo".
     * @return Retorna una instancia del tipo de restaurante especificado. Si el tipo no es reconocido, retorna null.
     */
    public Restaurante crearRestaurante(String tipo) {
        switch (tipo) {
            case "rapido":
                return new RestauranteRapido();
            case "tematico":
                return new RestauranteTematico();
            case "lujo":
                return new RestauranteDeLujo();
            default:
                return null;
        }
    }
}