import io.zipcoder.interfaces.People;
import io.zipcoder.interfaces.Person;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestPeople {
    @Test
    public void testAdd(){
        List<Person> personList = new ArrayList<Person>();
        Person person = new Person(1, "Nancy");

        personList.add(person);

        Assert.assertTrue(personList.contains(person));
    }

    @Test
    public void testRemove() {
        List<Person> personList = new ArrayList<Person>();
        Person person = new Person(1, "Nancy");

        personList.add(person);
        personList.remove(person);

        Assert.assertFalse(personList.contains(person));

    }

    @Test
    public void testFindById() {
        People people = new People();
        Person person = new Person(2, "Nancy");
        Person person1 = new Person(5, "Joanna");


        people.add(person);
        people.add(person1);

        assertEquals(person, people.findById((long) 2));
    }

}
