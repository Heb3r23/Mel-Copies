import java.util.Scanner;

public class Lab4{
	public static void main(String[] args){

		SuperDie fStop = new SuperDie(5);
		SuperDie shutterSpeed = new SuperDie(11);

		System.out.println("F-Stop: " + fStop.rollDie());
		System.out.println("Shutter Speed: " + shutterSpeed.rollDie());
	}
}