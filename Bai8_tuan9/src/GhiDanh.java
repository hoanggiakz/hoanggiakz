
public class GhiDanh {

		private String trangThai;
		private String diemChu;
		private double diemSo;
		public GhiDanh(String trangThai, String diemChu, double diemSo) {
			
			this.trangThai = trangThai;
			this.diemChu = diemChu;
			this.diemSo = diemSo;
		}
		public String getTrangThai() {
			return trangThai;
		}
		public void setTrangThai(String trangThai) {
			this.trangThai = trangThai;
		}
		public String getDiemChu() {
			return diemChu;
		}
		public void setDiemChu(String diemChu) {
			this.diemChu = diemChu;
		}
		public double getDiemSo() {
			return diemSo;
		}
		public void setDiemSo(double diemSo) {
			this.diemSo = diemSo;
		}
		@Override
		public String toString() {
			return " [trangThai=" + trangThai + ", diemChu=" + diemChu + ", diemSo=" + diemSo + "]";
		}
		

		
		}


