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
import practica.patrones.dominio.*;
import practica.patrones.repositorios.*;

public class AccesoriosController extends Application implements Initializable
{
    @FXML
    ListView<Accesorios> lstAccesorios;

    @FXML
    Button btnGrabar;

    @FXML
    Button btnEliminar;

    @FXML
    TextField txtCodigo;

    @FXML
    TextField txtNombres;

    @FXML
    TextField txtMarca;

    @FXML
    TextField txtCantidad;

    @FXML
    TextField txtPrecio;

    ObservableList<Accesorios> listaObservableAccesorio = FXCollections.observableArrayList();
    IAccesoriosDao accesorioDao = new AccesoriosListDao();

    public static void main(String[] args) 
    {
        launch(args);
        
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) 
    {
        cargarAccesoriosListView ();
        
    }

    @Override
    public void start(Stage pantalla) throws Exception 
    {
        Parent root = FXMLLoader.load(getClass().getResource("AccesorioMantenedor.fxml"));

        Scene ventana = new Scene(root,500, 500);

        pantalla.setScene(ventana);
        pantalla.setTitle("Mantenedor Accesorios");
        pantalla.show();
        
    }

    private void cargarAccesoriosListView ()
    {
        listaObservableAccesorio.clear();
        lstAccesorios.getItems().clear();
        
        listaObservableAccesorio.addAll(accesorioDao.consultarTodos());
        lstAccesorios.getItems().addAll(listaObservableAccesorio);
    }

    @FXML
    public void doSeleccionarAccesorio()
    {
        Accesorios accesorioSeleccionado = lstAccesorios.getSelectionModel().getSelectedItem();

        txtCodigo.setText(String.valueOf(accesorioSeleccionado.getCodigo()));
        txtNombres.setText(accesorioSeleccionado.getNombre());
        txtMarca.setText(accesorioSeleccionado.getMarca());
        txtCantidad.setText(String.valueOf(accesorioSeleccionado.getCantidad()));
        txtPrecio.setText(String.valueOf(accesorioSeleccionado.getPrecio()));
    }

    @FXML
    public void doGrabar()
    {
        Accesorios accesorio = new Accesorios();

        accesorio.setCodigo(Integer.parseInt(txtCodigo.getText()));
        accesorio.setNombre(txtNombres.getText());
        accesorio.setMarca(txtMarca.getText());
        accesorio.setCantidad(Integer.parseInt(txtCantidad.getText()));
        accesorio.setPrecio(Integer.parseInt(txtPrecio.getText()));

        accesorioDao.insertar(accesorio);
        cargarAccesoriosListView ();

    }


    @FXML
    public void doEliminar()
    {
        Accesorios accesorio = lstAccesorios.getSelectionModel().getSelectedItem();

        txtCodigo.setText(String.valueOf(accesorio.getCodigo()));
        txtNombres.setText(accesorio.getNombre());
        txtMarca.setText(accesorio.getMarca());
        txtCantidad.setText(String.valueOf(accesorio.getCantidad()));
        txtPrecio.setText(String.valueOf(accesorio.getPrecio()));
        
        
        accesorioDao.eliminar(accesorio);
        cargarAccesoriosListView ();
    }
    
}
