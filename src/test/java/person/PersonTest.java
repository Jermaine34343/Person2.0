package person;

import org.junit.Assert;
import org.junit.Test;


public class PersonTest {

    @org.junit.Test
    public void setNameTest() {
        Person person = new Person();
        String expectedName = "Choco";

        person.setName(expectedName);

        String actualName = person.getName();
        Assert.assertEquals(actualName, expectedName);
    }

    @org.junit.Test
    public void setAgeTest() {
        Person person2 = new Person();
        int expectedAge = 22;

        person2.setAge(expectedAge);
        int actualAge = person2.getAge();


        Assert.assertEquals(expectedAge, actualAge);

    }

    @Test
    public void testDefaultConstructor() {
        Person person = new Person();

        Assert.assertNotNull(person);
    }

    @Test
    public void testConstructorWithName() {
        String expectedName= "Penelope";

        Person penelope = new Person(expectedName);
        String actualName = penelope.getName();

        Assert.assertEquals(expectedName, actualName);

    }

    @Test
    public void testConstructorWithAge() {
        int expectedAge = 22;
        Person personAge = new Person(expectedAge);
        int actualAge = personAge.getAge();
        Assert.assertEquals(expectedAge, actualAge);

    }


    @Test
    public void testConstructorWithNameAndAge() {
        int expectedAge = 22;
        String expectedName = "Penelope";
        Person personName = new Person(expectedName, expectedAge);
        int actual2 =  personName.getAge();
        String actual = personName.getName();

        Assert.assertEquals(expectedName, actual);
        Assert.assertEquals(expectedAge,actual2);

    }


}