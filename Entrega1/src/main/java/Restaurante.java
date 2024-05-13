/**
 * Interfaz Restaurante que define los métodos que deben implementar los restaurantes.
 */
public interface Restaurante {
    /**
     * Método para describir el restaurante. La implementación de este método dependerá del tipo de restaurante.
     */
    void describir();

    /**
     * Método para establecer la estrategia de servicio del restaurante.
     * @param estrategiaServicio La estrategia de servicio que se utilizará en el restaurante.
     */
    void setEstrategiaServicio(EstrategiaServicio estrategiaServicio);
}