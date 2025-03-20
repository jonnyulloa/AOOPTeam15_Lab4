package chess;

import chess.PosX;

public class Rook extends Figure {

    public Rook(ChessPieces chessPiece, PosX posX, int posY) {
        super(chessPiece, posX, posY);
    }

    @Override
    public boolean moveTo(PosX x, int Y) {
        return (posX.ordinal() == x.ordinal() || posY == Y); 
    }

    @Override
    public String toString() {
        String print = "";
        return print;
    }
}