import java.util.Locale;
import java.util.Scanner;

public class negativos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        System.out.println("Quantos numeros voce vai digitar?");
        int num = input.nextInt();
        int[] vect = new int[num];

        for(int i = 0; i< vect.length; i++) {
            System.out.println("Digite um número: ");
            int numTemp = input.nextInt();
            if(numTemp <= 0 || numTemp <= 10) {
                vect[i] = numTemp;
            } else {
                System.out.println("Numero inválido. Digite um número de 0 a 10");
        }

    }
        System.out.println("NÚMEROS NEGATIVOS");
        for(int i = 0; i< vect.length; i++) {
            if(vect[i] < 0) {
                System.out.println(vect[i]);
            }
        }
    }
}
