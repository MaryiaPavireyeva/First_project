package Data_types;

public class Data_types {
    public static void main(String[] args) {
        long speed = 300_000;
        long dist = 365 * 24 * 60 * 60 * speed;
 //       System.out.println(dist);
// Если кладем меньший тип в больший = неявное приведение типа
        // Если кладем большего типа в меньший - явное приведение делаем b = (byte) (b + 10)
        // Если в выражении испл различные типы - будет прииведен к бОльшему
    }
}
