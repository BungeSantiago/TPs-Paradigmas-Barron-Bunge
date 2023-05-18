package marsrover;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;

 public class MarsRoverTest {

@Test public void test00MarsHaveCorrectInitialPositionAndOrientation() {

	Point initialPosition = new Point(0,0);
	Orientation north = new North();
	MarsRover rover = new MarsRover(initialPosition, north);
	assertEquals(initialPosition, rover.getPosition() ); 
	assertTrue(rover.isHeadingNorth());
	}
@Test public void test01MarsFacingNorthCanRotateLeft() {
	Point point = new Point(0,0);
	Orientation north = new North();
	MarsRover rover = new MarsRover(point, north);
	rover.turnLeft();
	assertEquals(new West(), rover.getOrientation() );
}
@Test public void test02MarsFacingCandRotateLeft() {
	Point point = new Point(0,0);
	Orientation west = new West();
	MarsRover rover = new MarsRover(point, west);
	rover.turnLeft();
	assertEquals(new South(), rover.getOrientation() );
}
@Test public void test03MarsFacingSouthCanRotateLeft() {
	Point point = new Point(0,0);
	Orientation south = new South();
	MarsRover rover = new MarsRover(point, south);
	rover.turnLeft();
	assertEquals(new East(), rover.getOrientation() );
}
@Test public void test04MarsFacingEastCanRotateLeft() {
	Point point = new Point(0,0);
	Orientation east = new East();
	MarsRover rover = new MarsRover(point, east);
	rover.turnLeft();
	assertEquals(new North(), rover.getOrientation() );
}
@Test public void test05MarsFacingNorthCanRotateRight() {
	Point point = new Point(0,0);
	Orientation north = new North();
	MarsRover rover = new MarsRover(point, north);
	rover.turnRight();
	assertEquals(new East(), rover.getOrientation() );
}
@Test public void test06MarsFacingEastCanRotateRight() {
	Point point = new Point(0,0);
	Orientation east = new East();
	MarsRover rover = new MarsRover(point, east);
	rover.turnRight();
	assertEquals(new South(), rover.getOrientation() );
}
@Test public void test07MarsFacingSouthCanRotateRight() {
	Point point = new Point(0,0);
	Orientation south = new South();
	MarsRover rover = new MarsRover(point, south);
	rover.turnRight();
	assertEquals(new West(), rover.getOrientation() );
}
@Test public void test08MarsFacingWestCanRotateRight() {
	Point point = new Point(0,0);
	Orientation west = new West();
	MarsRover rover = new MarsRover(point, west);
	rover.turnRight();
	assertEquals(new North(), rover.getOrientation() );
}
@Test public void test09MarsFacingNorthCanMoveForward() {
	Point point = new Point(0,1);
	MarsRover rover = new MarsRover(new Point(0,0), new North());
	rover.moveForward();
	assertEquals(point, rover.getPosition() );
}
@Test public void test10MarsFacingEastCanMoveForward() {
	Point point = new Point(1,0);
	MarsRover rover = new MarsRover(new Point(0,0), new East());
	rover.moveForward();
	assertEquals(point, rover.getPosition() );
}
@Test public void test11MarsFacingSouthCanMoveForward() {
	Point point = new Point(0,-1);
	MarsRover rover = new MarsRover(new Point(0,0), new South());
	rover.moveForward();
	assertEquals(point, rover.getPosition() );
}
@Test public void test12MarsFacingWestCanMoveForward() {
	Point point = new Point(-1,0);
	MarsRover rover = new MarsRover(new Point(0,0), new West());
	rover.moveForward();
	assertEquals(point, rover.getPosition() );
}
@Test public void test13MarsCanMoveWithCommand(){
	Point point = new Point(1,0);
	MarsRover rover = new MarsRover(new Point(0,0), new North());
	rover.move("frflb");
	assertEquals(point, rover.getPosition());
}
@Test public void test14MarsStopWithUnknounCommand(){
	Point point = new Point(0,1);
	MarsRover rover1 = new MarsRover(new Point(0,0), new North());
	MarsRover rover2 = new MarsRover(new Point(0,0), new North());
	try {
	      rover2.move("frui");
	    } catch ( Exception e ) {
	      assertEquals(  MarsRover.UnknownCommand , e.getMessage() );
	    }
    assertEquals( rover1.move("fr").getPosition(), rover2.getPosition() );
    assertEquals( rover1.move("fr").getOrientation(), rover2.getOrientation() );
}

}