package ra;

import java.util.Scanner;

public class exercise01 {
    public static void main(String[] args) {
        int[] numbers = {10, 4, 6, 7, 8, 6, 3, 2, 9, 5};
        int[] newNumbers = new int[10];
        int index=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhâp vào 1 số : ");
        int n = Integer.parseInt(sc.nextLine());
        for (int element: numbers) {
            if(element != n) {
                newNumbers[index++] = element;
            }

        }
        for (int element: newNumbers) {
            System.out.print(element + " ");
        }
    }
}
