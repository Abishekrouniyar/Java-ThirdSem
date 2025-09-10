public class sha {
    public static void main(String[] args) {
        Shape s= new Shape();
        System.out.println("area of Shape is: "+ s.area());

        Circle c=new Circle(7);
        System.out.println("Area of Circle is:"+ c.area());
    }
    
}

class Shape{
    public Shape(){

    }
    public double area(){
        return 0.0;
    }
}

class Circle extends Shape{
    private double radius;

    public Circle(int radius){
        this.radius=radius;
    }

    @Override
    public double area(){
        return Math.PI * this.radius * this.radius;
    }
}

