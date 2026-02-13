import oop.ocp.AreaCalculator;
import oop.ocp.Circle;
import oop.ocp.Ellipse;
import oop.ocp.Rectangle;

void main() {
    Circle A = new Circle(5);
    Rectangle B = new Rectangle(2,10);
    Ellipse C = new Ellipse(2,3);
    AreaCalculator KAKU = new AreaCalculator();
    KAKU.calculateArea(A);
    KAKU.calculateArea(B);
    KAKU.calculateArea(C);
}
