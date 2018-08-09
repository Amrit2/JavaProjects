package examples;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class GameAccountPrintReaderTest {
	public static void main(String[] args) {
		try {
			Scanner in = new Scanner(new FileReader("gameaccount.txt"));
			String name = in.nextLine();
			String address = in.nextLine();
			String trophy = in.nextLine();
			int score = in.nextInt();
			GameAccount ga = new GameAccount(name, address, Trophy.GOLD, score);
			ga.setTrophy(Trophy.valueOf(trophy));
			System.out.println(ga);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}