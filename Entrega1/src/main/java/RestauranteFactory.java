public class RestauranteFactory {
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
