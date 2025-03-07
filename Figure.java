public abstract class Figure implements IntFigure {
    ChessPieces chessPiece;
    PosX posX;
    int posY;

    public Figure(ChessPieces chessPiece, PosX posX, int posY) {
        this.chessPiece = chessPiece;
        this.posX = posX;
        this.posY = posY;
    }

    public abstract String toString();
}