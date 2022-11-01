import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<>();
        arr.add("Ania");
        arr.add("Piotrek");
        arr.add("Marek");
        arr.add("Ola");
        arr.add("Ala");
        arr.add("Michał");

        arr.stream().
                filter(str -> str.length()<4).
                filter(str -> str.startsWith("A") || str.startsWith("O")).forEach(str -> System.out.println(str));


        ArrayList<Car> cars = new ArrayList<>();

        cars.add(new Car("Fiat", 120, 45000, 3));
        cars.add(new Car("Porsche", 300, 250000, 8));
        cars.add(new Car("Mercedes", 280, 200000, 7));
        cars.add(new Car("Ford", 220, 120000, 5));
        cars.add(new Car("Kia", 200, 80000, 4));

        cars.stream().filter(car->car.rating>2)
                .filter(car->car.topSpeed>200)
                .filter(car -> car.price<200000)
                .forEach(car-> System.out.println(car));

    }
}
