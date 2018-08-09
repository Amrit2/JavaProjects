package exercises;

public class Cineam {
	private static final int DEFAULT_NUMBER_OF_ROWS = 4;
	private static final int DEFAULT_NUMBER_OF_COLS = 4;
	private Seat[][] seats;



	public int getNumberOfSeatsInRow(int row)
	{
		if((row>=0)&&(row<this.getNumberOfRows()))
		{
			return this.seats[row].length;
		}

		return 0;

	}

	public int getNumberOfRows()
	{
		return this.seats.length;
	}


	private boolean validSeatLocation(int row,int col)
	{
		if((row>=0)&&(row < this.seats.length))
		{
			Seat[] rowOfSeats = this.seats[row];

			return (col >= 0)&&(col < rowOfSeats.length);

		}
		return false;
	}

	public void bookSeat(int row,int col)
	{
		if(this.validSeatLocation(row,col))
		{
			this.seats[row][col].setBooked(true);
		}
	}

	public void addSeat(Seat aSeat,int row,int col)
	{
		if(this.validSeatLocation(row,col))
		{
			this.seats[row][col] = aSeat;
		}
	}


	public Cineam(int row,int col)
	{
		if((row>0)&&(col>0))
		{
			this.seats = new Seat[row][col];
		}
		else
		{
			this.seats = new Seat[DEFAULT_NUMBER_OF_ROWS][DEFAULT_NUMBER_OF_COLS];
		}

	}

	
	@Override
	public String toString() {
		String result = "";
		for (Seat[] rows: seats) {
			for (Seat s: rows) {
				result += s + " ";
			}
			result += "\n";
		}
		return result;
	}
}
