public class Rectangle extends Shape {
    private double length; //dikdörtgenin uzunluğu
    private double width; //dikdörtgenin genişliği

    public Rectangle(String color,double length, double width) {
        super(color); //burada üst sınıftan renk özelliğini alıyoruz
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width; //dikdörtgenin alanını hesaplama
    }
}
