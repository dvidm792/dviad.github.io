package practica.patrones.repositorios;

import java.util.ArrayList;
import java.util.List;

import practica.patrones.dominio.Tecnico;

public class TecnicoListDao implements ITecnicoDao
{
    List<Tecnico> tecnicoListas = new ArrayList<>();

    public TecnicoListDao ()
    {
        tecnicoListas.add(new Tecnico("Carlos Jose Matamoros Ortiz", "0986574382", 01, "Asesor Tecnico"));
        tecnicoListas.add(new Tecnico("Jose Martin Perez Lopez", "09863753844", 02, "Jefe de taller"));
        tecnicoListas.add(new Tecnico("Marcela Josefa Artiaga Mendez", "0886676385", 03, "Tecnico"));
        
    }

    @Override
    public void insertar(Tecnico tecnico) 
    {
        tecnicoListas.add(tecnico);
        
    }

    @Override
    public void eliminar(Tecnico tecnico) 
    {
        tecnicoListas.remove(tecnico);
        
    }

    @Override
    public List<Tecnico> consultarTodos() 
    {
        return tecnicoListas;
    }
    
}
