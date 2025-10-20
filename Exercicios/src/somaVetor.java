import java.util.Locale;
import java.util.Scanner;

public class somaVetor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        System.out.println("Quantos numeros voce vai digitar?");
        int num = input.nextInt();
        float[] vect = new float[num];

        for(int i = 0; i < vect.length; i++) {
            System.out.println("Digite um número: ");
            float numTemp = input.nextFloat();
            vect[i] = numTemp;
        }
        System.out.print("VALORES = ");
        for(int i = 0; i < vect.length; i++) {
            System.out.printf("%.1f ", vect[i]);
        }

        float  soma = 0;
        for(int i = 0; i< vect.length; i++) {
            soma += vect[i];
        }
        System.out.println();
        System.out.printf("SOMA = %.1f", soma);

        float  avg = 0;
        avg = soma / vect.length;
        System.out.println();
        System.out.printf("MEDIA =  %.1f", avg);
    }

}
