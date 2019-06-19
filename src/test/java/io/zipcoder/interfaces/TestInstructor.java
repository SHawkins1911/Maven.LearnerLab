package io.zipcoder.interfaces;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestInstructor {
    @Test
    public void testImplementation(){
        Instructor instructor = new Instructor(3);

        assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance(){
        Instructor instructor = new Instructor(3);

        assertTrue(instructor instanceof Person);
    }

    @Test
    public void testTeach(){
        Instructor instructor = new Instructor(3);
        Student student1 = new Student(1);

        instructor.teach(student1, 13.5);

        assertEquals(13.5, student1.getNumberOfHours(), 13.5 );

    }

    @Test
    public void testLecture(){
        Instructor instructor = new Instructor(3);
        Student student1 = new Student(1);
        Student student2= new Student(6);
        Learner[] learners = new Learner [2];
        learners[0] = student1;
        learners[1] = student2;

        instructor.lecture(learners, 20.0);

        assertEquals(10.0, student1.getNumberOfHours(), 10.0 );

    }
}
