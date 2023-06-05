package practica.patrones.ventas;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import practica.patrones.dominio.*;
import practica.patrones.repositorios.*;


public class PedidosController extends Application 
{
    

    @FXML
    TextField txtNumero;

    @FXML
    TextField txtFecha;

    @FXML
    TextArea txtDireccion;

    @FXML
    TextField txtSubtotal;

    @FXML
    TextField txtSubtotalGeneral;

    @FXML
    TextField txtTotal;

    @FXML
    TextField txtCedula;

    @FXML
    TextField txtNombres;

    @FXML
    TextField txtCantidad;

    @FXML
    TextField txtPrecio;

    @FXML
    TextField txtDescripcion;

    @FXML
    TextField txtCodigoProducto;

    @FXML
    TextField txtCodigoCliente;

    @FXML
    TextField txtIva;
    
    @FXML
    Button btnGrabar;

    @FXML
    Button btnBuscarCliente;

    @FXML
    Button btnCalcularTotal;

    ObservableList<PedidoDao> listaObservablePedidos = FXCollections.observableArrayList();
    IPedidosDao pedidoDao = new PedidoDao();

    public static void main(String[] args) 
    {
        launch(args);
        
        
    }



    @Override
    public void start(Stage pantalla) throws Exception 
    {
        Parent root = FXMLLoader.load(getClass().getResource("frmPrcIngresoPedido.fxml"));

        Scene ventana = new Scene(root,750, 700);

        pantalla.setScene(ventana);
        pantalla.setTitle("Ingreso de Pedidos");
        pantalla.show();
        
    }

    @FXML
    public void doBuscarCliente()
    {
        int numero = Integer.parseInt(txtNumero.getText());
        String fecha = txtFecha.getText();

        int codigo = Integer.parseInt(txtCodigoCliente.getText());
        String nombres = PedidoDao.buscarNombreCliente(codigo);
        String cedula = PedidoDao.buscarCedulaCliente(codigo);
        String direccion = PedidoDao.buscarDireccion(codigo);

        
        
        txtNombres.setText(nombres);
        txtCedula.setText(cedula);
        txtDireccion.setText(direccion);

    }

    @FXML
    public void doBuscarProducto()
    {
        
        int codigo = Integer.parseInt(txtCodigoProducto.getText());
        
        
        String descripcion = PedidoDao.buscarDescripcionProducto(codigo);
        int precio = PedidoDao.buscarPrecioProducto(codigo);
        String precio2 = PedidoDao.buscarPrecioProductoCadena(codigo);
        

        txtDescripcion.setText(descripcion);
        txtPrecio.setText(precio2);

        int cantidad = Integer.parseInt(txtCantidad.getText());

        int subtotal = PedidoDao.calculoSubtotal(cantidad, precio);
        String subtotalCadena = PedidoDao.calculoSubtotalCadena(cantidad, precio);

        txtSubtotal.setText(subtotalCadena);    
    }

    @FXML
    public void doCalcularTotal()
    {
        int subtotal = Integer.parseInt(txtSubtotalGeneral.getText());

        int subtotalIva = PedidoDao.calculodeIva(subtotal);

        String cadenaIva = PedidoDao.calculoIva(subtotal);
        String calculoTotal = PedidoDao.calculoTotal(subtotal, subtotalIva);

        txtIva.setText(cadenaIva);
        txtTotal.setText(calculoTotal);
        
    }


    @FXML
    public void doGrabar()
    {
        
    }

    
    
    
    
}
