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

}