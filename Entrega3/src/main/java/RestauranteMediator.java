public class RestauranteMediator implements Mediator {
    @Override
    public void enviar(String mensaje, Colleague colleague) {
        System.out.println("Mensaje enviado a " + colleague.getClass().getSimpleName() + ": " + mensaje);
    }
}