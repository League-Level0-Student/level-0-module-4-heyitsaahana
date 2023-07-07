package _99_extra.pong;

import javax.swing.JOptionPane;

import processing.core.PApplet;

public class Pong extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    int x=100;
    int xSpeed=3;
    int y=100;
    int ySpeed=3;
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
        
    }

    @Override
    public void setup() {

    }

    @Override
    public void draw() {
    	stroke( 0,0,155   );
    	fill(0,0,255);
    	background(0,0,100);
    	ellipse(x,y,75,75);
    	x=x+xSpeed;
    	  y=y+ySpeed;
    	if (x>width) {
    		xSpeed=-xSpeed;
    	}
    	if(y>height) {
    		ySpeed=-ySpeed;
    		JOptionPane.showMessageDialog(null,"You lost");
    	}
    	if(x<0) {
    		xSpeed=-xSpeed;
    	}
    	if(y<0) {
    		ySpeed=-ySpeed;
    		
    		
    	}
    	fill(0,255,0);
    	rect(mouseX, 500,175,150);
    	if(y>   500   &&  x>mouseX  &&  x<mouseX+175) {
    		ySpeed=-ySpeed;
    	}
    	
    	
    }

    private void mouseX() {
		// TODO Auto-generated method stub
		
	}

	static public void main(String[] args) {
        PApplet.main(Pong.class.getName());
    }
}