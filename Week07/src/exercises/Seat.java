package exercises;

public class Seat {
	private boolean booked;
	private SeatType seatType;
	
	public Seat (SeatType seat) {
		setSeatType(seat);
	}
	
	public void setBooked (boolean booked) {
		this.booked = booked;
	}
	
	public boolean isBooked() {
		return this.booked;
	}
	
	public SeatType getSeatType() {
		return seatType;
	}

	public void setSeatType(SeatType seat) {
		this.seatType = seat;
	}

	public String toString() {
		return this.getSeatType().name().charAt(0)+"["+(this.isBooked()?"X":" ")+"]";
	}
}
