package Level1;

import java.util.Scanner;

public class Ejercicio4 {

    static long factorialNum(int num) {
        long value = 1;
        int i = 1;
        while (i < num) {
            value = value * i;
            i++;
        }
        return value;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese su numero");
        int num = scan.nextInt();
        System.out.println(factorialNum(num));
    }
}