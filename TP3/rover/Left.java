package rover;


public class Left extends Command {

	public Character character = 'l';
			
	@Override
	public boolean validCharacter(Character c) {
		return character == c;
	}

	@Override
	public MarsRover execute(MarsRover rover) {
		rover.turnLeft();
		return rover;
	}

}
