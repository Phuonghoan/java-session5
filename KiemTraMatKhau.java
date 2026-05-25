import java.util.Scanner;

public class KiemTraMatKhau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập mật khẩu
        System.out.print("Nhập mật khẩu: ");
        String password = scanner.nextLine();

        // Các biến kiểm tra điều kiện
        boolean coChuHoa = false;
        boolean coChuThuong = false;
        boolean coChuSo = false;
        boolean coKyTuDacBiet = false;

        // Kiểm tra từng ký tự trong mật khẩu
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (Character.isUpperCase(ch)) {
                coChuHoa = true;
            } else if (Character.isLowerCase(ch)) {
                coChuThuong = true;
            } else if (Character.isDigit(ch)) {
                coChuSo = true;
            } else {
                coKyTuDacBiet = true;
            }
        }

        // Kiểm tra mật khẩu hợp lệ
        if (password.length() >= 8 && coChuHoa && coChuThuong && coChuSo && coKyTuDacBiet) {
            System.out.println("Mật khẩu hợp lệ");
        } else {
            System.out.println("Mật khẩu không hợp lệ");
        }

        scanner.close();
    }
}