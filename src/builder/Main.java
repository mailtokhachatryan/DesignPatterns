package builder;

import factory.Circle;
import factory.Rectangle;
import factory.Shape;
import factory.ShapeType;

public class Main {
    public static void main(String[] args) {


        TestUser testUser = TestUser.createUserWithNameAndSurnameWhichIsDoingSomething("asdasd", "KJADSH");

        User build = new User.UserBuilder("anun", "azganun")
                .isAdmin(true)
                .build();


        User user2 = new User.UserBuilder("anun", "azganun")
                .year(12)
                .year(65)
                .build();

        System.out.println(build);
        System.out.println(user2);

    }


    public static Shape getShape(ShapeType type) {
        return switch (type) {
            case CIRCLE -> new Circle();
            case RECTANGLE -> new Rectangle();
        };
    }
}