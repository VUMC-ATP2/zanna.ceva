package homework.classHomework;

public class Main {
    public static void main(String[] args) {
        Trīsstūris myTriangle = new Trīsstūris();
        myTriangle.printTriangle();
        myTriangle.a = 20;
        myTriangle.b = 20;
        myTriangle.c = 20;
        myTriangle.isTriangleIsosceles();
        myTriangle.isTriangleEquilateral();
        System.out.println("");
        Trīsstūris newOneTriangle = new Trīsstūris();
        newOneTriangle.printTriangle();
        newOneTriangle.areaOfTriangle(40, 50, 50);
        newOneTriangle.isTriangleIsosceles();
        newOneTriangle.isTriangleEquilateral();
    }

}
