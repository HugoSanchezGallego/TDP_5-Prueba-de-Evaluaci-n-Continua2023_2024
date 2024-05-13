
import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<Observer> observers = new ArrayList<>();

    public void suscribir(Observer observer) {
        observers.add(observer);
    }

    public void desuscribir(Observer observer) {
        observers.remove(observer);
    }

    public void notificar(String mensaje) {
        for (Observer observer : observers) {
            observer.actualizar(mensaje);
        }
    }
}