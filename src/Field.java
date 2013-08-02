public class Field {

//    private static final int MAX_FIELD_SIZE = 100;
//    private static final int MIN_FIELD_SIZE = 0;
    private static final int DEFAULT_FIELD_SIZE = 3;
    private static char DEFAULT_CELL_VALUE = ' ';
    private final int fieldSize;
    private final char [][] field;

    public Field () {
        this (DEFAULT_FIELD_SIZE);
    }

    public Field (int newFieldSize) {
        fieldSize = newFieldSize;
        field = new char [newFieldSize][newFieldSize];
    }

    public int getFieldSize() {
        return fieldSize;
    }

//    public void setFieldSize (int newFieldSize) {
//        if (newFieldSize > MIN_FIELD_SIZE && newFieldSize < MAX_FIELD_SIZE) {
//        fieldSize = newFieldSize;
//        }
//    }

    public void eraseField () {
        for (int i = 0; i < fieldSize; i ++) {
            eraseLine(i);
            }
        }

    public void showField () {
        System.out.println();
        for (int i = 0; i < fieldSize; i ++) {
            showLine(i);
            System.out.println();
        }
        System.out.println();
    }

    private void showLine (int lineNumber) {
        for (int i = 0; i < fieldSize; i ++) {
            showCell(i, lineNumber);
        }
    }

    private void eraseLine (int lineNumber) {
        for (int i = 0; i < fieldSize; i ++) {
            field [i] [lineNumber] = DEFAULT_CELL_VALUE;
        }
    }

    private void showCell (int x, int y) {
        System.out.print("[" + field[x][y] + "]" );
    }

}
