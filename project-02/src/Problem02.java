import processing.core.*;

import java.util.Random;


class check extends PApplet {

    int sizeOfField;
    int [][] tiles = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}};
    int sizeOfTiles;
    static final int NUM_SHUFFLE_MOVES = 500;
    static Random rnd = new Random();
    int numberOfMoves;
    float leftTopX, leftTopY;
    int empty_row, empty_column;


    public void settings() {
        fullScreen();
    }

    public void setup() {
        sizeOfField = height / 2;
        leftTopX = width / 2f - sizeOfField / 2f;
        leftTopY = height / 2f - sizeOfField / 2f;
        sizeOfTiles = sizeOfField / 4;
        numberOfMoves = 0;
        init();
        shuffle();
    }

    public void draw() {
        background(0, 0, 0);
        drawField();
        text();

    }

    public void text() {
        textAlign(CENTER, CENTER);
        fill(255, 255, 0);
        textSize(40);
        text("Game 15", width / 2f, height / 2f - 300);

        fill(255, 255, 0);
        textSize(40);
        text("Moves: " + numberOfMoves, width / 2f + 350, height / 2f);

        fill(255, 255, 0);
        textSize(40);
        text("Start/Restart: Enter", width / 2f, height / 2f + 350);
    }
    public void drawField() {
        for (int i = 0; i < 4; i++) { //row
            for (int j = 0; j < 4; j++){ //column
                fill(0, 0, 255);
                stroke(50);
                strokeWeight(4);
                square(leftTopX + i * sizeOfTiles, leftTopY + j * sizeOfTiles, sizeOfTiles);
                if (tiles [i][j] != 16) {
                    fill(255, 255, 0);
                    textSize(50);
                    text(tiles[i][j], leftTopX + i * sizeOfTiles + sizeOfField / 8f, (leftTopY + j * sizeOfTiles + sizeOfTiles / 8f) + 25);
                }

            }
        }
    }

    public void tileMove(int x, int y){
        int newRow = empty_row + x;
        int newCol = empty_column + y;
        if (empty_row + x >= 0 && empty_row + x < 4 && empty_column + y >= 0 && empty_column + y < 4) {
            int temp = tiles[newRow][newCol];
            tiles[newRow][newCol] = 16;
            tiles[empty_row][empty_column] = temp;
            empty_row = newRow;
            empty_column = newCol;
            numberOfMoves++;
        }
    }

    public void keyPressed() {
        switch (keyCode) {
            case UP -> tileMove(0, -1);
            case DOWN -> tileMove(0, 1);
            case RIGHT -> tileMove(1, 0);
            case LEFT -> tileMove(-1, 0);
            case ENTER -> {
                shuffle();
                numberOfMoves = 0;
            }
        }
    }

    public void init(){
        int num = 1;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                tiles[i][j] = num;
                num++;
            }
        }
        empty_row = 3;
        empty_column = 3;
    }

    public void shuffle() {
        int nMove = 0;
        while (nMove <= NUM_SHUFFLE_MOVES) {
            int dir = rnd.nextInt(4);
            int dc = 0;
            int dr = 0;
            switch (dir) {
                case 0 -> dr = -1;
                case 1 -> dc = 1;
                case 2 -> dr = 1;
                case 3 -> dc = -1;
            }
            if (empty_row + dr >= 0 && empty_row + dr < 4 && empty_column + dc >= 0 && empty_column + dc < 4) {
                tiles[empty_row][empty_column] = tiles[empty_row + dr][empty_column + dc];
                empty_row += dr;
                empty_column += dc;
                tiles[empty_row][empty_column] = 16;
                nMove++;
            }
        }
    }
    public static void main (String[]args){
        PApplet.main("check");
    }
}