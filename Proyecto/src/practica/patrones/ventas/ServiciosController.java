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

public class ServiciosController extends Application
{
    @FXML
    TextField txtNumero;

    @FXML
    TextField txtFecha;

    @FXML
    TextField txtCedula;

    @FXML
    TextField txtNombres;

    @FXML
    TextField txtCodigoCliente;

    @FXML
    Button btnBuscarCliente;

    @FXML
    TextField txtCodigoTecnico;

    @FXML
    TextField txtNombresTecnico;

    @FXML
    TextField txtCedulaTecnico;

    @FXML
    Button btnBuscarTecnico;

    @FXML
    TextField txtCodigoServicio;

    @FXML
    TextField txtNombreServicio;

    @FXML
    TextField txtDescripcion;

    @FXML
    TextField txtDuracion;

    @FXML
    TextField txtPrecio;

    @FXML
    TextField txtPrecioExtra;

    @FXML
    TextField txtTotal;

    @FXML
    Button btnBuscarServicio;

    ObservableList<ServicioListDao> listaObservableServicios = FXCollections.observableArrayList();
    IServicioDao servicioDao = new ServiciosListDao();

    public static void main(String[] args) 
    {
        launch(args);
        
        
    }


    @Override
    public void start(Stage pantalla) throws Exception 
    {
        Parent root = FXMLLoader.load(getClass().getResource("Servicios.fxml"));

        Scene ventana = new Scene(root,750, 700);

        pantalla.setScene(ventana);
        pantalla.setTitle("Solicitud de Servicio");
        pantalla.show();
        
    }
    
    @FXML
    public void doBuscarCliente()
    {
        int numero = Integer.parseInt(txtNumero.getText());
        String fecha = txtFecha.getText();

        int codigo = Integer.parseInt(txtCodigoCliente.getText());
        String nombres = ServiciosListDao.buscarNombreCliente(codigo);
        String cedula = ServiciosListDao.buscarCedulaCliente(codigo);
        
        txtNombres.setText(nombres);
        txtCedula.setText(cedula);
        
    }


    @FXML
    public void doBuscarTecnico()
    {
        int codigo = Integer.parseInt(txtCodigoTecnico.getText());

        String nombre = ServiciosListDao.buscarNombreTecnico(codigo);
        String cedula = ServiciosListDao.buscarcedulaTecnico(codigo);

        txtNombresTecnico.setText(nombre);
        txtCedulaTecnico.setText(cedula);
    }

    @FXML
    public void doBuscarServicio()
    {
        int codigo = Integer.parseInt(txtCodigoServicio.getText());

        String nombre = ServiciosListDao.buscarNombreServicio(codigo);
        String descripcion = ServiciosListDao.buscarDescripcionServicio(codigo);
        String duracion = ServiciosListDao.buscarDuracionServicio(codigo);
        String precio = ServiciosListDao.buscarPrecioServicio(codigo);
        int precio2 = ServiciosListDao.precioServicio(codigo);

        txtNombreServicio.setText(nombre);
        txtDescripcion.setText(descripcion);
        txtDuracion.setText(duracion);
        txtPrecio.setText(precio);

        int precioExtra = Integer.parseInt(txtPrecioExtra.getText());

        String total = ServiciosListDao.calcularCostoTotalServicio(precio2, precioExtra);
        txtTotal.setText(total);

    }








}
