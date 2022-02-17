package models;

import java.lang.reflect.Array;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Hangman {

    private char guessChar;
    private String[] wordsToGuess = {"waldo","berzerk","mongolia"};

   public int currentIndex = ThreadLocalRandom.current().nextInt(wordsToGuess.length);


}
