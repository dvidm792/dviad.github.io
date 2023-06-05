package practica.patrones.repositorios;

import java.util.ArrayList;
import java.util.List;

import practica.patrones.dominio.Cliente;

public class ClienteListDao  implements IClienteDao
{
    List<Cliente> clientesListas = new ArrayList<>();

    public ClienteListDao()
    {
        clientesListas.add(new Cliente("0914526387", "CARLOS ALBERTO ANDRADE",10, 1));
        clientesListas.add(new Cliente("0834567874", "MARTHA CECILIA AMPUERO",20, 2));
        clientesListas.add(new Cliente("0754527387", "ANDREA SOPHIA SALAS",30, 3));
    }


    @Override
    public void insertar(Cliente cliente) 
    {
        clientesListas.add(cliente);
        
    }

    @Override
    public void eliminar (Cliente cliente) 
    {
        clientesListas.remove(cliente);
        
    }

    @Override
    public List<Cliente> consultarTodos() 
    {
        return clientesListas;
    }
    

    
}
