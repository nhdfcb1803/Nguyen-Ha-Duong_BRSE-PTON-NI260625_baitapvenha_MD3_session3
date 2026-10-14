import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhap thong tin khach hang
        System.out.print("Nhap ten khach hang: ");
        String tenKhachHang = scanner.nextLine();

        System.out.print("Nhap ten san pham: ");
        String tenSanPham = scanner.nextLine();

        System.out.print("Nhap gia san pham: ");
        double giaSanPham = scanner.nextDouble();

        System.out.print("Nhap so luong mua: ");
        int soLuong = scanner.nextInt();

        System.out.print("Khach hang co the thanh vien khong (true/false): ");
        boolean thanhVien = scanner.nextBoolean();

        // Tinh tien
        double thanhTien = giaSanPham * soLuong;

        // Giam gia 10% neu la thanh vien
        double giamGia = 0;
        if (thanhVien) {
            giamGia = thanhTien * 0.10;
        }

        // Tinh VAT 8% tren thanh tien sau giam gia
        double tienVAT = (thanhTien - giamGia) * 0.08;

        // Tinh tong tien thanh toan
        double tongThanhToan = thanhTien - giamGia + tienVAT;

        // Hien thi hoa don
        System.out.println("\n========== HOA DON THANH TOAN ==========");
        System.out.println("Khach hang: " + tenKhachHang);
        System.out.println("San pham: " + tenSanPham);
        System.out.println("So luong: " + soLuong);

        System.out.printf("Don gia: %.0f VND%n", giaSanPham);
        System.out.printf("Thanh tien: %.0f VND%n", thanhTien);
        System.out.printf("Giam gia: %.0f VND%n", giamGia);
        System.out.printf("Tien VAT (8%%): %.0f VND%n", tienVAT);
        System.out.printf("Tong thanh toan: %.0f VND%n", tongThanhToan);

        System.out.println("========================================");

        scanner.close();
    }
}