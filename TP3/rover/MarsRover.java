package rover;

import java.util.ArrayList;
import java.util.Arrays;

public class MarsRover {
	
	public Point position;
	public Orientation orientation;
	public ArrayList<Command> commands;

	public MarsRover(Point initialPosition, Orientation initialOrientation) {
		position = initialPosition;
		orientation = initialOrientation;
		commands = new ArrayList<>(Arrays.asList(new Left(), new Right(), new Forward(), new Back()));
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

	public MarsRover executeCommand(Character commandChar) {
		Command actualCommand = commands.stream().filter(c -> c.validCharacter(commandChar)).findFirst().orElse(new InvalidCommand());
		return actualCommand.execute(this);
	}
	
	public MarsRover move(String commandString) {
		for (char comando : commandString.toCharArray()) {
			this.executeCommand(comando);
		}
		return this;
	}

	public MarsRover turnLeft() {
		orientation = orientation.turnLeft();
		return this;
	}
	
	public MarsRover turnRight() {
		orientation = orientation.turnRight();
		return this;
	}
	
	public MarsRover moveForward() {
		position = position.add(orientation.moveForward());
		return this;
	}
	
	public MarsRover moveBackwards() {
		position = position.add(orientation.moveBackwards());
		return this;
	}
	
}




