import java.util.ArrayList;
import java.util.List;

public class GrupoRestaurantes implements ComponenteRestaurante {
    private List<ComponenteRestaurante> componentes = new ArrayList<>();

    public void agregar(ComponenteRestaurante componente) {
        componentes.add(componente);
    }

    public void eliminar(ComponenteRestaurante componente) {
        componentes.remove(componente);
    }

    @Override
    public void operacion() {
        for (ComponenteRestaurante componente : componentes) {
            componente.operacion();
        }
    }

    public List<ComponenteRestaurante> getComponentes() {
        return componentes;
    }
}