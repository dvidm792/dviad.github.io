package practica.patrones.dominio;

public class Equipo 
{
    private String nombre;
    private String marca;
    private String cantidadAccesorios;
    private int codigo;
    private int precio;

    //#region constructores
    public Equipo() {
    }


    public Equipo(String nombre, String marca, String cantidadAccesorios, int codigo, int precio) 
    {
        this.nombre = nombre;
        this.marca = marca;
        this.cantidadAccesorios = cantidadAccesorios;
        this.codigo = codigo;
        this.precio = precio;
    }
    //#endregion constructores

    //#region Obtenedores de datos
    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getMarca() {
        return marca;
    }


    public void setMarca(String marca) {
        this.marca = marca;
    }


    public String getCantidadAccesorios() {
        return cantidadAccesorios;
    }


    public void setCantidadAccesorios(String cantidadAccesorios) {
        this.cantidadAccesorios = cantidadAccesorios;
    }

    public int getCodigo() {
        return codigo;
    }


    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getPrecio() {
        return precio;
    }


    public void setPrecio(int precio) {
        this.precio = precio;
    }

    

    //#endregion Obtenedores de datos

    //#region Metodos heredados

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((cantidadAccesorios == null) ? 0 : cantidadAccesorios.hashCode());
        result = prime * result + codigo;
        result = prime * result + ((marca == null) ? 0 : marca.hashCode());
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
        Equipo other = (Equipo) obj;
        if (cantidadAccesorios == null) {
            if (other.cantidadAccesorios != null)
                return false;
        } else if (!cantidadAccesorios.equals(other.cantidadAccesorios))
            return false;
        if (codigo != other.codigo)
            return false;
        if (marca == null) {
            if (other.marca != null)
                return false;
        } else if (!marca.equals(other.marca))
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
        return " Equipo: " + nombre + "   Marca: " + marca + "   Precio: " + "  $" + precio + " " + "   Numero de accesorios que contiene: " + cantidadAccesorios;
    }
    


    
    //#endregion Metodos heredados


    
    
    
    
    
    
}
