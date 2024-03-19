package BranchCoverageTest;

import BranchCoverageTest.RomanNumeral;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
public class Exo5Test {

    @Test
    void testToRoman() {
        // Test lower bound
        assertEquals("I", BranchCoverageTest.RomanNumeral.toRoman_corection(1));

        // Test upper bound
        assertEquals("MMMCMXCIX", BranchCoverageTest.RomanNumeral.toRoman_corection(3999));

        // Test some random values
        assertEquals("V", BranchCoverageTest.RomanNumeral.toRoman_corection(5));
        assertEquals("XII", BranchCoverageTest.RomanNumeral.toRoman_corection(12));
        assertEquals("CXXV", BranchCoverageTest.RomanNumeral.toRoman_corection(125));
        assertEquals("DLIX", BranchCoverageTest.RomanNumeral.toRoman_corection(559));
        assertEquals("CMXCIV", BranchCoverageTest.RomanNumeral.toRoman_corection(994));
        assertEquals("MMMCM", BranchCoverageTest.RomanNumeral.toRoman_corection(3900));
    }

    @Test
    public void testToRomanForInvalidInput() {

        assertThrows(IllegalArgumentException.class, () -> {
            BranchCoverageTest.RomanNumeral.toRoman_corection(-1); // Should throw IllegalArgumentException
        });
    }

    @Test
    public void testToRomanForOutOfRangeInput() {

        assertThrows(IllegalArgumentException.class, () -> {
            RomanNumeral.toRoman_corection(4001); // Should throw IllegalArgumentException
        });
    }
}
