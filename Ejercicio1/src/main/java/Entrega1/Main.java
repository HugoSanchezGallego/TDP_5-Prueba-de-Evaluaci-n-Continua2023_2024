package Entrega1;

public class Main {
    public static void main(String[] args) {
        //Entrega 1
        // Crear la fábrica de restaurantes
        RestauranteFactory restauranteFactory = new RestauranteFactory();

        // Crear diferentes tipos de restaurantes
        Restaurante restauranteRapido = restauranteFactory.crearRestaurante("rapido");
        Restaurante restauranteTematico = restauranteFactory.crearRestaurante("tematico");
        Restaurante restauranteDeLujo = restauranteFactory.crearRestaurante("lujo");

        // Obtener la instancia de la gestión de restaurantes
        GestionRestaurantes gestionRestaurantes = GestionRestaurantes.getInstancia();

        // Agregar los restaurantes a la gestión de restaurantes
        gestionRestaurantes.agregarRestaurante(restauranteRapido);
        gestionRestaurantes.agregarRestaurante(restauranteTematico);
        gestionRestaurantes.agregarRestaurante(restauranteDeLujo);

        // Imprimir la descripción de cada restaurante
        for (Restaurante restaurante : gestionRestaurantes.getRestaurantes()) {
            restaurante.describir();
        }
    }
}