import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnitTests {

    // test start for startWord method
    //positive
    @Test
    public void theWordHipEqualsTheFirstThreeLettersOfTheString() {
        //given
        Main object = new Main();
        String inputString = "hippo";
        String inputWord = "hip";

        //when
        String stringResult = object.startWord(inputString, inputWord);

        //then
        Assertions.assertEquals(inputWord, stringResult);

        //positive

    }

    //positive
    @Test
    public void theWordXipEqualsTheFirstThreeLettersOfTheString() {
        //given
        Main object = new Main();
        String inputString = "hippo";
        String inputWord = "xip";

        //when
        String stringResult = object.startWord(inputString, inputWord);

        //then
        Assertions.assertEquals(inputString.substring(0, inputWord.length()), stringResult);
    }

    //negative
    @Test
    public void theLengthOfTheWordIsLongerThanTheLengthOfTheString() {
        //given
        Main object = new Main();
        String inputString = "hippo";
        String inputWord = "hippokos";

        //when
        String stringResult = object.startWord(inputString, inputWord);

        //then
        Assertions.assertEquals("", stringResult);
    }

    //negative
    @Test
    public void theWordIsNullOrTheStringIsNullEqualsNull() {
        //given
        Main object = new Main();
        String inputString = null;
        String inputWord = "xip";

        //when
        String stringResult = object.startWord(inputString, inputWord);

        //then
        Assertions.assertNull(stringResult);
    }

    // end of testing for startWord method


    // test start for makeAbba method
    //positive
    @Test
    public void theWordAPlusTheWordBYieldsTheWordADoubleWordBAndA() {
        //given
        Main object = new Main();
        String aInput = "a";
        String bInput = "b";

        //when
        String result = object.makeAbba(aInput, bInput);


        //then
        Assertions.assertEquals(aInput + bInput + bInput + aInput, result);
    }

    //positive
    @Test
    public void helloPlusBEqualsHelloBBHello() {
        //given
        Main object = new Main();
        String helloInput = "Hello";
        String bInput = "b";

        //when
        String result = object.makeAbba(helloInput, bInput);


        //then
        assertEquals("HellobbHello", result);
    }

    //negative
    @Test
    public void aStringIsNull() {
        //given
        Main object = new Main();
        String aInput = null;
        String bInput = "b";

        //when
        String result = object.makeAbba(aInput, bInput);


        //then
        assertNull(result);
    }

    //negative
    @Test
    public void bStringIsNull() {
        //given
        Main object = new Main();
        String aInput = "a";
        String bInput = null;

        //when
        String result = object.makeAbba(aInput, bInput);


        //then
        assertNull(result);
    }
    // end of testing for makeAbba method

    // test start for withoutX method

    //positive
    @Test
    public void theStringXHiXBecomesStringHi() {
        //given
        Main object = new Main();
        String inputString = "xhix";

        //when
        String stringResult = object.withoutX(inputString);

        //then
        assertEquals(inputString.substring(1, inputString.length() - 1), stringResult);


    }

    //positive
    @Test
    public void theSecondLetterInputStringIsEquatesToFirstLetterInStringResult() {
        //given
        Main object = new Main();
        String inputString = "xhix";

        //when
        String stringResult = object.withoutX(inputString);

        //then
        assertEquals(inputString.charAt(1), stringResult.charAt(0));


    }

    //negative
    @Test
    public void ifStringInputIsNullStringResultEquatesNullAsWell() {
        //given
        Main object = new Main();
        String inputString = null;

        //when
        String stringResult = object.withoutX(inputString);

        //then
        assertNull(stringResult);


    }

    //negative
    @Test
    public void ifStringInputLengthIsLessThanOneStringResultEquatesNull() {
        //given
        Main object = new Main();
        String inputString = "";

        //when
        String stringResult = object.withoutX(inputString);

        //then
        assertNull(stringResult);


    }
    // end of testing for withoutX method

    // test start for has22 method
    //positive
    @Test
    public void array1223ReturnTrue() {
        //given
        Main object = new Main();
        int[] inputArray = {1, 2, 2, 3};

        //when
        boolean conditionResult = object.has22(inputArray);

        //then
        assertTrue(conditionResult);
    }

    //positive
    @Test
    public void array12323ReturnFalse() {
        //given
        Main object = new Main();
        int[] inputArray = {1, 2,3, 2, 3};

        //when
        boolean conditionResult = object.has22(inputArray);

        //then
        assertFalse(conditionResult);
    }

    //negative
    @Test
    public void ifInputArrayLengthOneReturnFalse() {
        //given
        Main object = new Main();
        int[] inputArray = {2};

        //when
        boolean conditionResult = object.has22(inputArray);

        //then
        assertFalse(conditionResult);
    }
    //negative
    @Test
    public void emptyInputArrayReturnFalse() {
        //given
        Main object = new Main();
        int[] inputArray = {};

        //when
        boolean conditionResult = object.has22(inputArray);

        //then
        assertFalse(conditionResult);
    }
    // end of testing for has22 method

    // test start for more14 method
    //positive
    @Test
    public void ifInputArrayIs1114MethodReturnTrue(){
        //given
        Main object = new Main();
        int[] arrayInput = {1,1,1,4};

        //when
        boolean methodResult = object.more14(arrayInput);

        //then
        assertTrue(methodResult);

    }

    //positive
    @Test
    public void ifInputArrayIs1444MethodReturnFalse(){
        //given
        Main object = new Main();
        int[] arrayInput = {1,4,4,4};

        //when
        boolean methodResult = object.more14(arrayInput);

        //then
        assertFalse(methodResult);

    }

    //negative
    @Test
    public void ifInputArrayIsEmptyReturnFalse(){
        //given
        Main object = new Main();
        int[] arrayInput = {};

        //when
        boolean methodResult = object.more14(arrayInput);

        //then
        assertFalse(methodResult);

    }
    // end of testing for more14 method
}

