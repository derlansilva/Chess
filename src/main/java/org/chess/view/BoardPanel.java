package org.chess.view;

import org.chess.controller.GameController;
import org.chess.model.Board;
import org.chess.model.Pawn;
import org.chess.model.Piece;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

public class BoardPanel extends JPanel {
    private static final int SIZE =8;
    private static final int CELL_SIZE =  80;

    private final Image[] pieceImages;


    private Board board;

    public BoardPanel(Board board , GameController game) {
        this.board = board;
        this.pieceImages = new Image[12];
        loadImages();


        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                int x = e.getX() / CELL_SIZE;
                int y = e.getY() / CELL_SIZE;
                game.handleClick(x , y);
                repaint();
            }
        });

        

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawBoard(g);
        drawPieces(g);
    }

    private void drawBoard(Graphics g) {
        for (int i = 0; i < SIZE ; i++) {
            for(int j = 0; j < SIZE ; j++) {
                if((i + j ) % 2 == 0) {
                    g.setColor(Color.WHITE);
                }else{
                    g.setColor(Color.BLACK  );
                }
                g.fillRect(j*CELL_SIZE, i*CELL_SIZE, CELL_SIZE, CELL_SIZE);
            }
        }
    }

    private void drawPieces(Graphics g){
        Piece[][] pieces = board.getBoard();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                Piece piece =pieces[i][j];
                if(piece!= null){
                    Image img = null;

                    if(piece instanceof Pawn){
                        img = piece.isWhite() ? pieceImages[0] : pieceImages[6];
                    }

                    if (img != null) {
                        g.drawImage(img, j * CELL_SIZE, i * CELL_SIZE, CELL_SIZE, CELL_SIZE, this);
                    }
                }
            }
        }
    }
    private void loadImages(){
        try {
            pieceImages[0] = ImageIO.read(getClass().getResource("/images/pawn_white.png"));
            pieceImages[1] = ImageIO.read(getClass().getResource("/images/rook_white.png"));
            pieceImages[2]=ImageIO.read(getClass().getResource("/images/knight_white.png"));
            pieceImages[3]=ImageIO.read(getClass().getResource("/images/bishop_white.png"));
            pieceImages[4]=ImageIO.read(getClass().getResource("/images/quen_white.png"));
            pieceImages[5]=ImageIO.read(getClass().getResource("/images/king_white.png"));

            pieceImages[6]=ImageIO.read(getClass().getResource("/images/pawn_black.png"));
            pieceImages[7]=ImageIO.read(getClass().getResource("/images/rook_black.png"));
            pieceImages[8]= ImageIO.read(getClass().getResource("/images/knight_black.png"));
            pieceImages[9]=ImageIO.read(getClass().getResource("/images/bishop_black.png"));
            pieceImages[10]=ImageIO.read(getClass().getResource("/images/quen_black.png"));
            pieceImages[11]=ImageIO.read(getClass().getResource("/images/king_black.png"));
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }


}
