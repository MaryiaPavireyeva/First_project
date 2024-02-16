package Conditional;

import java.io.IOException;

public class Conditional {
    public static void main(String[] args) throws IOException {
        char ch, answer = 'B';
        System.out.println("какую букву я загадал?");
        System.out.print("попытайтесь ее угадать:");

        ch = (char)System.in.read();

        if (ch == answer) {
            System.out.println("поздравляю");
        } else if (ch > answer) {
            System.out.println("перестарался");
        } else {
            System.out.println("недостарался");
        }

    }
}