// Интерфейс должности
interface Position {
    void printPosition();
}

// Класс Директор
class Director implements Position {
    @Override
    public void printPosition() {
        System.out.println("Директор");
    }
}

// Класс Рабочий
class Worker implements Position {
    @Override
    public void printPosition() {
        System.out.println("Рабочий");
    }
}

// Класс Бухгалтер
class Accountant implements Position {
    @Override
    public void printPosition() {
        System.out.println("Бухгалтер");
    }
}

// Решение
public class Rabota {
    public static void main(String[] args) {
        // Создаем объекты классов
        Director director = new Director();
        Worker worker = new Worker();
        Accountant accountant = new Accountant();

        // Вызываем метод printPosition для каждого объекта
        director.printPosition();
        worker.printPosition();
        accountant.printPosition();
    }
}