package practica.patrones.dominio;

public class Cliente 
{
    private String cedula;
    private String nombre;
    private int codigo;
    private int turno;

    //#region constructores
    public Cliente() 
    {

    }

    public Cliente(String cedula, String nombre, int codigo, int turno) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.codigo = codigo;
        this.turno = turno;
    }
    //#endregion constructores

    //#region Obtenedores de datos
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
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
        result = prime * result + turno;
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
        Cliente other = (Cliente) obj;
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
        if (turno != other.turno)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return codigo + " " + cedula + " " + nombre + " # turno: " + turno;
    }

    
    //#endregion Metodos heredados

    

    
}
