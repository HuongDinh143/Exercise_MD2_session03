package ra;

public class Exercise07 {
    public static void main(String[] args) {
        //Kiểm tra chuỗi chứa chuỗi khác
        StringBuilder str1 = new StringBuilder("Rikkei Academy");
        String str2 = "Rikkei";
        System.out.println("kiểm tra xem chuỗi str2 có chứa str2 không: " + str1.toString().contains(str2));
    }
}
