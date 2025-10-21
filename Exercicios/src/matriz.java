import java.util.Scanner;

public class matriz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int m = input.nextInt();
        int n = input.nextInt();

        int [][] mat = new int[m][n];
        for(int i=0; i<mat.length; i++) {
            for(int j=0; j<mat[i].length; j++) {
                mat[i][j] = input.nextInt();
            }
        }
        int num = input.nextInt();
        for(int i=0; i <mat.length; i++) {
            for(int j= 0; j <mat[i].length; j++) {
                if(mat[i][j] == num) {
                    System.out.println("Position: " + i + "," + j);

                    if(j > 0) System.out.println("Left: " + mat[i][j - 1]);
                    if(j < n - 1) System.out.println("Right: " + mat[i][j + 1]);
                    if(i > 0) System.out.println("Up: " + mat[i-1][j]);
                    if(i < m - 1) System.out.println("Down: " + mat[i+1][j]);
                }
    }
}
    }
}
