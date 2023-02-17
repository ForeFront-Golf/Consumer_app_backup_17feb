package io.realm;


public interface ClubRealmProxyInterface {
    public Integer realmGet$clubId();
    public void realmSet$clubId(Integer value);
    public String realmGet$name();
    public void realmSet$name(String value);
    public String realmGet$phoneNumber();
    public void realmSet$phoneNumber(String value);
    public Boolean realmGet$valid();
    public void realmSet$valid(Boolean value);
    public String realmGet$address();
    public void realmSet$address(String value);
    public Double realmGet$lat();
    public void realmSet$lat(Double value);
    public Double realmGet$lon();
    public void realmSet$lon(Double value);
    public String realmGet$photoUrl();
    public void realmSet$photoUrl(String value);
    public String realmGet$photoUrlThumb();
    public void realmSet$photoUrlThumb(String value);
    public java.util.Date realmGet$modifiedAt();
    public void realmSet$modifiedAt(java.util.Date value);
    public Double realmGet$taxRate();
    public void realmSet$taxRate(Double value);
    public Boolean realmGet$showTax();
    public void realmSet$showTax(Boolean value);
    public RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.Menu> realmGet$menus();
    public void realmSet$menus(RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.Menu> value);
}
