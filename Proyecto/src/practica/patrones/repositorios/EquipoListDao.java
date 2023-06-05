package practica.patrones.repositorios;

import java.util.ArrayList;
import java.util.List;

import practica.patrones.dominio.Equipo;

public class EquipoListDao implements IEquipoDao
{
    List<Equipo> equipoListas = new ArrayList<>();

    public EquipoListDao()
    {
        equipoListas.add(new Equipo("XRC-75", "Razer", "25", 10, 500));
        equipoListas.add(new Equipo("Filma-Family", "LG", "15", 20, 380));
        equipoListas.add(new Equipo("Deskop-Intension", "Lenovo", "20", 30, 400));
    }

    @Override
    public void insertar(Equipo equipo) 
    {
        equipoListas.add(equipo);
        
    }

    @Override
    public void eliminar(Equipo equipo) 
    {
        equipoListas.remove(equipo);
    }

    @Override
    public List<Equipo> consultarTodos() 
    {
        return equipoListas;
    }

    
}
