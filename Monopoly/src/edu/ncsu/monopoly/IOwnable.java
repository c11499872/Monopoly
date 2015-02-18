package edu.ncsu.monopoly;

public interface IOwnable {

	String getName();

	Player getTheOwner();

	int getPrice();

	void playAction();

	void setTheOwner(Player owner);

	String toString();

	boolean isAvailable();

	void setAvailable(boolean available);

}