import java.util.Scanner;

/**
 * Created by user on 07.07.17.
 */
public class Solution1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number A:");
        int A = sc.nextInt();
        System.out.print("Enter number B:");
        int B = sc.nextInt();

        int tmp = A;
        A = B;
        B = tmp;
        System.out.println("A=" + A);
        System.out.println("B=" + B);

    }
}
