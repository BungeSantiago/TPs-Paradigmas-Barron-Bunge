package rover;

public class East extends Orientation {
	
	public East() {
	}
	@Override
	public Orientation turnLeft() {
		return new North();
	}
	@Override
	public Orientation turnRight() {
		return new South();
	}
	@Override
	public Point moveForward() {
		return new Point(1, 0);
	}
	@Override
	public Point moveBackwards() {
		return new Point(-1,0);
	}
}
