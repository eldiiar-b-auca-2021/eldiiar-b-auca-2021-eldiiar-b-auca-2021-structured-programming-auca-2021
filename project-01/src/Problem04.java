import processing.core.*;

public class Problem04 extends PApplet {

    float circleX;
    float circleY;
    float circleR;
    public void settings() {

        size(1000, 800);
    }

    public void setup() {
         //stroke(0,0,255);
        circleX = 1000 / 2f;
        circleY = 800 / 2f;
        circleR = 800 / 20f;
        frameRate(10);
    }

    public void draw() {
        background(0,0,0);
        stroke(0,0,255);


        for (int i = 0; i < 550; i+=40) {

            fill(255, 0, 0);
            line(100, 100 + i, width - 100 , height - 700 + i);
        }
        line(100, 600, width - 100, height-200);

        fill(0,0,0,50);
        rect(0,0,width,height);

        fill(255,0,0);
        circle(circleX,circleY,circleR);
        frameRate(5);
        if (key == CODED) {
            switch (keyCode) {
                case UP:
                    circleY -= circleR;
                    break;
                case DOWN:
                    circleY += circleR;
                    break;
                case RIGHT:
                    circleX += circleR;
                    break;
                case LEFT:
                    circleX -= circleR;
                    break;
            }
        }

    }

    public static void main(String[] args) {
        PApplet.main("Problem04");
    }

}