import java.util.Scanner;

public class desafio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many rooms will be rented?");
        int qnt = input.nextInt();

        String[] names = new String[qnt];
        String[] email = new String[qnt];
        int[] roomNumber = new int[qnt];
        input.nextLine();
        for (int i = 0; i < qnt; i++) {
            System.out.printf("Rent #%s:%n", i);
            System.out.println("Name: ");
            names[i] = input.nextLine();
            System.out.println("Email: ");
            email[i] = input.next();
            input.nextLine();
            System.out.println("Room: ");
            int roomTemp = input.nextInt();
            input.nextLine();
            if (roomTemp > 0 && roomTemp < 10) {
                roomNumber[i] = roomTemp;
            } else {
                System.out.println("Numero invalido");
                roomNumber[i] = input.nextInt();
            }
        }
        System.out.println("Busy rooms: ");
        for(int i=0; i<qnt; i++) {
            System.out.printf("%s: %s, %s%n", roomNumber[i], names[i], email[i]);
        }
    }
}