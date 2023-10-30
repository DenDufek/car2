public class Car {
    private int year;
    private double speed;
    private int weight;
    private String color;

    // Конструктор за замовчуванням
    public Car() {
        year = 0;
        speed = 0.0;
        weight = 0;
        color = "Невідомий";
    }

    // Конструктор з 1 параметром (рік)
    public Car(int year) {
        this();
        this.year = year;
    }

    // Конструктор з 2 параметрами (рік і швидкість)
    public Car(int year, double speed) {
        this(year);
        this.speed = speed;
    }

    // Конструктор з 3 параметрами (рік, швидкість і вага)
    public Car(int year, double speed, int weight) {
        this(year, speed);
        this.weight = weight;
    }

    // Конструктор з 4 параметрами (рік, швидкість, вага і колір)
    public Car(int year, double speed, int weight, String color) {
        this(year, speed, weight);
        this.color = color;
    }

    public void displayInfo() {
        System.out.println("Рік: " + year);
        System.out.println("Швидкість: " + speed);
        System.out.println("Вага: " + weight);
        System.out.println("Колір: " + color);
    }
}

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(); // Створення машини зі значеннями за замовчуванням
        Car car2 = new Car(2022); // Створення машини зі значенням року
        Car car3 = new Car(2022, 180.5); // Створення машини з роком і швидкістю
        Car car4 = new Car(2022, 180.5, 1500); // Створення машини з роком, швидкістю і вагою
        Car car5 = new Car(2022, 180.5, 1500, "Червоний"); // Створення машини з усіма параметрами

        System.out.println("Машина 1:");
        car1.displayInfo();
        System.out.println("\nМашина 2:");
        car2.displayInfo();
        System.out.println("\nМашина 3:");
        car3.displayInfo();
        System.out.println("\nМашина 4:");
        car4.displayInfo();
        System.out.println("\nМашина 5:");
        car5.displayInfo();
    }
}
