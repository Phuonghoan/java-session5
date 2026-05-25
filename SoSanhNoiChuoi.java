public class SoSanhNoiChuoi {
    public static void main(String[] args) {
        int soLanLap = 1000000;

        // 1. Nối chuỗi bằng String
        String str = "Hello";
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < soLanLap; i++) {
            str += " World";
        }

        long endTime = System.currentTimeMillis();
        long stringTime = endTime - startTime;

        // 2. Nối chuỗi bằng StringBuilder
        StringBuilder stringBuilder = new StringBuilder("Hello");
        startTime = System.currentTimeMillis();

        for (int i = 0; i < soLanLap; i++) {
            stringBuilder.append(" World");
        }

        endTime = System.currentTimeMillis();
        long stringBuilderTime = endTime - startTime;

        // 3. Nối chuỗi bằng StringBuffer
        StringBuffer stringBuffer = new StringBuffer("Hello");
        startTime = System.currentTimeMillis();

        for (int i = 0; i < soLanLap; i++) {
            stringBuffer.append(" World");
        }

        endTime = System.currentTimeMillis();
        long stringBufferTime = endTime - startTime;

        // In kết quả
        System.out.println("Thời gian thực hiện với String: " + stringTime + " ms");
        System.out.println("Thời gian thực hiện với StringBuilder: " + stringBuilderTime + " ms");
        System.out.println("Thời gian thực hiện với StringBuffer: " + stringBufferTime + " ms");

        // Nhận xét
        System.out.println();
        System.out.println("Nhận xét:");
        System.out.println("- String: Không hiệu quả cho phép nối chuỗi nhiều lần do tạo ra nhiều đối tượng mới.");
        System.out.println("- StringBuilder: Hiệu quả và nhanh chóng, thích hợp cho nhiều thao tác nối chuỗi trong một luồng.");
        System.out.println("- StringBuffer: Tương tự StringBuilder nhưng an toàn với đa luồng, có thể chậm hơn một chút do đồng bộ hóa.");
    }
}