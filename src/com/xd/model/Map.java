package com.xd.model;

/**
 * Created by imbzr on 7/28/2017.
 */
public class Map {
    private final int width;
    private final int height;

    private final int mineCount;

    private CellState[][] board;

    public Map(int width, int height, int mineCount) {
        this.width = width;
        this.height = height;
        this.mineCount = mineCount;
    }

    public void createMap() {
        createBoard();
    }

    private void createBoard() {
        board = new CellState[height][width];
    }

//    private void displayCoordinates() {
//        for (int i = 0; i < height; i++) {
//            for (int j = 0; j < width; j++) {
//                board[i][j] =
//            }
//        }
//    }

    private void placeMines() {
        // Assert: createBoard() is ran before this method
        int tempMineCount = mineCount;

        while (tempMineCount > 0) {
            int randomX = (int) Math.floor(Math.random() * width + 1);
            int randomY = (int) Math.floor(Math.random() * height + 1);

            if (board[randomY][randomX].getCellState()) {
                board[randomY][randomX].setCellState(true);
                tempMineCount--;
            }
        }
    }

    private void displayBoard() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {

            }
        }
    }
}
