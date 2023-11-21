
public class HocPhan {
	private String maHocPhan;
	private String hocKy;
	private String phongHoc;
	public HocPhan(String maHocPhan, String hocKy, String phongHoc) {
		super();
		this.maHocPhan = maHocPhan;
		this.hocKy = hocKy;
		this.phongHoc = phongHoc;
	}
	public String getMaHocPhan() {
		return maHocPhan;
	}
	public void setMaHocPhan(String maHocPhan) {
		this.maHocPhan = maHocPhan;
	}
	public String getHocKy() {
		return hocKy;
	}
	public void setHocKy(String hocKy) {
		this.hocKy = hocKy;
	}
	public String getPhongHoc() {
		return phongHoc;
	}
	public void setPhongHoc(String phongHoc) {
		this.phongHoc = phongHoc;
	}
	@Override
	public String toString() {
		return " [maHocPhan=" + maHocPhan + ", hocKy=" + hocKy + ", phongHoc=" + phongHoc + "]";
	}
	
	
}
