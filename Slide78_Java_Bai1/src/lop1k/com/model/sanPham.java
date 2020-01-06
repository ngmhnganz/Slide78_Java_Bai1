package lop1k.com.model;

public class sanPham {
	private String ten;
	private String ma;
	private String xuatXu;
	private double gia;
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getMa() {
		return ma;
	}
	public void setMa(String ma) {
		this.ma = ma;
	}
	public String getXuatXu() {
		return xuatXu;
	}
	public void setXuatXu(String xuatXu) {
		this.xuatXu = xuatXu;
	}
	public double getGia() {
		return gia;
	}
	public void setGia(double gia) {
		this.gia = gia;
	}
	@Override
	public String toString() {
		return "sanPham [ten=" + ten + ", ma=" + ma + ", xuatXu=" + xuatXu + ", gia=" + gia + "]";
	}
	public sanPham(String ten, String ma, String xuatXu, double gia) {
		super();
		this.ten = ten;
		this.ma = ma;
		this.xuatXu = xuatXu;
		this.gia = gia;
	}
	public sanPham() {
		super();
	}
}
