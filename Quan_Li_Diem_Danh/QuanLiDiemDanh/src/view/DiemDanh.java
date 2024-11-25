package view;
import controller.QuanLiDiemDanh;
import model.SinhVien;

import java.util.List;
import java.util.Scanner;

public class DiemDanh {
    Scanner sc = new Scanner(System.in);
    QuanLiDiemDanh quanLiDiemDanh = new QuanLiDiemDanh();
    public void menu(List<SinhVien> list) {
        String choice;
        while (true) {
            System.out.println("1. Thêm sinh viên mới");
            System.out.println("2. Sửa tên sinh viên");
            System.out.println("3. Xóa sinh viên");
            System.out.println("4. Hiển thị danh sách sinh viên");
            System.out.println("5. Điểm danh");
            System.out.println("6. Kiểm tra số lượng sinh viên bị cấm thi");
            System.out.println("7. Tìm kiếm theo mã sinh viên");
            System.out.println("8. Thoát");
            System.out.print("Mời bạn nhập lựa chọn");
            choice = sc.nextLine();
            switch (choice) {
                case "1":
                    quanLiDiemDanh.themSinhVien(list);
                    break;
                case "2":
                    quanLiDiemDanh.suaSinhVien(list);
                    break;
                case "3":
                    quanLiDiemDanh.xoaSinhVien(list);
                    break;
                case "4":
                    quanLiDiemDanh.hienThiSinhVien(list);
                    break;
                case "5":
                    quanLiDiemDanh.diemDanh(list);
                    break;
                case "6":
                    quanLiDiemDanh.kiemTraCamThi(list);
                    break;
                case "7":
                    quanLiDiemDanh.timTheoMa(list);
                    break;
                default:
                    break;

            }
        }
    }
}
