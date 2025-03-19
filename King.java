public class King extends Queen {

	King(ChessPieces chessPiece, PosX posX, int posY) {
    	super(chessPiece, posX, posY);
	}

	@Override
	boolean moveTo(PosX x, int Y) {
        return Math.abs(column - toColumn) <= 1 && Math.abs(row - toRow) <= 1;
	}
}