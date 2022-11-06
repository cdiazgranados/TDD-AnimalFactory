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
public class CatTest {
    // TODO - Create tests for `void setName(String name)` //DONE
    // TODO - Create tests for `speak` //DONE
    // TODO - Create tests for `setBirthDate(Date birthDate)` //DONE
    // TODO - Create tests for `void eat(Food food)` //DONE
    // TODO - Create tests for `Integer getId()` //DONE
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword` //DONE
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword` //DONE

    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void setName() { //writing this from scratch
        //ensure that when .setName is invoked on an instance of Cat,
        //the name field is being set to the respective value.

        // Given (a name exists and a cat exists)
        Cat cat = new Cat(null, null, null);
        String givenName = "Leon";

        // When (a cat's name is set to the given name)
        cat.setName(givenName);

        // Then (we expect to get the given name from the cat)
        String catName = cat.getName();
        Assert.assertEquals(catName, givenName);
    }

    @Test
    public void setBirthDate() { //writing this from scratch
        //ensure that when .setName is invoked on an instance of Cat,
        //the name field is being set to the respective value.

        // Given (a birthdate exists and a cat exists)
        Cat cat = new Cat(null, null, null);
        Date givenBirthDate = new Date();

        // When (a cat's name is set to the given name)
        cat.setBirthDate(givenBirthDate);

        // Then (we expect to get the given name from the dog)
        Date catBirthDate = cat.getBirthDate();
        Assert.assertEquals(catBirthDate, givenBirthDate);
    }

    @Test
    public void getId() { //writing this from scratch
        //ensure that when .setName is invoked on an instance of Cat,
        //the name field is being set to the respective value.

        // Given (a birthdate exists and a cat exists)
        Cat cat = new Cat(null, null, null);
        Integer givenId = 4;

        // When (a cat's name is set to the given name)
        cat.setId(givenId);

        // Then (we expect to get the given name from the dog)
        Integer retrievedId = cat.getId();
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void speak() {
        //Given
        Cat cat = new Cat(null, null, null);
        String givenSpeak = "meow!";

        //When

        //Then
        String retrievedSpeak = cat.speak();
        Assert.assertEquals(givenSpeak, retrievedSpeak);
    }

    @Test
    public void eat() {
        //ensure that when .eat is invoked on an instance of Cat, the numberOfMealsEaten is increased by 1.

        //Given
        Cat cat = new Cat(null, null, null);
        int givenFood = 2;

        //When
        Food fish = new Food(); //CREATED A FISH OBJECT!
        cat.eat(fish);
        cat.eat(fish);

        //Then
        int retrievedFood = cat.getNumberOfMealsEaten();
        Assert.assertEquals(givenFood, retrievedFood);
    }

    @Test
    public void animalInheritance() {
        //Create test to check Animal inheritance; google search `java instanceof keyword`

        //Given
        Cat cat = new Cat(null, null, null);
        boolean givenInheritance = true;

        //When


        //Then
        boolean retrievedInheritance = cat instanceof Cat;
        Assert.assertEquals(givenInheritance, retrievedInheritance);
    }

    @Test
    public void mammalInheritance() {
        //Create test to check Mammal inheritance; google search `java instanceof keyword`

        //Given
        Cat cat = new Cat(null, null, null);
        boolean givenInheritance = true;

        //When


        //Then
        boolean retrievedInheritance = cat instanceof Mammal; //needed to import class up top
        Assert.assertEquals(givenInheritance, retrievedInheritance);
    }
}
