import java.util.Scanner;

/**
 * Created by user on 07.07.17.
 */
public class Solution4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int arr[] = new int[sc.nextInt()];

        System.out.println("Введите " + arr.length + " элементов для заполнения массива");
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for (int i = arr.length; i > 0; i--){
            for (int j = arr.length - 1; j > 0; j--){
                if (arr[j - 1] < arr[j]){
                    int tmp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }

        for (int i : arr){
            System.out.println(i);
        }
    }
}
