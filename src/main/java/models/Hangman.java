package models;

import java.lang.reflect.Array;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Hangman {

    private char guessChar;
    private String[] wordsToGuess = {"waldo","berzerk","mongolia"};

    int currentIndex = ThreadLocalRandom.current().nextInt(wordsToGuess.length);

    public void setGuessChar(char guessChar) {
        this.guessChar = guessChar;
    }

    public char getGuessChar() {
        return guessChar;
    }

    public void wordToGuessAsCharacters(){
        String hiddenWord = wordsToGuess[currentIndex].replaceAll(".","_");
        System.out.println(hiddenWord);
    }


}
