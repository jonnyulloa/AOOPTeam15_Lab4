package chess;

import chess.PosX;
import interfaces.IntFigure;

public abstract class Figure implements IntFigure {
    public ChessPieces chessPiece;
    public PosX posX;
    public int posY;

    public Figure(ChessPieces chessPiece, PosX posX, int posY) {
        this.chessPiece = chessPiece;
        this.posX = posX;
        this.posY = posY;
    }

    public abstract boolean moveTo(PosX x, int Y);
    
    public abstract String toString();
}