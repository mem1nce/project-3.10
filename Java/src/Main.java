import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan sayıları alıyoruz
        System.out.print("Birinci sayıyı giriniz: ");
        int num1 = input.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        int num2 = input.nextInt();

        // EBOB hesaplama (while döngüsü ile)
        int i = Math.min(num1, num2);  // Küçük sayıyı buluyoruz
        int ebob = 1;

        while (i > 0) {
            if (num1 % i == 0 && num2 % i == 0) {
                ebob = i;
                break;  // EBOB bulundu, döngüden çıkıyoruz
            }
            i--;
        }

        System.out.println("EBOB: " + ebob);

        // EKOK hesaplama (while döngüsü ile)
        int ekok = Math.max(num1, num2);  // Büyük sayıyı başlangıç olarak alıyoruz

        while (true) {
            if (ekok % num1 == 0 && ekok % num2 == 0) {
                break;  // EKOK bulundu, döngüden çıkıyoruz
            }
            ekok++;
        }

        System.out.println("EKOK: " + ekok);
    }
}
