package marsrover;

public class West extends Orientation {

	public West() {
	}
	@Override
	public Orientation turnLeft() {
		return new South();
	}
	@Override
	public Orientation turnRight() {
		return new North();
	}
	@Override
	public Point moveForward() {
		return new Point(-1, 0);
	}
	@Override
	public Point moveBackwards() {
		return new Point(1, 0);
	}

}
