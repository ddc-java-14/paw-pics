package edu.cnm.deepdive.pawpics.model;

import com.google.gson.annotations.SerializedName;

public class Pet {
  @SerializedName("id")
  private int id;

  @SerializedName("name")
  private String name;

  @SerializedName("pet_type")
  private String type;

  @SerializedName("breed")
  private String breed;

  @SerializedName("sex")
  private String sex;

  Pet(int id, String name, String type, String breed, String sex) {
    this.setId(id);
    this.setName(name);
    this.setType(type);
    this.setBreed(breed);
    this.setSex(sex);
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getBreed() {
    return breed;
  }

  public void setBreed(String breed) {
    this.breed = breed;
  }

  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }
}
