import java.util.Scanner;

public class New {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter size of row = ");
        int n1 = n.nextInt();
        System.out.println("Enter size of colomn = ");
        int n2 = n.nextInt();
int sum = 0;
        int a[][] = new int[n1][n2];
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                System.out.println(i + " "+ j);
                a[i][j] = n.nextInt();
                sum = sum + a[i][j];
            }
        }
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Sum = "+sum);

    }
}
