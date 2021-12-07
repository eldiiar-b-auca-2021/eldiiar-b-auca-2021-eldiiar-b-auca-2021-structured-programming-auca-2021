import processing.core.*;

public class Problem01 extends PApplet {
    static float MIN_BORDER = 20;
    static float MAX_BORDER = 120;
    static float MESSAGE;
    float temp;
    float colorRed = 255;
    float colorGreen = 0;
    float colorBlue = 0;
    float changeSize;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        MESSAGE = MIN_BORDER;
        changeSize = 3f;
       // frameRate(10);

    }

    public void draw() {
        background(0, 0, 0);
        textSize(MESSAGE);
        textAlign(CENTER,CENTER);
        fill(colorRed,colorGreen,colorBlue);
        text ("Hello, processing!!!",width/2f,height/2f);
        MESSAGE+=changeSize;

        if (MESSAGE <= MIN_BORDER) {
            changeSize += 2;

            temp = colorRed;
            colorRed = colorBlue;
            colorBlue = temp;
        }
        if (MESSAGE >= MAX_BORDER) {
            changeSize -= 2;
            temp = colorRed;
            colorRed = colorGreen;
            colorGreen = temp;
        }

    }

    public static void main(String[] args) {
        PApplet.main("Problem01");
    }

}