
public class PhongThiNghiem extends PhongHoc {
	 String chuyenNganh;
	    int sucChua;
	    boolean coBonRua;

	    public PhongThiNghiem(String maPhong, String dayNha, double dienTich, int soBongDen, String chuyenNganh, int sucChua, boolean coBonRua) {
	        super(maPhong, dayNha, dienTich, soBongDen);
	        this.chuyenNganh = chuyenNganh;
	        this.sucChua = sucChua;
	        this.coBonRua = coBonRua;
	    }

		@Override
		public boolean danhGia() {
			if(coBonRua)
				
		
			return coBonRua;
			else
				return false;
		}

		@Override
		public String toString() {
			return "PhongThiNghiem [toString()=" + super.toString() + ", chuyenNganh=" + chuyenNganh + ", sucChua="
					+ sucChua + ", coBonRua=" + coBonRua + ", danhGia()=" + danhGia() + "]";
		}

		public String coDatChuan() {
			// TODO Auto-generated method stub
			return null;
		}

		
		
}
