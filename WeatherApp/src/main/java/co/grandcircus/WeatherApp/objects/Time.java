package co.grandcircus.WeatherApp.objects;

import java.util.List;

public class Time {
	
	private List<String> time;

	public List<String> getTime() {
		return time;
	}

	public void setTime(List<String> time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "Time [time=" + time + "]";
	}

}
