public class RestauranteIndividual implements Restaurante {
    private String nombre;

    public RestauranteIndividual(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void describir() {
        System.out.println("Restaurante individual: " + nombre);
    }
}