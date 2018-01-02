import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Guest on 1/2/18.
 */
public class FindAndReplaceTest {
    @Test
    public void findAndReplace_replacesOneLowerCaseWord_Hello_Universe() throws Exception {
        FindAndReplace myFindAndReplace = new FindAndReplace();
        String expected = "hello universe";
        assertEquals(expected, myFindAndReplace.findAndReplace("hello world", "world", "universe"));
    }
    @Test
    public void findAndReplace_replaceNotWholeWords_I_am_walking_my_dog_to_the_doghedral() throws Exception {
        FindAndReplace myFindAndReplace = new FindAndReplace();
        String expected = "I am walking my dog to the doghedral";
        assertEquals(expected, myFindAndReplace.findAndReplace("I am walking my cat to the cathedral", "cat", "dog"));
    }
}