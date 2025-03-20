package chess;

import chess.PosX;
import interfaces.IntBishop;

public class Bishop implements IntBishop {

    ChessPieces chessPiece;
    PosX posX;
    int posY;

    public Bishop(ChessPieces chessPiece, PosX posX, int posY) {
        this.chessPiece = chessPiece;
        this.posX = posX;
        this.posY = posY;
    }

    
    public boolean moveToBishop(PosX x, int Y) {
        return Math.abs(Y - posY) == Math.abs(x.ordinal() - posX.ordinal());
    }

    @Override
    public String toString() {
        String print = "";
        return print;
    }
}