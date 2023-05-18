package marsrover;

import java.util.function.BooleanSupplier;

public class MarsRover {
	
	public static final String UnknownCommand = "Unknown Command";
	
	public Point position;
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

	public MarsRover move(String string) {
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
		return this;
	}
	
	public void turnLeft() {
		orientation = orientation.turnLeft();
	}
	
	public void turnRight() {
		orientation = orientation.turnRight();
	}
	
	public void moveForward() {
		position = position.add(orientation.moveForward());
	}
	
	public void moveBackwards() {
		position = position.add(orientation.moveBackwards());
	}
	
}




