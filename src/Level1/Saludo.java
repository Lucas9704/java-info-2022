package Level1;

import java.util.Scanner;

public class Saludo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();

        System.out.println("Hola " + name);
        scan.close();
    }
}
