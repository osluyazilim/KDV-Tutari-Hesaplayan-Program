
import java.util.Scanner;

public class kdvproje {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double tutar;
        double seçim;
        double kdv=0;
        double toplam;
        double kdvtutar;
        
        System.out.println("Tutarınızı Giriniz ");
        tutar=input.nextDouble();

        System.out.println("Ürününüzü Seçiniz : " );
        
        System.out.println("1 %1 KDV ORANI \n\n 1,1 Temel Gıda  \n 1,2 Tarımsal Girdiler  \n 1,3 Yayın & Eğitim \n");

        System.out.println("2 %10 KDV ORANI \n\n 2,1 Yeme-İçme Hizmetleri \n 2,2 Konaklama Hizmetleri \n 2,3 Kültür & Eğlence \n 2,4 Kişisel Hizmetler \n 2,5 Taşımacılık ve Lojistik \n 2,6 Temel Tıbbi - Bebek Ürünleri \n");

        System.out.println("3 %20 KDV ORANI \n\n 3,1 Elektronik \n 3,2 Beyaz Eşya & Elektrikli Ev Ürünleri \n 3,3  Giyim & Aksesuar \n 3,4 Kozmetik & Kişisel Bakım \n 3,5 Mobilya & Ev Ürünleri \n 3,6 Temizlik Ürünleri \n 3,7 Profesyonel Hizmetler \n 3,8 Araç & Ulaşım \n 3,9 Diğer Genel Ürünler \n");

        System.out.println("Seçimiziniz Giriniz : ");
        seçim=input.nextDouble();

        if((seçim==1.1)||(seçim==1.2)||(seçim==1.3)){
            kdv=1;
        }else if((seçim==2.1)||(seçim==2.2)||(seçim==2.3)||(seçim==2.4)||(seçim==2.5)||(seçim==2.6)){
            kdv=10;
        }else if((seçim==3.1)||(seçim==3.2)||(seçim==3.3)||(seçim==3.4)||(seçim==3.5)||(seçim==3.6)||(seçim==3.7)||(seçim==3.8)||(seçim==3.9)){
            kdv=20;
        }else {
            System.out.println("Geçersiz seçim!");
            return;
        }

        System.out.println("Tutarınız : "+tutar);

        System.out.println("KDV Oranınınız : "+kdv);

        kdvtutar=tutar*(kdv/100);

        toplam= tutar + (tutar*(kdv/100));

        System.out.println("KDV Tutarınız : "+kdvtutar);

        System.out.println("Toplam Tutarınız : "+toplam);


    }
}
