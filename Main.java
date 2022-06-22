import java.util.Scanner;
//Patika.dev linkim --> https://app.patika.dev/ailker
public class Main {
    public static void main(String[] args) {
        double n, total = 0, k, s;
        Scanner inp = new Scanner(System.in);
        System.out.print("n sayisini giriniz :");
        n = inp.nextInt();

        for (int i = 1; i <= n; i++) {
            k = i;
            s = 1 / k;
            total += s;
        }
        System.out.println(total);

    }
}