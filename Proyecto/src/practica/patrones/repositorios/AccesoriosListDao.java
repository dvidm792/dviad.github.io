package practica.patrones.repositorios;

import java.util.ArrayList;
import java.util.List;

import practica.patrones.dominio.*;

public class AccesoriosListDao implements IAccesoriosDao
{
    List<Accesorios> accesoriosListas = new ArrayList<>();

    public AccesoriosListDao()
    {
        accesoriosListas.add(new Accesorios("GForce 340x", "Nvidia", 20, 01, 300));
        accesoriosListas.add(new Accesorios("Mx- Master 3s mouse", "Logitech", 15, 02, 100));
        accesoriosListas.add(new Accesorios("M325 Wireless mouse", "Logitech", 10, 03, 79));
        accesoriosListas.add(new Accesorios("SlimStar M200 KeyBoard", "Genius", 15, 04, 100));
        accesoriosListas.add(new Accesorios("A40 TR - Auriculares", "Astro", 10, 05, 80));


    }

    @Override
    public void insertar(Accesorios accesorio) 
    {
        accesoriosListas.add(accesorio);
        
    }

    @Override
    public void eliminar(Accesorios accesorio) 
    {
        accesoriosListas.remove(accesorio);
        
    }

    @Override
    public List<Accesorios> consultarTodos() 
    {
        return accesoriosListas;
    }
}
