package Game;

import java.util.Scanner;

public class tictactoe {
	//declare variable
	static String[] board;
	static char player1, player2;
	static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		//chose who is the first player
		firstPlayer();
		
		//table no
		board = new String[9];
		for (int i = 0; i < board.length; i++) {
			board[i] = String.valueOf(i + 1);
		}
		System.out.println();
		
		//make a table
		printBoard();
		
		//player turn
		playerTurn();
	}

	static void printBoard() {
		System.out.println("| --- | --- | --- |");
		System.out.println("|  " + board[0] + "  |  " + board[1] + "  |  " + board[2] + "  |");
		System.out.println("| --- | --- | --- |");
		System.out.println("|  " + board[3] + "  |  " + board[4] + "  |  " + board[5] + "  |");
		System.out.println("| --- | --- | --- |");
		System.out.println("|  " + board[6] + "  |  " + board[7] + "  |  " + board[8] + "  |");
		System.out.println("| --- | --- | --- |");
	}
	
	static void firstPlayer() {
		System.out.println("Which player first? 'x' or 'o'");
		char c = sc.next().charAt(0);
		
		if(c == 'x' || c == 'X') {
			player1 = 'x';
			player2 = 'o';
		}
		else {
			player1 = 'o';
			player2 = 'x';
		}
	}
	
	static void playerTurn() {
		for(int i = 0; i < board.length; i++) {
			if(i%2 == 0) {
				System.out.print(player1 + " turn: ");
				String str = sc.next();
				
				for(int j = 0; j < board.length; j++) {
					if(str == board[j]) {
						board[j] = "x";
					}
				}
				printBoard();
			}
			else {
				System.out.print(player2 + " turn: ");
			}
		}
	}
}