package lop1k.com.model;

public class danhMuc extends sanPham {
	private String ma;
	private String ten;
	public String getMa() {
		return ma;
	}
	public void setMa(String ma) {
		this.ma = ma;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public danhMuc(String ma, String ten) {
		super();
		this.ma = ma;
		this.ten = ten;
	}
	public danhMuc() {
		super();
	}
	@Override
	public String toString() {
		return "Mã" + ma + " - Mục: " + ten;
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
	public danhMuc(String ten, String ma, String xuatXu, double gia) {
		super(ten, ma, xuatXu, gia);
		// TODO Auto-generated constructor stub
	}
	
}
