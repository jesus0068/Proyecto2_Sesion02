
package programas;
import java.util.Scanner;
public class Programa02 {
    public static void main(String[] args){
        //declarar variables
        double angulo,coseno;
        Scanner lectura = new Scanner(System.in);
        //entrada de datos
        System.out.println("Ingresar el angulo en radianes");
        angulo=lectura.nextInt();        
        //proceso de datos
        coseno=Math.cos(angulo);
        //salida de datos
        System.out.println("El coseno del angulo es: "+coseno);
        
    }

    
}