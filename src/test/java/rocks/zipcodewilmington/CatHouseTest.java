package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)` //DONE
    // TODO - Create tests for `void remove(Integer id)` //DONE
    // TODO - Create tests for `void remove(Cat cat)` //DONE
    // TODO - Create tests for `Cat getCatById(Integer id)` //DONE
    // TODO - Create tests for `Integer getNumberOfCats()` //DONE

    @Test
    public void testGetNumberOfCats() {
        // Given (some
        String name = "Leon";
        Date birthDate = new Date();
        Cat animal = AnimalFactory.createCat(name, birthDate);
        CatHouse.clear();
        int givenNumberOfCats = 1;

        // When
        CatHouse.add(animal);

        // Then
        int retrievedNumberOfCats = CatHouse.getNumberOfCats();
        Assert.assertEquals(givenNumberOfCats,  retrievedNumberOfCats);
    }
    @Test
    public void testAdd() { //same as get number of cats?
        // Given (some
        String name = "Leon";
        Date birthDate = new Date();
        Cat cat = AnimalFactory.createCat(name, birthDate);
        CatHouse.clear();
        int givenNumberOfCats = 1;

        // When
        CatHouse.add(cat);

        // Then
        int retrievedNumberOfCats = CatHouse.getNumberOfCats();
        Assert.assertEquals(givenNumberOfCats,  retrievedNumberOfCats);
    }

    @Test
    public void testRemoveCat() { //almost the same
        // Given (some
        String name = "Leon";
        Date birthDate = new Date();
        Cat animal = AnimalFactory.createCat(name, birthDate);
        CatHouse.clear();


        // When
        CatHouse.add(animal);
        CatHouse.remove(animal);
        int givenNumberOfCats = 0;

        // Then
        int retrievedNumberOfCats = CatHouse.getNumberOfCats();
        Assert.assertEquals(givenNumberOfCats,  retrievedNumberOfCats);
    }

    @Test
    public void testRemoveCatById() { //almost the same
        // Given (some
        String name = "Leon";
        Date birthDate = new Date();
        Cat cat = AnimalFactory.createCat(name, birthDate);
        CatHouse.clear();
        int givenNumberOfCats = 0;


        // When
        CatHouse.add(cat);
        CatHouse.remove(cat.getId()); //or Id = 0 because "Leon is the 0 index cat
                                        // in the CatHouse

        // Then
        int retrievedNumberOfCats = CatHouse.getNumberOfCats();
        Assert.assertEquals(givenNumberOfCats,  retrievedNumberOfCats);
    }
    @Test
    public void testGetCatById() { //almost the same
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

}
