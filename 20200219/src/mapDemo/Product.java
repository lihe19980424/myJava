package mapDemo;

public class Product {
	

	
	@Override
	public String toString() {
		return "Product [proId=" + proId + ", proName=" + proName + ", proImg=" + proImg + ", price=" + price
				+ ", stock=" + stock + "]";
	}

	private int proId;

	private String proName;

	private String proImg;

	private double price;

	private int stock;

	public int getProId() {
		return proId;
	}

	public void setProId(int proId) {
		this.proId = proId;
	}

	public String getProName() {
		return proName;
	}

	public void setProName(String proName) {
		this.proName = proName;
	}

	public String getProImg() {
		return proImg;
	}

	public void setProImg(String proImg) {
		this.proImg = proImg;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
	
}
