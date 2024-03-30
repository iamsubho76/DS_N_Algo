package com.org.ds.v3.lohia.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoCharactersTest {

    private final TwoCharacters twoCharacters = new TwoCharacters();

    @Test
    void testTwoCharacters1() {
        String str = "beabeefeab";
        assertEquals(5, twoCharacters.alternate(str));
    }

    @Test
    void testTwoCharacters2() {
        String str = "jshdjshdjshdjs";
        assertEquals(8, twoCharacters.alternate(str));
    }

}