public class Queen extends Rook implements IntBishop {

	Queen(ChessPieces chessPiece, PosX posX, int posY) {
    	super(chessPiece, posX, posY);
	}

	@Override
    boolean moveTo(PosX x, int Y) {
    	return (Math.abs(toRow - row) == Math.abs(toColumn- column) && 
    		super.moveTo(PosX x, int Y);
}