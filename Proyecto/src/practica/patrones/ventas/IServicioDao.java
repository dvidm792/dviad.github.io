package practica.patrones.ventas;

import java.util.List;

import practica.patrones.dominio.*;

public interface IServicioDao 
{
    public void insertar(Servicio servicio);
    public List<Servicio> consultarTodos();
}
