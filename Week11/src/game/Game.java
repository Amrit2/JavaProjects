package game;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Game {
	private static boolean[][] board;
	public int i;
	public int j;
	
	public Game() {
		board = new boolean[10][10];
		startBoard();
	}
	
	public void startBoard(){
		for (int r = 0; r< board.length; r++) {
			for (int c= 0; c< board[r].length; c++) {
				board[r][c] = false;
			}
		}
	}
	
	public String toString() {
		return this.board.toString();
	}
	
	public static void main (String[] args) {
		String array = Arrays.toString(board);
		System.out.println(array);
	}
}
