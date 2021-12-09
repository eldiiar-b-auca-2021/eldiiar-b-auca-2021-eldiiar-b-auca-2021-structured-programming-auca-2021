import processing.core.*;

public class Problem02 extends PApplet {
    float x1,x2,x3;
    float y1,y2,y3;

    float speedX1, speedX2, speedX3;
    float speedY1, speedY2, speedY3;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        x1 = width/2f;
        y1 = height/2f;

        x2 = (width/2f+45f);
        y2 = (height/2f+20f);

        x3 = (width/2f-45f);
        y3 = (height/2f-20f);

        speedX1 = random(-10,10);
        speedY1 = random(-10,10);
        speedX2 = speedX1;
        speedY2 = speedY1;
        speedX3 = speedX1;
        speedY3 = speedY1;

    }

    public void draw() {
        background(0, 0, 0);

        noStroke();
        fill(255,0,0);
        circle(x3,y3,50);

        fill(0,255,0);
        circle(x1,y1,50);

        fill(0,0,255);
        circle (x2,y2,50);

        x1 += speedX1;
        y1 += speedY1;

        x2 += speedX2;
        y2 += speedY2;

        x3 += speedX3;
        y3 += speedY3;


        if (x1 <= 0){
            x1 = 1;
            speedX1 = -speedX1;
        }
        if (y1 <= 0) {
            y1 = 1;
            speedY1 = -speedY1;
        }
        if (x1 >= width) {
            x1 = width-1;
            speedX1 = -speedX1;
        }
        if (y1 >= height) {
            y1 = height - 1;
            speedY1 = -speedY1;
        }
        if (x2 <= 0) {
            x2 = 1;
            speedX2 = -speedX2;
        }
        if (y2 <= 0) {
            y2 = 1;
            speedY2 = -speedY2;
        }
        if (x2 >= width) {
            x2 = width - 1;
            speedX2 = -speedX2;
        }
        if (y2 >= height) {
            y2 = height - 1;
            speedY2 = -speedY2;
        }
        if (x3 <= 0) {
            x3 = 1;
            speedX3 = -speedX3;
        }
        if (y3 <= 0) {
            y3 = 1;
            speedY3 = -speedY3;
        }
        if (x3 >= width) {
            x3 = width-1;
            speedX3 = -speedX3;
        }
        if (y3 >= height) {
            y3 = height -1;
            speedY3 = -speedY3;
        }

    }

    public static void main(String[] args) {
        PApplet.main("Problem02");
    }

}