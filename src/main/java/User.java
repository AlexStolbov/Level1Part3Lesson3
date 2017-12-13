
public class User implements Comparable {

    /**
     * Age of the user.
     */
    private final Integer age;
    /**
     * Name of the user.
     */
    private String name;

    /**
     * Constructor.
     * @param age age of the user.
     * @param name name of the user.
     */
    public User(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    /**
     * Getter
     * @return age of the user.
     */
    public Integer getAge() {
        return age;
    }

    /**
     * Getter
     * @return name of the user
     */
    public String getName() {
        return name;
    }

    /**
     * Compare users by age.
     * @param o - another user.
     * @return value.
     */
    @Override
    public int compareTo(Object o) {
        User u2 = (User) o;
        return this.getAge().compareTo(u2.getAge());
    }

    @Override
    public String toString() {
        return "User{"
                + "age=" + age
                + ", name='" + name + '\''
                + '}';
    }
}
