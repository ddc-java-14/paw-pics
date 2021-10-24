package edu.cnm.deepdive.pawpics.model;

import com.google.gson.annotations.SerializedName;

public class PetOrganization {
  @SerializedName("org_id")
  private String id;

  @SerializedName("organization_name")
  private String name;

  @SerializedName("contact_email")
  private String email;

  @SerializedName("phone_number")
  private String phoneNumber;

  @SerializedName("first_address_field")
  private String address1;

  @SerializedName("second_address_field")
  private String address2;

  @SerializedName("city_name")
  private String cityName;

  @SerializedName("state_name")
  private String stateName;

  @SerializedName("zip_code")
  private int postalCode;

  @SerializedName("country")
  private String country;

  @SerializedName("org_site_url")
  private String organizationUrl;

  // ## GETTERS AND SETTERS ## //

  PetOrganization(String id, String name, String email, String phoneNumber, String address1, String address2, String cityName, String stateName, int postalCode, String country, String organizationUrl) {
    this.setId(id);
    this.setName(name);
    this.setEmail(email);
    this.setPhoneNumber(phoneNumber);
    this.setAddress1(address1);
    this.setAddress2(address2);
    this.setCityName(cityName);
    this.setStateName(stateName);
    this.setPostalCode(postalCode);
    this.setCountry(country);
    this.setOrganizationUrl(organizationUrl);
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getAddress1() {
    return address1;
  }

  public void setAddress1(String address1) {
    this.address1 = address1;
  }

  public String getAddress2() {
    return address2;
  }

  public void setAddress2(String address2) {
    this.address2 = address2;
  }

  public String getCityName() {
    return cityName;
  }

  public void setCityName(String cityName) {
    this.cityName = cityName;
  }

  public String getStateName() {
    return stateName;
  }

  public void setStateName(String stateName) {
    this.stateName = stateName;
  }

  public int getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(int postalCode) {
    this.postalCode = postalCode;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public String getOrganizationUrl() {
    return organizationUrl;
  }

  public void setOrganizationUrl(String organizationUrl) {
    this.organizationUrl = organizationUrl;
  }
}