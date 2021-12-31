import processing.core.*;

public class Problem03 extends PApplet {

    public void settings() {
        fullScreen();
    }

    public void setup() {
    }

    public void draw() {
        background(0, 0, 0);
        drawStar(width / 2f, height / 2f, height / 3f, 255f, 0f, 0f);
        drawStar(width / 6f, height / 6f, height / 8f, 255f, 255f, 0f);
        drawStar(width - width / 6f, height / 6f, height / 8f, 255f, 255f, 0f);
        drawStar(width/6f,height-height/6f,height/8f,255,255,0);
        drawStar(width-width/6f,height-height/6f,height/8f,255,255,0);
    }

    private void drawStar(float x, float y, float rad, float red, float green, float blue) {
        pushMatrix();

        int n = 8;
        float alpha = 0;
        float dAlpha = 2 * PI / n;

        translate(x, y);
        stroke(red, green, blue);

        float prevX = 0;
        float prevY = 0;

        for (int i = 0; i <= n; i++) {
            float curR = rad;
            if (i % 2 == 1) {
                curR /= 4;
            }
           x = curR * cos(alpha);
           y = curR * sin(alpha);
            line (0,0,x,y);


            line (prevX,prevY,x, y);

            prevX = x;
            prevY = y;
            alpha += dAlpha;

        }
        popMatrix();
    }


    public static void main(String[] args) {
        PApplet.main("Problem03");
    }

}