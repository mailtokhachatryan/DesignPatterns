package builder;

public class TestUser {

    private String name;
    private String lastname;
    private int year;
    private int month;


    private TestUser(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    private TestUser(String name) {
        this.name = name;
    }

    public static TestUser createUserWithNameAndSurnameWhichIsDoingSomething(String name, String lastname) {
        return new TestUser(name, lastname);
    }

    public static TestUser createUserWithNameWhichIsDoingSomethingElse(String name) {
        return new TestUser(name);
    }
}
