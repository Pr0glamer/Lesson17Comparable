import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CarTest {
    List<Car> carList = new ArrayList<>();

    @BeforeEach
    public void initCarList(){
        Car car1 = new Car(1999, 5);
        Car car2 = new Car(2000, 4);
        Car car3 = new Car(1955, 3);
        carList.clear();
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
    }

    @Test
    public void shouldSortByYearOfManufacture() {
        Car.sortByYearOfManufacture(carList);
        assertEquals(2000, carList.get(carList.size() - 1).getYearOfManufacture());
    }

    @Test
    public void shouldSortByEngineCapacity() {
        Car.sortByEngineCapacity(carList);
        assertEquals(5, carList.get(carList.size() - 1).getEngineCapacity());
    }

}
