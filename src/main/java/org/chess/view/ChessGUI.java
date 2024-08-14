package org.chess.view;

import org.chess.controller.GameController;
import org.chess.model.Board;

import javax.swing.*;

public class ChessGUI extends JFrame {
    public ChessGUI(){
        setTitle("Chess");
        setSize(660, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        Board board = new Board();
        GameController game = new GameController(board);
        add(new BoardPanel(board , game));
    }
}
