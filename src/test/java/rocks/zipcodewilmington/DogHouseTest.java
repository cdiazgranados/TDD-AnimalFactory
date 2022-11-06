package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();
        int givenNumberOfDogs = 1;

        // When
        DogHouse.add(animal);

        // Then
        int retrievedNumberOfDogs = DogHouse.getNumberOfDogs();
        Assert.assertEquals(givenNumberOfDogs,  retrievedNumberOfDogs);
    }
    @Test
    public void testAdd() { //same as get number of cats?
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog dog = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();
        int givenNumberOfDogs = 1;

        // When
        DogHouse.add(dog);

        // Then
        int retrievedNumberOfDogs = DogHouse.getNumberOfDogs();
        Assert.assertEquals(givenNumberOfDogs,  retrievedNumberOfDogs);
    }

    @Test
    public void testRemoveCat() { //almost the same
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();


        // When
        DogHouse.add(animal);
        DogHouse.remove(animal);
        int givenNumberOfDogs = 0;

        // Then
        int retrievedNumberOfDogs = DogHouse.getNumberOfDogs();
        Assert.assertEquals(givenNumberOfDogs,  retrievedNumberOfDogs);
    }

    @Test
    public void testRemoveCatById() { //almost the same
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog dog = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();
        int givenNumberOfDogs = 0;


        // When
        DogHouse.add(dog);
        DogHouse.remove(dog.getId()); //or Id = 0 because "Leon is the 0 index cat
        // in the CatHouse

        // Then
        int retrievedNumberOfDogs = DogHouse.getNumberOfDogs();
        Assert.assertEquals(givenNumberOfDogs,  retrievedNumberOfDogs);
    }
    @Test
    public void testGetCatById() { //almost the same
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog dog = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();
        Dog givenDog = dog;


        // When
        DogHouse.add(dog);
        Dog retrievedDog = DogHouse.getDogById(dog.getId()); // "Leon is the 0 index cat
        // in the CatHouse

        // Then
        Assert.assertEquals(givenDog,  retrievedDog);
    }

}
