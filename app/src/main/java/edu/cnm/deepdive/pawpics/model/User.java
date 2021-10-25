package edu.cnm.deepdive.pawpics.model;

import android.provider.ContactsContract.CommonDataKinds.Email;
import com.google.gson.annotations.SerializedName;
import java.util.Date;

public class User {
  @SerializedName("user_id")
  private String id;

  @SerializedName("first_name")
  private String firstName;

  @SerializedName("last_name")
  private String lastName;

  @SerializedName("date_of_birth")
  private Date dateOfBirth;

  @SerializedName("email_address")
  private String email;

  public User(String id, String firstName, String lastName, Date dateOfBirth, String email) {
    this.setId(id);
    this.setFirstName(firstName);
    this.setLastName(lastName);
    this.setDateOfBirth(dateOfBirth);
    this.setEmail(email);
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Date getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(Date dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
}