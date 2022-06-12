package Level1;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int result = 0;

        for (int i = 0; i < num2; i++) {
            result = result + num1;
        }

        System.out.println(num1 + " X " + num2 + " = " + result);
    }
}
