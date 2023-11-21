
public class PhongLyThuyet extends PhongHoc  {
	
	    boolean coMayChieu;

	    public PhongLyThuyet(String maPhong, String dayNha, double dienTich, int soBongDen, boolean coMayChieu) {
	        super(maPhong, dayNha, dienTich, soBongDen);
	        this.coMayChieu = coMayChieu;
	    
}
	    public boolean coDatChuan() {
	        return (dienTich / soBongDen >= 10) ; }
	    
	    
		@Override
		public String toString() {
			return "PhongLyThuyet [coMayChieu=" + coMayChieu + ", maPhong=" + maPhong + ", dayNha=" + dayNha
					+ ", dienTich=" + dienTich + ", soBongDen=" + soBongDen + ", getMaPhong()=" + getMaPhong()
					+ ", getDayNha()=" + getDayNha() + ", getDienTich()=" + getDienTich() + ", getSoBongDen()="
					+ getSoBongDen() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
					+ ", hashCode()=" + hashCode() + "]";
		
}
		@Override
		public boolean danhGia() {
			// TODO Auto-generated method stub
			
	    if (dienTich / soBongDen <=10)

			return true;
	    else {
	    	
	    }
		return false;
		} }