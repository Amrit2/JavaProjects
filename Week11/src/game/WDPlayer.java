package game;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class WDPlayer  implements Comparable<WDPlayer>{
	private String name;
	private int nPieces;
	private int nPrevent;
	private ArrayList<WDPlayer> player;

	public WDPlayer(String name, int pieces, int prevent) {
		this.name = name;
		this.nPieces = pieces;
		this.nPrevent = prevent;
	}

	public Double rank() {
		double rank = 1 - 1 / (this.nPieces* this.nPrevent);
		if (rank >= 0) {
			return rank;
		}
		else 
			return 0.0;
	}


	public int getnPieces() {
		return nPieces;
	}
	public void setnPieces(int nPieces) {
		this.nPieces = nPieces;
	}
	public int getnPrevent() {
		return nPrevent;
	}
	public void setnPrevent(int nPrevent) {
		this.nPrevent = nPrevent;
	}

	public void inputPlayer() {
		this.player = new ArrayList<WDPlayer>();
		Scanner keyboard = new Scanner(System.in);
		boolean notfinished = true;
		while(notfinished) {
			System.out.println("Enter name: ");
			String name = keyboard.nextLine();
			if(name.equalsIgnoreCase("stop"))
			{
				notfinished = false;
			}
			else
			{
				try {
					System.out.println("Enter number of pieces information: ");
					int pieces = keyboard.nextInt();

					System.out.println("Enter number of crimes prevented: ");
					int crimes = keyboard.nextInt();

					WDPlayer wplayer = new WDPlayer(name, pieces, crimes);
					player.add(wplayer);

				}
				catch (InputMismatchException e){
					System.out.println("Please input a number");
				}

				keyboard.nextLine();
			}

		}
	}

	@Override
	public int compareTo(WDPlayer o) {

		return this.rank().compareTo(o.rank());
	}
}
