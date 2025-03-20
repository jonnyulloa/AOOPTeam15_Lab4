public class Bishop implements IntBishop {

    ChessPieces chessPiece;
    PosX posX;
    int posY;

    Bishop(ChessPieces chessPiece, PosX posX, int posY) {
        this.chessPiece = chessPiece;
        this.posX = posX;
        this.posY = posY;
    }

    @Override
    public boolean moveTo(PosX x, int Y) {
        return Math.abs(Y - posY) == Math.abs(x.ordinal() - posX.ordinal());
    }
    
    @Override
    public String toString() {
        String print = "";
        return print;
    }
}