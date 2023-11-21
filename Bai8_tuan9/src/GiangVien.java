import java.util.List;

public class GiangVien extends Nguoi {


private String maGiangVien;
private String khoa;
public GiangVien(String lastName, String firstNmae, String maGiangVien, String khoa) {
	super(lastName, firstNmae);
	this.maGiangVien = maGiangVien;
	this.khoa = khoa;
}
public String getMaGiangVien() {
	return maGiangVien;
}
public void setMaGiangVien(String maGiangVien) {
	this.maGiangVien = maGiangVien;
}
public String getKhoa() {
	return khoa;
}
public void setKhoa(String khoa) {
	this.khoa = khoa;
}

	public  GiangVien(String lastName, String firstNmae) {
		
		super(lastName, firstNmae);
		
	}
	@Override
	public String toString() {
		return "GiangVien [maGiangVien=" + maGiangVien + ", khoa=" + khoa + "]";
	}
	
}


