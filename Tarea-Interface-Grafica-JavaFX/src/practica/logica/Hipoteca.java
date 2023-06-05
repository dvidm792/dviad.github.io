package practica.logica;

public class Hipoteca 
{
    private static final double PORCENTAJE_ENTRADRA = 0.10;
    /// 10 años = 120 meses
    private static final int NUMERO_DE_MESES = 120;

    public static String montoEntrada(double costo)
    {
        double montoEntrada = costo * PORCENTAJE_ENTRADRA;
        String montoInicial = "$" + montoEntrada;
        
        return montoInicial;
    }

    public static String cuotaMensual(double costo)
    {
        double cuotaMensual = (costo - (costo * PORCENTAJE_ENTRADRA)) / NUMERO_DE_MESES;
        String pagoMensual = "$" + cuotaMensual;
        return pagoMensual;
       
    }

    public static String calcularSaldo(double costo)
    {
        double saldoEntrada = costo - (costo * PORCENTAJE_ENTRADRA);
        String saldoRestante = "$" + saldoEntrada;
        return saldoRestante;
    }
    
}
