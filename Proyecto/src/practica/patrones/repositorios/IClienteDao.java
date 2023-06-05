package practica.patrones.repositorios;

import java.util.List;

import practica.patrones.dominio.Cliente;

public interface IClienteDao 
{
    public void insertar(Cliente cliente);
    public void eliminar(Cliente cliente);
    public List<Cliente> consultarTodos();
    
}

