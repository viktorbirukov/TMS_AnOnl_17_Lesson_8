package lesson8_1;

// Базовый класс "Фигура"
class Shape {
    // Конструктор по умолчанию
    public Shape() {
    }

    // Метод для вычисления площади (в базовом классе он абстрактный)
    public double calculateArea() {
        return 0.0;
    }
}

// Подкласс "Треугольник", расширяющий базовый класс "Фигура"
class Triangle extends Shape {
    private double base;
    private double height;

    // Конструктор с параметрами
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Переопределение метода для вычисления площади треугольника
    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

// Подкласс "Прямоугольник", расширяющий базовый класс "Фигура"
class Rectangle extends Shape {
    private double length;
    private double width;

    // Конструктор с параметрами
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Переопределение метода для вычисления площади прямоугольника
    @Override
    public double calculateArea() {
        return length * width;
    }
}

// Подкласс "Круг", расширяющий базовый класс "Фигура"
class Circle extends Shape {
    private double radius;

    // Конструктор с параметром
    public Circle(double radius) {
        this.radius = radius;
    }

    // Переопределение метода для вычисления площади круга
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}