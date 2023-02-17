package io.realm;


public interface UserRealmProxyInterface {
    public Integer realmGet$userId();
    public void realmSet$userId(Integer value);
    public String realmGet$firstName();
    public void realmSet$firstName(String value);
    public String realmGet$lastName();
    public void realmSet$lastName(String value);
    public String realmGet$phoneNumber();
    public void realmSet$phoneNumber(String value);
    public Integer realmGet$age();
    public void realmSet$age(Integer value);
    public String realmGet$dob();
    public void realmSet$dob(String value);
    public String realmGet$email();
    public void realmSet$email(String value);
    public String realmGet$permLvl();
    public void realmSet$permLvl(String value);
    public Float realmGet$rating();
    public void realmSet$rating(Float value);
    public String realmGet$profilePhotoUrl();
    public void realmSet$profilePhotoUrl(String value);
    public Boolean realmGet$valid();
    public void realmSet$valid(Boolean value);
    public Integer realmGet$ratingCount();
    public void realmSet$ratingCount(Integer value);
    public Boolean realmGet$signUpComplete();
    public void realmSet$signUpComplete(Boolean value);
    public Boolean realmGet$phoneValid();
    public void realmSet$phoneValid(Boolean value);
    public Boolean realmGet$banned();
    public void realmSet$banned(Boolean value);
    public java.util.Date realmGet$modifiedAt();
    public void realmSet$modifiedAt(java.util.Date value);
}
