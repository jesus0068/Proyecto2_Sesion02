
package programas;
import java.util.Scanner;
public class Programa02 {
    public static void main(String[] args) {
        //declarar variables
        double num;
        String mensaje;
        Scanner lectura=new Scanner(System.in);
        //entrada de datos
        System.out.println("Ingrese un numero entero");
        num=lectura.nextDouble();
        //proceso de datos
        if (num %1==0){
            mensaje="el numero es entero";
        }else{
            mensaje="el numero no es entero";
        }
        System.out.println(mensaje);
    }
}
