public class Rook extends Figure {

    Rook(ChessPieces chessPiece, PosX posX, int posY) {
        super(chessPiece, posX, posY);
    }

    public boolean moveTo(PosX x, int Y) {
        return (posX.ordinal() == x.ordinal() || posY == Y); 
    }

    @Override
    public String toString() {
        String print = "";
        return print;
    }
}