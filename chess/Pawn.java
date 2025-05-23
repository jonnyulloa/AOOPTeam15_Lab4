package chess;

import chess.PosX;

public class Pawn extends Figure {
    String color;

    public Pawn(ChessPieces chessPiece, PosX posX, int posY, String color) {
        super(chessPiece, posX, posY);
        this.color = color;
    }

    @Override
    public boolean moveTo(PosX x, int Y) {
        if (chessPiece == ChessPieces.PAWN) {
            if (color.equalsIgnoreCase("WHITE")) {
                return posX.ordinal() == x.ordinal() && (Y - posY == 1 || (posY == 2 && Y == 4)); 
            } 
            else if (color.equalsIgnoreCase("BLACK")){
                return posX.ordinal() == x.ordinal() && (Y - posY == -1 || (posY == 7 && Y == 5)); 
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String print = "";
        return print;
    }
}