class HellowWorld{
    public static void main(String[] args) {
            
            Triangle triangle = new Triangle("Red", 5.0, 3.0);
            Rectangle rectangle = new Rectangle("Blue", 7.0, 6.0);
            Square square = new Square("Green", 4.0);
            Circle circle = new Circle("Yellow", 6.0);
     
            triangle.print();
            System.out.println("Area: " + triangle.Area());
            System.out.println();
     
            rectangle.print();
            System.out.println("Area: " + rectangle.Area());
            System.out.println();
     
            square.print();
            System.out.println("Area: " + square.Area());
            System.out.println();
     
            circle.print();
            System.out.println("Area: " + circle.Area());
        }
    
}
 
abstract class Figure {
        public String color;
        public double side;
     
        public Figure(String color, double side) {
            this.color = color;
            this.side = side;
        }
     
        public abstract double Area();
     
        public void print() {
            System.out.println("Figure: " + this.getClass().getSimpleName());
            System.out.println("Color: " + color);
           
        }
    }
     
    class Triangle extends Figure {
        
        public double height;
     
        public Triangle(String color, double side , double height) {
            super(color, side);
            this.height = height;
        }
        public void print() {
            System.out.println("Figure: " + this.getClass().getSimpleName());
            System.out.println("Color: " + color);
            System.out.println("Side: " + side);
            System.out.println("Heigh: " + height);
           
        }
     
        
        public double Area() {
            return 0.5 * side * height;
        }
    }
     
    class Rectangle extends Figure {
        public double width;
        
     
        public Rectangle(String color, double side,  double width) {
            super(color, side);
            this.side = side;
            this.width = width;
        }
        public void print() {
            System.out.println("Figure: " + this.getClass().getSimpleName());
            System.out.println("Color: " + color);
            System.out.println("Width: " + width);
            System.out.println("Length: " + side);
           
        }
     
        
        public double Area() {
            return side * width;
        }
    }
     
    class Square extends Figure {
        public Square(String color, double side) {
            super(color, side);
            
        }
        
        public void print() {
            System.out.println("Figure: " + this.getClass().getSimpleName());
            System.out.println("Color: " + color);
            System.out.println("Side: " + side);
           
        }
                
        
        public double Area() {
            return side * side;
        }
    }
     
    class Circle extends Figure {
        
        public Circle(String color, double radius) {
            super(color, radius);
            
        }
         public void print() {
            System.out.println("Figure: " + this.getClass().getSimpleName());
            System.out.println("Color: " + color);
            System.out.println("Radius: " + side);
           
        }
     
        
        public double Area() {
            
            return Math.PI * side * side;
        }
     
    }