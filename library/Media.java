package library;

import java.util.ArrayList;
import java.util.List;

public class Media extends Item {
	List<String> mediaList = new ArrayList<>();
	private String mediaType;
	private String brand;

	public Media(int stocked, int available, int id, String name, String mediaType, String brand) {
		super(stocked, available, name);
		this.mediaType = mediaType;
		this.brand = brand;
		totalItems += 1;

	}

	public String getMediaType() {
		return mediaType;
	}

	public void setMediaType(String mediaType) {
		this.mediaType = mediaType;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

}
