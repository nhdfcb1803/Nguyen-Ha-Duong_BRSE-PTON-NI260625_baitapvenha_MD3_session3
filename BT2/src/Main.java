import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Double> danhSachDiem = new ArrayList<>();

    public static void main(String[] args) {
        int luaChon;

        do {
            System.out.println("\n***************MENU NHAP DIEM***************");
            System.out.println("1. Nhap diem hoc vien");
            System.out.println("2. Hien thi thong ke");
            System.out.println("3. Thoat");
            System.out.print("Lua chon cua ban: ");

            luaChon = scanner.nextInt();

            switch (luaChon) {
                case 1:
                    nhapDiem();
                    break;

                case 2:
                    hienThiThongKe();
                    break;

                case 3:
                    System.out.println("Ket thuc chuong trinh!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Lua chon khong hop le!");
            }

        } while (true);
    }

    // Chuc nang 1: Nhap diem hoc vien
    public static void nhapDiem() {
        double diem;

        while (true) {
            System.out.print("Nhap diem (-1 de ket thuc): ");
            diem = scanner.nextDouble();

            if (diem == -1) {
                break;
            }

            if (diem < 0 || diem > 10) {
                System.out.println("Diem khong hop le! Vui long nhap tu 0 den 10.");
                continue;
            }

            danhSachDiem.add(diem);

            System.out.println("Xep loai: " + xepLoai(diem));
        }

        System.out.println("Da ket thuc nhap diem.");
        System.out.println("Tong so hoc vien: " + danhSachDiem.size());
    }

    // Xep loai hoc luc
    public static String xepLoai(double diem) {
        if (diem < 5) {
            return "Yeu";
        } else if (diem < 7) {
            return "Trung Binh";
        } else if (diem < 8) {
            return "Kha";
        } else if (diem < 9) {
            return "Gioi";
        } else {
            return "Xuat sac";
        }
    }

    // Chuc nang 2: Hien thi thong ke
    public static void hienThiThongKe() {
        if (danhSachDiem.isEmpty()) {
            System.out.println("Chua co du lieu");
            return;
        }

        double tongDiem = 0;
        double diemCaoNhat = danhSachDiem.get(0);
        double diemThapNhat = danhSachDiem.get(0);

        for (double diem : danhSachDiem) {
            tongDiem += diem;

            if (diem > diemCaoNhat) {
                diemCaoNhat = diem;
            }

            if (diem < diemThapNhat) {
                diemThapNhat = diem;
            }
        }

        double diemTrungBinh = tongDiem / danhSachDiem.size();

        System.out.println("\n========== THONG KE DIEM ==========");
        System.out.println("So hoc vien: " + danhSachDiem.size());
        System.out.printf("Tong diem: %.2f%n", tongDiem);
        System.out.printf("Diem trung binh: %.2f%n", diemTrungBinh);
        System.out.printf("Diem cao nhat: %.2f%n", diemCaoNhat);
        System.out.printf("Diem thap nhat: %.2f%n", diemThapNhat);
        System.out.println("===================================");
    }
}