
package programas;
import java.util.Scanner;
public class Programa03 {
    public static void main(String[] args){
        //declarar variables
        double angulosexa,angulorad;
        Scanner lectura = new Scanner(System.in);
        //entrada de datos
        System.out.println("Ingresar el angulo en sexagesimal");
        angulosexa=lectura.nextInt();        
        //proceso de datos
        angulorad=Math.toRadians(angulosexa);
        //salida de datos
        System.out.println("El angulo en radianes es: "+angulorad);
        
    }

    
}