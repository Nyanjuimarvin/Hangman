package models;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Hangman {

    private char guessChar;
    private final String[] wordsToGuess = {"waldo","berzerk","mongolia"};

    //Random number < 1 - 3>
    int currentIndex = ThreadLocalRandom.current().nextInt(wordsToGuess.length);

    //No of guesses == Chars in string
    long guessCount = wordsToGuess[currentIndex].chars().filter( ch -> ch != ' ').count();
    ArrayList<Character> everyGuess = new ArrayList<>();

    public void setGuessChar(char guessChar) {
        this.guessChar = guessChar;
    }

    public char getGuessChar() {
        return guessChar;
    }

    public String currentGuessWord(){
        return wordsToGuess[currentIndex];
    }

    public String wordToGuessAsCharacters(){
        String hiddenWord = wordsToGuess[currentIndex].replaceAll(".","_");
        return hiddenWord;
    }

    public void guessedWords ( ){
        everyGuess.add(getGuessChar());
    }


}
