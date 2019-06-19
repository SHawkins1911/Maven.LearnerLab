package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudents {
    @Test
    public void testGetInstance(){
        Students students = Students.getInstance();
        Boolean everyStudent = true;
        String[] studentNames = {"Ben C", "Ben R", "Edward", "Alex I", "Alex B", "Kavya", "Prashanti", "Reese",
                "Joanna", " Angelica", "Erik", "Bob", "Robert", "Abram", "Andrew", "Anish", "Donna", "William", "Ajulu", "Justin",
                "Sputnika", "Dan", "Caleb", "Alicia", " Dasha", "Aashna", "Connor"};

        for (int i = 0; i < studentNames.length ; i++) {
            if (!students.findById(i+1).getName.equals(studentNames[i])){
                everyStudent= false;
                break;
            }
        }
        Assert.assertTrue(everyStudent);
    }

}
