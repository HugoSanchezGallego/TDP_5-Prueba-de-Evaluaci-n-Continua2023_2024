public class SistemaExternoReal implements SistemaExterno {
    @Override
    public void reservar() {
        System.out.println("Reserva realizada en el sistema externo real");
    }

    @Override
    public void entregarComida() {
        System.out.println("Comida entregada en el sistema externo real");
    }
}