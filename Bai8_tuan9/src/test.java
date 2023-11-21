import java.lang.reflect.Array;
import java.util.ArrayList;

public class test {
public static void main(String[] args) {
	
	GiangVien gv = new GiangVien("Tuan", "Hoang", "111", "KhoaCNTT");
	GiangVien gv2 = new GiangVien("Nguyen", "van A", "222", "KhoaQTKD");
	SinhVien sv = new SinhVien("Hoang", "Gia","22003145" , 2022);
	SinhVien sv2 = new SinhVien("Nguyen", "vanB", "22003142", 2023);
	KhoaHoc kh = new KhoaHoc("147", "KhoaHocNganHna", 15000);
	KhoaHoc kh1 = new KhoaHoc("852", " KhoaHocDaiHan", 17000);
	HocPhan hp = new HocPhan("abc", "ky I", "Phong1");
	HocPhan hp2 = new HocPhan("bca", "hoc ky II", "Phong2");
	GhiDanh gd = new GhiDanh("DangHoc", "Tam Diem", 8);
	System.out.println("SInhVien va Diem"+sv+gd);
	//tao danh sach hoc phan
	ArrayList<HocPhan> danhSachHocPhan = new ArrayList<>();
	danhSachHocPhan.add(hp2);
	danhSachHocPhan.add(hp);
	System.out.println("Danh sach hoc Phan"+danhSachHocPhan);
	// tao danh sach giang vien
	 ArrayList<GiangVien > danhSachGiangVien = new ArrayList<>();
	 danhSachGiangVien.add(gv2) ;
	 danhSachGiangVien.add(gv);
     // In ra danh sách giảng viên
     System.out.println("Danh sach giang vien:" +danhSachGiangVien  );
     // tao danh sach sinh vien 
     ArrayList<SinhVien> danhSachSinhVien = new ArrayList<>();
     danhSachSinhVien.add(sv2);
     danhSachSinhVien.add(sv);
     //In ra danh sach sinh vien
     System.out.println("Danh Sach Sinh Vien:"+danhSachSinhVien);
     
     //tao khoa hoc
     ArrayList<KhoaHoc> danhSachKhoaHoc = new ArrayList<>();
     danhSachKhoaHoc.add(kh1);
     danhSachKhoaHoc.add(kh);
     System.out.println("Danh sach khoa hoc:"
     +danhSachKhoaHoc  );
}
 

}     







