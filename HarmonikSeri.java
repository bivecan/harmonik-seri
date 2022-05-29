import java.util.Scanner;

public class HarmonikSeri {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Sayı giriniz");
        int number=input.nextInt();

        double sum=0;

        for(int i=1; i<=number; i++){
            sum += (1.0/i);
        }

        System.out.println("sonuc: " + sum);
    }
}
