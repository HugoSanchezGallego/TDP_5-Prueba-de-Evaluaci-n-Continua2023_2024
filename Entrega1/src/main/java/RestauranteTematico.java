public class RestauranteTematico implements Restaurante {
    private EstrategiaServicio estrategiaServicio;

    @Override
    public void describir() {
        System.out.println("Restaurante temático");
    }

    @Override
    public void setEstrategiaServicio(EstrategiaServicio estrategiaServicio) {
        this.estrategiaServicio = estrategiaServicio;
    }
}