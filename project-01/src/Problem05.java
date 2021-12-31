import processing.core.*;

import javax.swing.*;

public class Problem05 extends PApplet {
    float radius;
    float x,y;
    float row,column;
    String a;
    float boardSize;
    public void settings() {
        fullScreen();
    }
    public void setup() {
        textSize(30);
        boardSize = 600;
        row = 0;
        column = 0;
        a = "No Color";
        x = width/2f-300;
        y = height/2f-300;
        try {
            String strRadius = JOptionPane.showInputDialog("Radius [4,12]");
            radius = Float.parseFloat(strRadius);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Incorrect number");
            System.exit(1);
        }
        if (radius > 12 || radius < 4) {
            JOptionPane.showMessageDialog(null, "Incorrect number");
            System.exit(1);
        }
    }
    public void draw () {
        background(0, 0, 0);
        fill(255,255,0);
        text("Row:"+row+" Column: "+column+"  Color: "+a,width/2f-200,50);

        fill(0,0,0);
        stroke (255,255,255);
        rect(x, y, boardSize, boardSize);
        for (int i = 0; i <= radius; i++) {
            for (int j = 0; j <= radius; j++) {
                float x2 = x + i * boardSize/radius;
                float y2 = y + j * boardSize/radius;
                if ((j+i) % 2 == 0) {
                    noStroke();
                    fill(155,155,155);
                } else {
                    fill(1,55,32);
                }
                noStroke();
                square(x2, y2, boardSize/radius);
                if (mouseX >= x2 && mouseX <= x2+boardSize/radius && mouseY >= y2 && mouseY <= y2 + boardSize/radius) {
                    row = i;
                    column = j;
                    if ((i+j)%2==0) {
                        a = "White";
                    } else {
                        a = "Black";
                    }

                    strokeWeight(2);
                    stroke(255,0,0);
                    square(x2, y2, boardSize/radius-2);
                }
            }
        }
        noStroke();


    }
    public static void main (String[]args){
        PApplet.main("Problem05");

    }

}