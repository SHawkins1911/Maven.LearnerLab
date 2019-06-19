package io.zipcoder.interfaces;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class TestStudent {

    @Test
    public void testImplementation(){
        Student student = new Student(526);

        assertTrue(student instanceof Learner);
    }

    @Test
    public void testInheritance(){
        Student student = new Student(526);

        assertTrue(student instanceof Person);

    }
}
