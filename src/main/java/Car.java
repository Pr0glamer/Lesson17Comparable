import java.util.*;

public class Car implements Comparable<Car>{
    private int yearOfManufacture;
    private int engineCapacity;

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public Car(int yearOfManufacture, int engineCapacity) {
        this.yearOfManufacture = yearOfManufacture;
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "yearOfManufacture=" + yearOfManufacture +
                ", engineCapacity=" + engineCapacity +
                '}';
    }

    @Override
    public int compareTo(Car o) {
        return yearOfManufacture - o.yearOfManufacture;
    }

    public static void sortByYearOfManufacture(List<Car> cars) {
        cars.sort((o1, o2) -> o1.compareTo(o2));
        cars.forEach(System.out::println);
    }

    public static void sortByEngineCapacity(List<Car> cars) {
        Set<Car> set = new TreeSet<>(new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.engineCapacity - o2.engineCapacity;
            }
        });
        set.addAll(cars);
        cars.clear();
        cars.addAll(set);
        set.forEach(System.out::println);
    }

    public static void main(String[] args) {
        Car car1 = new Car(1999, 5);
        Car car2 = new Car(2000, 4);
        Car car3 = new Car(1955, 3);

        List<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);

        Car.sortByYearOfManufacture(cars);
        Car.sortByEngineCapacity(cars);

    }
}
