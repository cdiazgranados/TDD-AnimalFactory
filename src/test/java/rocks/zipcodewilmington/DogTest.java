package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`

    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Hugo";
        Date givenBirthDate = new Date();
        Integer givenId = 123;

        // When (a cat is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = dog.getName();
        Date retrievedBirthDate = dog.getBirthDate();
        Integer retrievedId = dog.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void speak() {
        //Given
        Dog dog = new Dog(null, null, null);
        String givenSpeak = "bark!";

        //When

        //Then
        String retrievedSpeak = dog.speak();
        Assert.assertEquals(givenSpeak, retrievedSpeak);
    }



    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    @Test
    public void setBirthDate() {

        // Given
        Dog dog = new Dog(null, null, null);
        Date givenBirthDate = new Date();

        // When
        dog.setBirthDate(givenBirthDate);

        // Then
        Date retrievedBirthDate = dog.getBirthDate();
        Assert.assertEquals(retrievedBirthDate, givenBirthDate);
    }

    @Test
    public void eat() {
        //ensure that when .eat is invoked on an instance of Cat, the numberOfMealsEaten is increased by 1.

        //Given
        Dog dog = new Dog(null, null, null);
        int givenFood = 3;

        //When
        Food steak = new Food(); //CREATED A FISH OBJECT!
        dog.eat(steak);
        dog.eat(steak);
        dog.eat(steak);

        //Then
        int retrievedFood = dog.getNumberOfMealsEaten();
        Assert.assertEquals(givenFood, retrievedFood);
    }


    @Test
    public void getId() { //writing this from scratch

        // Given (a birthdate exists and a cat exists)
        Dog dog = new Dog(null, null, null);
        Integer givenId = 678;

        // When (a cat's name is set to the given name)
        dog.setId(givenId);

        // Then (we expect to get the given name from the dog)
        Integer retrievedId = dog.getId();
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void animalInheritance() {
        //Create test to check Animal inheritance; google search `java instanceof keyword`

        //Given
        Dog dog = new Dog(null, null, null);
        boolean givenInheritance = true;

        //When


        //Then
        boolean retrievedInheritance = dog instanceof Dog;
        Assert.assertEquals(givenInheritance, retrievedInheritance);
    }

    @Test
    public void mammalInheritance() {
        //Create test to check Mammal inheritance; google search `java instanceof keyword`

        //Given
        Dog dog = new Dog(null, null, null);
        boolean givenInheritance = true;

        //When


        //Then
        boolean retrievedInheritance = dog instanceof Mammal; //needed to import class up top
        Assert.assertEquals(givenInheritance, retrievedInheritance);
    }
}



