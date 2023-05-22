package rover;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

 public class MarsRoverTest {

@Test public void test00MarsHasCorrectInitialPositionAndOrientation() {

	assertEquals(new Point(0, 0), marsRoverAtPositionZeroFacingNorth().getPosition() ); 
	assertTrue(marsRoverAtPositionZeroFacingNorth().isHeadingNorth());
	}

@Test public void test01MarsDoesntMoveWhenRotatingLeft() {
	assertEquals(new Point(0,0), marsRoverAtPositionZeroFacingNorth().turnLeft().getPosition());
}

@Test public void test02MarsDoesntMoveWhenRotatingRight() {
	assertEquals(new Point(0,0), marsRoverAtPositionZeroFacingNorth().turnRight().getPosition());
}

@Test public void test03MarsFacingNorthCanRotateLeft() {
	assertEquals(new West(), marsRoverAtPositionZeroFacingNorth().turnLeft().getOrientation() );
}
@Test public void test04MarsFacingWestCanRotateLeft() {
	assertEquals(new South(), marsRoverAtPositionZeroFacingWest().turnLeft().getOrientation() );
}

@Test public void test05MarsFacingSouthCanRotateLeft() {
	assertEquals(new East(), marsRoverAtPositionZeroFacingSouth().turnLeft().getOrientation() );
}

@Test public void test06MarsFacingEastCanRotateLeft() {
	assertEquals(new North(), marsRoverAtPositionZeroFacingEast().turnLeft().getOrientation() );
}

@Test public void test07MarsFacingNorthCanRotateRight() {
	assertEquals(new East(), marsRoverAtPositionZeroFacingNorth().turnRight().getOrientation() );
}

@Test public void test08MarsFacingEastCanRotateRight() {
	assertEquals(new South(), marsRoverAtPositionZeroFacingEast().turnRight().getOrientation() );
}

@Test public void test09MarsFacingSouthCanRotateRight() {
	assertEquals(new West(), marsRoverAtPositionZeroFacingSouth().turnRight().getOrientation() );
}

@Test public void test10MarsFacingWestCanRotateRight() {
	assertEquals(new North(), marsRoverAtPositionZeroFacingWest().turnRight().getOrientation() );
}

@Test public void test11MarsFacingNorthCanMoveForward() {
	assertEquals(new Point(0,1), marsRoverAtPositionZeroFacingNorth().moveForward().getPosition() );
}

@Test public void test12MarsFacingEastCanMoveForward() {
	assertEquals(new Point(1,0), marsRoverAtPositionZeroFacingEast().moveForward().getPosition() );
}

@Test public void test13MarsFacingSouthCanMoveForward() {
	assertEquals(new Point(0,-1), marsRoverAtPositionZeroFacingSouth().moveForward().getPosition() );
}

@Test public void test14MarsFacingWestCanMoveForward() {
	assertEquals(new Point(-1,0), marsRoverAtPositionZeroFacingWest().moveForward().getPosition() );
}

@Test public void test15MarsFacingNorthCanMoveBackwards() {
	assertEquals(new Point(0,-1), marsRoverAtPositionZeroFacingNorth().moveBackwards().getPosition() );
}

@Test public void test16MarsFacingEastCanMoveBackwards() {
	assertEquals(new Point(-1,0), marsRoverAtPositionZeroFacingEast().moveBackwards().getPosition() );
}

@Test public void test17MarsFacingSouthCanMoveBackwards() {
	assertEquals(new Point(0,1), marsRoverAtPositionZeroFacingSouth().moveBackwards().getPosition() );
}

@Test public void test18MarsFacingWestCanMovebackwards() {
	assertEquals(new Point(1,0), marsRoverAtPositionZeroFacingWest().moveBackwards().getPosition() );
}


@Test public void test19MarsCanMoveWithCommand(){
	assertEquals(new Point(1,0) , marsRoverAtPositionZeroFacingNorth().move("frflb").getPosition());
}


@Test public void test20MarsStopWithUnknownCommand(){
	MarsRover caseRover = marsRoverAtPositionZeroFacingNorth().move("fr");	
	MarsRover rover = new MarsRover(new Point(0,0), new North());

	assertThrowsLike(InvalidCommand.UnknownCommand, () -> rover.move("frui"));
    assertEquals( caseRover.getPosition(), rover.getPosition() );
    assertEquals( caseRover.getOrientation(), rover.getOrientation() );
}




private MarsRover marsRoverAtPositionZeroFacingNorth() {
	return new MarsRover(new Point(0,0), new North());

}

private MarsRover marsRoverAtPositionZeroFacingWest() {
	return new MarsRover(new Point(0,0), new West());

}

private MarsRover marsRoverAtPositionZeroFacingSouth() {
	return new MarsRover(new Point(0,0), new South());

}

private MarsRover marsRoverAtPositionZeroFacingEast() {
	return new MarsRover(new Point(0,0), new East());
}

private void assertThrowsLike(String msg, Executable expressionToEvaluate) {
	assertEquals(msg, assertThrows(Exception.class, expressionToEvaluate).getMessage());
}

}