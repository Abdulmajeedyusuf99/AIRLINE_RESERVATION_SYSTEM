import org.junit.Test;


import static org.junit.jupiter.api.Assertions.*;

public class PlaneTest {
    Plane plane = new Plane();
    @Test
    public void firstClassSeatsAreEmpty(){
        for(int i= 0; i <5; i++) {

            assertFalse(plane.seats[i]);
        }
    }

    @Test
    public void economySeatsAreEmpty(){
        for(int i= 5; i <10; i++) {

            assertFalse(plane.seats[i]);
        }
    }
    @Test
    public void assigningFirstClassSeat(){
        for(int i= 0; i <5; i++) {
            assertTrue(plane.assignSeat(0,5));
            assertTrue(plane.seats[i]);
        }
    }
    @Test
    public void assigningEconomySeat(){
        for(int i= 5; i <10; i++) {
            assertTrue(plane.assignSeat(5,10));
            assertTrue(plane.seats[i]);
        }
    }
    @Test
    public void changingOfFirstClassSeatToEconomy(){
        for(int i= 0; i <5; i++) {
            assertTrue(plane.assignSeat(0,5));
            assertTrue(plane.seats[i]);

        }
        System.out.println("first class is filled up");
        for(int i= 5; i <10; i++) {
            assertTrue(plane.assignSeat(5,10));
            assertTrue(plane.seats[i]);
        }
    }


}
