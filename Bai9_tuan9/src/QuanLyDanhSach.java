

	import java.util.LinkedList;

	public class QuanLyDanhSach {
	    public static void main(String[] args) {
	        // Tạo hai danh sách liên kết chứa chuỗi String
	        LinkedList<String> danhSach1 = new LinkedList<>();
	        danhSach1.add("Chuoi 1");
	        danhSach1.add("Chuoi 2");
	        danhSach1.add("Chuoi 3");

	        LinkedList<String> danhSach2 = new LinkedList<>();

	        // In ra danh sách trước khi thực hiện các toán tử
	        System.out.println("Danh sach 1 ban dau:");
	        inDanhSach(danhSach1);
	        System.out.println("Danh sach 2 ban dau:");
	        inDanhSach(danhSach2);

	        // Sao chép danh sách 1 sang danh sách 2
	        saoChepDanhSach(danhSach1, danhSach2);

	        // Chuyển đổi chuỗi sang chữ hoa trong danh sách 2
	        chuyenChuoiSangChuHoa(danhSach2);

	        // Xoá các phần tử của danh sách 1
	        xoaDanhSach(danhSach1);

	        // In ra danh sách sau khi thực hiện các toán tử
	        System.out.println("\nDanh sach 1 sau khi xoa:");
	        inDanhSach(danhSach1);
	        System.out.println("Danh sach 2 sau khi chuyen doi & sao chep:");
	        inDanhSach(danhSach2);
	    }

	    // Phương thức in ra các phần tử của danh sách
	    private static void inDanhSach(LinkedList<String> danhSach) {
	        for (String phanTu : danhSach) {
	            System.out.println(phanTu);
	        }
	    }

	    // Phương thức sao chép danh sách từ danhSach1 sang danhSach2
	    private static void saoChepDanhSach(LinkedList<String> danhSach1, LinkedList<String> danhSach2) {
	        danhSach2.addAll(danhSach1);
	    }

	    // Phương thức chuyển đổi chuỗi sang chữ hoa trong danh sách
	    private static void chuyenChuoiSangChuHoa(LinkedList<String> danhSach) {
	        for (int i = 0; i < danhSach.size(); i++) {
	            danhSach.set(i, danhSach.get(i).toUpperCase());
	        }
	    }

	    // Phương thức xoá các phần tử của danh sách
	    private static void xoaDanhSach(LinkedList<String> danhSach) {
	        danhSach.clear();
	    }
	}


