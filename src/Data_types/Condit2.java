package Data_types;

import javax.sound.midi.SysexMessage;

public class Condit2 {
    public static void main(String[] args) {
//        int temp = 30;
//        boolean hot = temp > 25; //=>, <=, ==, !=
//        boolean cold = temp < 22;
//        int time = 23;
//        boolean isNight = time > 22 || time < 6; //|| или
//
//
//        if (hot && !isNight) { //&&=и, если хотим: чтобы выражение было с частицой не (не ночь) !isNight (не ночь)
//            System.out.println("Cond ON");
//        } else if (cold)
//            System.out.println("Cond OFF");
//        else
//            System.out.println("Nothing");

       boolean Weather = false;
       boolean isNight = true;

       if (Weather && !isNight) {
           System.out.println("walk");
       }
       if (!Weather && !isNight) {
           System.out.println("read");
       }
       if (isNight) {
           System.out.println("sleep");
       }

    }
}
