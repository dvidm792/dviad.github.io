package practica.patrones.repositorios;

import java.util.List;

import practica.patrones.dominio.*;

public interface IServicioDao 
{
    public void insertar(Servicio servicio);
    public void eliminar(Servicio servicio);
    public List<Servicio> consultarTodos();

    
}
