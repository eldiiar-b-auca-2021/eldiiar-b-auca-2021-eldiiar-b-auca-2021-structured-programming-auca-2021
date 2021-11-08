import processing.core.*;

public class Problem02 extends PApplet {
    float x;
    float y;
    float dx = 0;
    float dy = 0;
    public void settings() {
        //fullScreen();
        size (800,800);
    }

    public void setup() {
        x = 400;
        y = 400;
        dx = random(-25f, 25f);
        dy = random(-25f, 25f);

    }
    public void draw() {
        background(25, 40, 60);
        fill(255, 1, 0);
        circle(x, y, 50);
        x += dx;
        y += dy;

        if (x >= width) {
            x = width - 1;
            dx = -dx;
        }
        if (x < 0) {
            x = 0;
            dx = -dx;
        }
        if (y >= height) {
            y = height - 1;
            dy = -dy;
        }
        if (y < 0) {
            y = 0;
            dy = -dy;
        }
    }

    public static void main(String[] args) {
        PApplet.main("Problem02");

    }

}
