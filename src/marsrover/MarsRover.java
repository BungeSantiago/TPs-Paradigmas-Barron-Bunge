package marsrover;



import java.util.function.BooleanSupplier;



public class MarsRover {
	


	public static final String UnknownCommand = "Unknown Command";

	
	private Point position;
	public Orientation orientation;



	public MarsRover(Point initialPosition, Orientation initialOrientation) {
		position = initialPosition;
		orientation = initialOrientation;
	}

	public Point getPosition() {
		return position;
	}
	public Orientation getOrientation() {
		return orientation;
	}

	public boolean isHeadingNorth() {
		return orientation.equals(new North());
	}

	public void move(String string) {
		for (char comando : string.toCharArray()) {
		if (comando == 'f') {
			moveForward();
		}
		else if (comando == 'b') {
			moveBackwards();
		}
		else if (comando == 'l') {
			turnLeft();
		}
		else if (comando == 'r') {
			turnRight();
		}
		else {
			throw new RuntimeException( UnknownCommand );
		}
		}
	}
	
	public void turnLeft() {
		orientation = orientation.turnLeft();
		
		}
	public void turnRight() {
		orientation = orientation.turnRight();
	}
	
	public void moveForward() {
		position = position.add(orientation.moveForward());
//		if (orientation.equals("N")) {
//			position.increaseY();}
//		else if (orientation.equals("O")) {
//			position.decreaseX();}
//		else if (orientation.equals("S")) {
//			position.decreaseY();}
//		else {
//			position.increaseX();}
	}
	
	public void moveBackwards() {
		position = position.add(orientation.moveBackwards());
//		if (orientation.equals("N")) {
//			position.decreaseY();}
//		else if (orientation.equals("O")) {
//			position.increaseX();}
//		else if (orientation.equals("S")) {
//			position.increaseY();}
//		else {
//			position.decreaseX();}
	}
}




