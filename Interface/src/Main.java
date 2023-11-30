public class Main {
    public static void main(String[] args) {
        Shape[] tables = new Shape[] {
                new Rectangle(7, 5),
                new Rectangle(2, 4),
                new Rectangle(3, 5),
                new Circle(4),
                new Circle(6)
        };

        double totalArea = 0;
        double totalPerimeter = 0;
        for (Shape table: tables) {
            totalArea += table.getArea();
            totalPerimeter += table.getPerimeter();
        }

        System.out.println("Total area = " + totalArea);
        System.out.println("Total perimeter = " + totalPerimeter);
    }
}
