package practica.patrones.repositorios;

import java.util.List;

import practica.patrones.dominio.Accesorios;


public interface IAccesoriosDao 
{
    public void insertar(Accesorios accesorio);
    public void eliminar(Accesorios accesorio);
    public List<Accesorios> consultarTodos();
}
