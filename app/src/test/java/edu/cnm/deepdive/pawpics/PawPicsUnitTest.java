package edu.cnm.deepdive.pawpics;

import edu.cnm.deepdive.pawpics.model.Pet;
import edu.cnm.deepdive.pawpics.model.User;
import java.util.Date;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class PawPicsUnitTest {
  // Pet Values
  String[] petStringValues = {
      "MN300",                // Org ID
      "Nacho",                // Pet Name
      "Cat",                  // Pet Type
      "Domestic Long Hair",   // Breed
      "Male"                  // Sex
  };
  boolean petAdoptableValue = true;
  int petIdValue = 53271215;

  // User Values
  String[] userStringValues = {
      "304",                  // User Id
      "Mark",                 // User First Name
      "Waid",                 // User Last Name
      "06/07/1994",           // User Date of Birth
      "fleabass4@gmial.com",  // User Email
  };

  @Test
  public void addition_isCorrect() {
    assertEquals(4, 2 + 2);
  }

  @Test
  public void pet_gettersAndSetters() {
    Pet testPet = new Pet(petIdValue, petStringValues[0], petStringValues[1], petStringValues[2], petStringValues[3], petStringValues[4], petAdoptableValue);

    assertEquals(petIdValue, testPet.getId());
    assertEquals(petAdoptableValue, testPet.isAdoptable());
    assertEquals(petStringValues[0], testPet.getOrganizationId());
    assertEquals(petStringValues[1], testPet.getName());
    assertEquals(petStringValues[2], testPet.getType());
    assertEquals(petStringValues[3], testPet.getBreed());
    assertEquals(petStringValues[4], testPet.getSex());
  }

  @Test
  public void user_gettersAndSetters() {
    // Convert date string to object
    Date userBirthdate = new Date(userStringValues[3]);
    User testUser = new User(userStringValues[0], userStringValues[1], userStringValues[2], userBirthdate, userStringValues[4]);

    assertEquals(userStringValues[0], testUser.getId());
    assertEquals(userStringValues[1], testUser.getFirstName());
    assertEquals(userStringValues[2], testUser.getLastName());
    assertEquals(new Date(userStringValues[3]), testUser.getDateOfBirth());
    assertEquals(userStringValues[4], testUser.getEmail());
  }

  @Test
  public void petOrg_gettersAndSetters() {

  }
}