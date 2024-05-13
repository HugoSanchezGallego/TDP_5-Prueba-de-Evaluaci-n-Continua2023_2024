public class Main {
    public static void main(String[] args) {
        // Crear instancias de los comandos
        Command reservarCommand = new ReservarCommand();
        Command ordenarCommand = new OrdenarCommand();
        Command cancelarCommand = new CancelarCommand();

        // Ejecutar los comandos
        reservarCommand.ejecutar();
        ordenarCommand.ejecutar();
        cancelarCommand.ejecutar();

        // Crear un mediador y colegas
        Mediator mediator = new RestauranteMediator();
        Colleague cocina = new Cocina();
        Colleague servicioAlCliente = new ServicioAlCliente();
        Colleague entrega = new Entrega();

        // Configurar el mediador para los colegas
        cocina.setMediator(mediator);
        servicioAlCliente.setMediator(mediator);
        entrega.setMediator(mediator);

        // Enviar mensajes entre colegas a través del mediador
        cocina.enviar("Orden recibida");
        servicioAlCliente.enviar("Orden preparada");
        entrega.enviar("Orden entregada");

        // Crear instancias de los estados
        State libreState = new LibreState();
        State reservadaState = new ReservadaState();
        State ocupadaState = new OcupadaState();

        // Manejar los estados
        libreState.manejar();
        reservadaState.manejar();
        ocupadaState.manejar();
    }
}