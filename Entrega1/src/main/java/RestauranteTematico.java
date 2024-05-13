/**
 * Clase RestauranteTematico que implementa la interfaz Restaurante.
 * Esta clase representa un restaurante temático en el sistema.
 */
public class RestauranteTematico implements Restaurante {
    // Estrategia de servicio que se utilizará en el restaurante temático
    private EstrategiaServicio estrategiaServicio;

    /**
     * Método que describe el restaurante.
     * En este caso, simplemente imprime "Restaurante temático" en la consola.
     */
    @Override
    public void describir() {
        System.out.println("Restaurante temático");
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