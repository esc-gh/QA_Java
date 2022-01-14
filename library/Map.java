package library;

import java.util.ArrayList;
import java.util.List;

public class Map extends Item implements Shredder {
	List<String> mapList = new ArrayList<>();
	private String mapType;
	private String mapArea;

	public Map(int stocked, int available, int id, String name, String mapType, String mapArea) {
		super(stocked, available, name);
		this.mapType = mapType;
		this.mapArea = mapArea;
		totalItems += 1;

	}

	public String getMapType() {
		return mapType;
	}

	public void setMapType(String mapType) {
		this.mapType = mapType;
	}

	public String getMapArea() {
		return mapArea;
	}

	public void setMapArea(String mapArea) {
		this.mapArea = mapArea;
	}

	@Override
	public void shred() {
		System.out.println("Have you no respect for geography!");

	}

}
