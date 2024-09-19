package ra;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        //gop mang
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử của array1");
        int n1=Integer.parseInt(sc.nextLine());
        int[] array1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            System.out.printf("array1[%d]",i);
          array1[i]=Integer.parseInt(sc.nextLine());
        }
        System.out.println(Arrays.toString(array1));
        System.out.println("Mời bạn nhập số phần tử của array2");
        int n2=Integer.parseInt(sc.nextLine());
        int[] array2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            System.out.printf("array2[%d]",i);
            array2[i]=Integer.parseInt(sc.nextLine());
        }
        System.out.println(Arrays.toString(array2));
        int n3=n1+n2;
        // mảng 1 chiều
        int[] array3 = new int[n3];
        for (int i = 0; i < n1; i++) {
            array3[i]=array1[i];
        }

        for (int i = 0; i < n2; i++) {
            array3[n1+i]=array2[i];
        }
        System.out.println(Arrays.toString(array3));

        // mảng 2 chiều
        int[][] array4 = new int[n1][n2];
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                array4[i][j]= Integer.parseInt(array1[i]+""+array2[j]);

            }
        }
        System.out.println("mảng hai chiều tạo được là");
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                System.out.print(array4[i][j]+"\t");
            }
            System.out.println("\n");
        }

    }
}
