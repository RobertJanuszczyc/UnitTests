import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnitTests {
    private Main object;

    @BeforeEach
    public void createMain() {
        object = new Main();
    }

    @Test
    public void testStartWordIfWordIsHip() {
        //given

        String inputString = "hippo";
        String inputWord = "hip";

        //when
        String stringResult = object.startWord(inputString, inputWord);

        //then
        Assertions.assertEquals(inputWord, stringResult);


    }


    @Test
    public void testStartWordIfWordIsXip() {
        //given
        String inputString = "hippo";
        String inputWord = "xip";

        //when
        String stringResult = object.startWord(inputString, inputWord);

        //then
        Assertions.assertEquals(inputString.substring(0, inputWord.length()), stringResult);
    }


    @Test
    public void testStartWordIfWordLengthIsLongerThanLengthString() {
        //given
        String inputString = "hippo";
        String inputWord = "hippokos";

        //when
        String stringResult = object.startWord(inputString, inputWord);

        //then
        Assertions.assertEquals("", stringResult);
    }


    @Test
    public void testStartWordIfStringIsNull() {
        //given
        String inputString = null;
        String inputWord = "xip";

        //when
        String stringResult = object.startWord(inputString, inputWord);

        //then
        Assertions.assertNull(stringResult);
    }


    @Test
    public void testMakeAbbaIfStringAIsAAndStringBIsB() {
        //given
        String aInput = "a";
        String bInput = "b";

        //when
        String result = object.makeAbba(aInput, bInput);


        //then
        Assertions.assertEquals(aInput + bInput + bInput + aInput, result);
    }


    @Test
    public void testMakeAbbaIfStringAIsHelloAndStringBIsB() {
        //given
        String helloInput = "Hello";
        String bInput = "b";

        //when
        String result = object.makeAbba(helloInput, bInput);


        //then
        assertEquals("HellobbHello", result);
    }


    @Test
    public void testMakeAbbaIfStringAIsNull() {
        //given
        String aInput = null;
        String bInput = "b";

        //when
        String result = object.makeAbba(aInput, bInput);


        //then
        assertNull(result);
    }


    @Test
    public void testMakeAbbaIfStringBIsNull() {
        //given
        String aInput = "a";
        String bInput = null;

        //when
        String result = object.makeAbba(aInput, bInput);


        //then
        assertNull(result);
    }


    @Test
    public void testWithoutXIfStringIsXhix() {
        //given
        String inputString = "xhix";

        //when
        String stringResult = object.withoutX(inputString);

        //then
        assertEquals(inputString.substring(1, inputString.length() - 1), stringResult);


    }

    @Test
    public void testWithoutXIfStringIsXhixAndSecondLetterInputStringEquatesFirstLetterOutputString() {
        //given
        String inputString = "xhix";

        //when
        String stringResult = object.withoutX(inputString);

        //then
        assertEquals(inputString.charAt(1), stringResult.charAt(0));


    }


    @Test
    public void testWithoutXIfStringIsNull() {
        //given
        String inputString = null;

        //when
        String stringResult = object.withoutX(inputString);

        //then
        assertNull(stringResult);


    }


    @Test
    public void testWithoutXIfStringIsEmpty() {
        //given
        String inputString = "";

        //when
        String stringResult = object.withoutX(inputString);

        //then
        assertNull(stringResult);


    }

    @Test
    public void testHas22IfArrayIs1223() {
        //given
        int[] inputArray = {1, 2, 2, 3};

        //when
        boolean conditionResult = object.has22(inputArray);

        //then
        assertTrue(conditionResult);
    }


    @Test
    public void testHas22IfArrayIs12323() {
        //given
        int[] inputArray = {1, 2, 3, 2, 3};

        //when
        boolean conditionResult = object.has22(inputArray);

        //then
        assertFalse(conditionResult);
    }

    @Test
    public void testHas22IfArrayIs2() {
        //given
        int[] inputArray = {2};

        //when
        boolean conditionResult = object.has22(inputArray);

        //then
        assertFalse(conditionResult);
    }


    @Test
    public void testHas22IfArrayIsEmpty() {
        //given
        int[] inputArray = {};

        //when
        boolean conditionResult = object.has22(inputArray);

        //then
        assertFalse(conditionResult);
    }

    @Test
    public void testMore14IfArrayIs1114() {
        //given
        int[] arrayInput = {1, 1, 1, 4};

        //when
        boolean methodResult = object.more14(arrayInput);

        //then
        assertTrue(methodResult);

    }


    @Test
    public void testMore14IfArrayIs1444() {
        //given
        int[] arrayInput = {1, 4, 4, 4};

        //when
        boolean methodResult = object.more14(arrayInput);

        //then
        assertFalse(methodResult);

    }


    @Test
    public void testMore14IfArrayIsEmpty() {
        //given
        int[] arrayInput = {};

        //when
        boolean methodResult = object.more14(arrayInput);

        //then
        assertFalse(methodResult);

    }

}

