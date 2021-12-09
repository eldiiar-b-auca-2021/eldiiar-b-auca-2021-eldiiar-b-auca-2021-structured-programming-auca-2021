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

        x2 = (width/2f+35f);
        y2 = (height/2f+35f);

        x3 = (width/2f-35f);
        y3 = (height/2f-35f);

        speedX1 = random(-8,8);
        speedY1 = random(-8,8);
        speedX2 = speedX1;
        speedY2 = speedY1;
        speedX3 = speedX1;
        speedY3 = speedY1;

    }

    public void draw() {
        background(0, 0, 0);

        fill(255,0,0);
        circle(x3,y3,50);

        fill(0,255,0);
        circle(x1,y1,50);

        fill(0,0,255);
        circle (x2,y2,50);

    }

    public static void main(String[] args) {
        PApplet.main("Problem02");
    }

}