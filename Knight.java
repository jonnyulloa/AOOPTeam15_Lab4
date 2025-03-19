public class Knight extends Figure {

    Knight(ChessPieces chessPiece, PosX posX, int posY) {
        super(chessPiece, posX, posY);
    }

    public boolean moveTo(PosX x, int Y) {
        return (Math.abs(toRow - row) == 2 && Math.abs(toColumn - column) == 1) ||
            (Math.abs(toColumn - column) == 2 && Math.abs(toRow - row) == 1);
    }

    @Override
    public String toString() {
        String print = "";
        return print;
    }
}