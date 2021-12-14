import processing.core.*;

import javax.swing.*;

public class Problem06 extends PApplet {
    float alpha,beta,gamma;
    float redComp = 0,yellow = 0,r = 100,num= 5;
    public void settings() {

        fullScreen();
    }
    public void setup() {
        textSize(30);
       alpha =  PI / 4;
       beta = PI / 8;
       gamma = PI / 8;
    }

    public void draw() {
        background(0, 0, 0);


        pushMatrix();
        translate(width / 2f, height / 2f);
        rotate(alpha);
        stroke(255, 0, 0);
        circle(0, 0, 300);
        circle(230, 0, 100);


        translate(380, 0);
        rotate(gamma);

        circle(0, 0, 95);
        circle(70, 0, 30);

        popMatrix();
        alpha += 0.005f;
        gamma += 0.02;

        fill(0, 0, 255);
        rect(width - 300, 50, 200, 50);
        fill(255,255,255);
        text ("Sun", width - 250, 50,200,50);
        fill(0,0,255);
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
            stroke(255);
        }
        if (mouseX >= width-300 && mouseX <= width-100 && mouseY >= 100 && mouseY <= 149 ) {
            fill(255,0,0);
            text ("Venus",width -250, 100,200,50);
        }
        if (mouseX >= width-300 && mouseX <= width - 100 && mouseY >= 150 && mouseY <= 199) {
            fill(255,0,0);
            text ("Earth",width -250,150,200,50);
        }
        if (mouseX >= width - 300 && mouseX <= width - 100 && mouseY >= 200 && mouseY <= 250) {
            fill(255,0,0);
            text("Moon", width -250,200,200,50);
        }

    }

    public static void main(String[] args) {
        PApplet.main("Problem06");
    }

}