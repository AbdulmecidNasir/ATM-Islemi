import java.util.Scanner;

public class Input {
    Scanner print = new Scanner(System.in);
    AtmIslemi atmIslemi = new AtmIslemi();

    public char devam;
    public int secim;
    public void input()
    {
        do
        {
            try
            {
                System.out.println("-----Merhaba Akbank ATM sine Hosgeldiniz----");
                System.out.println("Alttaki islemlerden birini seciniz");
                System.out.println("1 - Para Yatir");
                System.out.println("2 - Para Cek");
                System.out.println("3 - Guncel Bakiye Goster");
                System.out.println("4 - Para Transferi");
                secim = print.nextInt();

                switch (secim) {
                    case 1:
                        atmIslemi.paraYatir();
                        break;
                    case 2:
                        atmIslemi.paraCek();
                        break;
                    case 3:
                        atmIslemi.bakiyeGoster();
                        break;
                    case 4:
                        atmIslemi.transfer();
                        break;
                    default:
                        System.out.println("Geçersiz seçim.");
                }

            }catch(Exception e)
            {
                System.out.println("Hata Mesaji : "+e.getMessage());
            }
            System.out.println("Ana Menu ya Donmek Istermisiniz (e/h)");
            devam = print.next().charAt(0);
        }while(devam == 'e' || devam == 'E');

    }
    public void closeScanner() {
        print.close();
    }


}
