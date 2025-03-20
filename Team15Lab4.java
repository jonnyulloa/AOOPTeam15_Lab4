//Derek Gamboa, Jonathan Ulloa, Ugyen Dorji
//This program takes in a user input, which should be between a-h and 1-8 to ensure its inside of the chess board
//The program then takes the input and checks for each chess piece if the move is acceptable
//The move is based on each chess piece's rules for moving and where the chess piece is originally on the board

import java.util.Scanner;

public class Team15Lab4 {
    static Scanner scanner;
    static String piece;
    static PosX posX;
    static int posY;
    static PosX toX;
    static int toY; 
    static int i;
    static Figure[] chessPieces = new Figure[6];

    public static void main(String[] args) {
        // Derek, Jonathan, Ugyen
        scanner = new Scanner(System.in);
        for(i = 0; i < 6; i++){
            boolean isDuplicate = false;
            askForPiece();
            for (int j = 0; j < chessPieces.length; j++) {
                if (chessPieces[j] != null && chessPieces[j].pieceName.equalsIgnoreCase((piece))) {
                    isDuplicate = true;
                    System.out.println("You already chose that piece. Try again.");
                    i--;
                    break;
                }
            }
            if (!isDuplicate) {
                askForColor();
                askForInitPos();
                storeInArray();
            }
        }
        askForToPos();
        process();
    }

    static void askForPiece() {
        boolean isPiece = false;
        while (true) {
            System.out.println("Enter piece to move (e.g Pawn, Rook, Knight, Bishop, Queen, and King): ");
            String pieceInput = scanner.nextLine().trim().toUpperCase();
            try {
            	chessPiece = ChessPieces.valueOf(pieceInput);
            	break;
            } catch (IllegalArgumentException e) {
            	System.out.println("Invalid piece. Try again.");
            }
        }
    }

    static void askForColor() {
        while (true) {
            System.out.println("Pick a piece color (e.g. White or Black): ");
            pieceColor = scanner.nextLine();
            if (!Chessboard.validColor(pieceColor)) {
                System.out.println("That piece color is not valid. Try again.");
            } else {
                break;
            }
        }
    }

    static void askForInitPos() {
        while (true) {
            System.out.println("Enter initial column (e.g a-h): ");
            String column = scanner.nextLine().toUpperCase();
            try {
            	posX = PosX.valueOf(column);
            	break;
            } catch (IllegalArgumentException e) {
            	System.out.println("Invalid column. Try again.");
            }
        }

        while (true) {
            System.out.println("Enter initial row (e.g 1-8): ");
           	try {
           		posY = Integer.parseInt(scanner.nextLine());
           		if (posY >= 1 && posY <= 8) {
           			break;
           		} else {
           			System.out.println("Invalid row. Try again.");
           		} 
           	} catch (NumberFormatException e) {
           		System.out.println("Invalid row. Try again.");
           	}
        }
    }

    static void storeInArray() {
        switch (piece.toUpperCase()) {
            case "KING": // Derek, Ugyen
                chessPieces[i] = new King(ChessPieces.KING, posX, posY);
                break;
            case "ROOK": // Derek, Ugyen
                chessPieces[i] = new Rook(ChessPieces.ROOK, posX, posY);
                break;
            case "PAWN": // Derek, Jonathan
                chessPieces[i] = new Pawn(ChessPieces.PAWN, posX, posY);
                break;
            case "KNIGHT": // Derek, Ugyen
                chessPieces[i] = new Knight(ChessPieces.KNIGHT, posX, posY);
                break;
            case "QUEEN": // Jonathan, Ugyen
                chessPieces[i] = new Queen(ChessPieces.QUEEN, posX, posY);
                break;
            case "BISHOP": // Derek, Jonathan
                chessPieces[i] = new Bishop(ChessPieces.BISHOP, posX, posY);
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
        for (int i = 0; i < chessPieces.length; i++) {
            chessPieces[i].moveTo(toColumn, toRow);
        }
    }
} 