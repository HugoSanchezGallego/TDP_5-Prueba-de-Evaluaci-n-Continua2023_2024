public class SistemaExternoAdapter implements SistemaExterno {
    private SistemaExterno sistemaExterno;

    public SistemaExternoAdapter(SistemaExterno sistemaExterno) {
        this.sistemaExterno = sistemaExterno;
    }

    @Override
    public void reservar() {
        sistemaExterno.reservar();
    }

    @Override
    public void entregarComida() {
        sistemaExterno.entregarComida();
    }
}