package Scanner;

import java.io.IOException;

public class Scanner {
    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        int number = scanner.nextInt();
        System.out.println("введенное число " + number);
    }

    }
