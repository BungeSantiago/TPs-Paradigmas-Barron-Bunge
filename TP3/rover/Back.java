package rover;


public class Back extends Command {

	public Character character = 'b';
	
	@Override
	public boolean validCharacter(Character c) {
		return character == c;
	}

	@Override
	public MarsRover execute(MarsRover rover) {
		rover.moveBackwards();
		return rover;
	}

}
