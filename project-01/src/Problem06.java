import processing.core.*;

import javax.swing.*;

public class Problem06 extends PApplet {
    float alpha,beta,gamma;
    public void settings() {

        fullScreen();
    }
    public void setup() {
        textSize(30);
        alpha = 1;
        beta =  0;
        gamma = 1f;
    }

    public void draw() {
        background(0,0,0);
        fill(0, 0, 255);
        rect(width - 300, 50, 200, 50);
        fill(255,255,255);
        text ("Sun", width - 250, 50,200,50);
        fill(0,0,255);
        stroke(255);
        rect (width - 300, 100, 200,50);
        fill(255,255,255);
        text ("Venus",width -250, 100,200,50);
        fill(0,0,255);
        rect (width - 300, 150, 200,50);
        fill(255,255,255);
        text ("Earth",width -250,150,200,50);
        fill(0,0,255);
        rect(width-300,200,200,50);
        fill(255,255,255);
        text("Moon", width -250,200,200,50);
        if (mouseX >= width - 300 && mouseX <= width - 100 &&
                mouseY >= 50 && mouseY <= 99) {
            fill(255,0,0);
            text ("Sun", width-250, 50,200,50);
            stroke(255,0,0);
            noFill();
            strokeWeight(3);
            circle(width / 2f, height/2f, 305);
        }

        if (mouseX >= width - 300 && mouseX <= width - 100 && mouseY >= 200 && mouseY <= 250) {
            fill(255,0,0);
            text("Moon", width -250,200,200,50);
        }

        pushMatrix();
        translate(width / 2f, height / 2f);
        float rad1 = 300f, d = 5f, red = 0, green = 0, dr = 5f;
        for (int i = 0; i < 30; i++) {
            noStroke();
            fill(red, green, 0);
            circle(0, 0, rad1);
            rad1 -= d;
            red += dr;
            green += dr;
        }
        rotate(alpha);
        alpha += 0.02f;
        float green3 = 0, blue3 = 0, venusChanger = 5;
        float radiusOfVenus = 100f, ch = 3;
        for (int i = 0; i < 30; i++) {
            fill(0,green3,blue3);
            circle(230, 0, radiusOfVenus);
            green3+=venusChanger;
            blue3+=venusChanger;
            radiusOfVenus-=ch;
        }
        if (mouseX >= width-300 && mouseX <= width-100 && mouseY >= 100 && mouseY <= 149 ) {
            fill(255,0,0);
            text ("Venus",width -250, 100,200,50);
            noFill();
            stroke(255,0,0);
            strokeWeight(3);
            circle(230,0,100);
        }
        popMatrix();



        pushMatrix();
        translate (width / 2f, height /2f);
        rotate(beta);
        float blue = 0, change = 5;
        float radius = 95f, radiusChange = 3f;
        for (int i = 0; i < 30; i++) {
            fill(0,0, blue);
            circle(350, 0, radius);
            blue+=change;
            radius-=radiusChange;
        }
        if (mouseX >= width-300 && mouseX <= width - 100 && mouseY >= 150 && mouseY <= 199) {
            fill(255,0,0);
            text ("Earth",width -250,150,200,50);
            noFill();
            stroke (255,0,0);
            strokeWeight(3);
            circle(350, 0, 95);
        }
        beta += 0.02;
        translate(350,0);
        rotate(gamma);
        float red1 = 0, green1 = 0, blue1 = 0, colorChanger = 5;
        float moonRadius = 10f, radiusChanger = 1;
        for (int i = 0; i < 30; i++) {
            fill (red1,green1,blue1);
            circle(80, 0, moonRadius);
            red1+=colorChanger;
            green1 += colorChanger;
            blue1 += colorChanger;
            moonRadius-=radiusChanger;
        }
        gamma += 0.05;


        popMatrix();

    }

    public static void main(String[] args) {
        PApplet.main("Problem06");
    }

}