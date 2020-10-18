package com.homeschooltracker.domain.content;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MaterialTest {
    // Initialize test data
    String description1 = "Worksheet A";
    String description2 = "Phonics Book, Page 32";

    Material material1 = new Material(description1);
    Material material2 = new Material(description2);

    @Test
    public void testGetDescription() {
        assertEquals("-- " + description1, material1.getName());
        assertEquals("-- " + description2, material2.getName());
    }

    @Test
    public void testPrepared() {
        material1.setPrepared();
        assertTrue(material1.isPrepared());
        assertFalse(material2.isPrepared());
    }

    @Test
    public void testCompleted() {
        material1.setCompleted();
        assertTrue(material1.isCompleted());
        assertFalse(material2.isCompleted());
    }

    @Test
    public void testGraded() {
        material1.setGraded();
        assertTrue(material1.isGraded());
        assertFalse(material2.isGraded());
    }

    @Test
    public void testToString() {
        material1.setGraded();
        String expected1 = "  [X][X][X] -- " + description1;

        material2.setPrepared();
        String expected2 = "  [X][ ][ ] -- " + description2;

        assertEquals(expected1, material1.toString());
        assertEquals(expected2, material2.toString());
    }

    @Test
    public void testSetGraded() {
        assertFalse(material1.isGraded());

        material2.setGraded();
        assertTrue(material2.isGraded());
    }
}