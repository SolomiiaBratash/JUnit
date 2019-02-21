package com.bratash.task2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class SampleTest {
    final private boolean boolValue = true;
    Sample sample = new Sample();
    private Sample lstTest = new Sample();

    @BeforeEach
    public void init() {
        lstTest.add("User1");
        lstTest.add("User2");
        lstTest.add("User3");
    }

    @Test
    void sum() throws Exception{
        int actual = sample.sum(5);
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    void returnNullString() {
        assertNotNull(sample);
    }

    @Test
    void getStr() {
        assertNull(sample.getStr());
    }

    @Test
    void remove() {
        lstTest.remove("User2");
        assertEquals(2, lstTest.size());
    }

    @Test
    void testFinalPrivateBool(){
        assertNotEquals(boolValue, false);
    }
}