package controller;

import model.SinhVien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLiDiemDanh {
    Scanner sc = new Scanner(System.in);
    public void themSinhVien(List<SinhVien> list) {
        System.out.println("Nhập mã sinh viên: ");
        String maSV = sc.nextLine();

        System.out.println("Nhập tên sinh viên: ");
        String tenSinhVien = sc.nextLine();

        System.out.println("Nhập lớp: ");
        String lop = sc.nextLine();
        SinhVien sinhVien = new SinhVien(maSV,tenSinhVien,lop,0,"Đang học");
        list.add(sinhVien);
        System.out.println("Thêm sinh viên thành công!");
    }

    public void xoaSinhVien(List<SinhVien> list) {
        System.out.println("Nhập mã sinh viên muốn xóa: ");
        String maSV = sc.nextLine();
        SinhVien sinhVien = timSinhVien(maSV,list);
        if (sinhVien == null) {
            System.out.println("Không tôồn tại sinh viên có mã là: " + maSV);
        } else {
            list.remove(sinhVien);
            System.out.println("Xóa thành công!");
        }
    }


    public SinhVien timSinhVien(String maSv,List<SinhVien> list) {
        for (SinhVien sinhVien : list) {
            if (sinhVien.getMaSV().equals(maSv)) {
                return sinhVien;
            }
        }
        return null;
    }


    public void hienThiSinhVien(List<SinhVien> list) {
        // In tiêu đề bảng
        System.out.printf("%-15s %-20s %-10s %-15s %-15s%n", "Mã Sinh Viên", "Tên Sinh Viên", "Lớp", "Số Tiết Nghỉ", "Tình Trạng");
        System.out.println("--------------------------------------------------------------------------------");

        // Duyệt qua danh sách và in thông tin sinh viên
        for (SinhVien sinhVien : list) {
            System.out.printf("%-15s %-20s %-10s %-15d %-15s%n",
                    sinhVien.getMaSV(),
                    sinhVien.getTenSinhVien(),
                    sinhVien.getLop(),
                    sinhVien.getSoTietNghi(),
                    sinhVien.getTinhTrang());
        }
    }

    public void timTheoMa(List<SinhVien> list) {
        System.out.println("Nhập mã sinh viên muốn tìm: ");
        String maSV = sc.nextLine();
        SinhVien timSinhVien = timSinhVien(maSV,list);
        if (timSinhVien == null) {
            System.out.println("Không tồn tại sinh viên này!");
        } else {

            System.out.println("Mã sinh viên: " + maSV);
            System.out.println("Tên sinh viên: " + timSinhVien.getTenSinhVien());
            System.out.println("Lớp: " + timSinhVien.getLop());
            System.out.println("Số tiết nghỉ: " + timSinhVien.getSoTietNghi());
            System.out.println("Tình trạng: " + timSinhVien.getTinhTrang());
        }
    }


    public void kiemTraCamThi(List<SinhVien> list) {
        List<SinhVien> list2 = new ArrayList<SinhVien>();
        for (SinhVien sinhVien : list) {
            if (sinhVien.getSoTietNghi() > 8){
                list2.add(sinhVien);
            }
        }
        if (list2.size() > 0) {
            for (SinhVien sinhVien : list2) {
                System.out.println("Mã sinh viên: " + sinhVien.getMaSV());
                System.out.println("Tên sinh viên: " + sinhVien.getTenSinhVien());
                System.out.println("Lớp: " + sinhVien.getLop());
                System.out.println("Số tiết nghỉ: " + sinhVien.getSoTietNghi());
                System.out.println("Tình trạng: Cấm thi");
            }
        } else {
            System.out.println("Chưa có sinh viên nào bị cấm thi!");
        }
    }


    public void suaSinhVien(List<SinhVien> list) {
        System.out.println("Nhập mã sinh viên muốn sửa: ");
        String maSV = sc.nextLine();
        SinhVien sinhVien = timSinhVien(maSV,list);
        if (sinhVien == null) {
            System.out.println("Không có sinh viên có mã: " + maSV);
        } else {
            System.out.println("Nhập tên sinh viên: ");
            String tenSv = sc.nextLine();
            sinhVien.setTenSinhVien(tenSv);
            System.out.println("Sửa thành công!");
        }
    }


    public void diemDanh(List<SinhVien> list) {
        System.out.println("Nhập mã sinh viên : ");
        String maSV = sc.nextLine();
        SinhVien sinhVien = timSinhVien(maSV,list);
        if (sinhVien == null) {
            System.out.println("Không có sinh viên có mã: " + maSV);
        } else {
            System.out.println("Nhập số tiết: ");
            int soTietNghi = sc.nextInt();
            sinhVien.setSoTietNghi(soTietNghi);
            if (soTietNghi > 8){
                sinhVien.setTinhTrang("Cấm thi");
            } else {
                sinhVien.setTinhTrang("Đang học");
            }
        }
    }


    
}
