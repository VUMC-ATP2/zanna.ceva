package homework.classHomework;

public class Trīsstūris {
    int a;
    int b;
    int c;
    int perimeter;
    double semiPerimeter;
    double area;

    public void printTriangle() {
        System.out.println("Mēs veidojam trijstūri!");
    }

    public void areaOfTriangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        perimeter = (a + b + c);
        semiPerimeter = perimeter / 2;
        area = Math.sqrt(semiPerimeter * (semiPerimeter - a) * (semiPerimeter - b) * (semiPerimeter - c));
        System.out.println("Trijstūra malas ir: " + a + ", " + b + ", " + c + ";");
        System.out.println("Trijstūra laukums ir: " + area);
    }

    public boolean isTriangleEquilateral() {
        boolean isTriangleEquilateral;
        if (a == b && b == c) {
            isTriangleEquilateral = true;
            System.out.println("Vienādmālu trijstūris!");

        } else {
            isTriangleEquilateral = false;
            System.out.println("Trijstūris nav vienādmālu!");

        }
        return isTriangleEquilateral;
    }

    public boolean isTriangleIsosceles() {
        boolean isTriangleIsosceles;
        if (a == b || b == c || c == a) {
            isTriangleIsosceles = true;
            System.out.println("Vienādsānu trijstūris!");

        } else {
            isTriangleIsosceles = false;
            System.out.println("Trijstūris nav vienādsānu!");

        }
        return isTriangleIsosceles;
    }


}




