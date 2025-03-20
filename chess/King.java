package chess;

import chess.PosX;

public class King extends Queen {

	public King(ChessPieces chessPiece, PosX posX, int posY) {
    	super(chessPiece, posX, posY);
	}

	@Override
	public boolean moveTo(PosX x, int Y) {
        return Math.abs(posX.ordinal() - x.ordinal()) <= 1 && Math.abs(posY - Y) <= 1;
	}
}