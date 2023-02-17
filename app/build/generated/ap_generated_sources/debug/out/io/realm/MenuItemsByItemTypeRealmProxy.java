package io.realm;


import android.annotation.TargetApi;
import android.os.Build;
import android.util.JsonReader;
import android.util.JsonToken;
import io.realm.ProxyUtils;
import io.realm.exceptions.RealmMigrationNeededException;
import io.realm.internal.ColumnInfo;
import io.realm.internal.OsList;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Property;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Row;
import io.realm.internal.Table;
import io.realm.internal.android.JsonUtils;
import io.realm.log.RealmLog;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressWarnings("all")
public class MenuItemsByItemTypeRealmProxy extends com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType
    implements RealmObjectProxy, MenuItemsByItemTypeRealmProxyInterface {

    static final class MenuItemsByItemTypeColumnInfo extends ColumnInfo {
        long menuItemByItemTypeIdIndex;
        long itemTypeIndex;
        long menuItemsIndex;

        MenuItemsByItemTypeColumnInfo(OsSchemaInfo schemaInfo) {
            super(3);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("MenuItemsByItemType");
            this.menuItemByItemTypeIdIndex = addColumnDetails("menuItemByItemTypeId", objectSchemaInfo);
            this.itemTypeIndex = addColumnDetails("itemType", objectSchemaInfo);
            this.menuItemsIndex = addColumnDetails("menuItems", objectSchemaInfo);
        }

        MenuItemsByItemTypeColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new MenuItemsByItemTypeColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final MenuItemsByItemTypeColumnInfo src = (MenuItemsByItemTypeColumnInfo) rawSrc;
            final MenuItemsByItemTypeColumnInfo dst = (MenuItemsByItemTypeColumnInfo) rawDst;
            dst.menuItemByItemTypeIdIndex = src.menuItemByItemTypeIdIndex;
            dst.itemTypeIndex = src.itemTypeIndex;
            dst.menuItemsIndex = src.menuItemsIndex;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private static final List<String> FIELD_NAMES;
    static {
        List<String> fieldNames = new ArrayList<String>(3);
        fieldNames.add("menuItemByItemTypeId");
        fieldNames.add("itemType");
        fieldNames.add("menuItems");
        FIELD_NAMES = Collections.unmodifiableList(fieldNames);
    }

    private MenuItemsByItemTypeColumnInfo columnInfo;
    private ProxyState<com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType> proxyState;
    private RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem> menuItemsRealmList;

    MenuItemsByItemTypeRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (MenuItemsByItemTypeColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$menuItemByItemTypeId() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.menuItemByItemTypeIdIndex);
    }

    @Override
    public void realmSet$menuItemByItemTypeId(String value) {
        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'menuItemByItemTypeId' cannot be changed after object was created.");
    }

    @Override
    public com.rhinodesktop.foreorder_golf_consumer1.models.ItemType realmGet$itemType() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNullLink(columnInfo.itemTypeIndex)) {
            return null;
        }
        return proxyState.getRealm$realm().get(com.rhinodesktop.foreorder_golf_consumer1.models.ItemType.class, proxyState.getRow$realm().getLink(columnInfo.itemTypeIndex), false, Collections.<String>emptyList());
    }

    @Override
    public void realmSet$itemType(com.rhinodesktop.foreorder_golf_consumer1.models.ItemType value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("itemType")) {
                return;
            }
            if (value != null && !RealmObject.isManaged(value)) {
                value = ((Realm) proxyState.getRealm$realm()).copyToRealm(value);
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                // Table#nullifyLink() does not support default value. Just using Row.
                row.nullifyLink(columnInfo.itemTypeIndex);
                return;
            }
            proxyState.checkValidObject(value);
            row.getTable().setLink(columnInfo.itemTypeIndex, row.getIndex(), ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getIndex(), true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().nullifyLink(columnInfo.itemTypeIndex);
            return;
        }
        proxyState.checkValidObject(value);
        proxyState.getRow$realm().setLink(columnInfo.itemTypeIndex, ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getIndex());
    }

    @Override
    public RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem> realmGet$menuItems() {
        proxyState.getRealm$realm().checkIfValid();
        // use the cached value if available
        if (menuItemsRealmList != null) {
            return menuItemsRealmList;
        } else {
            OsList osList = proxyState.getRow$realm().getModelList(columnInfo.menuItemsIndex);
            menuItemsRealmList = new RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem>(com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem.class, osList, proxyState.getRealm$realm());
            return menuItemsRealmList;
        }
    }

    @Override
    public void realmSet$menuItems(RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem> value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("menuItems")) {
                return;
            }
            // if the list contains unmanaged RealmObjects, convert them to managed.
            if (value != null && !value.isManaged()) {
                final Realm realm = (Realm) proxyState.getRealm$realm();
                final RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem> original = value;
                value = new RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem>();
                for (com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem item : original) {
                    if (item == null || RealmObject.isManaged(item)) {
                        value.add(item);
                    } else {
                        value.add(realm.copyToRealm(item));
                    }
                }
            }
        }

        proxyState.getRealm$realm().checkIfValid();
        OsList osList = proxyState.getRow$realm().getModelList(columnInfo.menuItemsIndex);
        // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
        if (value != null && value.size() == osList.size()) {
            int objects = value.size();
            for (int i = 0; i < objects; i++) {
                com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem linkedObject = value.get(i);
                proxyState.checkValidObject(linkedObject);
                osList.setRow(i, ((RealmObjectProxy) linkedObject).realmGet$proxyState().getRow$realm().getIndex());
            }
        } else {
            osList.removeAll();
            if (value == null) {
                return;
            }
            int objects = value.size();
            for (int i = 0; i < objects; i++) {
                com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem linkedObject = value.get(i);
                proxyState.checkValidObject(linkedObject);
                osList.addRow(((RealmObjectProxy) linkedObject).realmGet$proxyState().getRow$realm().getIndex());
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("MenuItemsByItemType", 3, 0);
        builder.addPersistedProperty("menuItemByItemTypeId", RealmFieldType.STRING, Property.PRIMARY_KEY, Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedLinkProperty("itemType", RealmFieldType.OBJECT, "ItemType");
        builder.addPersistedLinkProperty("menuItems", RealmFieldType.LIST, "MenuItem");
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static MenuItemsByItemTypeColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new MenuItemsByItemTypeColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "MenuItemsByItemType";
    }

    public static List<String> getFieldNames() {
        return FIELD_NAMES;
    }

    @SuppressWarnings("cast")
    public static com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = new ArrayList<String>(2);
        com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType obj = null;
        if (update) {
            Table table = realm.getTable(com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType.class);
            MenuItemsByItemTypeColumnInfo columnInfo = (MenuItemsByItemTypeColumnInfo) realm.getSchema().getColumnInfo(com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType.class);
            long pkColumnIndex = columnInfo.menuItemByItemTypeIdIndex;
            long rowIndex = Table.NO_MATCH;
            if (json.isNull("menuItemByItemTypeId")) {
                rowIndex = table.findFirstNull(pkColumnIndex);
            } else {
                rowIndex = table.findFirstString(pkColumnIndex, json.getString("menuItemByItemTypeId"));
            }
            if (rowIndex != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType.class), false, Collections.<String> emptyList());
                    obj = new io.realm.MenuItemsByItemTypeRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("itemType")) {
                excludeFields.add("itemType");
            }
            if (json.has("menuItems")) {
                excludeFields.add("menuItems");
            }
            if (json.has("menuItemByItemTypeId")) {
                if (json.isNull("menuItemByItemTypeId")) {
                    obj = (io.realm.MenuItemsByItemTypeRealmProxy) realm.createObjectInternal(com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.MenuItemsByItemTypeRealmProxy) realm.createObjectInternal(com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType.class, json.getString("menuItemByItemTypeId"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'menuItemByItemTypeId'.");
            }
        }

        final MenuItemsByItemTypeRealmProxyInterface objProxy = (MenuItemsByItemTypeRealmProxyInterface) obj;
        if (json.has("itemType")) {
            if (json.isNull("itemType")) {
                objProxy.realmSet$itemType(null);
            } else {
                com.rhinodesktop.foreorder_golf_consumer1.models.ItemType itemTypeObj = ItemTypeRealmProxy.createOrUpdateUsingJsonObject(realm, json.getJSONObject("itemType"), update);
                objProxy.realmSet$itemType(itemTypeObj);
            }
        }
        if (json.has("menuItems")) {
            if (json.isNull("menuItems")) {
                objProxy.realmSet$menuItems(null);
            } else {
                objProxy.realmGet$menuItems().clear();
                JSONArray array = json.getJSONArray("menuItems");
                for (int i = 0; i < array.length(); i++) {
                    com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem item = MenuItemRealmProxy.createOrUpdateUsingJsonObject(realm, array.getJSONObject(i), update);
                    objProxy.realmGet$menuItems().add(item);
                }
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType obj = new com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType();
        final MenuItemsByItemTypeRealmProxyInterface objProxy = (MenuItemsByItemTypeRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("menuItemByItemTypeId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$menuItemByItemTypeId((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$menuItemByItemTypeId(null);
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("itemType")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$itemType(null);
                } else {
                    com.rhinodesktop.foreorder_golf_consumer1.models.ItemType itemTypeObj = ItemTypeRealmProxy.createUsingJsonStream(realm, reader);
                    objProxy.realmSet$itemType(itemTypeObj);
                }
            } else if (name.equals("menuItems")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$menuItems(null);
                } else {
                    objProxy.realmSet$menuItems(new RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem>());
                    reader.beginArray();
                    while (reader.hasNext()) {
                        com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem item = MenuItemRealmProxy.createUsingJsonStream(realm, reader);
                        objProxy.realmGet$menuItems().add(item);
                    }
                    reader.endArray();
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'menuItemByItemTypeId'.");
        }
        return realm.copyToRealm(obj);
    }

    public static com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType copyOrUpdate(Realm realm, com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null) {
            final BaseRealm otherRealm = ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm();
            if (otherRealm.threadId != realm.threadId) {
                throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
            }
            if (otherRealm.getPath().equals(realm.getPath())) {
                return object;
            }
        }
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        RealmObjectProxy cachedRealmObject = cache.get(object);
        if (cachedRealmObject != null) {
            return (com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType) cachedRealmObject;
        }

        com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType.class);
            MenuItemsByItemTypeColumnInfo columnInfo = (MenuItemsByItemTypeColumnInfo) realm.getSchema().getColumnInfo(com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType.class);
            long pkColumnIndex = columnInfo.menuItemByItemTypeIdIndex;
            String value = ((MenuItemsByItemTypeRealmProxyInterface) object).realmGet$menuItemByItemTypeId();
            long rowIndex = Table.NO_MATCH;
            if (value == null) {
                rowIndex = table.findFirstNull(pkColumnIndex);
            } else {
                rowIndex = table.findFirstString(pkColumnIndex, value);
            }
            if (rowIndex == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType.class), false, Collections.<String> emptyList());
                    realmObject = new io.realm.MenuItemsByItemTypeRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, realmObject, object, cache) : copy(realm, object, update, cache);
    }

    public static com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType copy(Realm realm, com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType) cachedRealmObject;
        }

        // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
        com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType realmObject = realm.createObjectInternal(com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType.class, ((MenuItemsByItemTypeRealmProxyInterface) newObject).realmGet$menuItemByItemTypeId(), false, Collections.<String>emptyList());
        cache.put(newObject, (RealmObjectProxy) realmObject);

        MenuItemsByItemTypeRealmProxyInterface realmObjectSource = (MenuItemsByItemTypeRealmProxyInterface) newObject;
        MenuItemsByItemTypeRealmProxyInterface realmObjectCopy = (MenuItemsByItemTypeRealmProxyInterface) realmObject;


        com.rhinodesktop.foreorder_golf_consumer1.models.ItemType itemTypeObj = realmObjectSource.realmGet$itemType();
        if (itemTypeObj == null) {
            realmObjectCopy.realmSet$itemType(null);
        } else {
            com.rhinodesktop.foreorder_golf_consumer1.models.ItemType cacheitemType = (com.rhinodesktop.foreorder_golf_consumer1.models.ItemType) cache.get(itemTypeObj);
            if (cacheitemType != null) {
                realmObjectCopy.realmSet$itemType(cacheitemType);
            } else {
                realmObjectCopy.realmSet$itemType(ItemTypeRealmProxy.copyOrUpdate(realm, itemTypeObj, update, cache));
            }
        }

        RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem> menuItemsList = realmObjectSource.realmGet$menuItems();
        if (menuItemsList != null) {
            RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem> menuItemsRealmList = realmObjectCopy.realmGet$menuItems();
            menuItemsRealmList.clear();
            for (int i = 0; i < menuItemsList.size(); i++) {
                com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem menuItemsItem = menuItemsList.get(i);
                com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem cachemenuItems = (com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem) cache.get(menuItemsItem);
                if (cachemenuItems != null) {
                    menuItemsRealmList.add(cachemenuItems);
                } else {
                    menuItemsRealmList.add(MenuItemRealmProxy.copyOrUpdate(realm, menuItemsItem, update, cache));
                }
            }
        }

        return realmObject;
    }

    public static long insert(Realm realm, com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType.class);
        long tableNativePtr = table.getNativePtr();
        MenuItemsByItemTypeColumnInfo columnInfo = (MenuItemsByItemTypeColumnInfo) realm.getSchema().getColumnInfo(com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType.class);
        long pkColumnIndex = columnInfo.menuItemByItemTypeIdIndex;
        String primaryKeyValue = ((MenuItemsByItemTypeRealmProxyInterface) object).realmGet$menuItemByItemTypeId();
        long rowIndex = Table.NO_MATCH;
        if (primaryKeyValue == null) {
            rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
        } else {
            rowIndex = Table.nativeFindFirstString(tableNativePtr, pkColumnIndex, primaryKeyValue);
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, primaryKeyValue);
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, rowIndex);

        com.rhinodesktop.foreorder_golf_consumer1.models.ItemType itemTypeObj = ((MenuItemsByItemTypeRealmProxyInterface) object).realmGet$itemType();
        if (itemTypeObj != null) {
            Long cacheitemType = cache.get(itemTypeObj);
            if (cacheitemType == null) {
                cacheitemType = ItemTypeRealmProxy.insert(realm, itemTypeObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.itemTypeIndex, rowIndex, cacheitemType, false);
        }

        RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem> menuItemsList = ((MenuItemsByItemTypeRealmProxyInterface) object).realmGet$menuItems();
        if (menuItemsList != null) {
            OsList menuItemsOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.menuItemsIndex);
            for (com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem menuItemsItem : menuItemsList) {
                Long cacheItemIndexmenuItems = cache.get(menuItemsItem);
                if (cacheItemIndexmenuItems == null) {
                    cacheItemIndexmenuItems = MenuItemRealmProxy.insert(realm, menuItemsItem, cache);
                }
                menuItemsOsList.addRow(cacheItemIndexmenuItems);
            }
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType.class);
        long tableNativePtr = table.getNativePtr();
        MenuItemsByItemTypeColumnInfo columnInfo = (MenuItemsByItemTypeColumnInfo) realm.getSchema().getColumnInfo(com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType.class);
        long pkColumnIndex = columnInfo.menuItemByItemTypeIdIndex;
        com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType object = null;
        while (objects.hasNext()) {
            object = (com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            String primaryKeyValue = ((MenuItemsByItemTypeRealmProxyInterface) object).realmGet$menuItemByItemTypeId();
            long rowIndex = Table.NO_MATCH;
            if (primaryKeyValue == null) {
                rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
            } else {
                rowIndex = Table.nativeFindFirstString(tableNativePtr, pkColumnIndex, primaryKeyValue);
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, primaryKeyValue);
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, rowIndex);

            com.rhinodesktop.foreorder_golf_consumer1.models.ItemType itemTypeObj = ((MenuItemsByItemTypeRealmProxyInterface) object).realmGet$itemType();
            if (itemTypeObj != null) {
                Long cacheitemType = cache.get(itemTypeObj);
                if (cacheitemType == null) {
                    cacheitemType = ItemTypeRealmProxy.insert(realm, itemTypeObj, cache);
                }
                table.setLink(columnInfo.itemTypeIndex, rowIndex, cacheitemType, false);
            }

            RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem> menuItemsList = ((MenuItemsByItemTypeRealmProxyInterface) object).realmGet$menuItems();
            if (menuItemsList != null) {
                OsList menuItemsOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.menuItemsIndex);
                for (com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem menuItemsItem : menuItemsList) {
                    Long cacheItemIndexmenuItems = cache.get(menuItemsItem);
                    if (cacheItemIndexmenuItems == null) {
                        cacheItemIndexmenuItems = MenuItemRealmProxy.insert(realm, menuItemsItem, cache);
                    }
                    menuItemsOsList.addRow(cacheItemIndexmenuItems);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType.class);
        long tableNativePtr = table.getNativePtr();
        MenuItemsByItemTypeColumnInfo columnInfo = (MenuItemsByItemTypeColumnInfo) realm.getSchema().getColumnInfo(com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType.class);
        long pkColumnIndex = columnInfo.menuItemByItemTypeIdIndex;
        String primaryKeyValue = ((MenuItemsByItemTypeRealmProxyInterface) object).realmGet$menuItemByItemTypeId();
        long rowIndex = Table.NO_MATCH;
        if (primaryKeyValue == null) {
            rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
        } else {
            rowIndex = Table.nativeFindFirstString(tableNativePtr, pkColumnIndex, primaryKeyValue);
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, primaryKeyValue);
        }
        cache.put(object, rowIndex);

        com.rhinodesktop.foreorder_golf_consumer1.models.ItemType itemTypeObj = ((MenuItemsByItemTypeRealmProxyInterface) object).realmGet$itemType();
        if (itemTypeObj != null) {
            Long cacheitemType = cache.get(itemTypeObj);
            if (cacheitemType == null) {
                cacheitemType = ItemTypeRealmProxy.insertOrUpdate(realm, itemTypeObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.itemTypeIndex, rowIndex, cacheitemType, false);
        } else {
            Table.nativeNullifyLink(tableNativePtr, columnInfo.itemTypeIndex, rowIndex);
        }

        OsList menuItemsOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.menuItemsIndex);
        RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem> menuItemsList = ((MenuItemsByItemTypeRealmProxyInterface) object).realmGet$menuItems();
        if (menuItemsList != null && menuItemsList.size() == menuItemsOsList.size()) {
            // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
            int objects = menuItemsList.size();
            for (int i = 0; i < objects; i++) {
                com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem menuItemsItem = menuItemsList.get(i);
                Long cacheItemIndexmenuItems = cache.get(menuItemsItem);
                if (cacheItemIndexmenuItems == null) {
                    cacheItemIndexmenuItems = MenuItemRealmProxy.insertOrUpdate(realm, menuItemsItem, cache);
                }
                menuItemsOsList.setRow(i, cacheItemIndexmenuItems);
            }
        } else {
            menuItemsOsList.removeAll();
            if (menuItemsList != null) {
                for (com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem menuItemsItem : menuItemsList) {
                    Long cacheItemIndexmenuItems = cache.get(menuItemsItem);
                    if (cacheItemIndexmenuItems == null) {
                        cacheItemIndexmenuItems = MenuItemRealmProxy.insertOrUpdate(realm, menuItemsItem, cache);
                    }
                    menuItemsOsList.addRow(cacheItemIndexmenuItems);
                }
            }
        }

        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType.class);
        long tableNativePtr = table.getNativePtr();
        MenuItemsByItemTypeColumnInfo columnInfo = (MenuItemsByItemTypeColumnInfo) realm.getSchema().getColumnInfo(com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType.class);
        long pkColumnIndex = columnInfo.menuItemByItemTypeIdIndex;
        com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType object = null;
        while (objects.hasNext()) {
            object = (com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            String primaryKeyValue = ((MenuItemsByItemTypeRealmProxyInterface) object).realmGet$menuItemByItemTypeId();
            long rowIndex = Table.NO_MATCH;
            if (primaryKeyValue == null) {
                rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
            } else {
                rowIndex = Table.nativeFindFirstString(tableNativePtr, pkColumnIndex, primaryKeyValue);
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, primaryKeyValue);
            }
            cache.put(object, rowIndex);

            com.rhinodesktop.foreorder_golf_consumer1.models.ItemType itemTypeObj = ((MenuItemsByItemTypeRealmProxyInterface) object).realmGet$itemType();
            if (itemTypeObj != null) {
                Long cacheitemType = cache.get(itemTypeObj);
                if (cacheitemType == null) {
                    cacheitemType = ItemTypeRealmProxy.insertOrUpdate(realm, itemTypeObj, cache);
                }
                Table.nativeSetLink(tableNativePtr, columnInfo.itemTypeIndex, rowIndex, cacheitemType, false);
            } else {
                Table.nativeNullifyLink(tableNativePtr, columnInfo.itemTypeIndex, rowIndex);
            }

            OsList menuItemsOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.menuItemsIndex);
            RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem> menuItemsList = ((MenuItemsByItemTypeRealmProxyInterface) object).realmGet$menuItems();
            if (menuItemsList != null && menuItemsList.size() == menuItemsOsList.size()) {
                // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
                int objectCount = menuItemsList.size();
                for (int i = 0; i < objectCount; i++) {
                    com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem menuItemsItem = menuItemsList.get(i);
                    Long cacheItemIndexmenuItems = cache.get(menuItemsItem);
                    if (cacheItemIndexmenuItems == null) {
                        cacheItemIndexmenuItems = MenuItemRealmProxy.insertOrUpdate(realm, menuItemsItem, cache);
                    }
                    menuItemsOsList.setRow(i, cacheItemIndexmenuItems);
                }
            } else {
                menuItemsOsList.removeAll();
                if (menuItemsList != null) {
                    for (com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem menuItemsItem : menuItemsList) {
                        Long cacheItemIndexmenuItems = cache.get(menuItemsItem);
                        if (cacheItemIndexmenuItems == null) {
                            cacheItemIndexmenuItems = MenuItemRealmProxy.insertOrUpdate(realm, menuItemsItem, cache);
                        }
                        menuItemsOsList.addRow(cacheItemIndexmenuItems);
                    }
                }
            }

        }
    }

    public static com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType createDetachedCopy(com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType) cachedObject.object;
            }
            unmanagedObject = (com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        MenuItemsByItemTypeRealmProxyInterface unmanagedCopy = (MenuItemsByItemTypeRealmProxyInterface) unmanagedObject;
        MenuItemsByItemTypeRealmProxyInterface realmSource = (MenuItemsByItemTypeRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$menuItemByItemTypeId(realmSource.realmGet$menuItemByItemTypeId());

        // Deep copy of itemType
        unmanagedCopy.realmSet$itemType(ItemTypeRealmProxy.createDetachedCopy(realmSource.realmGet$itemType(), currentDepth + 1, maxDepth, cache));

        // Deep copy of menuItems
        if (currentDepth == maxDepth) {
            unmanagedCopy.realmSet$menuItems(null);
        } else {
            RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem> managedmenuItemsList = realmSource.realmGet$menuItems();
            RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem> unmanagedmenuItemsList = new RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem>();
            unmanagedCopy.realmSet$menuItems(unmanagedmenuItemsList);
            int nextDepth = currentDepth + 1;
            int size = managedmenuItemsList.size();
            for (int i = 0; i < size; i++) {
                com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem item = MenuItemRealmProxy.createDetachedCopy(managedmenuItemsList.get(i), nextDepth, maxDepth, cache);
                unmanagedmenuItemsList.add(item);
            }
        }

        return unmanagedObject;
    }

    static com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType update(Realm realm, com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType realmObject, com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType newObject, Map<RealmModel, RealmObjectProxy> cache) {
        MenuItemsByItemTypeRealmProxyInterface realmObjectTarget = (MenuItemsByItemTypeRealmProxyInterface) realmObject;
        MenuItemsByItemTypeRealmProxyInterface realmObjectSource = (MenuItemsByItemTypeRealmProxyInterface) newObject;
        com.rhinodesktop.foreorder_golf_consumer1.models.ItemType itemTypeObj = realmObjectSource.realmGet$itemType();
        if (itemTypeObj == null) {
            realmObjectTarget.realmSet$itemType(null);
        } else {
            com.rhinodesktop.foreorder_golf_consumer1.models.ItemType cacheitemType = (com.rhinodesktop.foreorder_golf_consumer1.models.ItemType) cache.get(itemTypeObj);
            if (cacheitemType != null) {
                realmObjectTarget.realmSet$itemType(cacheitemType);
            } else {
                realmObjectTarget.realmSet$itemType(ItemTypeRealmProxy.copyOrUpdate(realm, itemTypeObj, true, cache));
            }
        }
        RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem> menuItemsList = realmObjectSource.realmGet$menuItems();
        RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem> menuItemsRealmList = realmObjectTarget.realmGet$menuItems();
        if (menuItemsList != null && menuItemsList.size() == menuItemsRealmList.size()) {
            // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
            int objects = menuItemsList.size();
            for (int i = 0; i < objects; i++) {
                com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem menuItemsItem = menuItemsList.get(i);
                com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem cachemenuItems = (com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem) cache.get(menuItemsItem);
                if (cachemenuItems != null) {
                    menuItemsRealmList.set(i, cachemenuItems);
                } else {
                    menuItemsRealmList.set(i, MenuItemRealmProxy.copyOrUpdate(realm, menuItemsItem, true, cache));
                }
            }
        } else {
            menuItemsRealmList.clear();
            if (menuItemsList != null) {
                for (int i = 0; i < menuItemsList.size(); i++) {
                    com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem menuItemsItem = menuItemsList.get(i);
                    com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem cachemenuItems = (com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem) cache.get(menuItemsItem);
                    if (cachemenuItems != null) {
                        menuItemsRealmList.add(cachemenuItems);
                    } else {
                        menuItemsRealmList.add(MenuItemRealmProxy.copyOrUpdate(realm, menuItemsItem, true, cache));
                    }
                }
            }
        }
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("MenuItemsByItemType = proxy[");
        stringBuilder.append("{menuItemByItemTypeId:");
        stringBuilder.append(realmGet$menuItemByItemTypeId() != null ? realmGet$menuItemByItemTypeId() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{itemType:");
        stringBuilder.append(realmGet$itemType() != null ? "ItemType" : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{menuItems:");
        stringBuilder.append("RealmList<MenuItem>[").append(realmGet$menuItems().size()).append("]");
        stringBuilder.append("}");
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    @Override
    public ProxyState<?> realmGet$proxyState() {
        return proxyState;
    }

    @Override
    public int hashCode() {
        String realmName = proxyState.getRealm$realm().getPath();
        String tableName = proxyState.getRow$realm().getTable().getName();
        long rowIndex = proxyState.getRow$realm().getIndex();

        int result = 17;
        result = 31 * result + ((realmName != null) ? realmName.hashCode() : 0);
        result = 31 * result + ((tableName != null) ? tableName.hashCode() : 0);
        result = 31 * result + (int) (rowIndex ^ (rowIndex >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItemsByItemTypeRealmProxy aMenuItemsByItemType = (MenuItemsByItemTypeRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aMenuItemsByItemType.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aMenuItemsByItemType.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aMenuItemsByItemType.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
