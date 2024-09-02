
package programas;
import java.util.Scanner;
public class Programa01 {
    public static void main(String[] args) {
        //declarar variables
        double num;
        Scanner lectura=new Scanner(System.in);
        //entrada de datos
        System.out.println("Ingrese un positivo");
        num=lectura.nextDouble();
        //proceso de datos
        if (num>0){
            System.out.println("el numero es positivo");
        }
    }
}
