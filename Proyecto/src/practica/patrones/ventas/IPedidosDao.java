package practica.patrones.ventas;

import java.util.List;

import practica.patrones.dominio.*;

public interface IPedidosDao 
{
    public void insertar(Pedidos pedido);
    public List<Pedidos> consultarTodos();
    
}
