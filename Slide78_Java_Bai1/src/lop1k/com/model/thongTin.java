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
	@Override
	public String getMa() {
		// TODO Auto-generated method stub
		return super.getMa();
	}
	@Override
	public void setMa(String ma) {
		// TODO Auto-generated method stub
		super.setMa(ma);
	}
	@Override
	public String getTen() {
		// TODO Auto-generated method stub
		return super.getTen();
	}
	@Override
	public void setTen(String ten) {
		// TODO Auto-generated method stub
		super.setTen(ten);
	}
	@Override
	public String getXuatXu() {
		// TODO Auto-generated method stub
		return super.getXuatXu();
	}
	@Override
	public void setXuatXu(String xuatXu) {
		// TODO Auto-generated method stub
		super.setXuatXu(xuatXu);
	}
	@Override
	public double getGia() {
		// TODO Auto-generated method stub
		return super.getGia();
	}
	@Override
	public void setGia(double gia) {
		// TODO Auto-generated method stub
		super.setGia(gia);
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
	
}
