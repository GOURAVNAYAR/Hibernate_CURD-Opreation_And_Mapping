package CURD_opration;

import java.util.Iterator;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import javax.persistence.Entity;

@Entity
@Table(name = "Product_5142")
public class Product {

	@Id
	@Column(name = "pro_id")
	private int productId;

	@Column(name = "pro_name")
	private String productName;

	@Column(name = "pro_mfr")
	private String productManufacturing;

	@Column(name = "pro_price")
	private int productPrice;

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductManufacturing() {
		return productManufacturing;
	}

	public void setProductManufacturing(String productManufacturing) {
		this.productManufacturing = productManufacturing;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	public int nextInt() {
		// TODO Auto-generated method stub
		return 0;
	}

	public String nextLine() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productManufacturing="
				+ productManufacturing + ", productPrice=" + productPrice + "]";
	}

	public Iterator<Product> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	public static Set<Product> getChildren() {
		// TODO Auto-generated method stub
		return null;
	}



}
