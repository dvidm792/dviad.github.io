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

public class SerieController extends Application
{
    @FXML
    TextField txtNumero;
    @FXML
    TextArea txtSerie;
    @FXML
    Button btnGenerarSerie;

    public static void main(String[] args) {
        launch(args);
        
    }

    @Override
    public void start(Stage pantalla) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("../vista/frmSerie.fxml"));
        
        Scene ventana = new Scene(root,650,450);

        pantalla.setScene(ventana);
        pantalla.setTitle("Serie fibonacci");
        pantalla.show();
        
    }

    @FXML
    public void onGenerarSerie()
    {
        int numero;
        String cadenaSerieFibonacci;

        numero = Integer.parseInt(txtNumero.getText());

        cadenaSerieFibonacci = Serie.fibonacci(numero);

        txtSerie.setText(cadenaSerieFibonacci);

    }
    
}
