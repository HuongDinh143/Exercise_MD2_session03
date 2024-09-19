package ra;

import java.util.Scanner;

public class Exercise09 {
    public static void main(String[] args) {
        //Nhập vào email và password và kiểm tra xem có đúng định dạng không
        Scanner sc = new Scanner(System.in);
        String emailRegex="[\\w]+@[\\w]+\\.[\\w]{2,3}";
        String email;
        System.out.println("Mời bạn nhập email: ");
        while (true){
            email = sc.nextLine();
            if (email.matches(emailRegex)){
                break;
            }else {
                System.out.println("Định dạng email không đúng vui lòng nhập lại");
            }
        }
        String passwordRegex="[\\w]{6,}\\S";
        System.out.println("Mời bạn nhập password: ");
        String password;
        while (true){
            password = sc.nextLine();
            if (password.matches(passwordRegex)){
                break;
            }else {
                System.out.println("Định dạng password không đúng, xin mời nhập lại");
            }
        }
        System.out.print("email: "+email);
        System.out.println();
        System.out.print(" password: "+password);
    }
}
