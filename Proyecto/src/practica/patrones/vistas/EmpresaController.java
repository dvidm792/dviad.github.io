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


public class EmpresaController extends Application implements Initializable
{
    @FXML
    ListView<Empresa> lstEmpresas;

    @FXML
    Button btnGrabar;

    @FXML
    Button btnEliminar;

    @FXML
    TextField txtCodigo;

    @FXML
    TextField txtNombres;

    @FXML
    TextField txtRuc;

    @FXML
    TextField txtUbicacion;

    ObservableList<Empresa> listaObservableEmpresa = FXCollections.observableArrayList();
    IEmpresaDao empresaDao = new EmpresaListDao();

    public static void main(String[] args) 
    {
        launch(args);
        
    }


    @Override
    public void initialize(URL arg0, ResourceBundle arg1) 
    {
        cargarEmpresasListView ();
    }

    @Override
    public void start(Stage pantalla) throws Exception 
    {
        Parent root = FXMLLoader.load(getClass().getResource("EmpresaMantenedor.fxml"));

        Scene ventana = new Scene(root,500, 500);

        pantalla.setScene(ventana);
        pantalla.setTitle("Mantenedor Empresa");
        pantalla.show();
        
    }
    
    private void cargarEmpresasListView ()
    {
        listaObservableEmpresa.clear();
        lstEmpresas.getItems().clear();
        
        listaObservableEmpresa.addAll(empresaDao.consultarTodos());
        lstEmpresas.getItems().addAll(listaObservableEmpresa);
    }

    @FXML
    public void doSeleccionarEmpresa()
    {
        Empresa empresaSeleccionada = lstEmpresas.getSelectionModel().getSelectedItem();

        txtCodigo.setText(String.valueOf(empresaSeleccionada.getCodigo()));
        txtNombres.setText(empresaSeleccionada.getNombre());
        txtUbicacion.setText(empresaSeleccionada.getUbicacion());
        txtRuc.setText(empresaSeleccionada.getRuc());
    }

    @FXML
    public void doGrabar()
    {
        Empresa empresa = new Empresa();

        empresa.setCodigo(Integer.parseInt(txtCodigo.getText()));
        empresa.setNombre(txtNombres.getText());
        empresa.setRuc(txtRuc.getText());
        empresa.setUbicacion(txtUbicacion.getText());

        empresaDao.insertar(empresa);
        cargarEmpresasListView();

    }

    @FXML
    public void doEliminar()
    {
        Empresa empresa = lstEmpresas.getSelectionModel().getSelectedItem();

        txtCodigo.setText(String.valueOf(empresa.getCodigo()));
        txtNombres.setText(empresa.getNombre());
        txtUbicacion.setText(empresa.getUbicacion());
        txtRuc.setText(empresa.getRuc());

        empresaDao.eliminar(empresa);
        cargarEmpresasListView();

    }
}
