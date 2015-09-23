package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class ERRORERROR {

	public static void main(String[] args) {

	Robot Armando = new Robot();
	Armando.penDown();	
	Armando.setPenWidth(10);
	Armando.setSpeed(333);	
	for (int i = 0; i < 100; i++) {
		Armando.move(100);
		Armando.turn(90);
		Armando.setRandomPenColor();
	}	
	Armando.penUp();
	Armando.moveTo(920, 475);
		
		
	}

}
