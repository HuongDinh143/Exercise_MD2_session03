package ra;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        //Chèn phần tử vào mảng
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử muốn khai báo");
        int n = Integer.parseInt(sc.nextLine());
        int[] numbers = new int[n];
        int counter = 1;


        //Nhập giá trị bất kỳ từ bàn phìm và vị trí cần chèn
        while (true){
            System.out.println("Mời bạn nhập giá trị cần chèn");
            int n3 = Integer.parseInt(sc.nextLine());
            System.out.println("Mời bạn nhập vị trí cần chèn");
            int index = Integer.parseInt(sc.nextLine());
            if (index < 0 || index > numbers.length){
                System.out.println("Không thể chèn phần tử vào mảng");
            } else {
                for (int i = numbers.length - 1; i > index; i--){
                    numbers[i] = numbers[i - 1];

                }
                numbers[index] = n3;
                counter++;
                if (counter > numbers.length){
                    System.out.println("Bạn đã thêm đủ số phần tử của mảng, thoát chương trình");
                    break;
                }
                System.out.println("Bạn có muốn chèn thêm?");
                String answer = sc.nextLine();
                if(answer.equalsIgnoreCase("N")){
                    System.out.println("Thoat chương trình");
                    break;
                }
            }

        }

        System.out.println(Arrays.toString(numbers));

    }
}
