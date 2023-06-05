package practica.patrones.repositorios;

import java.util.ArrayList;
import java.util.List;

import practica.patrones.dominio.Servicio;

public class ServicioListDao implements IServicioDao
{

    List<Servicio> servicioListas = new ArrayList<>();

    public ServicioListDao()
    {
        servicioListas.add(new Servicio("Mantenimiento", "Limpieza del equipo, cambios de pasta termica, pequeñas reparaciones.", 01, 20, 1));
        servicioListas.add(new Servicio("Revision y reparacion", "Chequeo del equipo entregado y reparacion del problema.", 02, 25, 2));
        

    }

    @Override
    public void insertar(Servicio servicio) 
    {
        servicioListas.add(servicio);
        
    }

    @Override
    public void eliminar(Servicio servicio) 
    {
        servicioListas.remove(servicio);
        
    }

    @Override
    public List<Servicio> consultarTodos() 
    {
        return servicioListas;
    }

    
}
