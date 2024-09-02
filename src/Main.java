import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int sum = 0;
        int a[] = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = n.nextInt();

            sum = sum + a[i];

        }
        for (int i = 0; i < 5; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("Sum = "+sum);
    }
}
