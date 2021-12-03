import processing.core.*;

public class Problem04 extends PApplet {
    static final float RECT_WIDTH = 200;
    static final float RECT_HEIGHT = 200;

    public void settings() {
       fullScreen();

    }

    public void setup() {
        textSize(50f);
    }

    public void draw() {
        background(0, 0, 0);
        float rectWidth = (width/2f) - 400;
        float rectHeight = (height/2f) - 300;

        float secondRectWidth = (width/2f) - 400;
        float secondRectHeight = (height/2f) - 200;

        float thirdRectWidth = (width/2f) - 400;
        float thirdRectHeight = (height/2f) - 100;

        fill(0,0,250);
        rect(rectWidth,rectHeight,800,100);
        fill(255,255,255);
        text("    Java Programming Language",rectWidth,rectHeight,800,100);

        fill(0,0,250);
        rect(secondRectWidth,secondRectHeight,800,100);
        fill(255,255,255);
        text("    Kotlin Programming Language", secondRectWidth,secondRectHeight,800,100 );

        fill(0,0,250);
        rect(thirdRectWidth,thirdRectHeight,800,100);

        fill(255,255,255);
        text("    Scala Programming Language",thirdRectWidth,thirdRectHeight,800,100);

        int x = mouseX;
        int y = mouseY;
        if (mouseX >= rectWidth && mouseX <= rectWidth+800 &&
                mouseY >= rectHeight && mouseY <= rectHeight+100) {
            fill(255,0,0);
            text("    Java Programming Language",rectWidth,rectHeight,800,100);


            fill (255,204,0);
            text("Year: 1995.PYPL Index:2",rectWidth+200,rectHeight+600);

        } else if (mouseX >= secondRectWidth && mouseX <= secondRectHeight+800 &&
        mouseY>=secondRectHeight && mouseY <= secondRectHeight + 100) {
            fill(255,0,0);
            text("    Kotlin Programming Language", secondRectWidth,secondRectHeight,800,100 );

            fill(255,204,0);
            text("Year:2011.PYPL Index:11",rectWidth+200,rectHeight+600);

        } else if (mouseX >= thirdRectWidth && mouseX <= thirdRectWidth+800 &&
        mouseY >= thirdRectHeight && mouseY <= thirdRectHeight+100) {
            fill(255,0,0);
            text("    Scala Programming Language",thirdRectWidth,thirdRectHeight,800,100);

            fill(255,204,0);
            text("Year:2004.PYPL Index:20",rectWidth+200,rectHeight+600);
        }

    }

    public static void main(String[] args) {
        PApplet.main("Problem04");
    }

}