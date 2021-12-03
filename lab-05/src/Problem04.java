import processing.core.*;

public class Problem04 extends PApplet {

    public void settings() {
        fullScreen();
    }

    public void setup() {
        frameRate(2);

    }

    public void draw() {
        background(0);
       for (int i = 0; i < 100; i++) {
           float x = random(width);
           float y = random(height);

           float r = random(10,70);
           noStroke();
           fill (random(255), random(255), random(255));
           circle(x,y,2*r);
       }

    }

    public static void main(String[] args) {
        PApplet.main("Problem04");
    }

}
