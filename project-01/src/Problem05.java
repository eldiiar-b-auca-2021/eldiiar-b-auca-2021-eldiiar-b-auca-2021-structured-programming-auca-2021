import processing.core.*;

import javax.swing.*;

public class Problem05 extends PApplet {
    static final float BOARD_SIZE = 600;
    float radius;
    float SIZE = 50;
    float rectX;
    float rectY;
    public void settings() {

        fullScreen();
    }


    public void setup() {

        try {
            String strRadius = JOptionPane.showInputDialog("Radius [10, 300]: ");
            radius = Float.parseFloat(strRadius);
            //JOptionPane.showMessageDialog(null,"Hello" );
        }catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Incorrect number" );
            System.exit(1);
        }
         if (radius < 10 || radius > 300) {
            JOptionPane.showMessageDialog(null,"Incorrect number" );
            System.exit(1);
        }
    }
    public void draw() {
        background(0,0,0);
        translate(width/2f-300f, height/2f - 300);
        fill(0,0,0);
        stroke (255,255,255);
        float x = 0,y = 0;
        rect(x, y, BOARD_SIZE, BOARD_SIZE);
        float x1,y1;
        for (int i = 0; i < radius; i++) {
           for (int j = 0; j < radius;j++){
               x1 = i * BOARD_SIZE/radius;
               y1 = j * BOARD_SIZE/radius;
               if ((i+j) % 2 == 0) {
                   fill(255,255,255);
               } else {
                   fill (0,255,0);
               }
              square(x1,y1,BOARD_SIZE/radius);
           }
        }


    }

    public static void main(String[] args) {
        PApplet.main("Problem05");

    }

}
