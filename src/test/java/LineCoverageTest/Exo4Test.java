package LineCoverageTest;

import org.example.Anagram;
import org.example.BinarySearch;
import org.example.Palindrome;
import org.example.QuadraticEquation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class Exo4Test {

    @Test
    public void Test(){
        double[] result = QuadraticEquation.solve(1, 2, 1);

        // Print the values of the array
        for (double value : result) {
            System.out.println(value);
        }
    }

}
