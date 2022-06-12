package Level1;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int result = num1;

        for (int i = 1; i < num2; i++) {
            result = result * num1;
        }

        System.out.println(num1 + " Elevado a " + num2 + " = " + result);
    }
}
