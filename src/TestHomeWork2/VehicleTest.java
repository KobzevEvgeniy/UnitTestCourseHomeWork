import org.example.homeWork2.Car;
import org.example.homeWork2.Motorcycle;
import org.example.homeWork2.Vehicle;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VehicleTest {
    //1 проверка того, что экземпляр объекта Car также является экземпляром транспортного средства; (instanceof)
    Car car = new Car("BMW","X-5",2023);
    Motorcycle motorcycle = new Motorcycle("Kavasaki","D-500",2020);
    @Test
    public  void testCartype(){
        assertThat(car instanceof Vehicle);
    }

    //2 проверка того, объект Car создается с 4-мя колесами
    @Test
    public  void testCountWellsCar(){
        assertThat(car.getNumWheels()).isEqualTo(4);
    }
    //3 Проверить, что объект Motorcycle создается с 2-мя колесами.
    @Test
    public  void testCountWellsMotorcycle(){
        assertThat(motorcycle.getNumWheels()).isEqualTo(2);
    }
    //4 Проверить, что объект Car развивает
    // скорость 60 в режиме тестового вождения (используя метод testDrive()).
    @Test
    public  void testSpeedCar(){
        car.testDrive();
        assertEquals(60,car.getSpeed());
    }
    //5 Проверить, что объект Motorcycle развивает
    // скорость 75 в режиме тестового вождения (используя метод testDrive()).
    @Test
    public  void testSpeedMotorcycle(){
        motorcycle.testDrive();
        assertEquals(75,motorcycle.getSpeed());
    }

    //6 Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения
    // транспорта) машина останавливается (speed = 0).
    @Test
    public  void testSpeedCarPark(){
        car.testDrive();
        car.park();
        assertEquals(0,car.getSpeed());
    }
    //6 Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения
    // транспорта) машина останавливается (speed = 0).
    @Test
    public  void testSpeedMotorcyclePark(){
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0,motorcycle.getSpeed());
    }



}



