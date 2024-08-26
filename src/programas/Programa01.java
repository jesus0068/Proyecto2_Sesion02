
package programas;
import java.util.Scanner;
public class Programa01 {
    public static void main(String[] args){
        //declarar variables
        double lado,exponente,area;
        exponente=2;
        Scanner lectura = new Scanner(System.in);
        //entrada de datos
        System.out.println("Ingresar el lado del Cuadrado");
        lado=lectura.nextInt();        
        //proceso de datos
        area=Math.pow(lado, exponente);
        //salida de datos
        System.out.println("El area del cuadrado es: "+area);
        
    }

    
}
