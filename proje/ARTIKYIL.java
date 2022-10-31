package proje;

import java.util.Scanner;

public class ARTIKYIL {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int YEAR;
        System.out.println("YEAR:   ");
        YEAR= inp.nextInt();

        //100'ün katı olan yıllardan sadece 400'e kalansız olarak bölünebilenler artık yıldır:
        if (YEAR%100==0){
            if (YEAR%400==0){
                System.out.println("ARTIK YILDIR.");
            }else {
                System.out.println("ARTIK YIL DEĞİLDİR !");
            }
            //Genel bir kural olarak, artık yıllar 4 rakamının katı olan yıllardır:
        } else if (YEAR%4==0){
            System.out.println("ARTIK YILDIR.");
        }else {
            System.out.println("ARTIK YIL DEĞİLDİR !");
        }
    }
}
