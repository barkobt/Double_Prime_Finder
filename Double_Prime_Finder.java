import java.util.Scanner;
/*
Java döngüler ile girilen sayıya kadar olan 2'nin kuvvetlerini ekrana yazdıran programı yazıyoruz.

Ödev
Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
 */
public class Double_Prime_Finder {
    public static void main(String[] args) {
        int i;
        System.out.println("Bir sayı giriniz:");
        Scanner input = new Scanner(System.in);
        int entry = input.nextInt();
        for (i=1; i<entry; i*=2) {
            System.out.println(i);

        }
        System.out.println("---------------");
        System.out.println("Bir sayı giriniz:");
        for (i=1; i<entry; i*=3){
            System.out.println(i);
        }



    }


}
