package Cycle;

public class hw {
    public static void main(String[] args) {
        //вывести от 1000 до 0, for цикл, те числа, кот без отстатка делятся на 3)
        for (int i = 1000; i >= 0; i--) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
