package exercises;

import exercises.SeatType;

public class CinemaBookingApp {
	public static void main (String[] args) {
		int nRows=4;
		int nCols=4;
		Cineam smallCinema = new Cineam(nRows,nCols);

		//setup Cinema with the appropriate seating arrangement.
		for(int r=0;r<smallCinema.getNumberOfRows();r++)
		{
			smallCinema.addSeat(new Seat(SeatType.WALL), r, 0);
			smallCinema.addSeat(new Seat(SeatType.AISLE), r, smallCinema.getNumberOfSeatsInRow(r)-1);
			for(int i=1;i<nCols-1;i++)
			{
				smallCinema.addSeat(new Seat(SeatType.MIDDLE), r, i);	
			}			
		}
		
		smallCinema.bookSeat(0,0); 
		System.out.println(smallCinema); 
		smallCinema.bookSeat(0,1); 
		System.out.println(smallCinema); 
		smallCinema.bookSeat(3,0); 
		System.out.println(smallCinema); 
		smallCinema.bookSeat(3,3);
		System.out.println(smallCinema);
		smallCinema.bookSeat(6,3); //note, invalid row. System.out.println(smallCinema);

	}
		
	}

