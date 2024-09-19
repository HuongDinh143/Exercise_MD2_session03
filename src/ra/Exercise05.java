package ra;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        //tìm giá trị nhỏ nhất trong mảng
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số lượng phần tử của mảng: ");
        int n = Integer.parseInt(sc.nextLine());
        int[] numbers = new int[n];
        System.out.println("Bạn muốn nhập giá trị từ bàn phím hay khởi tạo giá trị ngẫu nhiên?" +
                "Nhập từ bàn nhím nhập 1, tạo ngẫu nhiên chọn phím bất kỳ khác 1");
        int answer = Integer.parseInt(sc.nextLine());
        if (answer == 1) {
            for (int i = 0; i < n; i++) {
                System.out.printf("numbers[%d] = ",i);
                numbers[i] = Integer.parseInt(sc.nextLine());
            }
            System.out.println("Mảng đã được tạo: "+ Arrays.toString(numbers));
            int min=numbers[0];
            for (int element : numbers) {
                if (element < min) {
                    min = element;
                }
            }
            System.out.println("Giá trị nhỏ nhất: " + min);
        }else {
            Random rd = new Random();
            //tao cac phan tu ngau nhien cho mang
            for (int i = 0; i < n; i++) {
                int ngauNhien=rd.nextInt(100);
                numbers[i] = ngauNhien;

            }
            System.out.println("Mãng đã được tạo: "+ Arrays.toString(numbers));
            int min=numbers[0];
            for (int element : numbers) {
                if (element < min) {
                    min = element;
                }
            }
            System.out.println("Giá trị nhỏ nhất: " + min);
        }
    }
}
