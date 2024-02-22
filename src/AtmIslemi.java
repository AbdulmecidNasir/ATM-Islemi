import java.util.Scanner;

public class AtmIslemi {
    private double para;
    public long ibanNo;
    public String isim;
    public String soyad;
    Scanner print = new Scanner(System.in);
    private double bakiye;
    public void paraYatir()
    {
        System.out.println("Ne Kadar Para Yatirmak Istersiniz : ");
        para = print.nextDouble();
        bakiye = para ;
        System.out.println("Hesabiniza "+para +" TL Para Eklendi");
        System.out.println("Toplam Bakiyeniz : "+ bakiye+ " TL");
    }
    public void paraCek()
    {
        System.out.println("Ne Kadar Para Cekmek Istersiniz : ");
        para = print.nextDouble();
        bakiye -= para;
        System.out.println(para +" TL Para cekildi");
        System.out.println("Toplam Bakiyeniz : "+ bakiye);

    }
    public void transfer()
    {
        if(bakiye > 0)
        {
            System.out.println("Gonderilecek kisinin IBAN Numarasini giriniz : ");
            ibanNo = print.nextLong();
            System.out.println("Ismini Giriniz : ");
            isim = print.next();
            System.out.println("Soyadini Giriniz : ");
            soyad = print.next();
            System.out.println("Ne Kadar Para Gonderilecek :");
            para = print.nextDouble();
            bakiye -= para;
            System.out.println("Kisinin Adi :"+isim);
            System.out.println("Kisinin Soyadi :"+soyad);
            System.out.println("IBAN Numarasi :"+ibanNo);
            System.out.println("Gonderildigi Miktar para : "+para +" TL");
            System.out.println(isim+" "+soyad+" adli kisiye \n"+ ibanNo+" IBAN numarasina\n"+ para+" TL Gonderildi");
        }

        else
        {
            System.out.println("Yetersiz Bakiye");
        }

    }
    public void bakiyeGoster()
    {
        System.out.println("Toplam Bakiyeniz : "+bakiye+" TL");
    }
}
