import java.util.Random;
import java.util.Scanner;

public class TaoMaGiaNgauNhien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập độ dài chuỗi
        System.out.print("Nhập n: ");
        int n = scanner.nextInt();

        // Kiểm tra điều kiện n
        if (n < 1 || n > 1000) {
            System.out.println("Giá trị n không hợp lệ.");
        } else {
            // Chuỗi chứa các ký tự được phép sử dụng
            String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

            Random random = new Random();
            StringBuilder result = new StringBuilder();

            // Tạo chuỗi ngẫu nhiên có độ dài n
            for (int i = 0; i < n; i++) {
                int index = random.nextInt(characters.length());
                result.append(characters.charAt(index));
            }

            // In kết quả
            System.out.println("Chuỗi ngẫu nhiên: " + result.toString());
        }

        scanner.close();
    }
}