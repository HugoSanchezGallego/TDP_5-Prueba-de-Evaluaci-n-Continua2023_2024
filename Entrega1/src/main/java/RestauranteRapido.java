/**
 * Clase RestauranteRapido que implementa la interfaz Restaurante.
 * Esta clase representa un restaurante de servicio rápido en el sistema.
 */
public class RestauranteRapido implements Restaurante {
    // Estrategia de servicio que se utilizará en el restaurante de servicio rápido
    private EstrategiaServicio estrategiaServicio;

    /**
     * Método que describe el restaurante.
     * En este caso, simplemente imprime "Restaurante de servicio rápido" en la consola.
     */
    @Override
    public void describir() {
        System.out.println("Restaurante de servicio rápido");
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