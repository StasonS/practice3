import java.util.Scanner;

public class Solution3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива А:");
        int[] arrA = new int[sc.nextInt()];
        System.out.println("Введите размер массива B:");
        int[] arrB = new int[sc.nextInt()];
        System.out.println("Введите " + arrA.length + " элементов для заполнения массива A");
        for (int i = 0; i < arrA.length; i++){
            arrA[i] = sc.nextInt();
        }
        System.out.println("Введите " + arrB.length + " элементов для заполнения массива B");
        for (int i = 0; i < arrB.length; i++){
            arrB[i] = sc.nextInt();
        }

        int[] sum = new int[(arrA.length > arrB.length) ? arrA.length : arrB.length];

        if (arrA.length > arrB.length){
            for (int i = 0; i < sum.length; i++){
                try{
                    sum[i] = arrA[i] + arrB[i];
                }
                catch (Exception e){
                    sum[i] = arrA[i];
                }
            }
        }
        else {
            for (int i = 0; i < sum.length; i++){
                try{
                    sum[i] = arrA[i] + arrB[i];
                }
                catch (Exception e){
                    sum[i] = arrB[i];
                }
            }
        }

        System.out.println("Итоговый массив:");
        for (int i : sum){
            System.out.println(i);
        }
    }
}
