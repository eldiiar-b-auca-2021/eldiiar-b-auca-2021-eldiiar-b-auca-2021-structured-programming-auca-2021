import processing.core.*;

public class Problem04 extends PApplet {
    float x,y,r;
    float a,b,c,d;
    public void settings() {
        fullScreen();
    }

    public void setup() {
        frameRate(10);
         x = width/4f+25;
         y = height /4f+25;
         r = 50f;

         a = width/4f+25;
         b = width/4f + 775;

         c = height/4f+25;
         d = height/4f+475;

    }

    public void draw() {
        fill(0,0,0,100);
        rect(0,0,width,height);
        stroke(0,0,255);
        fill(0,0,255);
        for (int i = 0;i<=500;i+=50) {
            fill(0,0,255);
            line(width / 4f, height / 4f+i, width / 4f + 800f, height / 4f+i);
        }
        for (int j = 0; j<=800; j+=50) {
            fill(0,0,255);
            line (width / 4f+j, height / 4f, width / 4f + j , height / 4f + 500);
        }

        noStroke();
        frameRate(5);
        fill(255,0,0);
        circle (x, y, r);

        if (key == CODED) {
            switch (keyCode) {
                case UP:
                  y-=r;
                  break;
                case DOWN:
                    y+=r;
                    break;
                case LEFT:
                    x -= r;
                    break;
                case RIGHT:
                    x += r;
                    break;

            }
        }
        if (x <= (width / 4f) ) {
            x = a;
        }
        if (x >= (width/4f + 800)) {
            x = b;
        }
        if (y <= (height/4f+25)) {
            y = c;
        }
        if (y >= (height/4f+500)) {
            y = d;
        }


            }


    public static void main(String[] args) {
        PApplet.main("Problem04");
    }

}