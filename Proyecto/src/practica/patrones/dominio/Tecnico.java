package practica.patrones.dominio;

public class Tecnico 
{
    private String nombre;
    private String cedula;
    private int codigo;
    private String rol;

    //#region constructores
    public Tecnico() 
    {
        
    }

    public Tecnico(String nombre, String cedula, int codigo, String rol) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.codigo = codigo;
        this.rol = rol;
    }
    //#endregion constructores

    //#region Obtenedores de datos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    //#endregion Obtenedores de datos

    //#region Metodos heredados
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((cedula == null) ? 0 : cedula.hashCode());
        result = prime * result + codigo;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + ((rol == null) ? 0 : rol.hashCode());
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
        Tecnico other = (Tecnico) obj;
        if (cedula == null) {
            if (other.cedula != null)
                return false;
        } else if (!cedula.equals(other.cedula))
            return false;
        if (codigo != other.codigo)
            return false;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (rol == null) {
            if (other.rol != null)
                return false;
        } else if (!rol.equals(other.rol))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return rol + " " + nombre + " || " + cedula + " || " + codigo;
    }

    //#endregion Metodos heredados

    
}
