package practica.logica;

public class NumeroPerfecto 
{
    public static String numeroPerfecto(int numero)
    {
        String cadena = "";
        int suma = 1;

        if (numero == 1)
        {
            cadena = "El numero: " + numero + " no tiene más divisores, entonces no es perfecto";
            return cadena;
        }
        else
        {
            for (int i = 2; i < numero; i++) 
                {
                    if (numero % i == 0) {
                        suma += i;
                    }
                }
        }
        if (suma == numero)
            cadena = "El numero: " + numero + " es un numero perfecto";
        else
            cadena = "El numero: " + numero + " no es un numero perfecto";
    return cadena;
        
    }
    
}