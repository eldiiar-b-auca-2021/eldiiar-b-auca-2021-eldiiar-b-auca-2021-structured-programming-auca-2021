import processing.core.*;
public class Problem06 extends PApplet {
    float alpha;
    float beta ;
    float gamma;
    float red;
    float green;
    float blue;
    float radiusChanger;
    float radiusOfSun;
    float radiusOfVenus;
    float radiusOfEarth;
    float radiusOfMoon;
    public void settings() {
        fullScreen();
    }
    public void setup() {
        textSize(30);
        alpha = 1;
        beta = 0;
        gamma = 1;
    }
    public void draw() {
        background(0,0,0);
        float firstPointOfWidth = width-250;
        float firstPointOfHeight = 50;


        fill(0,0,255);
        rect(firstPointOfWidth,firstPointOfHeight,200,50);
        rect(firstPointOfWidth,100,200,50);
        rect(firstPointOfWidth,150,200,50);
        rect(firstPointOfWidth,200,200,50);


        fill(255,255,255);
        text ("SUN",firstPointOfWidth+50,firstPointOfHeight,200,50);
        text("VENUS", firstPointOfWidth+50,100,200,100);
        text("EARTH", firstPointOfWidth+50,150,200,150);
        text("MOON", firstPointOfWidth+50,200,200,200);

        if (mouseX >= firstPointOfWidth && mouseX <= width - 50 &&
                mouseY >= firstPointOfHeight && mouseY <= 99) {
            fill(255,0,0);
            text ("SUN",firstPointOfWidth+50,firstPointOfHeight,200,50);
            noFill();
            stroke(255,0,0);
            strokeWeight(1);
            circle(width/2f,height/2f,302);
        }
        if (mouseX >= firstPointOfWidth && mouseX <= width -50 &&
                mouseY >= 100 && mouseY <= 149) {
            fill(255,0,0);
            text("VENUS", firstPointOfWidth+50,100,200,100);
            noFill();
            stroke(255,0,0);
            strokeWeight(1);
            circle(width/2f,height/2f,510);
        }
        if (mouseX >= firstPointOfWidth && mouseX <= width - 50 &&
                mouseY >= 150 && mouseY <= 199) {
            fill(255,0,0);
            text("EARTH", firstPointOfWidth+50,150,200,150);
            noFill();
            stroke(255,0,0);
            strokeWeight(1);
            circle(width/2f,height/2f,750);
        }
        if (mouseX >= firstPointOfWidth && mouseX <= width - 50 &&
                mouseY >= 200 && mouseY <= 250) {
            fill(255,0,0);
            text("MOON", firstPointOfWidth+50,200,200,200);
        }
        pushMatrix();
        translate(width/2f,height/2f);
        red = 0;
        green = 0;
        blue = 0;
        radiusChanger = 5;
        radiusOfSun = 300;
        radiusOfVenus = 100;
        radiusOfEarth = 95;
        radiusOfMoon = 20;
        noStroke();
        for (int i = 0; i < 30; i++) {
            fill(red,green,0);
            circle(0,0,radiusOfSun);
            red += radiusChanger;
            green += radiusChanger;
            radiusOfSun -= radiusChanger;
        }
        rotate(alpha);
        alpha+=0.01;
        float rad2 = 3, color2 = 5, green2 = 0, blue2 = 0, radiusOfVenus2 = 100;
        noStroke();
        for (int i = 0; i < 30; i++) {
            fill(0,green2,blue2);
            circle(250,0,radiusOfVenus2);
            green2 += color2 ;
            blue2 += color2;
            radiusOfVenus2 -= rad2;
        }
        if (mouseX >= firstPointOfWidth && mouseX <= width -50 &&
                mouseY >= 100 && mouseY <= 149) {
            noFill();
            stroke(255, 0, 0);
            strokeWeight(1);
            circle(250, 0, 100);
        }
        popMatrix();

        pushMatrix();
        translate(width/2f,height/2f);
        rotate(beta);
        beta+=0.01;
        float rad3 = 3, blue3 = 0, color = 5,radiusOfEarth2 = 95;
        noStroke();
        for (int i = 0; i < 30; i++) {
            fill(0,0,blue3);
            circle (380,0,radiusOfEarth2);
            blue3 += color;
            radiusOfEarth2 -= rad3;
        }
        if (mouseX >= firstPointOfWidth && mouseX <= width - 50 &&
                mouseY >= 150 && mouseY <= 199) {
            noFill();
            stroke(255,0,0);
            strokeWeight(1);
            circle(380,0,97);
        }
        translate(380,0);


        float rad4 = 1,radiusOfMoon = 30, red4 = 0, green4 = 0, blue4 = 0, color4 = 1f;
        rotate(gamma);
        gamma += 0.05f;
        noStroke();
        for (int i = 0; i < 30; i++) {
            fill(red4,green4,blue4);
            circle(60,0,radiusOfMoon);
            red4+=color4;
            green4+=color4;
            blue4+=color4;
            radiusOfMoon-=rad4;
        }
        if (mouseX >= firstPointOfWidth && mouseX <= width - 50 &&
                mouseY >= 200 && mouseY <= 250) {
            noFill();
            stroke(255,0,0);
            strokeWeight(1);
            circle(60,0,33);
            circle(0,0,130);
        }

        popMatrix();
    }


    public static void main(String[] args) {
        PApplet.main("Problem06");
    }
}
