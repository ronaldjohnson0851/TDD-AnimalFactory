package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    private String birthDate;

    // TODO - Create tests for `void setName(String name)`
    @Test
    public void setNameTest(){
        String expectedName = "";
        Cat cat = new Cat(expectedName);

        String actualName = Cat.getName();

        Assert.assertEquals(expectedName, actualName);
    }
    // TODO - Create tests for `speak`
    @Test
    public void speakTest(){
        Cat cat = new Cat();
        String expected = "Meow!";

        String actual = cat.speak();

        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void setBirthDateTest(){
        Cat cat = new Cat();
        String expectedBirthDate = "";

        String actualBirthDate = birthDate;

        Assert.assertEquals(expectedBirthDate, actualBirthDate);
    }
    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void eatTeast(){
        Cat cat = new Cat();
        String expected = "Catnip";
        String actual = cat.eat();
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `Integer getId()`
    @Test
    public void getIdTest(){

    }
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void animalInheritanceTest(){

    }
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void mammalInheritanceTest(){

    }


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

}
