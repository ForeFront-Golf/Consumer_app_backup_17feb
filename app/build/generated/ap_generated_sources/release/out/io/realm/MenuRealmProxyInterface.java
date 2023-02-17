package io.realm;


public interface MenuRealmProxyInterface {
    public Integer realmGet$menuId();
    public void realmSet$menuId(Integer value);
    public String realmGet$name();
    public void realmSet$name(String value);
    public String realmGet$desc();
    public void realmSet$desc(String value);
    public Integer realmGet$clubId();
    public void realmSet$clubId(Integer value);
    public Boolean realmGet$valid();
    public void realmSet$valid(Boolean value);
    public RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType> realmGet$menuItemsByItemType();
    public void realmSet$menuItemsByItemType(RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType> value);
    public java.util.Date realmGet$modifiedAt();
    public void realmSet$modifiedAt(java.util.Date value);
}
