package practica.patrones.dominio;

public class Producto
{
    private String nombre;
    private String descripcion;
    private int precio;
    private int cantidadProductos;
    private int codigo;

    //#region constructores

    public Producto() 
    {

    }

    public Producto(String nombre, String descripcion, int precio, int cantidadProductos, int codigo)
    {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidadProductos = cantidadProductos;
        this.codigo = codigo;
    }
    //#endregion constructores

    //#region Obtenedores de datos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidadProductos() {
        return cantidadProductos;
    }

    public void setCantidadProductos(int cantidadProductos) {
        this.cantidadProductos = cantidadProductos;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
     //#endregion Obtenedores de datos


    //#region Metodos heredados
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + cantidadProductos;
        result = prime * result + codigo;
        result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + precio;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Producto other = (Producto) obj;
        if (cantidadProductos != other.cantidadProductos)
            return false;
        if (codigo != other.codigo)
            return false;
        if (descripcion == null) {
            if (other.descripcion != null)
                return false;
        } else if (!descripcion.equals(other.descripcion))
            return false;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (precio != other.precio)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return nombre + ": " + descripcion + "; a : $" + precio + "; Unidades disponibles: " + cantidadProductos + " |||| Codigo: " + codigo;
    }
    //#endregion Metodos heredados
    
    
}
