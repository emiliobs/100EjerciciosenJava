package Tienda;

import java.util.Scanner;

/**
 *
 * @author Emilio
 */
public class Tienda
{

    public static void main(String[] args)
    {
        double ventas[] = new double[5];
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Ingrese las primera 30 ventas del mes: ");
        for (int i = 0;i < ventas.length; i++)
        {
            System.out.println("Venta: " + (i + 1));
            ventas[i] = sc.nextDouble();     
                       
        }
        
        int k = 0;
        int total =0;
        
        while (k <5)
        {            
            if (ventas[k] >= 2000)
            {
                System.out.println("$" + ventas[k]);
                total++;
                
            }
            
            k++;
        }
        
        System.out.println("El total de Ventas Mayores a 200 es: " + total);

    }

}
