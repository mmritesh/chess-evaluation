package com.chess.impl;

import com.chess.IChess;
import com.chess.util.Util;

import java.util.HashMap;
import java.util.Map;

public class Chess implements IChess {

    private static Map<String, Piece> pieces = new HashMap<>();

    public Chess(){
        pieces.put("King", new Piece(new int[]{1,1,1,1,1,1,1,1}, 1));
    }

    @Override
    public void evaluate(int row, int col, String type){
        int iCol, iRow;
        Piece piece = pieces.get(type);
        for (int i = 0; i < 8; i++) {
            if (piece.getCanMove()[i] == 1) {
                iCol = col;
                iRow = row;
                while (iRow >= 0 && iRow < 8 && iCol >=0 && iCol < 8) {
                    System.out.println(Util.getCharForNumber((iRow + piece.getDirections()[i][0]) +1) + "," + ((iCol += piece.getDirections()[i][1])+1));
                    if (piece.getNumOfMoves() == 1) {
                        break;
                    }
                }
            }
        }
    }

}

