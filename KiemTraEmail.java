import java.util.Scanner;

public class KiemTraEmail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập email từ bàn phím
        System.out.print("Nhập email: ");
        String email = scanner.nextLine();

        // Loại bỏ khoảng trắng thừa ở đầu và cuối chuỗi
        email = email.trim();

        // Regex kiểm tra định dạng email hợp lệ
        String regex = "^[a-zA-Z0-9._]+@[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)*\\.[a-zA-Z]{2,6}$";

        // Kiểm tra email
        if (email.matches(regex)) {
            System.out.println("Email hợp lệ");
        } else {
            System.out.println("Email không hợp lệ");
        }

        scanner.close();
    }
}