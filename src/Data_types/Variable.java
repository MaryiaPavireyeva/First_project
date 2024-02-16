package Data_types;

public class Variable {
    public static void main(String[] args) {

        int jhone = 100;
        int nike = jhone * 5;
        int sum = jhone + nike;
        System.out.println(sum);

        int a = 10;
        int b = 3;
        int c = a / b;
        System.out.println(c);

        int a1 = 10;
        int b2 = 3;
        int c3 = a % b; //вычисление остатка от деления
        System.out.println(c3);

        int days = 10000;
        int years = days / 365;//1 year - 365 days, x year - 10000 days
        int month = 12 * years; //years - x month, 1 - 12 month
        int weeks = 4 * month ;//1 month - 4 weeks, month - x weeks
        System.out.println(years);
        System.out.println(month);
        System.out.println(weeks);




    }
}
