package practica.patrones.dominio;

public class Pedidos
{
    private int numero;
    private String fecha;
    private String cedulaCliente;
    private String nombreCliente;
    private String direccionCliente;
    private int codigoCliente;

    private String nombreProducto;
    private String descripcionProducto;
    private int precio;
    private int cantidadProductos;
    private int codigoProducto;

    public Pedidos() 
    {
        
    }

    public Pedidos(String cedulaCliente, String nombreCliente, String direccionCliente, int codigoCliente) 
    {
        this.cedulaCliente = cedulaCliente;
        this.nombreCliente = nombreCliente;
        this.direccionCliente = direccionCliente;
        this.codigoCliente = codigoCliente;
    }

    public Pedidos(String nombreProducto, String descripcionProducto, int precio, int cantidadProductos,
            int codigoProducto) {
        this.nombreProducto = nombreProducto;
        this.descripcionProducto = descripcionProducto;
        this.precio = precio;
        this.cantidadProductos = cantidadProductos;
        this.codigoProducto = codigoProducto;
    }

    

    public Pedidos(int numero, String fecha) {
        this.numero = numero;
        this.fecha = fecha;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCedulaCliente() {
        return cedulaCliente;
    }

    public void setCedulaCliente(String cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }

    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
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

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + cantidadProductos;
        result = prime * result + ((cedulaCliente == null) ? 0 : cedulaCliente.hashCode());
        result = prime * result + codigoCliente;
        result = prime * result + codigoProducto;
        result = prime * result + ((descripcionProducto == null) ? 0 : descripcionProducto.hashCode());
        result = prime * result + ((direccionCliente == null) ? 0 : direccionCliente.hashCode());
        result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
        result = prime * result + ((nombreCliente == null) ? 0 : nombreCliente.hashCode());
        result = prime * result + ((nombreProducto == null) ? 0 : nombreProducto.hashCode());
        result = prime * result + numero;
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
        Pedidos other = (Pedidos) obj;
        if (cantidadProductos != other.cantidadProductos)
            return false;
        if (cedulaCliente == null) {
            if (other.cedulaCliente != null)
                return false;
        } else if (!cedulaCliente.equals(other.cedulaCliente))
            return false;
        if (codigoCliente != other.codigoCliente)
            return false;
        if (codigoProducto != other.codigoProducto)
            return false;
        if (descripcionProducto == null) {
            if (other.descripcionProducto != null)
                return false;
        } else if (!descripcionProducto.equals(other.descripcionProducto))
            return false;
        if (direccionCliente == null) {
            if (other.direccionCliente != null)
                return false;
        } else if (!direccionCliente.equals(other.direccionCliente))
            return false;
        if (fecha == null) {
            if (other.fecha != null)
                return false;
        } else if (!fecha.equals(other.fecha))
            return false;
        if (nombreCliente == null) {
            if (other.nombreCliente != null)
                return false;
        } else if (!nombreCliente.equals(other.nombreCliente))
            return false;
        if (nombreProducto == null) {
            if (other.nombreProducto != null)
                return false;
        } else if (!nombreProducto.equals(other.nombreProducto))
            return false;
        if (numero != other.numero)
            return false;
        if (precio != other.precio)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Pedidos [cantidadProductos=" + cantidadProductos + ", cedulaCliente=" + cedulaCliente
                + ", codigoCliente=" + codigoCliente + ", codigoProducto=" + codigoProducto + ", descripcionProducto="
                + descripcionProducto + ", direccionCliente=" + direccionCliente + ", fecha=" + fecha
                + ", nombreCliente=" + nombreCliente + ", nombreProducto=" + nombreProducto + ", numero=" + numero
                + ", precio=" + precio + "]";
    }

   
   

    

    
}
