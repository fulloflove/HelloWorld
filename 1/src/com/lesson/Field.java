package com.lesson;

/**
 * Created by karpenkoi on 20.03.14.
 */
public class Field {

    private int fieldSize = 3;

    private static final int MAX_FIELD_SIZE = 100;
    private static final int MIN_FIELD_SIZE = 0;

    private static final int DEFAULT_CELL_VALUE = ' ';
    private static final int DEFAULT_FIELD_SIZE = 3;

    private final char[][] field;

    public Field() {
        this(DEFAULT_FIELD_SIZE);
//        System.out.println("Construct!11");
    }

    public Field(int size) {
        fieldSize = size;
        field = new char[fieldSize][fieldSize];
//        System.out.println("Construct!");
    }

    public int getFieldSize() {
        return fieldSize;
    }

//    public void setFieldSize(int newFieldSize) {
//        if (newFieldSize > MIN_FIELD_SIZE && newFieldSize < MAX_FIELD_SIZE) {
//            fieldSize = newFieldSize;
//        }
//    }
    public void eraseField() {
        for (int i = 0; i < fieldSize; i++) {
            for (int j = 0; j < fieldSize; j++) {
                field[i][j] = DEFAULT_CELL_VALUE;
            }
        }
    }

    public void showField() {
        System.out.println();
        for (int i = 0; i < fieldSize; i++) {
            for (int j = 0; j < fieldSize; j++) {
                showCell(i, j);
            }
            //System.out.println();
        System.out.println();
        }

    }

    public void showCell(int i, int j) {
        System.out.print("[" + field[i][j] + "]");
    }


}
