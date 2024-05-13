// Clases de Restaurantes
public class RestauranteRapido implements Restaurante {
    private EstrategiaServicio estrategiaServicio;

    @Override
    public void describir() {
        System.out.println("Restaurante de servicio rápido");
    }

    @Override
    public void setEstrategiaServicio(EstrategiaServicio estrategiaServicio) {
        this.estrategiaServicio = estrategiaServicio;
    }
}
