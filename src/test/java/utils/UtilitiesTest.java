package utils;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import utils.exception.ShuffleException;
import utils.impl.AShuffle;
import utils.interf.Shuffle;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static utils.Utilities.*;

public class UtilitiesTest {

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test(expected = NullPointerException.class)
    public void getUniqueCountTestWithNullInput(){
        getUniqueCount(null);
    }

    @Test
    public void getUniqueCountTest(){
        Integer[] test = new Integer[]{0,0,0,1,1,1};
        assertThat(getUniqueCount(test),is(2));
    }

    @Test
    public void testGenerateRandomSequence(){
        Arrays.stream(generateRandomizedSequence(5, 8)).forEach(System.out::println);
    }

    @Test
    public void testGetCutPositions(){
        assertThat(getCutPositions(new Integer[]{1,1,0,0,0}),is(new Integer[]{3,2}));
    }
}