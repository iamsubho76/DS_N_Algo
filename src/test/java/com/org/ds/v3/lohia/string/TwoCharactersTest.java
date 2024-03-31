package com.org.ds.v3.lohia.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoCharactersTest {

    private final C4_TwoCharacters twoCharacters = new C4_TwoCharacters();

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