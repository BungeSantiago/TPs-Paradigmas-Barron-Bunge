package marsrover;

public class South extends Orientation {
	
	public South(){
	}

	@Override
	public Orientation turnLeft() {
		return new East();
	}

	@Override
	public Orientation turnRight() {
		return new West();
	}

	@Override
	public Point moveForward() {
		return new Point(0, -1);
	}

	@Override
	public Point moveBackwards() {
		return new Point(0,1);
	}

}
