package practica.controladores;

import practica.logica.*;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class NumeroPerfectoController extends Application
{
    @FXML
    TextField txtNumero;
    @FXML
    TextArea txtMensaje;
    @FXML
    Button btnVerificar;


    public static void main(String[] args) {
        launch(args);
        
    }

    @Override
    public void start(Stage pantalla) throws Exception 
    {
        Parent root = FXMLLoader.load(getClass().getResource("../vista/frmPerfecto.fxml"));
        
        Scene ventana = new Scene(root,650,450);

        pantalla.setScene(ventana);
        pantalla.setTitle("Numero Perfecto");
        pantalla.show();
        
    }
    
    @FXML
    public void onVerificar()
    {
        int numero;
        String cadena;

        numero = Integer.parseInt(txtNumero.getText());

        cadena = NumeroPerfecto.numeroPerfecto(numero);

        txtMensaje.setText(cadena);

    }



}
