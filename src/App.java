
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println(" Digite as horas: ");
        int horas = teclado.nextInt();
        System.out.println(" Digite os minutos: ");
        int minutos = teclado.nextInt();
        teclado.close();

        if (horas > 12) {
            horas = horas - 12;
            System.out.println(horas + ":" + minutos + " P.M ");
        } else {
            System.out.println(horas + ":" + minutos + " A.M ");
        }
    }

}