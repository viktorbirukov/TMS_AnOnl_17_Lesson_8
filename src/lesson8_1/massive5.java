// Базовый класс "Фигура"
abstract class Shape {
    // Абстрактные методы для подсчета площади и периметра
    public abstract double calculateArea();

    public abstract double calculatePerimeter();
}

// Подкласс "Треугольник"
class Triangle extends Shape {
    private double sideA;
    private double sideB;
    private double sideC;

    // Конструктор с параметрами
    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    // Переопределение метода для подсчета площади треугольника
    @Override
    public double calculateArea() {
        // Используем формулу Герона для вычисления площади треугольника
        double s = calculatePerimeter() / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    // Переопределение метода для подсчета периметра треугольника
    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }
}

// Подкласс "Прямоугольник"
class Rectangle extends Shape {
    private double length;
    private double width;

    // Конструктор с параметрами
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Переопределение метода для подсчета площади прямоугольника
    @Override
    public double calculateArea() {
        return length * width;
    }

    // Переопределение метода для подсчета периметра прямоугольника
    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

// Подкласс "Круг"
class Circle extends Shape {
    private double radius;

    // Конструктор с параметром
    public Circle(double radius) {
        this.radius = radius;
    }

    // Переопределение метода для подсчета площади круга
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Переопределение метода для подсчета периметра круга
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Main {
    public static void main(String[] args) {
        // Создание массива из 5 фигур
        Shape[] shapes = new Shape[5];
        shapes[0] = new Triangle(3, 4, 5);
        shapes[1] = new Rectangle(4, 6);
        shapes[2] = new Circle(2);
        shapes[3] = new Triangle(5, 7, 8);
        shapes[4] = new Rectangle(5, 8);

        // Вычисление и вывод суммы периметра всех фигур в массиве
        double totalPerimeter = 0;
        for (Shape shape : shapes) {
            totalPerimeter += shape.calculatePerimeter();
        }

        System.out.println("Сумма периметров всех фигур: " + totalPerimeter);
    }
}
