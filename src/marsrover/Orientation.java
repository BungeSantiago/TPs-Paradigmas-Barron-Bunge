package marsrover;

public abstract class Orientation {

	
	public abstract Orientation turnLeft();
	public abstract Orientation turnRight();
	public abstract Point moveForward();
	public abstract Point moveBackwards();
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return true;
    }
}
