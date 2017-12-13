import org.junit.Test;

import java.util.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SortUserTest {

    @Test
    public void whenPassListOfUserThenReturnTreeSet() {
        List<User> listUsers = Arrays.asList(new User(10, "Ten"), new User(20, "Twenty"));

        boolean well = true;
        try {
            Set<User> result = new SortUser().sort(listUsers);
        } catch (Exception all) {
            well = false;
        }

        assertThat(well, is(true));
    }

    @Test
    public void sortNameLengthTest() {
        User user1 = new User(1, "AA");
        User user2 = new User(2, "BBB");
        User user3 = new User(3, "CCCC");

        List<User> sourceList = Arrays.asList(user2, user3, user1);

        List<User> testList = Arrays.asList(user1, user2, user3);

        List<User> resultList = new SortUser().sortNameLength(sourceList);

        assertThat(testList, is(testList));

    }

    @Test
    public void sortByAllFieldsTest() {
        User user11 = new User(1, "A");
        User user12 = new User(2, "A");
        User user21 = new User(1, "B");
        User user22 = new User(2, "B");

        List<User> sourceList = Arrays.asList(user21, user11, user22, user12);

        List<User> testList = Arrays.asList(user11, user12, user21, user22);

        List<User> resultList = new SortUser().sortByAllFields(sourceList);

        assertThat(resultList, is(testList));
    }

}