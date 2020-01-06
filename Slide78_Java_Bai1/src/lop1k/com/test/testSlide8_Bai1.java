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
		System.out.println("3. Tìm thông tin sản phẩm.");
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
	private static void lietKe() {
		
	}
	private static void thongKeGiaTri() {
		// TODO Auto-generated method stub
		
	}
	private static void xoaSanPham() {
		// TODO Auto-generated method stub
		
	}
	private static void capNhatSanPham() {
		// TODO Auto-generated method stub
		
	}
	private static void timSanPham() {
		// TODO Auto-generated method stub
		
	}
	private static void themSanPham() {
		ArrayList<sanPham> dsSanPham = new ArrayList<sanPham>();
		thongTin thongTin = new thongTin();
		System.out.println("Đây là các danh mục sản phẩm. Chọn danh mục bạn muốn thêm vào.");
		for (int i =0;i<quanLiDonHang.size();i++) {
			System.out.println((i+1)+".\t"+quanLiDonHang.get(i).getDanhmuc());
		}
		System.out.println("Nhập thứ tự danh mục bạn muốn chọn: ");
		int pick = new Scanner(System.in).nextInt();
		danhMuc danhMuc = new danhMuc();
		danhMuc = quanLiDonHang.get(pick-1).getDanhmuc();
		dsSanPham= quanLiDonHang.get(pick-1).getSanpham();
		do {
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
			System.out.println("Nhập tên sản phẩm: ");
			s= new Scanner(System.in).nextLine();
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
