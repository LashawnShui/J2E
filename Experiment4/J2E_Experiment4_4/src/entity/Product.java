package entity;

public class Product {
	private String productName;
	private String brand;
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	@Override
	public String toString() {
		return "Product£º"
				+ "\n\tproductName = " + productName
				+ "\n\tbrand = " + brand;
	}
}
