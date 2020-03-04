package co.grandcircus.WeatherApp.objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Area {

	@JsonProperty("location")
	private Location location;
	private String productionCenter;
	private Data data;
	private Time time;

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Area [location=" + location + "]";
	}

	public String getProductionCenter() {
		return productionCenter;
	}

	public void setProductionCenter(String productionCenter) {
		this.productionCenter = productionCenter;
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}
	
}
