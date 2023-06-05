package practica.patrones.repositorios;

import java.util.ArrayList;
import java.util.List;

import practica.patrones.dominio.Producto;


public class ProductosListDao implements IProductoDao
{
    List<Producto> productoListas = new ArrayList<>();

    public ProductosListDao ()
    {
        productoListas.add(new Producto("AMD-Ryzer 5", "Procesador de computadora de escritorio", 140, 30, 01));
        productoListas.add(new Producto("GeForce RTX 3070", "Tarjeta Grafica Nvidia", 550, 15, 02));
        productoListas.add(new Producto("SAMSUNG 980 SSD 1TB PCle 3.0x4, NVMe M.2 2280,", " Unidad interna de estado sólido, almacenamiento para PC", 100, 25, 03));
    }


    @Override
    public void insertar(Producto producto) 
    {
        productoListas.add(producto);
        
    }

    @Override
    public void eliminar(Producto producto) 
    {
        productoListas.remove(producto);
        
    }

    @Override
    public List<Producto> consultarTodos()
    {
        return productoListas;
    }
    
}
