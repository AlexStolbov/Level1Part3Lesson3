import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortUser {

    /**
     * Sorts user.
     * @param sourceUsers - users
     * @return - TreeSet, sorted by age in ascending mode.
     */
    public Set<User> sort(List<User> sourceUsers) {

        Set<User> result = new TreeSet<>();
        for (User currentUser : sourceUsers) {
            result.add(currentUser);
        }

        return result;
    }
}
