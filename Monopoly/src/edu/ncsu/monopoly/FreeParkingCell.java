package edu.ncsu.monopoly;

public class FreeParkingCell extends Cell {

	public FreeParkingCell() {
		setName("Free Parking");
	}

	public void playAction() {
		return;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}
}
