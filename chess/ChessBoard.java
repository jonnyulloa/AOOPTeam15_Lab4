package chess;

import chess.PosX;
import interfaces.IntChessBoard;

public class ChessBoard implements IntChessBoard {
    static final int MAX_ROW = 8;
    static final int MIN_ROW = 1;

    // Derek
    public boolean verifyCoordinate(PosX X, int Y) {
        return validColumn(X) && (Y >= MIN_ROW && Y <= MAX_ROW);
    }

    enum Column {
        A, B, C, D, E, F, G, H;
    }

    enum Color {
    	WHITE, BLACK;
    }

    public static boolean validPiece(String chessPiece) {
        try {
            ChessPieces.valueOf(chessPiece.trim().toUpperCase());
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }

    public static boolean validColumn(PosX X) {
        try {
            Column.valueOf(X.name());
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }

    public static boolean validColor(String color) {
    try {
        Color.valueOf(color.trim().toUpperCase());
        return true;
    } catch (IllegalArgumentException e) {
        return false;
    }
}
}
