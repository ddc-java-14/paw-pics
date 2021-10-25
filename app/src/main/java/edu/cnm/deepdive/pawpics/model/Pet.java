package edu.cnm.deepdive.pawpics.model;

import com.google.gson.annotations.SerializedName;

public class Pet {
  @SerializedName("id")
  private int id;

  // The or ID is what adoption facility if any the pet is at.
  @SerializedName("organization_id")
  private String organizationId;

  @SerializedName("name")
  private String name;

  @SerializedName("pet_type")
  private String type;

  @SerializedName("breed")
  private String breed;

  @SerializedName("sex")
  private String sex;

  @SerializedName("adoptable")
  private boolean adoptable;

  public Pet(int id, String organizationId, String name, String type, String breed, String sex, boolean adoptable) {
    this.setId(id);
    this.setOrganizationId(organizationId);
    this.setName(name);
    this.setType(type);
    this.setBreed(breed);
    this.setSex(sex);
    this.setAdoptable(adoptable);
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getOrganizationId() {
    return organizationId;
  }

  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
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

  public boolean isAdoptable() {
    return adoptable;
  }

  public void setAdoptable(boolean adoptable) {
    this.adoptable = adoptable;
  }
}
