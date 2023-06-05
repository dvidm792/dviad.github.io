package practica.patrones.repositorios;

import java.util.List;

import practica.patrones.dominio.*;

public interface IEquipoDao 
{
    public void insertar(Equipo equipo);
    public void eliminar(Equipo equipo);
    public List<Equipo> consultarTodos();
    
}
