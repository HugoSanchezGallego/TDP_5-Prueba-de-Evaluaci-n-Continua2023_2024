public class CancelarCommand implements Command {
    @Override
    public void ejecutar() {
        System.out.println("Reserva cancelada");
    }
}