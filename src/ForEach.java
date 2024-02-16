public class ForEach {
    public static void main(String[] args) {
//        String[] studentsName = new String[2];
//        studentsName[0] = "Dima";
//        studentsName[1] = "Masha";
//        for (int i = 0; i < studentsName.length; i++) {
//            System.out.print(studentsName[i]);
//        }
//
//        for each
//
//        for (String name : studentsName) {
//            System.out.println(name);
//        }
        // массив 100 элементов, присвоить значение элементам от 100 до 199, вывести все значения в консоль через for each
        int[] elements = new int[100];
        for (int i = 0; i < elements.length; i++) {
            elements[i] = i + 100;
        }
        for (int el : elements) {
            System.out.println(el);

        }
    }
}
