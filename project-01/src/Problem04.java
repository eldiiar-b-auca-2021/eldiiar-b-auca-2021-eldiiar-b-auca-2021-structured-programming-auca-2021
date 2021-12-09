import processing.core.*;

public class Problem04 extends PApplet {
    float x,y,r;
    float a,b,c,d,x2,y2,r2;
    int score = 0;
    public void settings() {
        fullScreen();
    }

    public void setup() {
        frameRate(10);
        textSize(50);
        x2 = width/4f+25;
        y2 = height /4f+25;
        r2 = 50f;

         x = width/4f+25;
         y = height /4f+25;
         r = 50f;

         a = width/4f+25;
         b = width/4f + 775;

         c = height/4f+25;
         d = height/4f+475;

    }

    public void draw() {
        fill(0,0,0,50);
        rect(0,0,width,height);
        noStroke();
        fill(0,255,0);
        text ("Game: Yellow Circles using Arrow Buttons",width/2f-430,height/6f);
        text("Score: " + score, width/2f -100,height-50);
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

        fill(255,255,0);
        circle(x2,y2,r2);
        if (x == x2 && y == y2) {
            x2 += 50;
            y2 += 50;
            score++;

        }
        if (x2 <=  (width / 4f) ) {
            x2 = a;
        }
        if (x2 >= (width / 4f + 800)) {
            x2 = b;
        }
        if (y2 <= (height/4f+25)) {
            y2 = c;
        }
        if (y2 >= (height/4f+500)) {
            y2 = d;
        }


            }


    public static void main(String[] args) {
        PApplet.main("Problem04");
    }

}