package rover;


public class Forward extends Command {

	public Character character = 'f';
	
	@Override
	public boolean validCharacter(Character c) {
		return character == c;
	}

	@Override
	public MarsRover execute(MarsRover rover) {
		rover.moveForward();
		return rover;
	}

}
