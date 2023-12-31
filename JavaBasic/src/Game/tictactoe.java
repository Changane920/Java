package Game;

import java.util.Scanner;

public class tictactoe {
	//declare variable
	static String[] board;
	static String player1, player2;
	static Scanner sc;
	static String str;
	static String[] column, row, diagonal1,diagonal2;

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
		String c = sc.next();
		
		if(c.equalsIgnoreCase("x")) {
			player1 = "x";
			player2 = "o";
		}
		else{
			player1 = "o";
			player2 = "x";
		}
	}
	
	static void playerTurn() {
		for(int i = 0; i < board.length; i++) {
			if(i%2 == 0) {
				System.out.print(player1 + " turn: ");
				str = sc.next();
				
				for(int j = 0; j < board.length; j++) {
					if(str.equalsIgnoreCase(board[j])) {			
						if(player1.equalsIgnoreCase("x")) {
							board[j] = "x";
							break;							
						}
						else {
							board[j] = "o";
							break;
						}
					}
				}
				printBoard();
				
				if(board[0] == "x" && board[1] == "x" && board[2] == "x") {
					System.out.println(player1 + " win.");
					return;
				}
				else if(board[3] == "x" && board[4] == "x" && board[5] == "x") {
					System.out.println(player1 + " win.");
					return;
				}
				else if(board[6] == "x" && board[7] == "x" && board[8] == "x") {
					System.out.println(player1 + " win.");
					return;
				}
			}
			else {
				System.out.print(player2 + " turn: ");
				str = sc.next();
				
				for(int j = 0; j < board.length; j++) {
					if(str.equalsIgnoreCase(board[j])) {						
						if(player2.equalsIgnoreCase("x")) {
							board[j] = "x";
							break;							
						}
						else {
							board[j] = "o";
							break;
						}
					}
				}
				printBoard();
			}
		}
	}
}
