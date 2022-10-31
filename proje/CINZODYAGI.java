package proje;

import java.util.Scanner;

public class CINZODYAGI {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int born;
        System.out.println("YEAR :  ");
        born= inp.nextInt();

        String str= born%12==0 ? "Maymun" : born%12==1 ? "Horoz": born%12==2 ? "Köpek" : born%12==3 ? "Domuz" : born%12==4 ? "Fare" : born%12==5 ? "Öküz": born%12==6 ? "Kaplan" : born%12==7 ? "Tavşan" : born%12==8 ? "Ejderha" : born%12==9 ? "Yılan": born%12==10 ? "At" : born%12==11 ? "Koyun":"";
        System.out.println("Horoscope:  "+str);
    }

}
