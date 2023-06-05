package practica.patrones.ventas;

import java.util.ArrayList;
import java.util.List;

import practica.patrones.dominio.*;

public class ServiciosListDao implements IServicioDao
{
    static List<Servicio> serviciosLista = new ArrayList<>();
    static List<Tecnico> tecnicoLista = new ArrayList<>();
    static List<Cliente> clienteLista = new ArrayList<>();

    public ServiciosListDao ()
    {
        serviciosLista.add(new Servicio("Mantenimiento", "Limpieza del equipo, cambios de pasta termica, pequeñas reparaciones.", 1, 20, 1));
        serviciosLista.add(new Servicio("Revision y reparacion", "Chequeo del equipo entregado y reparacion del problema.", 2, 25, 2));

        tecnicoLista.add(new Tecnico("Marcela Josefa Artiaga Mendez", "0886676385", 01, "Tecnico"));
        tecnicoLista.add(new Tecnico("Pedro Jose Matamoros Trujillo", "0984676785", 02, "Tecnico"));
        tecnicoLista.add(new Tecnico("Mathias Fernando Lopez Lara", "0886676385", 03, "Tecnico"));

        clienteLista.add(new Cliente("0814826387", "Maria Josefa Montenegro",10, 1));
        clienteLista.add(new Cliente("0834867874", "Camila Andrea Zurita Palmeidas",20, 2));
        clienteLista.add(new Cliente("0964527387", "Paolo Jose Mecias Moreira",30, 3));
    }

    public static String buscarNombreCliente (int codigo)
    {
        String nombre = "";
        for (Cliente cliente: clienteLista) 
        {
            if (codigo == cliente.getCodigo())
            {
                nombre = cliente.getNombre();
                return nombre;
            }
        }
        return null;
    }

    public static String buscarCedulaCliente (int codigo)
    {
        String cedula = "";
        for (Cliente cliente: clienteLista) 
        {
            if (codigo == cliente.getCodigo())
            {
                cedula = cliente.getCedula ();
                return cedula;
            }
        }
        return null;
    }

    public static String buscarNombreTecnico(int codigo) 
    {
        String nombre = "";
        for (Tecnico tecnico: tecnicoLista) 
        {
            if (codigo == tecnico.getCodigo())
            {
                nombre = tecnico.getNombre();
                return nombre;
            }
        }
        return null;
    }

    public static String buscarcedulaTecnico(int codigo) 
    {
        String cedula = "";
        for (Tecnico tecnico: tecnicoLista) 
        {
            if (codigo == tecnico.getCodigo())
            {
                cedula = tecnico.getCedula();
                return cedula;
            }
        }
        return null;
    }

    public static String buscarNombreServicio(int codigo) 
    {
        String nombre = "";
        for (Servicio servicio: serviciosLista) 
        {
            if (codigo == servicio.getCodigo())
            {
                nombre = servicio.getNombre();
                return nombre;
            }
        }
        return null;
    }

    public static String buscarDescripcionServicio(int codigo) 
    {
        String descripcion = "";
        for (Servicio servicio: serviciosLista) 
        {
            if (codigo == servicio.getCodigo())
            {
                descripcion = servicio.getNombre();
                return descripcion;
            }
        }
        return null;
    }

    public static String buscarPrecioServicio(int codigo) 
    {
        String precio = "";
        for (Servicio servicio: serviciosLista) 
        {
            if (codigo == servicio.getCodigo())
            {
                precio = precio + servicio.getCosto();
                return precio;
            }
        }
        return null;
    }

    public static int precioServicio(int codigo) 
    {
        int precio;
        for (Servicio servicio: serviciosLista) 
        {
            if (codigo == servicio.getCodigo())
            {
                precio = servicio.getCosto();
                return precio;
            }
        }
        return (Integer) null;
    }

    public static String buscarDuracionServicio(int codigo) 
    {
        String duracion = "";
        for (Servicio servicio: serviciosLista) 
        {
            if (codigo == servicio.getCodigo())
            {
                duracion = duracion + servicio.getDuracionServicio();
                return duracion + " dias";
            }
        }
        return null;
    }

    public static String calcularCostoTotalServicio(int precio, int precioExtra)
    {
        String valorFacturar = "$ ";
        int total = precio + precioExtra;
        valorFacturar = valorFacturar + total;
        return valorFacturar;
    }

    @Override
    public void insertar(Servicio servicio) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public List<Servicio> consultarTodos() {
        // TODO Auto-generated method stub
        return null;
    }

}
