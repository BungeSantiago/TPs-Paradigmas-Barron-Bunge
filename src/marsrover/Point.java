package marsrover;

// ver lo de que las coordeandas deben ser inmutables

public class Point {
	int x;
	int y;

	public Point(int i, int j) {
		x = i;
		y = j;
	}
	public Point add(Point point) {
		x = x + point.x;
		y = y + point.y;
		return this;
	}
	@Override
	public boolean equals(Object obj) {
	    if (this == obj) {
	        return true;
	    }
	    if (obj == null || getClass() != obj.getClass()) {
	        return false;
	    }
	    Point other = (Point) obj;
	    return this.x == other.x && this.y == other.y;
	}

}