import processing.core.*;

public class Problem04 extends PApplet {

    float circleX;
    float circleY;
    float circleR;
    public void settings() {

        size(1000, 800);
    }

    public void setup() {
        textSize(30);
        circleX = 1000 / 2f;
        circleY = 800 / 2f;
        circleR = 800 / 20f;
        frameRate(10);
    }

    public void draw() {
        fill(0,255,0);
       text ("Game: Collect Yellow Circles using Arrow Buttons",200,50);
       text("Score: ", 400, 750);

        stroke(0,0,255);

        for (int i = 0; i < 550; i+=40) {

            fill(255, 0, 0);
            line(120, 100 + i, width - 120 , height - 700 + i);
        }
        for(int j = 0; j < 800; j+=40) {
            fill (255,0,0);
            line(121+j,100,width-879+j,height-180);
        }

        //line(100, 600, width - 100, height-200);
        noStroke();
        fill(0,0,0,100);
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