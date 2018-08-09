package exercises;

public class Flight {
	private String airlineName;
	private int airlineNumber;
	private String flightOrigin;
	private String destinationCities;
	
	public Flight (String name, int number, String origin, String cities) {
		this.airlineName = name;
		this.airlineNumber = number;
		this.flightOrigin = origin;
		this.destinationCities = cities;
	}
	
	public void setName(String name) {
		this.airlineName = name;
	}
	public void setNumber (int number) {
		this.airlineNumber = number;
	}
	public void setFlightOrigin(String origin) {
		this.flightOrigin = origin;
	}
	public void setDestinations (String cities) {
		this.destinationCities = cities;
	}
	
	public String getName() {
		return this.airlineName;
	}
	public int getNumber() {
		return this.airlineNumber;
	}
	public String getOrigin() {
		return this.flightOrigin;
	}
	public String getDestination() {
		return this.destinationCities;
	}
	
	public String toString() {
		return ("Airline name "+ this.airlineName + " with flight number of " + this.airlineNumber + " is flying from " + this.flightOrigin + " to " + this.destinationCities);
	}
}
