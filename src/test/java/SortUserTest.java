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

}