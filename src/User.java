public class User implements Comparable<User> {
    String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" + "name='" + name + "\'" + "}";
    }

    @Override
    public int compareTo(User o) {
        if (name.hashCode() == o.name.hashCode()) {
            return 0;
        } else if (name.hashCode() > o.name.hashCode()) {
            return 1;
        } else {
            return -1;
        }
    }
}
