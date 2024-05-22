/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculadora;

/**
 *
 * @author egpanades
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        ArrayList list = new ArrayList();
        int resultado = 0;
        System.out.println("Introduzca el primer numero");
        int num1 = sc.nextInt();
        System.out.println("Introduzca el segundo numero");
        int num2 = sc.nextInt();
        System.out.println("Seleccione 1 para sumar, 2 para restar, 3 para multiplicar y 4 para dividir");
        int operacion = sc.nextInt();
        switch(operacion){
            case 1:
                resultado = num1+num2;
                System.out.println("El resultado de la suma es " + (resultado));
                list.add(resultado);
                break;
            case 2: 
                resultado = num1-num2;
                System.out.println("El resultado de la resta es " + (resultado));
                list.add(resultado);
                break;
            case 3:
                resultado = num1*num2;
                System.out.println("El resultado de la multiplicacion es " + (resultado));
                list.add(resultado);
                break;
            case 4:
                if(num2==0)
                    System.out.println("La division por cero no esta definida");
                
                else
                    resultado = num1/num2;
                System.out.println("El resultado de la division es " + (resultado));
                list.add(resultado);
                break;
        }
    }
    
}
