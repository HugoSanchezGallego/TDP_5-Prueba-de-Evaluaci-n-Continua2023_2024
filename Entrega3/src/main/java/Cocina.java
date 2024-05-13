public class Cocina implements Colleague {
    private Mediator mediator;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void enviar(String mensaje) {
        mediator.enviar(mensaje, this);
    }

    @Override
    public void recibir(String mensaje) {
        System.out.println("Cocina recibió: " + mensaje);
    }
}