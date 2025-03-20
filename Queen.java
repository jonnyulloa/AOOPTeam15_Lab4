public class Queen extends Rook implements IntBishop {
	
	Queen(ChessPieces chessPiece, PosX posX, int posY) {
    	super(chessPiece, posX, posY);
	}

	@Override
    boolean moveTo(PosX x, int Y) {
    	return moveToBishop(x, Y) || super.moveTo(x, Y);
}