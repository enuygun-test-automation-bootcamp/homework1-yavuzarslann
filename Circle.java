public class Circle extends Shape {
    private double radius; //çemberin yarıçapı
    private final double piNumber = 3.14; //pi sayısı

    public Circle(String color,double radius) {
        super(color); //burada üst sınıftan renk özelliğini alıyoruz
        this.radius = radius;
    }

    @Override
    double area() {
        return piNumber * (radius * radius); //çemberin alanını hesaplama
    }
}
