package edu.ncsu.monopoly;

public class GoCell extends Cell {
	public GoCell() {
		super.setName("Go");
		setAvailable(false);
	}

	public void playAction() {
	}
	
	void setName(String name) {
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}
}
