package om_save;

import java.util.Set;

public class Vendor {

	public int vendorId;
	public String venderName;
	private Set<Customer> children;

	public int getVendorId() {
		return vendorId;
	}

	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}

	public String getVenderName() {
		return venderName;
	}

	public void setVenderName(String venderName) {
		this.venderName = venderName;
	}

	
	
	
	   @Override
	public String toString() {
		return "Vendor [vendorId=" + vendorId + ", venderName=" + venderName + ", children=" + children + "]";
	}

	public Set<Customer> getChildren() {
	        return children;
	    }

	    public void setChildren(Set<Customer> children) {
	        this.children = children;
	    }

}

