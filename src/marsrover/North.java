package marsrover;

public class North extends Orientation {
	
	public North() {
	}

	@Override
	public Orientation turnLeft() {
		return new West();
	}

	@Override
	public Orientation turnRight() {
		return new East();
	}

	@Override
	public Point moveForward() {
		return new Point(0,1);
	}

	@Override
	public Point moveBackwards() {
		return new Point(0,-1);
	}

}
