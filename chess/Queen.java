package chess;

import chess.PosX;
import interfaces.IntBishop;

public class Queen extends Rook implements IntBishop {
	
	public Queen(ChessPieces chessPiece, PosX posX, int posY) {
    	super(chessPiece, posX, posY);
	}

    public boolean moveToBishop(PosX x, int Y) {
    	return Math.abs(Y - posY) == Math.abs(x.ordinal() - posX.ordinal());
    }

    @Override
    public boolean moveTo(PosX x, int Y) {
    	return this.moveToBishop(x, Y) || super.moveTo(x, Y);
    }
}