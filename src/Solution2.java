import java.util.Scanner;

/**
 * Created by user on 07.07.17.
 */
public class Solution2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int arr[] = new int[sc.nextInt()];

        System.out.println("Введите " + arr.length + " элементов для заполнения массива");
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < (arr.length / 2); i++){
            int tmp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = tmp;
        }

        for (int i : arr){
            System.out.println(i);
        }
    }
}
