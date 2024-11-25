import model.SinhVien;
import view.DiemDanh;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SinhVien sinhVien = new SinhVien("1771020401", "Nguyễn Văn Mạnh", "CNTT1701", 2, "Đang học");
        SinhVien sinhVien1 = new SinhVien("1771020402", "Trần Thị Trà", "CNTT1701", 1, "Đang học");
        SinhVien sinhVien2 =  new SinhVien("1771020403", "Lê Văn Luyện", "CNTT1701", 0, "Đang học");
        SinhVien sinhVien3 = new SinhVien("1771020404", "Phạm Thị Nhu", "CNTT1701", 3, "Đang học");
        SinhVien sinhVien4 = new SinhVien("1771020405", "Nguyễn Văn Em", "CNTT1701", 1, "Đang học");
        SinhVien sinhVien5 = new SinhVien("1771020406", "Trần Văn Lâm", "CNTT1701", 2, "Đang học");
        SinhVien sinhVien6 = new SinhVien("1771020407", "Lê Thị Hòa", "CNTT1701", 0, "Đang học");
        SinhVien sinhVien7 = new SinhVien("1771020408", "Phạm Văn Dương", "CNTT1701", 4, "Đang học");
        SinhVien sinhVien8 = new SinhVien("1771020409", "Nguyễn Thị Hiếu", "CNTT1701", 1, "Đang học");
        SinhVien sinhVien9 = new SinhVien("1771020410", "Trần Văn Khánh ", "CNTT1701", 2, "Đang học");

        List<SinhVien> list = new ArrayList<>();
        list.add(sinhVien);
        list.add(sinhVien1);
        list.add(sinhVien2);
        list.add(sinhVien3);
        list.add(sinhVien4);
        list.add(sinhVien5);
        list.add(sinhVien6);
        list.add(sinhVien7);
        list.add(sinhVien8);
        list.add(sinhVien9);


        DiemDanh d = new DiemDanh();
        d.menu(list);
    }
}