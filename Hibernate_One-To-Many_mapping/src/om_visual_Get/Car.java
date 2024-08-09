package om_visual_Get;

import java.util.Set;

public class Car {

	private int carId;
	private String carName;
	private String carmodels;
	private int forevenId;

	public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getCarmodels() {
		return carmodels;
	}

	public void setCarmodels(String carmodels) {
		this.carmodels = carmodels;
	}

	public int getForevenId() {
		return forevenId;
	}

	public void setForevenId(int forevenId) {
		this.forevenId = forevenId;
	}

	@Override
	public String toString() {
		return "Car [carId=" + carId + ", carName=" + carName + ", carmodels=" + carmodels + ", forevenId=" + forevenId
				+ "]";
	}
	

}
