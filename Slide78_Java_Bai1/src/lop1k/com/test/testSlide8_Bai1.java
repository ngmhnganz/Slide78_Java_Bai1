package lop1k.com.test;

import java.util.ArrayList;
import java.util.Scanner;

import lop1k.com.model.danhMuc;
import lop1k.com.model.sanPham;
import lop1k.com.model.thongTin;

public class testSlide8_Bai1 {
	static ArrayList<thongTin> quanLiDonHang = new ArrayList<thongTin>();
	private static void Menu() {
		System.out.println("1. Thêm danh mục.");
		System.out.println("2. Thêm sản phẩm cho danh mục có sẵn.");
		System.out.println("3. Xuất danh sách sản phẩm từ một danh mục.");
		System.out.println("4. Cập nhật thông tin sản phẩm.");
		System.out.println("5. Xóa thông tin sản phẩm.");
		System.out.println("6. Thống kê tổng giá trị của các mặt hàng.");
		System.out.println("7. Liệt kê các sản phẩm có xuất xứ từ Trung Quốc.");
		int pick = new Scanner(System.in).nextInt();
		switch (pick) {
		case 1:
			themDanhMuc();
			break ;
		case 2:
			themSanPham();
			break;
		case 3:
			timSanPham();
			break;
		case 4: 
			capNhatSanPham();
			break;
		case 5:
			xoaSanPham();
			break;
		case 6:
			thongKeGiaTri();
			break;
		case 7:
			lietKe();
			break;
	}
	}
	private static sanPham newSanPham() {
		sanPham sanPham = new sanPham();
		System.out.println("Nhập tên sản phẩm: ");
		String s= new Scanner(System.in).nextLine();
		sanPham.setTen(s);
		System.out.println("Nhập mã sản phẩm: ");
		s= new Scanner(System.in).nextLine();
		sanPham.setMa(s);
		System.out.println("Nhập xuất xứ sản phẩm: ");
		s = new Scanner(System.in).nextLine();
		sanPham.setXuatXu(s);
		System.out.println("Nhập đơn giá: ");
		double gia = new Scanner(System.in).nextDouble();
		sanPham.setGia(gia);
		return (sanPham);
	}
	private static void xuatDanhMucSanPham() {
		int i;
		for (i =0;i<quanLiDonHang.size();i++) {
			System.out.println((i+1)+".\t"+quanLiDonHang.get(i).getDanhmuc());
		}
	}
	private static void xuatSanPham(int pickDanhMuc) {
		int i;
		for (i=0; i<quanLiDonHang.get(pickDanhMuc-1).getSanpham().size();i++) {
			System.out.println((i+1)+".\t"+quanLiDonHang.get(pickDanhMuc-1).getSanpham().get(i));
		}
	}
	private static void lietKe() {
		System.out.println("Các sản phẩm có xuất xứ Trung Quốc: ");
		int i;
		for (i =0;i<quanLiDonHang.size();i++) {
			for (int j=0;j<quanLiDonHang.get(i).getSanpham().size();j++) {
				if( quanLiDonHang.get(i).getSanpham().get(j).getXuatXu().contentEquals("Trung Quốc")) System.out.println(quanLiDonHang.get(i).getSanpham().get(j));
			}
		}
	}
	private static void thongKeGiaTri() {
		int i;
		double tongGiaTri=0;
		for (i =0;i<quanLiDonHang.size();i++) {
			for (int j=0;j<quanLiDonHang.get(i).getSanpham().size();j++) {
				tongGiaTri =tongGiaTri+ quanLiDonHang.get(i).getSanpham().get(j).getGia();
			}
		}
		System.out.println("Tổng giá trị các mặt hàng: "+ tongGiaTri);
	}
	private static void xoaSanPham() {
		System.out.println("Đây là các danh mục sản phẩm.");
		xuatDanhMucSanPham();
		System.out.println("Nhập thứ tự danh mục bạn muốn chọn: ");
		int pickDanhMuc = new Scanner(System.in).nextInt();
		System.out.println("Danh sách sản phẩm: ");
		xuatSanPham(pickDanhMuc);
		System.out.println("Nhập thứ tự sản phẩm bạn muốn chọn: ");
		int pickSanPham = new Scanner(System.in).nextInt();
		System.out.println("Bạn đã chọn sản phẩm "+quanLiDonHang.get(pickDanhMuc-1).getSanpham().get(pickSanPham));
		quanLiDonHang.get(pickDanhMuc-1).getSanpham().remove(pickSanPham);
		System.out.println("Đã xoá.");
	}
	private static void capNhatSanPham() {
		System.out.println("Đây là các danh mục sản phẩm.");
		xuatDanhMucSanPham();
		System.out.println("Nhập thứ tự danh mục bạn muốn chọn: ");
		int pickDanhMuc = new Scanner(System.in).nextInt();
		System.out.println("Danh sách sản phẩm: ");
		xuatSanPham(pickDanhMuc);
		System.out.println("Nhập thứ tự sản phẩm bạn muốn chọn: ");
		int pickSanPham = new Scanner(System.in).nextInt();
		System.out.println("Bạn đã chọn sản phẩm "+quanLiDonHang.get(pickDanhMuc-1).getSanpham().get(pickSanPham));
		System.out.println("Cập nhật thông tin:");
		quanLiDonHang.get(pickDanhMuc-1).getSanpham().add(pickSanPham, newSanPham());;
		}
	private static void timSanPham() {
		System.out.println("Đây là các danh mục sản phẩm.");
		xuatDanhMucSanPham();
		System.out.println("Nhập thứ tự danh mục bạn muốn chọn: ");
		int pick = new Scanner(System.in).nextInt();
		xuatSanPham(pick);
	}
	private static void themSanPham() {
		ArrayList<sanPham> dsSanPham = new ArrayList<sanPham>();
		thongTin thongTin = new thongTin();
		System.out.println("Đây là các danh mục sản phẩm. Chọn danh mục bạn muốn thêm vào.");
		xuatDanhMucSanPham();
		System.out.println("Nhập thứ tự danh mục bạn muốn chọn: ");
		int pick = new Scanner(System.in).nextInt();
		danhMuc danhMuc = new danhMuc();
		danhMuc = quanLiDonHang.get(pick-1).getDanhmuc();
		dsSanPham= quanLiDonHang.get(pick-1).getSanpham();
		do {
			sanPham sanPham = new sanPham();
			sanPham = newSanPham();
			dsSanPham.add(sanPham);
			System.out.println("Tiếp tục thêm sản phẩm (c/k): ");
			String kq = new java.util.Scanner(System.in).nextLine();
			if (kq.equalsIgnoreCase("k"))
				break;
		} while (true);
		thongTin.setDanhmuc(danhMuc); thongTin.setSanpham(dsSanPham);
		quanLiDonHang.add(pick-1, thongTin);
		System.out.println("Đã thêm.");
	}
	private static void themDanhMuc() {
		thongTin thongTin = new thongTin();
		danhMuc danhMuc = new danhMuc();
		System.out.println("Nhập tên danh mục: ");
		String s = new Scanner(System.in).nextLine();
		danhMuc.setTen(s);
		System.out.println("Nhập mã danh mục: ");
		s= new Scanner(System.in).nextLine();
		danhMuc.setMa(s);
		thongTin.setDanhmuc(danhMuc);
		System.out.println("Đã tạo thành công danh mục. Mời bạn thêm các sản phẩm.");
		ArrayList<sanPham> dsSanPham = new ArrayList<sanPham>();
		do {
			sanPham sanPham = new sanPham();
			sanPham = newSanPham();
			dsSanPham.add(sanPham);
			System.out.println("Tiếp tục thêm sản phẩm (c/k): ");
			String kq = new java.util.Scanner(System.in).nextLine();
			if (kq.equalsIgnoreCase("k"))
				break;
		} while (true);
		thongTin.setSanpham(dsSanPham);
		quanLiDonHang.add(thongTin);
	}
	public static void main(String[] args) {
		do {
			Menu();
			System.out.println("Bạn muốn quay trở về menu không? (c/k): ");
			String kq = new java.util.Scanner(System.in).nextLine();
			if (kq.equalsIgnoreCase("k"))
				break;
		} while (true);
	
	} 
}
