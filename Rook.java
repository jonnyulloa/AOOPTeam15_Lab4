public class Rook extends Figure {

    Rook(ChessPieces chessPiece, PosX posX, int posY) {
        super(chessPiece, posX, posY);
    }

    public boolean moveTo(PosX x, int Y) {
        return true;
    }

    @Override
    public String toString() {
        String print = "";
        return print;
    }
}