package Level1;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        String result = "";

        for (int i = 1; i <= num ; i++) {
            result = result + " " + Integer.toString(i);
            System.out.println(result);
        }
    }
}
