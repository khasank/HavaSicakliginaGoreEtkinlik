import java.util.Scanner;

public class HavaSicakliginaGoreEtkinlik {
    public static void main(String[] args) {
        // Değişkenler tanımlanıyor.
        int head;

        Scanner input = new Scanner(System.in); // Scanner sınıfı değişkenimizi tanımladık.

        // Kullanıcıdan veri alışı işlemleri yapıyoruz. :
        System.out.print("Sıcaklığı Giriniz : ");
        head = input.nextInt();

        // Karşılaştırma işlemlerini yapıyoruz.
        if (head < 5) {
            System.out.println("Kayak yapabilirsiniz. ");
        } else if (head >= 5 && head <= 25) {
            if (head >= 10 && head <= 15) {
                System.out.println("Sinemaya gidebilir veya piknik yapabilirsiniz. ");
            } else if (head < 10) {
                System.out.println("Sinemaya gidebilirsiniz.");
            } else if (head > 15) {
                System.out.println("Piknik yapabilirsiniz.");
            }
        } else {
            System.out.println("Yüzmeye gidebilirsiniz. ");

        }

    }
}
