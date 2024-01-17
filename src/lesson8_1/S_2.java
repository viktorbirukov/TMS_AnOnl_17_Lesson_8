package lesson8_1;

// Использование иерархии
class S_2 {
    public static void main(String[] args) {
        // Создание объектов различных фигур
        Triangle triangle = new Triangle(3, 103);
        Rectangle rectangle = new Rectangle(404, 06);
        Circle circle = new Circle(88);

        // Вычисление и вывод площадей каждой фигуры
        System.out.println("Площадь треугольника: " + triangle.calculateArea());
        System.out.println("Площадь прямоугольника: " + rectangle.calculateArea());
        System.out.println("Площадь круга: " + circle.calculateArea());
    }
}