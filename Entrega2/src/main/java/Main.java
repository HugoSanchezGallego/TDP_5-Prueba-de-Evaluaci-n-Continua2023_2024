public class Main {
    public static void main(String[] args) {
        // Crear restaurantes individuales
        Restaurante restaurante1 = new RestauranteIndividual("Restaurante 1");
        Restaurante restaurante2 = new RestauranteIndividual("Restaurante 2");

        // Crear un grupo de restaurantes y agregar los restaurantes individuales
        GrupoRestaurantes grupoRestaurantes = new GrupoRestaurantes();
        grupoRestaurantes.agregarRestaurante(restaurante1);
        grupoRestaurantes.agregarRestaurante(restaurante2);

        // Crear un sistema externo real y un adaptador para él
        SistemaExterno sistemaExternoReal = new SistemaExternoReal();
        SistemaExterno sistemaExternoAdapter = new SistemaExternoAdapter(sistemaExternoReal);

        // Usar el sistema externo para reservar y entregar comida
        sistemaExternoAdapter.reservar();
        sistemaExternoAdapter.entregarComida();

        // Crear un cliente y un menú
        Cliente cliente = new Cliente("Cliente 1");
        Menu menu = new Menu();

        // Suscribir al cliente al menú
        menu.suscribir(cliente);

        // Notificar a los observadores del menú
        menu.notificar("Nuevo plato en el menú!");

        // Describir los restaurantes
        grupoRestaurantes.describir();
    }
}