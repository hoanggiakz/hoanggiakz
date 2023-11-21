
public class PhongMayTinh extends PhongHoc {
	 int soMayTinh;

	    public PhongMayTinh(String maPhong, String dayNha, double dienTich, int soBongDen, int soMayTinh) {
	        super(maPhong, dayNha, dienTich, soBongDen);
	        this.soMayTinh = soMayTinh;
	    }
	    
	    
		@Override
		public boolean danhGia() {
			// TODO Auto-generated method stub
			
	    if (dienTich / soMayTinh <=10)

			return true;
	    else {
	    	
	    }
		return false;
		}


	    
	    
	    
	    
	    
	    
	    
	    
}
