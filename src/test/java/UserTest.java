import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class UserTest {

    @Test
    public void whenOneLessThanTwoThenReturnNegativeOne() {
        User user1 = new User(10, "Ten");
        User user2 = new User(20, "Twenty");

        assertThat(user1.compareTo(user2), is(-1));
    }

    @Test
    public void whenOneMoreThanTwoThenReturnNegativeOne() {
        User user1 = new User(40, "Forty");
        User user2 = new User(20, "Twenty");

        assertThat(user1.compareTo(user2), is(1));
    }

    @Test
    public void whenOneEqualsToTwoThenReturnZero() {
        User user1 = new User(20, "Twenty");
        User user2 = new User(20, "Twenty");

        assertThat(user1.compareTo(user2), is(0));
    }
}