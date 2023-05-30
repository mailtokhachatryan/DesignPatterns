package builder;

public class User {
    private final String login;
    private final String password;
    private int year;
    private boolean isAdmin;

    public User(UserBuilder userBuilder) {
        this.login = userBuilder.login;
        this.password = userBuilder.password;
        this.year = userBuilder.year;
        this.isAdmin = userBuilder.isAdmin;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public int getYear() {
        return year;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", year=" + year +
                ", isAdmin=" + isAdmin +
                '}';
    }

    public static class UserBuilder {

        private final String login;
        private final String password;
        private int year;
        private boolean isAdmin;

        public UserBuilder(String login, String password) {
            this.login = login;
            this.password = password;
        }

        public UserBuilder year(int year) {
            this.year = year;
            return this;
        }

        public UserBuilder isAdmin(boolean isAdmin) {
            this.isAdmin = isAdmin;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
