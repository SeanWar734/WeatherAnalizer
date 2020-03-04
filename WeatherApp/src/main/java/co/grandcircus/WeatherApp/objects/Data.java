package co.grandcircus.WeatherApp.objects;

import java.util.List;

public class Data {

	private List<String> text;

	public List<String> getText() {
		return text;
	}

	public void setText(List<String> text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "Data [text=" + text + "]";
	}
	
}
