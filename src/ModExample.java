import java.util.Scanner;

public class ModExample {
    public static void main(String[] args) {

        // Kullanıcıdan aldığımız sayıya kadar olan sayıların 3 ve 4 e tam bölünebilenlerinin ortalamasını hesaplama.

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int number = input.nextInt();

        int sum = 0, count = 0;

        for (int i = 1; i < number; i++) {
            if (i % 3 == 0 && i % 4 == 0) {

                sum += i;
                count++;
                System.out.println(i); //Sayıları göstermek için.
            }
        }
        //System.out.println(count);
        double average = (sum / (float) count);
        if (count == 0) {
            System.out.println("Girilen aralıkta 3'e ve 4'e aynı anda bölünebilen bir sayı yoktur.");
        } else {
            System.out.println("3'e ve 4'e aynı anda bölünen sayıların ortalaması: " + average);
        }
    }
}
