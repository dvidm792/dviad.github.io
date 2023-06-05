package practica.patrones.dominio;

public class Servicio 
{
    private String nombre;
    private String descripcion;
    private int codigo;
    private int costo;
    private int duracionServicio;

    //#region constructores
    public Servicio() 
    {
    }

    public Servicio(String nombre, String descripcion, int codigo, int costo, int duracionServicio) 
    {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.codigo = codigo;
        this.costo = costo;
        this.duracionServicio = duracionServicio;
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

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public int getDuracionServicio() {
        return duracionServicio;
    }

    public void setDuracionServicio(int duracionServicio) {
        this.duracionServicio = duracionServicio;
    }
    //#endregion Obtenedores de datos


    //#region Metodos heredados
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + codigo;
        result = prime * result + costo;
        result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
        result = prime * result + duracionServicio;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
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
        Servicio other = (Servicio) obj;
        if (codigo != other.codigo)
            return false;
        if (costo != other.costo)
            return false;
        if (descripcion == null) {
            if (other.descripcion != null)
                return false;
        } else if (!descripcion.equals(other.descripcion))
            return false;
        if (duracionServicio != other.duracionServicio)
            return false;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        return true;
    }

    @Override
    public String toString() 
    {
        if (nombre.equals("Revision y reparacion"))
        {
            return nombre + ": " + descripcion + " duracion del servicio: " + duracionServicio + " días" + " por $ " + costo + " más costo de componentes necesarios " + " ||Codigo: " + codigo;
        }
        else 
        {
            return nombre + ": " + descripcion + " duracion del servicio: " + duracionServicio + " días" + " por $ " + costo + " ||Codigo: " + codigo;
        }
    }
    //#endregion Metodos heredados
    
    
    
}
