import processing.core.*;

public class Problem02 extends PApplet {
    float x;
    float y;
    float x2;
    float y2;
    float x3;
    float y3;
    float dx;
    float dy;
    float dx2;
    float dy2;
    float dx3;
    float dy3;
    public void settings() {
        //fullScreen();
        size (800,800);
    }

    public void setup() {
        x = 400;
        y = 400;

        dx = random(-10f,10f);
        dy = random(-10f,10f);
        dx = 10;
        dy = 10;
        dx2 = dx;
        dy2 = dy;
        dx3 = dx;
        dy3 = dy;

    }
    public void draw() {
        background(25, 40, 60);
        x2 = x-35;
        y2 = y-35;
        x3 = x+35;
        y3 = y+35;
        fill(0, 255, 0);
        circle(x, y, 50);

        fill(255,0,0);
        circle (x2,y2,50);


        fill(0,0,255);
        circle(x3,y3,50);

        x += dx;
        y += dy;
        x2 += dx2;
        y2 += dy2;
        x3 += dx3;
        y3 += dy3;




        if (x >= width) {
            x = width - 1;
            dx = -dx;
        }
        if (x <= 0) {
            x = 1;
            dx = -dx;
        }
        if (y >= height) {
            y = height - 1;
            dy = -dy;
        }
        if (y <= 0) {
            y = 1;
            dy = -dy;
        }
        if (x2 >= width) {
            x2 = width-1;
            dx2 = -dx2;

        }
        if (x2 <= width) {
            x2 = 1;
            dx2 = -dx2;
        }
        if (y2 >= height ) {
            y2 = height - 1;
            dy2 = -dy2;
        }
        if (x3 <= height) {
            x3 = 1;
            dx3 = -dx3;
        }
        if (y3 <= width) {
            y3 = 1;
            dy3 = -dy3;
        }

    }

    public static void main(String[] args) {
        PApplet.main("Problem02");

    }

}
