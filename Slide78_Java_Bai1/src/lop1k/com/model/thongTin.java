package lop1k.com.model;

import java.util.ArrayList;

public class  thongTin extends danhMuc {
	private danhMuc danhmuc;
	private ArrayList<sanPham> sanpham = new ArrayList<sanPham>();
	public danhMuc getDanhmuc() {
		return danhmuc; 
	}
	public void setDanhmuc(danhMuc danhmuc) {
		this.danhmuc = danhmuc;
	}
	public ArrayList<sanPham> getSanpham() {
		return sanpham;
	}
	public void setSanpham(ArrayList<sanPham> sanpham) {
		this.sanpham = sanpham;
	}
	@Override
	public String toString() {
		return "thongTin [danhmuc=" + danhmuc + ", sanpham=" + sanpham + "]";
	}
	public thongTin(danhMuc danhmuc, ArrayList<sanPham> sanpham) {
		super();
		this.danhmuc = danhmuc;
		this.sanpham = sanpham;
	}
	public thongTin() {
		super();
	}
}
