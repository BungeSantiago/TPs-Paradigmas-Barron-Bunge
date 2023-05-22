package rover;

public class Right extends Command {

	public Character character = 'r';
	
	@Override
	public boolean validCharacter(Character c) {
		return character == c;
	}

	@Override
	public MarsRover execute(MarsRover rover) {
		rover.turnRight();
		return rover;
	}

}
