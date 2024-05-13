package Entrega1;

public class RestauranteDeLujo implements Restaurante {
    private EstrategiaServicio estrategiaServicio;

    @Override
    public void describir() {
        System.out.println("Restaurante de lujo");
    }

    @Override
    public void setEstrategiaServicio(EstrategiaServicio estrategiaServicio) {
        this.estrategiaServicio = estrategiaServicio;
    }
}