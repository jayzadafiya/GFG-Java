/*
 * 1 - methods which are in super class
 * 2- methods which are in subclass or overloading 
 * 3- methods which are overriding
 */

package opp;

public class polymorphism {

	public static void main(String[] args) {
//		mountainbike m = new bicycle (3,100);    // we can not make object of subclass using super class	
//		mountainbike m = new mountainbike (3,100,50);	// 1 2 3		
//		m.speedUp(20);
//		System.out.println(m.info());

//		bicycle b = new mountainbike(3,100,50);// 1 3
//		b.speedUp(50);
//		System.out.println(b.info());

		bicycle b = new bicycle(3, 100); // 1 3
		b.speedUp(50);
		System.out.println(b.info());

	}

}

class bicycle {
	public int gear;
	public int speed;

	bicycle(int gear, int speed) {
		this.gear = gear;
		this.speed = speed;
	}

	// 1
	public void speedUp(int increment) {
		speed += increment;

	}

	// 1
	public void applyBreak(int decrement) {
		speed -= decrement;
	}

	public String info() {
		return ("No of Gear are " + gear + "\n" + "speed of bike is " + speed);
	}
}

class mountainbike extends bicycle {

	int setHight;

	mountainbike(int gear, int speed, int setHight) {
		super(gear, speed);// always write super class at first line of child class
		this.setHight = setHight;
	}

	// 2
	public void setHight(int newvalue) {
		setHight = newvalue;
	}

	// 3
	@Override
	public String info() {
		return (super.info() + "\nhight of bike is " + setHight);
	}

}
