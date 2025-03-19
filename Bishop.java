public class Bishop implements IntBishop {

    Pawn(ChessPieces chessPiece, PosX posX, int posY) {
        super(chessPiece, posX, posY);
    }

    public boolean moveTo(PosX x, int Y) {
        return (Math.abs(toRow - row) == Math.abs(toColumn- column));
    }

    @Override
    public String toString() {
        String print = "";
        return print;
    }
}