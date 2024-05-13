/**
 * Clase RestauranteDeLujo que implementa la interfaz Restaurante.
 * Esta clase representa un restaurante de lujo en el sistema.
 */
public class RestauranteDeLujo implements Restaurante {
    // Estrategia de servicio que se utilizará en el restaurante de lujo
    private EstrategiaServicio estrategiaServicio;

    /**
     * Método que describe el restaurante.
     * En este caso, simplemente imprime "Restaurante de lujo" en la consola.
     */
    @Override
    public void describir() {
        System.out.println("Restaurante de lujo");
    }

    /**
     * Método para establecer la estrategia de servicio del restaurante.
     * @param estrategiaServicio La estrategia de servicio que se utilizará en el restaurante.
     */
    @Override
    public void setEstrategiaServicio(EstrategiaServicio estrategiaServicio) {
        this.estrategiaServicio = estrategiaServicio;
    }
}