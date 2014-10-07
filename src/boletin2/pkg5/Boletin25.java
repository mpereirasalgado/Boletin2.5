
package boletin2.pkg5;

import java.util.Scanner;

public class Boletin25 
{

    public static void main(String[] args) 
    {
        float millas;
        System.out.println("Conversion de millas a metros\nIntroduzca las millas: ");
        Scanner dato = new Scanner(System.in);
        millas=dato.nextFloat();
        System.out.println(millas+" millas son "+(millas*1852)+" m");
        
    }
    
}
