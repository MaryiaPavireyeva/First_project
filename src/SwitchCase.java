public class SwitchCase {
    public static void main(String[] args) {
//        int month = 6;
//        switch (month) {
//            case 1:
//                System.out.println("January");
//                break;
//            case 2:
//                System.out.println("February");
//                break;
//            case 3:
//                System.out.println("March");
//                break;
//            default:
//                System.out.println("Nothing");
//        }
//        if (month == 1) {
//            System.out.println("January");
//        } else if (month == 2) {
//            System.out.println("February");
//        } else if (month == 3) {
//            System.out.println("March");
//        } else {
//            System.out.println("Nothing");
//        }
        // названия месяца принимает, к какому сезону относится
        String monthNames = "July";
        switch (monthNames) {
            case "July":
            case "June":
            case "August":
                System.out.println("Summer");
                break;
            case "December":
            case "November":
            case "February":
                System.out.println("Winter");
                break;
            default:
                System.out.println("IDK");
        }
    }
}
