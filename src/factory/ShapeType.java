package factory;

public enum ShapeType implements Shape {

    CIRCLE {
        @Override
        public void draw() {
            System.out.println("C");
        }
    },

    RECTANGLE {
        @Override
        public void draw() {
            System.out.println("R");
        }
    }

}
