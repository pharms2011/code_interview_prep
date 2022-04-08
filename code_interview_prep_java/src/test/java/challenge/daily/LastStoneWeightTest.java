package challenge.daily;

import org.junit.Test;

import static org.junit.Assert.*;

public class LastStoneWeightTest {

    @Test
    public void test(){
        LastStoneWeight lastStoneWeight = new LastStoneWeight();
        assertEquals(2, lastStoneWeight.lastStoneWeight(new int[] {3,7,2}));
    }
}
