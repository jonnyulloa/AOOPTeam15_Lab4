//Derek Gamboa, Jonathan Ulloa, Ugyen Dorji
//This program takes in a user input, which should be between a-h and 1-8 to ensure its inside of the chess board
//The program then takes the input and checks for each chess piece if the move is acceptable
//The move is based on each chess piece's rules for moving and where the chess piece is originally on the board


//Change log
// 3/11/2025: Derek adds chesspiece implementation, specifically how to compare enum values in the move methods
// 3/13/2025: Ugyen adds interface implentation and class extensions
// 3/16/2025: Jonathan begins work on main method and its code structure
// 3/17/2025: Ugyen adds in storeInArray() and process() methods, similar to past labs
// 3/17/2025: Derek completes each chesspiece implementation, carefully reusing code from past labs to keep consistency
// 3/19/2025: Jonathan completes the code on the main method and creates the packages "chess" and "interfaces" as per lab instruction
import java.util.Scanner;

import chess.*;

public class Team15Lab4 {
    static Scanner scanner;
    static String piece;
    static String color;
    static PosX posX;
    static int posY;
    static PosX toX;
    static int toY; 
    static int i;
    static Figure[] chessPieces = new Figure[5];

    public static void main(String[] args) {
        // Derek, Jonathan, Ugyen
        scanner = new Scanner(System.in);
        for(i = 0; i < chessPieces.length; i++){ //Store all five chess pieces in order of user input
            boolean isDuplicate = false;
            askForPiece();
            for (int j = 0; j < chessPieces.length; j++) { //This for loop will check if the user input has already been stored
                if (chessPieces[j] != null && chessPieces[j].chessPiece.name().equalsIgnoreCase((piece))) { //if the specific array position is not null and it equals the piece being inputted
                    isDuplicate = true;
                    System.out.println("You already chose that piece. Try again.");
                    i--;
                    break;
                }
            }
            if (!isDuplicate) { //If there are no duplicates, then the program will ask for the color, and initial position of the chesspiece
                askForColor();  //After asking for these details, the pieces will be stored in the array 
                askForInitPos();
                storeInArray();
            }
        }
        askForToPos(); //Ask for the target position
        process(); //Finally, initiate the final method to check if the chesspieces can move to the target
    }

    static void askForPiece() {
        boolean isPiece = false;
        while (true) {
            System.out.println("Enter piece to move (e.g Pawn, Rook, Knight, Bishop, Queen, and King): ");
            piece = scanner.nextLine().trim().toUpperCase();
            try { //introduce a try block to make suure the user inputted a correct enum type of chesspieces
            	ChessPieces chessPiece = ChessPieces.valueOf(piece);
            	break;
            } catch (IllegalArgumentException e) { //If the user did not input a correct type, throw an exception and ask again 
            	System.out.println("Invalid piece. Try again.");
            }
        }
    }

    static void askForColor() {
        while (true) {
            System.out.println("Pick a piece color (e.g. White or Black): ");
            color = scanner.nextLine().trim().toUpperCase(); //ask for the color of the chesspiece
            if (!ChessBoard.validColor(color)) { //making sure that the color is valid within the established colors
                System.out.println("That piece color is not valid. Try again.");
            } else {
                break;
            }
        }
    }

    static void askForInitPos() {
        while (true) {
            System.out.println("Enter initial column (e.g a-h): ");
            String column = scanner.nextLine().toUpperCase(); //ask for initial position, specifically the letter 
            try {
            	posX = PosX.valueOf(column); 
            	break;
            } catch (IllegalArgumentException e) { //if the user entered a wrong letter, throw an exception and ask again
            	System.out.println("Invalid column. Try again.");
            }
        }

        while (true) {
            System.out.println("Enter initial row (e.g 1-8): ");
           	try {
           		posY = Integer.parseInt(scanner.nextLine());
           		if (posY >= 1 && posY <= 8) { //ask the user for input and make sure its within the range
           			break;
           		} else {
           			throw new NumberFormatException();
           		} 
           	} catch (NumberFormatException e) { //if incorrect, throw an exception
           		System.out.println("Invalid row. Try again. The number must be between 1 and 8.");
           	}
        }
    }

    static void storeInArray() {
        switch (piece.toUpperCase()) { //Store each chesspiece in their respective array cases, except for the bishop
            case "KING": // Derek, Ugyen
                chessPieces[i] = new King(ChessPieces.KING, posX, posY);
                break;
            case "ROOK": // Derek, Ugyen
                chessPieces[i] = new Rook(ChessPieces.ROOK, posX, posY);
                break;
            case "PAWN": // Derek, Jonathan
                chessPieces[i] = new Pawn(ChessPieces.PAWN, posX, posY, color);
                break;
            case "KNIGHT": // Derek, Ugyen
                chessPieces[i] = new Knight(ChessPieces.KNIGHT, posX, posY);
                break;
            case "QUEEN": // Jonathan, Ugyen
                chessPieces[i] = new Queen(ChessPieces.QUEEN, posX, posY);
                break;
            case "BISHOP": // Derek, Jonathan
                i--;
                System.out.println("Bishop is not added to the array.");
                break;
        }
    }

    static void askForToPos() {
        while (true) {
            System.out.println("Enter target column (e.g a-h): ");
            String column = scanner.nextLine().toUpperCase();
            try {
            	toX = PosX.valueOf(column);
            	break;
            } catch (IllegalArgumentException e) {
            	System.out.println("Invalid column. Try again.");
            }
        }

        while (true) {
            System.out.println("Enter target row (e.g 1-8): ");
            try {
            	toY = Integer.parseInt(scanner.nextLine());
            	if (toY >= 1 && toY <= 8) {
            		break;
            	} else {
            		System.out.println("Invalid row. Try again.");
            	}
            } catch (NumberFormatException e) {
            	System.out.println("Invalid row. Try again.");
            }
        }
    }

    static void process() {
        for (Figure i: chessPieces) { //print out the statement for each array position using the respective moveTo of each chesspiece
        	if (i != null) {
        		System.out.println(i.chessPiece + " at " + i.posX + i.posY + " can move to " + toX + toY + ": " + i.moveTo(toX, toY));
        	}
        }
    }
} 
