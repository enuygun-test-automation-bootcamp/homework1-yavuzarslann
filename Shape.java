public abstract class Shape {
    private String color; //alt sınıflarda kullanılacak ortak özellik

    public Shape(String color) {
        this.color = color;
    }

    //bu metod bir abstract metoddur
    abstract double area();

    //bu metod ise normal metoddur
    public String getColor(){
        return color;
    }

}
