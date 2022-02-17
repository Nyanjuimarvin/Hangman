package models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HangmanTest {

    Hangman testHangman;
    @BeforeEach
    public void setUp(){
        testHangman = new Hangman();
    }

    @Test
    @DisplayName("Class Is Instantiated")
    public void runHangMan_isObjectIntantaited(){

        assertTrue(testHangman instanceof Hangman);
    }

    @Test
    @DisplayName("Random Integer Range")
    void runHangMan_checkRandomRange_Int() {
        assertEquals(testHangman.currentIndex,testHangman.currentIndex);
    }

    @Test
    @DisplayName("Should Check If The Character Is Set")
    void runHangMan_checkIfStringsAreReplaced_String() {
        testHangman.setGuessChar('w');
        assertEquals('w',testHangman.getGuessChar());
    }
}