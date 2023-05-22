package rover;

public abstract class Command {
	
    public Character character;

    public abstract boolean validCharacter(Character c);

    public abstract MarsRover execute(MarsRover rover);

}
