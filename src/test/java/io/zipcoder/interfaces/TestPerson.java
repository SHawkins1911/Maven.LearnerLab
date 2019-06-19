package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestPerson {


    @Test
    public void PersonConstructorTest(){
        long id = 56201;
        String name = "Stefun";

        Person person = new Person(56201, "Stefun");

        assertEquals(56201, person.getId());

    }

    public void testSetName(){
        long id = 56201;
        String name = "Stefun";

        Person person = new Person(56201, "Stefun");

        assertEquals("Stefun", person.getName());
    }

}
