
public class SinhVien extends Nguoi {

public SinhVien(String lastName, String firstNmae) {
		super(lastName, firstNmae);
		// TODO Auto-generated constructor stub
	}
private String maSinhVien;
private int namTrungTuyen;
public SinhVien(String lastName, String firstNmae, String maSinhVien, int namTrungTuyen) {
	super(lastName, firstNmae);
	this.maSinhVien = maSinhVien;
	this.namTrungTuyen = namTrungTuyen;
}
public String getMaSinhVien() {
	return maSinhVien;
}
public void setMaSinhVien(String maSinhVien) {
	this.maSinhVien = maSinhVien;
}
public int getNamTrungTuyen() {
	return namTrungTuyen;
}
public void setNamTrungTuyen(int namTrungTuyen) {
	this.namTrungTuyen = namTrungTuyen;
}
@Override
public String toString() {
	return "SinhVien [maSinhVien=" + maSinhVien + ", namTrungTuyen=" + namTrungTuyen + "]";
}


}
