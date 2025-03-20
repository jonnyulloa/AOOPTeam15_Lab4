public class Knight extends Figure {

    Knight(ChessPieces chessPiece, PosX posX, int posY) {
        super(chessPiece, posX, posY);
    }

    public boolean moveTo(PosX x, int Y) {
        return (Math.abs(Y - posY) == 2 && Math.abs(x.ordinal() - posX.ordinal()) == 1) ||
            (Math.abs(x.ordinal() - posX.ordinal()) == 2 && Math.abs(Y - posY) == 1);
    }

    @Override
    public String toString() {
        String print = "";
        return print;
    }
}