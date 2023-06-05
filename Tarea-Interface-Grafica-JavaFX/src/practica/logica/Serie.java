package practica.logica;

public class Serie 
{
    public static String fibonacci(int numero)
    {
        
        int i = 2;
        int n1 = 0;
        int n2 = 1;
        int n3;

        String cadenaSerie = " " + n1 + " " + n2;

        while (i < numero)
        {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            i = i + 1;

            cadenaSerie = cadenaSerie + " " + n3;  
        }
        return cadenaSerie;
    }
    
}
