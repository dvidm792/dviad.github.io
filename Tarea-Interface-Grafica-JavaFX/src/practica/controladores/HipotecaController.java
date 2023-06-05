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

public class HipotecaController extends Application
{
    @FXML
    TextField txtCosto;
    @FXML
    TextField txtPorcentaje;
    @FXML
    TextField txtMeses;
    @FXML
    TextArea txtMonto;
    @FXML
    TextArea txtSaldo;
    @FXML
    TextArea txtCuotaMensual;
    @FXML
    Button btnCalculo;

    public static void main(String[] args) {
        launch(args);
        
    }


    @Override
    public void start(Stage pantalla) throws Exception 
    {
        Parent root = FXMLLoader.load(getClass().getResource("../vista/frmHipoteca.fxml"));
        
        Scene ventana = new Scene(root,650,450);

        pantalla.setScene(ventana);
        pantalla.setTitle("Hipoteca de una vivienda");
        pantalla.show();
        
    }

    @FXML
    public void onCalcular()
    {
        double costo;
        String montoEntrada;
        String cuotaMensual;
        String saldoEntrada;

        costo = Double.parseDouble(txtCosto.getText());

        montoEntrada = Hipoteca.montoEntrada(costo);
        cuotaMensual = Hipoteca.cuotaMensual(costo);
        saldoEntrada = Hipoteca.calcularSaldo(costo);

        txtSaldo.setText(montoEntrada);
        txtMonto.setText(montoEntrada);
        txtSaldo.setText(saldoEntrada);
        txtCuotaMensual.setText(cuotaMensual);
        

    }
    
}
