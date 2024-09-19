package ra;

import java.util.Scanner;

public class Exercise06 {
    public static void main(String[] args) {
        //Nối chuỗi
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập chuỗi 1");
        String chuoi1 = sc.nextLine();
        System.out.println("Mời bạn nhập chuỗi 2");
        String chuoi2 = sc.nextLine();
        StringBuilder chuoi3 = new StringBuilder();
        chuoi3.append(chuoi1);
        chuoi3.append(chuoi2);
        System.out.println(chuoi3);
    }
}
