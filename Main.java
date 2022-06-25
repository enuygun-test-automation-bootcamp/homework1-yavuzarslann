public class Main {
    public static void main(String[] args) {

        Circle c1 = new Circle("Green",2.3);

        Rectangle r1 = new Rectangle("Blue",5,8);

        System.out.println("Circle's color is " + c1.getColor() + " and " + "the area is " + c1.area());
        System.out.println("Rectangle's color is " + r1.getColor() + " and " + "the area is " + r1.area());


    }
}
