
public class test {

	    

public class Main {
    public static void main(String[] args) {
        PhongLyThuyet phongLyThuyet = new PhongLyThuyet("LT001", "A", 50, 5, true);
        PhongMayTinh phongMayTinh = new PhongMayTinh("MT001", "B", 40, 4, 20);
        PhongThiNghiem phongThiNghiem = new PhongThiNghiem("TN001", "C", 60, 6, "Hóa học", 15, true);

        System.out.println("Phong ly thuyet: " + phongLyThuyet.coMayChieu);
        System.out.println("Phong May Tinh Dat Chuan: " + (phongMayTinh.soMayTinh >= phongMayTinh.dienTich / 1.5));
        System.out.println("Phong Thi Nghiem Co Dat Chua: " + phongThiNghiem.coDatChuan());
    }
}
}
