
public class KhoaHoc {
private String maKhoaHoc;
private String tenKhoaHoc;
private int hocPhi;
public KhoaHoc(String maKhoaHoc, String tenKhoaHoc, int hocPhi) {
	
	this.maKhoaHoc = maKhoaHoc;
	this.tenKhoaHoc = tenKhoaHoc;
	this.hocPhi = hocPhi;
}
public String getMaKhoaHoc() {
	return maKhoaHoc;
}
public void setMaKhoaHoc(String maKhoaHoc) {
	this.maKhoaHoc = maKhoaHoc;
}
public String getTenKhoaHoc() {
	return tenKhoaHoc;
}
public void setTenKhoaHoc(String tenKhoaHoc) {
	this.tenKhoaHoc = tenKhoaHoc;
}
public int getHocPhi() {
	return hocPhi;
}
public void setHocPhi(int hocPhi) {
	this.hocPhi = hocPhi;
}
@Override
public String toString() {
	return "KhoaHoc [maKhoaHoc=" + maKhoaHoc + ", tenKhoaHoc=" + tenKhoaHoc + ", hocPhi=" + hocPhi + "]";
}

}
