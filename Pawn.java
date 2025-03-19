public class Pawn extends Figure {

    Pawn(ChessPieces chessPiece, PosX posX, int posY) {
        super(chessPiece, posX, posY);
    }

    public boolean moveTo(PosX x, int Y) {
        if (color.toUpperCase().equals("WHITE")) {
            return column == toColumn && (toRow - row == 1 || (row == '2' && toRow == '4')); 
        } 
        else if (color.toUpperCase().equals("BLACK")){
            return column == toColumn && (toRow - row == -1 || (row == '7' && toRow == '5')); 
        }
    }

    @Override
    public String toString() {
        String print = "";
        return print;
    }
}