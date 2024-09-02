
package programas;
import java.util.Scanner;
public class Programa03 {
    public static void main(String[] args) {
        //declarar variables
        double nota;
        Scanner lectura = new Scanner(System.in);
        //entrada de datos
        System.out.println("Ingrese la nota del examen:");
        nota=lectura.nextDouble();
        //proceso de datos
        if (nota >= 20) {
            System.out.println("Nota perfecta");
        } else if (nota >= 11 & nota < 20) {
            System.out.println("Nota aprobatoria");
        } else if (nota > -1 & nota < 11) {
            System.out.println("Nota desaprobatoria");
        }
    }
}
