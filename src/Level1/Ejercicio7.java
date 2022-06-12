package Level1;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        String result = " ";

        for (int i = 0; i < text.length(); i++) {
            result = result + text.indexOf(i);

        }
    }
}
