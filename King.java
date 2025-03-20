public class King extends Queen {

	King(ChessPieces chessPiece, PosX posX, int posY) {
    	super(chessPiece, posX, posY);
	}

	@Override
	boolean moveTo(PosX x, int Y) {
        return Math.abs(posX.ordinal() - x.ordinal()) <= 1 && Math.abs(posY - Y) <= 1;
	}
}