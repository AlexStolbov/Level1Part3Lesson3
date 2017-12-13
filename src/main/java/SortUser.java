import java.util.Comparator;
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

    /**
     * Sorts user by name.
     * @param sourceUsers - users
     * @return
     */
    public List<User> sortNameLength(List<User> sourceUsers) {

        sourceUsers.sort(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return (new Integer(o1.getName().length()).compareTo(new Integer(o2.getName().length())));
            }
        });

        return sourceUsers;
    }

    /**
     * Sorts user by name and age.
     * @param sourceUsers
     * @return
     */
    public List<User> sortByAllFields(List<User> sourceUsers) {

        sourceUsers.sort(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                int compare = o1.getName().compareTo(o2.getName());
                if (compare == 0) {
                    compare = o1.getAge().compareTo(o2.getAge());
                }
                return compare;
            }
        });
        return sourceUsers;
    }
}
