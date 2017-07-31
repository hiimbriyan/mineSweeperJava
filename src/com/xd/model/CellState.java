package com.xd.model;

/**
 * Created by imbzr on 7/31/2017.
 */
public class CellState {
    private boolean isMine = false;

    public CellState(boolean isMine) {
        this.isMine = isMine;
    }

    public boolean getCellState() {
        return isMine;
    }

    public void setCellState(boolean isMine) {
        this.isMine = isMine;
    }
}
