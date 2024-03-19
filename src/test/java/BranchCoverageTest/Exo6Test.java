package BranchCoverageTest;

import BranchCoverageTest.FizzBuzz;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
public class Exo6Test {

    @Test
    public void testFizz() {
        assertEquals("Fizz", BranchCoverageTest.FizzBuzz.fizzBuzz(3));
        assertEquals("Fizz", BranchCoverageTest.FizzBuzz.fizzBuzz(6));
        assertEquals("Fizz", BranchCoverageTest.FizzBuzz.fizzBuzz(9));
    }

    @Test
    public void testBuzz() {
        assertEquals("Buzz", BranchCoverageTest.FizzBuzz.fizzBuzz(5));
        assertEquals("Buzz", BranchCoverageTest.FizzBuzz.fizzBuzz(10));
        assertEquals("Buzz", BranchCoverageTest.FizzBuzz.fizzBuzz(20));
    }

    @Test
    public void testFizzBuzz() {
        assertEquals("FizzBuzz", BranchCoverageTest.FizzBuzz.fizzBuzz(15));
        assertEquals("FizzBuzz", BranchCoverageTest.FizzBuzz.fizzBuzz(30));
        assertEquals("FizzBuzz", BranchCoverageTest.FizzBuzz.fizzBuzz(45));
    }

    @Test
    public void testNumber() {
        assertEquals("1", BranchCoverageTest.FizzBuzz.fizzBuzz(1));
        assertEquals("2", BranchCoverageTest.FizzBuzz.fizzBuzz(2));
        assertEquals("4", BranchCoverageTest.FizzBuzz.fizzBuzz(4));
        assertEquals("7", BranchCoverageTest.FizzBuzz.fizzBuzz(7));
    }

    @Test
    public void testEceptions() {
        assertThrows(IllegalArgumentException.class, () -> {
            assertEquals("7", FizzBuzz.fizzBuzz(-1));// Should throw IllegalArgumentException
        });
    }

}
