package practica.patrones.ventas;

import java.util.ArrayList;
import java.util.List;


import practica.patrones.dominio.Pedidos;



public class PedidoDao implements IPedidosDao
{
    static List<Pedidos> clienteListas = new ArrayList<>();
    static List<Pedidos> productoListas = new ArrayList<>();
    static List<Pedidos> pedidoListas = new ArrayList<>();

    public PedidoDao ()
    {
        

        clienteListas.add(new Pedidos("0914526387", "CARLOS ALBERTO ANDRADE", "Av.Perimetral", 1));
        clienteListas.add(new Pedidos("0834567874", "MARTHA CECILIA AMPUERO", "Sauces 2", 2));
        clienteListas.add(new Pedidos("0754527387", "ANDREA SOPHIA SALAS", "Alborada 11 etapa", 3));
        


        productoListas.add(new Pedidos("AMD-Ryzer 5", "Procesador de computadora de escritorio", 140, 30, 1));
        productoListas.add(new Pedidos("GeForce RTX 3070", "Tarjeta Grafica Nvidia", 550, 15, 2));
        productoListas.add(new Pedidos("SAMSUNG 980 SSD 1TB PCle 3.0x4, NVMe M.2 2280,", " Unidad interna de estado sólido, almacenamiento para PC", 200, 25, 3));
    }

    
    public static String buscarNombreCliente(int codigo) 
    {
        String nombre = "";
        for (Pedidos cliente: clienteListas) 
        {
            if (codigo == cliente.getCodigoCliente())
            {
                nombre = cliente.getNombreCliente();
                return nombre;
            }
        }
        return null;
    }

    public static String buscarDireccion(int codigo)
    {
        String direccion = "";
        for (Pedidos clienteDireccion: clienteListas) 
        {
            if (codigo == clienteDireccion.getCodigoCliente())
            {
                direccion = clienteDireccion.getDireccionCliente();
                return direccion;
            }
        }
        return null;
    }

   
    public static String buscarNombreProducto (int codigo) 
    {
        String nombre = "";
        for (Pedidos producto: productoListas) 
        {
            if (producto.getCodigoProducto() == codigo)
            {
                nombre = producto.getNombreProducto();
                return nombre;
            }
        }
        return null;
    }

    
    public static String buscarCedulaCliente(int codigo) 
    {
        String cedula = "";
        for (Pedidos cedulaCliente: clienteListas) {
            if (codigo == cedulaCliente.getCodigoCliente())
            {
                cedula = cedulaCliente.getCedulaCliente();
                return cedula;
            }
        }
        return null;
    }

    
    public static int buscarPrecioProducto(int codigo) 
    {
        int precio = 0;
        for (Pedidos producto: productoListas) 
        {
            if (producto.getCodigoProducto() != codigo)
            {
                precio = precio + producto.getPrecio();
                return precio;
            }
        }
        return (Integer) null;
    }

    public static String buscarPrecioProductoCadena(int codigo) 
    {
        String precio = "$ ";
        for (Pedidos producto: productoListas) 
        {
            if (producto.getCodigoProducto() != codigo)
            {
                precio = precio + producto.getPrecio();
                return precio;
            }
        }
        return null;
    }

    public static String buscarDescripcionProducto(int codigo) 
    {
        String descripcion = "";
        for (Pedidos producto: productoListas) 
        {
            if (producto.getCodigoProducto() == codigo)
            {
                descripcion = producto.getDescripcionProducto();
                return descripcion;
            }
        }
        return null;
    }

    public static int calculoSubtotal (int cantidad, int precio)
    {
        int subtotal = cantidad * precio;
        return subtotal;
    }

    public static String calculoSubtotalCadena (int cantidad, int precio)
    {
        int subtotal = cantidad * precio;
        String cadenaSubtotal = "$" + subtotal;
        return cadenaSubtotal;
    }

    public static String calculoIva (int subtotal)
    {
        int total = (int) (subtotal * 0.12);
        String cadenaTotal = "$" + total;
        return cadenaTotal;
    }

    public static int calculodeIva (int subtotal)
    {
        int iva = (int) (subtotal * 0.12);
        return iva;
    } 

    public static String calculoTotal (int subtotalGeneral, int subtotalIva)
    {
        int calculo = subtotalGeneral + subtotalIva;
        String total = "$ " + calculo;
        return total;
    }

   

    @Override
    public void insertar(Pedidos pedido) 
    {
        pedidoListas.add(pedido);   
    }

    @Override
    public List<Pedidos> consultarTodos() 
    {
        return productoListas;
    }
    

    

}
