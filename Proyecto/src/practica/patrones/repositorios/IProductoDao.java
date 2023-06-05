package practica.patrones.repositorios;

import java.util.List;

import practica.patrones.dominio.*;

public interface IProductoDao 
{
    public void insertar(Producto producto);
    public void eliminar(Producto producto);
    public List<Producto> consultarTodos();
}
