package practica.patrones.dominio;

public class Empresa 
{
    private String nombre;
    private String ubicacion;
    private int codigo;
    private String ruc;

    //#region constructores
    public Empresa() 
    {

    }


    public Empresa(String nombre, String ubicacion, int codigo, String ruc) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.codigo = codigo;
        this.ruc = ruc;
    }
    //#endregion constructores

    //#region Obtenedores de datos
    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getUbicacion() {
        return ubicacion;
    }


    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }


    public int getCodigo() {
        return codigo;
    }


    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getRuc() {
        return ruc;
    }


    public void setRuc(String ruc) {
        this.ruc = ruc;
    }


    

    

    //#endregion Obtenedores de datos


    //#region Metodos heredados
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + codigo;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + ((ruc == null) ? 0 : ruc.hashCode());
        result = prime * result + ((ubicacion == null) ? 0 : ubicacion.hashCode());
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
        Empresa other = (Empresa) obj;
        if (codigo != other.codigo)
            return false;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (ruc == null) {
            if (other.ruc != null)
                return false;
        } else if (!ruc.equals(other.ruc))
            return false;
        if (ubicacion == null) {
            if (other.ubicacion != null)
                return false;
        } else if (!ubicacion.equals(other.ubicacion))
            return false;
        return true;
    }


    @Override
    public String toString() {
        return codigo + " " + nombre + " RUC =" + ruc + " Ubicacion: " + ubicacion + " ";
    }


    

    //#endregion Metodos heredados
    

    
    
}
