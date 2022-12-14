package proje;

public class ucakbiletihesaplama {
    double mesafe;
    int yas;
    int yolculuktipi;

    ucakbiletihesaplama( double mesafe,int yas,int yolculuktipi){

        this.mesafe=mesafe;
        this.yas=yas;
        this.yolculuktipi=yolculuktipi;

    }
    double normal() {
        //Mesafe başına ücret 0,10 TL / km olarak alın.
        double normaltutari=0;
        normaltutari=mesafe*0.1;
        return normaltutari;
    }
    double yasindirimi(){
        //Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
        //Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
        //Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
        double indirimoranlifiyat=0,yenifiyat=0;
        if (yas<12){
            indirimoranlifiyat=normal()*0.5;
            yenifiyat=normal()-indirimoranlifiyat;
        } else if (12<yas&&yas<24) {
            indirimoranlifiyat=normal()*0.1;
            yenifiyat=normal()-indirimoranlifiyat;
        } else if (yas>65) {
            indirimoranlifiyat=normal()*0.3;
            yenifiyat=normal()-indirimoranlifiyat;
        }else {
            indirimoranlifiyat=normal()*0;
            yenifiyat=normal()-indirimoranlifiyat;
        }
            return  yenifiyat;
    }
    double gidisdonus(){
        //Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
        //Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
        double gidisdonusbiletindirimi=0,toplamtutar =0;
            if (yolculuktipi==1){
                gidisdonusbiletindirimi=yasindirimi()*0;
                toplamtutar=yasindirimi()-gidisdonusbiletindirimi;
            } else if (yolculuktipi==2) {
                gidisdonusbiletindirimi=yasindirimi()*0.2;
                toplamtutar=(yasindirimi()-gidisdonusbiletindirimi)*2;
            } else {
                System.out.println("HATALI GİRİŞ OLDU!!!");

            }
        return toplamtutar;
    }
    String tex(){
        System.out.println("Mesafeyi km türünden giriniz :  "+this.mesafe);
        System.out.println("Yaşınızı giriniz :"+this.yas);
        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): "+this.yolculuktipi);
        System.out.println();
        System.out.println("Toplam Tutar =  "+gidisdonus());
        System.out.println();
        System.out.println("-----------");
        System.out.println();
        return null;
    }
}
class Main {
    public static void main(String[] args) {
        ucakbiletihesaplama table1 = new ucakbiletihesaplama(1500,20,2 );
        table1.tex();
        ucakbiletihesaplama table2 = new ucakbiletihesaplama(-500, 1, 77);
        table2.tex();
        ucakbiletihesaplama table3 = new ucakbiletihesaplama(200, 35, 1);
        table3.tex();
    }
}
