package ra;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        //tìm phần tử lớn nhất trong mảng 2 chiều
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chiều số hàng của ma trận: ");
        int i = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập số cột của ma trận: ");
        int j = Integer.parseInt(sc.nextLine());
        float[][] maTran = new float[i][j];
        for (int a = 0; a < maTran.length; a++) {
            for (int b = 0; b < maTran[0].length; b++) {
                System.out.printf("matran[%d][%d] = ", a, b);
                maTran[a][b] = sc.nextFloat();
            }
        }
        float Max = 0;
        int[] toaDo = new int[2];
        for (int a = 0; a < maTran.length; a++) {
            for (int b = 0; b < maTran[0].length; b++) {
                if (maTran[a][b] > Max) {
                    Max = maTran[a][b];
                    toaDo[0] = a;
                    toaDo[1] = b;
                }
            }

            System.out.println("Giá trị lớn nhất là: " + Max + "Tọa độ" + Arrays.toString(toaDo));


            }
        System.out.println("in ra ma trận");
        for (int a = 0; a < maTran.length; a++) {
            for (int b = 0; b < maTran[0].length; b++) {
                System.out.print(maTran[a][b] + "\t");
            }
            System.out.println();
        }
    }
}
