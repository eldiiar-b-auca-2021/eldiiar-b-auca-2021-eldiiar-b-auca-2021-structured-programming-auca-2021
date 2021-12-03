import processing.core.*;

public class Problem05 extends PApplet {
    static final int NUM_OF_CIRCLES = 16;
    public void settings() {
        fullScreen();
    }

    public void setup() {
    noStroke();
    }

    public void draw() {
        background(0);
        float r = min(height,  width) / 2f;
        float redComp = 5;
        float dr = r / NUM_OF_CIRCLES;
        float dRedComp = 255f / NUM_OF_CIRCLES;

        for (int i = 0; i < NUM_OF_CIRCLES; i++) {
            fill(redComp,0,0);
            circle (width / 2f, height / 2f, 2 * r);
            r -= dr;
            redComp += dRedComp;
        }


    }

    public static void main(String[] args) {
        PApplet.main("Problem05");
    }

}

