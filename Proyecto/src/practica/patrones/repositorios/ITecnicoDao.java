package practica.patrones.repositorios;

import java.util.List;

import practica.patrones.dominio.*;

public interface ITecnicoDao 
{
    public void insertar(Tecnico tecnico);
    public void eliminar(Tecnico tecnico);
    public List<Tecnico> consultarTodos();
}
