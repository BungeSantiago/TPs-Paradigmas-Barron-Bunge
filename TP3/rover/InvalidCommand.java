package rover;


public class InvalidCommand extends Command {

	public static final String UnknownCommand = "Unknown Command";

	@Override
	public boolean validCharacter(Character c) {
		return false;
	}

	@Override
	public MarsRover execute(MarsRover rover) {
		throw new UnsupportedOperationException(UnknownCommand);
	}

}
