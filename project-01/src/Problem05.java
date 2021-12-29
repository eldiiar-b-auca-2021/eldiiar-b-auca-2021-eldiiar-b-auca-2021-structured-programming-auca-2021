import processing.core.*;

import javax.swing.*;

public class Problem05 extends PApplet {
    static final float BOARD_SIZE = 600;
    float radius;
    float row,x;
    float column,y;
    String color;
    public void settings() {
        fullScreen();
    }
    public void setup() {
        textSize(30);
        x = width/2f-300f;
        y = height/2f -300f;
        row = -1;
        column = -1;
        color = "No Color";
        try {
            String strRadius = JOptionPane.showInputDialog("Radius [4, 12]: ");
            radius = Float.parseFloat(strRadius);
            //JOptionPane.showMessageDialog(null,"Hello" );
        }catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Incorrect number" );
            System.exit(1);
        }
         if (radius < 4 || radius > 12) {
            JOptionPane.showMessageDialog(null,"Incorrect number" );
            System.exit(1);
        }
    }
    public void draw() {
        background(0,0,0);
        fill(255,255,0);
        text("Row:"+row+" Column: "+column+"  Color: "+color,width/2f-200,50);

        fill(0,0,0);
        stroke (255,255,255);
        rect(x, y, BOARD_SIZE, BOARD_SIZE);

        for (int i = 0; i < radius; i++) {
           for (int j = 0; j < radius;j++){
               float x1 = x + i * BOARD_SIZE/radius;
               float y1 = y + j * BOARD_SIZE/radius;
               if ((i+j) % 2 == 0) {
                   fill(150,150,150);
               } else {
                   fill (0,30,0);
               }
               if (mouseX >= x1 && mouseX <= x1+BOARD_SIZE/radius && mouseY >= y1 && mouseY <= y1+BOARD_SIZE/radius) {
                   row = i;
                   column = j;
                   if ((i+j) % 2 != 0) {
                       color = "Black";
                   } else {
                       color = "White";
                   }
                   noFill();
                   square(x1,y1,BOARD_SIZE/radius);
               }
              square(x1,y1,BOARD_SIZE/radius);
           }

        }
        fill(255, 0,0);
        ellipse(mouseX,mouseY,1,1);

    }
    public static void main(String[] args) {
        PApplet.main("Problem05");

    }
}
