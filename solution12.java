class Shape {
    double d1, d2;

    Shape(double d1, double d2) {
        d1 = d1;
        d2 = d2;
    }

    
}

class Rectangle extends Shape {
    Rectangle(double d1, double d2) {
        super(d1, d2);
    }

    double rarea() {
        return d1 * d2;
    }
}

class Triangle extends Shape {
    Triangle(double d1, double d2) {
        super(d1, d2);
    }

    double tarea() {
        return 0.5* d1 * d2;
    }
}

class solution12{
  public static void main(String [] args)
  {
    Rectangle r= new Rectangle(4.0, 5.0);
    double rArea = r.rarea();
    System.out.println("Area of rectangle: " + rArea);

    Triangle t = new Triangle(4.0, 5.0);
    double tArea = t.tarea();
    System.out.println("Area of triangle: " + tArea);

  }

}