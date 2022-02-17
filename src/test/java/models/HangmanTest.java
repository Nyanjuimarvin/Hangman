package models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HangmanTest {

    Hangman testHangman;
    @BeforeEach
    public void setUp(){
        testHangman = new Hangman();
    }

    @Test
    @DisplayName("Class Is Instantiated")
    public void HangMan_isObjectIntantaited(){

        assertTrue(testHangman instanceof Hangman);
    }

    @Test
    @DisplayName("Random Integer Range")
    void threadLocalRandom_checkRandomRange_Int() {
        assertEquals(testHangman.currentIndex,testHangman.currentIndex);
    }

    @Test
    @DisplayName("Should Check If The Character Is Set")
    void getGuessChar_checkGetterAndSetter() {
        testHangman.setGuessChar('w');
        assertEquals('w',testHangman.getGuessChar());
    }

    @Test
    void wordsToGuessAsCharacters_areWordsHiddenAsCharacters_String() {
        assertEquals(testHangman.wordToGuessAsCharacters(),testHangman.wordToGuessAsCharacters());
    }

    @Test
    @DisplayName("Should Return List Of Guessed Characters")
    void guessedWords_areGuessesStored_ArrayList() {
        List<Character> testGuesses = new ArrayList<>();
        testHangman.setGuessChar('e');
        testGuesses.add(testHangman.getGuessChar());
        testHangman.guessedWords();
        testHangman.setGuessChar('g');
        testGuesses.add(testHangman.getGuessChar());
        testHangman.guessedWords();

        assertEquals(testGuesses,testHangman.everyGuess);
    }
}