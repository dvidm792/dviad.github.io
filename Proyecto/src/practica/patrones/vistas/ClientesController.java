package practica.patrones.vistas;

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
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import practica.patrones.dominio.Cliente;
import practica.patrones.repositorios.ClienteListDao;
import practica.patrones.repositorios.IClienteDao;

public class ClientesController extends Application implements Initializable
{
    @FXML
    ListView<Cliente> lstClientes;

    @FXML
    Button btnGrabar;

    @FXML
    Button btnEliminar;

    @FXML
    TextField txtCodigo;

    @FXML
    TextField txtCedula;

    @FXML
    TextField txtNombres;

    @FXML
    TextField txtTurno;

    ObservableList<Cliente> listaObservableClientes = FXCollections.observableArrayList();
    IClienteDao clienteDao = new ClienteListDao();

    public static void main(String[] args) 
    {
        launch(args);
        
    }


    @Override
    public void start(Stage pantalla) throws Exception 
    {
        Parent root = FXMLLoader.load(getClass().getResource("ClienteMantenedor.fxml"));

        Scene ventana = new Scene(root,500, 500);

        pantalla.setScene(ventana);
        pantalla.setTitle("Mantenedor clientes");
        pantalla.show();

        
    }



    @Override
    public void initialize(URL arg0, ResourceBundle arg1) 
    {
        cargarClientesListView();
        
    }

    private void cargarClientesListView ()
    {
        listaObservableClientes.clear();
        lstClientes.getItems().clear();
        
        listaObservableClientes.addAll(clienteDao.consultarTodos());
        lstClientes.getItems().addAll(listaObservableClientes);
    }
    
    @FXML
    public void doSeleccionarCliente()
    {
        Cliente clienteSeleccionado = lstClientes.getSelectionModel().getSelectedItem();

        txtCodigo.setText(String.valueOf(clienteSeleccionado.getCodigo()));
        txtCedula.setText(clienteSeleccionado.getCedula());
        txtNombres.setText(clienteSeleccionado.getNombre());
        txtTurno.setText(String.valueOf(clienteSeleccionado.getTurno()));
    }

    @FXML
    public void doGrabarCliente()
    {
        Cliente cliente = new Cliente();

        cliente.setCodigo(Integer.parseInt(txtCodigo.getText()));
        cliente.setCedula(txtCedula.getText());
        cliente.setNombre(txtNombres.getText());
        cliente.setTurno(Integer.parseInt(txtTurno.getText()));
        
        clienteDao.insertar(cliente);
        cargarClientesListView();

    }

    @FXML
    public void doEliminar()
    {
        Cliente cliente = lstClientes.getSelectionModel().getSelectedItem();

        txtCodigo.setText(String.valueOf(cliente.getCodigo()));
        txtCedula.setText(cliente.getCedula());
        txtNombres.setText(cliente.getNombre());
        txtTurno.setText(String.valueOf(cliente.getTurno()));
        
        
        clienteDao.eliminar(cliente);
        cargarClientesListView();
    }

}
