package mil.ustranscom.dps.standard.tools;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UasiModemTest {

    private UasiModem testSubject;

    @Before public void setUp()
    {
        testSubject = new UasiModem();
    }

    @Test public void testEncodeReturnsEmptyStringWhenInputIsNull()
    {
        assertEquals("", testSubject.encode(null));
    }

    @Test public void testEncodeReplacesLowerCaseACharacterWithLowerCaseECharacter()
    {
        String testInput = "abc";
        String testResult = testSubject.encode(testInput);
        String expectedResult = "ebc";
        assertEquals(expectedResult, testResult);
    }

    @Test public void testEncodeReplacesUpperCaseACharacterWithUpperCaseECharacter()
    {
        String testInput = "ABC";
        String testResult = testSubject.encode(testInput);
        String expectedResult = "EBC";
        assertEquals(expectedResult, testResult);
    }

    @Test public void testEncodeReplacesLowerCaseECharacterWithLowerCaseICharacter()
    {
        String testInput = "def";
        String testResult = testSubject.encode(testInput);
        String expectedResult = "dif";
        assertEquals(expectedResult, testResult);
    }

    @Test public void testEncodeReplacesUpperCaseECharacterWithUpperCaseICharacter()
    {
        String testInput = "DEF";
        String testResult = testSubject.encode(testInput);
        String expectedResult = "DIF";
        assertEquals(expectedResult, testResult);
    }

    @Test public void testEncodeReplacesLowerCaseICharacterWithLowerCaseOCharacter()
    {
        String testInput = "hij";
        String testResult = testSubject.encode(testInput);
        String expectedResult = "hoj";
        assertEquals(expectedResult, testResult);
    }

    @Test public void testEncodeReplacesUpperCaseICharacterWithUpperCaseOCharacter()
    {
        String testInput = "HIJ";
        String testResult = testSubject.encode(testInput);
        String expectedResult = "HOJ";
        assertEquals(expectedResult, testResult);
    }

    @Test public void testEncodeReplacesLowerCaseOCharacterWithLowerCaseUCharacter()
    {
        String testInput = "nop";
        String testResult = testSubject.encode(testInput);
        String expectedResult = "nup";
        assertEquals(expectedResult, testResult);
    }

    @Test public void testEncodeReplacesUpperCaseOCharacterWithUpperCaseUCharacter()
    {
        String testInput = "NOP";
        String testResult = testSubject.encode(testInput);
        String expectedResult = "NUP";
        assertEquals(expectedResult, testResult);
    }

    @Test public void testEncodeReplacesLowerCaseUCharacterWithLowerCaseACharacter()
    {
        String testInput = "tuv";
        String testResult = testSubject.encode(testInput);
        String expectedResult = "tav";
        assertEquals(expectedResult, testResult);
    }

    @Test public void testEncodeReplacesUpperCaseUCharacterWithUpperCaseACharacter()
    {
        String testInput = "TUV";
        String testResult = testSubject.encode(testInput);
        String expectedResult = "TAV";
        assertEquals(expectedResult, testResult);
    }

    @Test public void testDecodeReturnsEmptyStringWhenInputIsNull()
    {
        assertEquals("", testSubject.decode(null));
    }

    @Test public void testDecodeReplacesLowerCaseACharacterWithLowerCaseUCharacter()
    {
        String testInput = "abc";
        String testResult = testSubject.decode(testInput);
        String expectedResult = "ubc";
        assertEquals(expectedResult, testResult);
    }

    @Test public void testDecodeReplacesUpperCaseACharacterWithUpperCaseUCharacter()
    {
        String testInput = "ABC";
        String testResult = testSubject.decode(testInput);
        String expectedResult = "UBC";
        assertEquals(expectedResult, testResult);
    }

    @Test public void testDecodeReplacesLowerCaseECharacterWithLowerCaseACharacter()
    {
        String testInput = "def";
        String testResult = testSubject.decode(testInput);
        String expectedResult = "daf";
        assertEquals(expectedResult, testResult);
    }

    @Test public void testDecodeReplacesUpperCaseECharacterWithUpperCaseACharacter()
    {
        String testInput = "DEF";
        String testResult = testSubject.decode(testInput);
        String expectedResult = "DAF";
        assertEquals(expectedResult, testResult);
    }

    @Test public void testDecodeReplacesLowerCaseICharacterWithLowerCaseECharacter()
    {
        String testInput = "hij";
        String testResult = testSubject.decode(testInput);
        String expectedResult = "hej";
        assertEquals(expectedResult, testResult);
    }

    @Test public void testDecodeReplacesUpperCaseICharacterWithUpperCaseECharacter()
    {
        String testInput = "HIJ";
        String testResult = testSubject.decode(testInput);
        String expectedResult = "HEJ";
        assertEquals(expectedResult, testResult);
    }

    @Test public void testDecodeReplacesLowerCaseOCharacterWithLowerCaseICharacter()
    {
        String testInput = "nop";
        String testResult = testSubject.decode(testInput);
        String expectedResult = "nip";
        assertEquals(expectedResult, testResult);
    }

    @Test public void testDecodeReplacesUpperCaseOCharacterWithUpperCaseICharacter()
    {
        String testInput = "NOP";
        String testResult = testSubject.decode(testInput);
        String expectedResult = "NIP";
        assertEquals(expectedResult, testResult);
    }

    @Test public void testDecodeReplacesLowerCaseUCharacterWithLowerCaseOCharacter()
    {
        String testInput = "tuv";
        String testResult = testSubject.decode(testInput);
        String expectedResult = "tov";
        assertEquals(expectedResult, testResult);
    }

    @Test public void testDecodeReplacesUpperCaseUCharacterWithUpperCaseOCharacter()
    {
        String testInput = "TUV";
        String testResult = testSubject.decode(testInput);
        String expectedResult = "TOV";
        assertEquals(expectedResult, testResult);
    }

}