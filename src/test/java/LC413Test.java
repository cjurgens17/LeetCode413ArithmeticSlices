import static org.junit.Assert.*;

public class LC413Test {

    @org.junit.Test
    public void numberOfArithemeticSlice() {
        int actual1 = LC413.numberOfArithemeticSlice(new int[] {1,2,3,4});
        int actual2 = LC413.numberOfArithemeticSlice(new int[] {1});
        int actual3 = LC413.numberOfArithemeticSlice(new int[] {1,2,3,8,9,10});

        assertEquals(3,actual1);
        assertEquals(0,actual2);
        assertEquals(2,actual3);

    }
}