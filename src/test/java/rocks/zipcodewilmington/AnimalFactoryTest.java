package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import rocks.zipcodewilmington.animals.animal_storage.AnimalWarehouse;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    //Create Test for Animal createDog(String name, Date birthDate)
        //ensure that when .createDog is invoked on AnimalFactoryTest
        // a Dog is created with the respective name and birthDate value.
    @Test
    public void testCreateCat() {
        // Given (some
        String name = "Leon";
        Date birthDate = new Date();
        Cat cat = AnimalFactory.createCat(name, birthDate);
        CatHouse.clear();
        Cat givenCat = cat;


        // When
        CatHouse.add(cat);
        Cat retrievedCat = CatHouse.getCatById(cat.getId()); // "Leon is the 0 index cat
        // in the CatHouse

        // Then
        Assert.assertEquals(givenCat,  retrievedCat);
    }


    @Test
    public void testCreateCat1() {
        // Given (some
        String name = "Leon";
        Date birthDate = new Date();
        Cat cat = AnimalFactory.createCat(name, birthDate);


        // Then
        Assert.assertEquals("Leon",  cat.getName());
        Assert.assertEquals(birthDate,  cat.getBirthDate());
    }


    //Create Test for Animal createCat(String name, Date birthDate)
        //ensure that when .createCat is invoked on AnimalFactoryTest
        // a Dog is created with the respective name and birthDate value.

    @Test
    public void testCreateDog() {
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

    @Test
    public void testCreateDog1() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog dog = AnimalFactory.createDog(name, birthDate);

        // Then
        Assert.assertEquals("Milo",  dog.getName());
        Assert.assertEquals(birthDate,  dog.getBirthDate());
    }

}



