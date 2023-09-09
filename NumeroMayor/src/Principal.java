
import java.util.Scanner;



/**
 *
 * @author Emilio
 */
public class Principal
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[5];
        int mayor = array[0];
        
        System.out.println("Ingrese los 5 numero: ");
        for (int i = 0; i < array.length; i++)
        {
            array[i] = sc.nextInt();
            if (array[i] > mayor)
            {
                mayor = array[i];
                
               
            }
            
        }
        
        System.out.println("El nmero mayor es: " + mayor);

    }
    
}
