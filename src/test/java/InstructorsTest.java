import io.zipcoder.interfaces.Instructors;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class InstructorsTest {

    private final String [] instructorNames = {"Froilan", "Kris", "Dolio", "Wilhelm"};

    @Test
    public void testGetInstance(){
        Instructors instructors = Instructors.getInstance();
        Boolean everyInstructor = true;

        for (int i = 1; i < instructorNames.length ; i++) {
            if (!instructors.findById(i+100).getName().equals(instructorNames[i-1])){
                everyInstructor = false;
                break;
            }
        }
        assertTrue(everyInstructor);
    }

}
