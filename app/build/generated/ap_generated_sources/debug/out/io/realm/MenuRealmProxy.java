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
public class MenuRealmProxy extends com.rhinodesktop.foreorder_golf_consumer1.models.Menu
    implements RealmObjectProxy, MenuRealmProxyInterface {

    static final class MenuColumnInfo extends ColumnInfo {
        long menuIdIndex;
        long nameIndex;
        long descIndex;
        long clubIdIndex;
        long validIndex;
        long menuItemsByItemTypeIndex;
        long modifiedAtIndex;

        MenuColumnInfo(OsSchemaInfo schemaInfo) {
            super(7);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("Menu");
            this.menuIdIndex = addColumnDetails("menuId", objectSchemaInfo);
            this.nameIndex = addColumnDetails("name", objectSchemaInfo);
            this.descIndex = addColumnDetails("desc", objectSchemaInfo);
            this.clubIdIndex = addColumnDetails("clubId", objectSchemaInfo);
            this.validIndex = addColumnDetails("valid", objectSchemaInfo);
            this.menuItemsByItemTypeIndex = addColumnDetails("menuItemsByItemType", objectSchemaInfo);
            this.modifiedAtIndex = addColumnDetails("modifiedAt", objectSchemaInfo);
        }

        MenuColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new MenuColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final MenuColumnInfo src = (MenuColumnInfo) rawSrc;
            final MenuColumnInfo dst = (MenuColumnInfo) rawDst;
            dst.menuIdIndex = src.menuIdIndex;
            dst.nameIndex = src.nameIndex;
            dst.descIndex = src.descIndex;
            dst.clubIdIndex = src.clubIdIndex;
            dst.validIndex = src.validIndex;
            dst.menuItemsByItemTypeIndex = src.menuItemsByItemTypeIndex;
            dst.modifiedAtIndex = src.modifiedAtIndex;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private static final List<String> FIELD_NAMES;
    static {
        List<String> fieldNames = new ArrayList<String>(7);
        fieldNames.add("menuId");
        fieldNames.add("name");
        fieldNames.add("desc");
        fieldNames.add("clubId");
        fieldNames.add("valid");
        fieldNames.add("menuItemsByItemType");
        fieldNames.add("modifiedAt");
        FIELD_NAMES = Collections.unmodifiableList(fieldNames);
    }

    private MenuColumnInfo columnInfo;
    private ProxyState<com.rhinodesktop.foreorder_golf_consumer1.models.Menu> proxyState;
    private RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType> menuItemsByItemTypeRealmList;

    MenuRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (MenuColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.rhinodesktop.foreorder_golf_consumer1.models.Menu>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public Integer realmGet$menuId() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.menuIdIndex)) {
            return null;
        }
        return (int) proxyState.getRow$realm().getLong(columnInfo.menuIdIndex);
    }

    @Override
    public void realmSet$menuId(Integer value) {
        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'menuId' cannot be changed after object was created.");
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$name() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.nameIndex);
    }

    @Override
    public void realmSet$name(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.nameIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.nameIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.nameIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.nameIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$desc() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.descIndex);
    }

    @Override
    public void realmSet$desc(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.descIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.descIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.descIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.descIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public Integer realmGet$clubId() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.clubIdIndex)) {
            return null;
        }
        return (int) proxyState.getRow$realm().getLong(columnInfo.clubIdIndex);
    }

    @Override
    public void realmSet$clubId(Integer value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.clubIdIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setLong(columnInfo.clubIdIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.clubIdIndex);
            return;
        }
        proxyState.getRow$realm().setLong(columnInfo.clubIdIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public Boolean realmGet$valid() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.validIndex)) {
            return null;
        }
        return (boolean) proxyState.getRow$realm().getBoolean(columnInfo.validIndex);
    }

    @Override
    public void realmSet$valid(Boolean value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.validIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setBoolean(columnInfo.validIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.validIndex);
            return;
        }
        proxyState.getRow$realm().setBoolean(columnInfo.validIndex, value);
    }

    @Override
    public RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType> realmGet$menuItemsByItemType() {
        proxyState.getRealm$realm().checkIfValid();
        // use the cached value if available
        if (menuItemsByItemTypeRealmList != null) {
            return menuItemsByItemTypeRealmList;
        } else {
            OsList osList = proxyState.getRow$realm().getModelList(columnInfo.menuItemsByItemTypeIndex);
            menuItemsByItemTypeRealmList = new RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType>(com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType.class, osList, proxyState.getRealm$realm());
            return menuItemsByItemTypeRealmList;
        }
    }

    @Override
    public void realmSet$menuItemsByItemType(RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType> value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("menuItemsByItemType")) {
                return;
            }
            // if the list contains unmanaged RealmObjects, convert them to managed.
            if (value != null && !value.isManaged()) {
                final Realm realm = (Realm) proxyState.getRealm$realm();
                final RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType> original = value;
                value = new RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType>();
                for (com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType item : original) {
                    if (item == null || RealmObject.isManaged(item)) {
                        value.add(item);
                    } else {
                        value.add(realm.copyToRealm(item));
                    }
                }
            }
        }

        proxyState.getRealm$realm().checkIfValid();
        OsList osList = proxyState.getRow$realm().getModelList(columnInfo.menuItemsByItemTypeIndex);
        // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
        if (value != null && value.size() == osList.size()) {
            int objects = value.size();
            for (int i = 0; i < objects; i++) {
                com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType linkedObject = value.get(i);
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
                com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType linkedObject = value.get(i);
                proxyState.checkValidObject(linkedObject);
                osList.addRow(((RealmObjectProxy) linkedObject).realmGet$proxyState().getRow$realm().getIndex());
            }
        }
    }

    @Override
    @SuppressWarnings("cast")
    public Date realmGet$modifiedAt() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.modifiedAtIndex)) {
            return null;
        }
        return (java.util.Date) proxyState.getRow$realm().getDate(columnInfo.modifiedAtIndex);
    }

    @Override
    public void realmSet$modifiedAt(Date value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.modifiedAtIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setDate(columnInfo.modifiedAtIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.modifiedAtIndex);
            return;
        }
        proxyState.getRow$realm().setDate(columnInfo.modifiedAtIndex, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("Menu", 7, 0);
        builder.addPersistedProperty("menuId", RealmFieldType.INTEGER, Property.PRIMARY_KEY, Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("name", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("desc", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("clubId", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("valid", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedLinkProperty("menuItemsByItemType", RealmFieldType.LIST, "MenuItemsByItemType");
        builder.addPersistedProperty("modifiedAt", RealmFieldType.DATE, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static MenuColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new MenuColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "Menu";
    }

    public static List<String> getFieldNames() {
        return FIELD_NAMES;
    }

    @SuppressWarnings("cast")
    public static com.rhinodesktop.foreorder_golf_consumer1.models.Menu createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = new ArrayList<String>(1);
        com.rhinodesktop.foreorder_golf_consumer1.models.Menu obj = null;
        if (update) {
            Table table = realm.getTable(com.rhinodesktop.foreorder_golf_consumer1.models.Menu.class);
            MenuColumnInfo columnInfo = (MenuColumnInfo) realm.getSchema().getColumnInfo(com.rhinodesktop.foreorder_golf_consumer1.models.Menu.class);
            long pkColumnIndex = columnInfo.menuIdIndex;
            long rowIndex = Table.NO_MATCH;
            if (json.isNull("menuId")) {
                rowIndex = table.findFirstNull(pkColumnIndex);
            } else {
                rowIndex = table.findFirstLong(pkColumnIndex, json.getLong("menuId"));
            }
            if (rowIndex != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.rhinodesktop.foreorder_golf_consumer1.models.Menu.class), false, Collections.<String> emptyList());
                    obj = new io.realm.MenuRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("menuItemsByItemType")) {
                excludeFields.add("menuItemsByItemType");
            }
            if (json.has("menuId")) {
                if (json.isNull("menuId")) {
                    obj = (io.realm.MenuRealmProxy) realm.createObjectInternal(com.rhinodesktop.foreorder_golf_consumer1.models.Menu.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.MenuRealmProxy) realm.createObjectInternal(com.rhinodesktop.foreorder_golf_consumer1.models.Menu.class, json.getInt("menuId"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'menuId'.");
            }
        }

        final MenuRealmProxyInterface objProxy = (MenuRealmProxyInterface) obj;
        if (json.has("name")) {
            if (json.isNull("name")) {
                objProxy.realmSet$name(null);
            } else {
                objProxy.realmSet$name((String) json.getString("name"));
            }
        }
        if (json.has("desc")) {
            if (json.isNull("desc")) {
                objProxy.realmSet$desc(null);
            } else {
                objProxy.realmSet$desc((String) json.getString("desc"));
            }
        }
        if (json.has("clubId")) {
            if (json.isNull("clubId")) {
                objProxy.realmSet$clubId(null);
            } else {
                objProxy.realmSet$clubId((int) json.getInt("clubId"));
            }
        }
        if (json.has("valid")) {
            if (json.isNull("valid")) {
                objProxy.realmSet$valid(null);
            } else {
                objProxy.realmSet$valid((boolean) json.getBoolean("valid"));
            }
        }
        if (json.has("menuItemsByItemType")) {
            if (json.isNull("menuItemsByItemType")) {
                objProxy.realmSet$menuItemsByItemType(null);
            } else {
                objProxy.realmGet$menuItemsByItemType().clear();
                JSONArray array = json.getJSONArray("menuItemsByItemType");
                for (int i = 0; i < array.length(); i++) {
                    com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType item = MenuItemsByItemTypeRealmProxy.createOrUpdateUsingJsonObject(realm, array.getJSONObject(i), update);
                    objProxy.realmGet$menuItemsByItemType().add(item);
                }
            }
        }
        if (json.has("modifiedAt")) {
            if (json.isNull("modifiedAt")) {
                objProxy.realmSet$modifiedAt(null);
            } else {
                Object timestamp = json.get("modifiedAt");
                if (timestamp instanceof String) {
                    objProxy.realmSet$modifiedAt(JsonUtils.stringToDate((String) timestamp));
                } else {
                    objProxy.realmSet$modifiedAt(new Date(json.getLong("modifiedAt")));
                }
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.rhinodesktop.foreorder_golf_consumer1.models.Menu createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.rhinodesktop.foreorder_golf_consumer1.models.Menu obj = new com.rhinodesktop.foreorder_golf_consumer1.models.Menu();
        final MenuRealmProxyInterface objProxy = (MenuRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("menuId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$menuId((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$menuId(null);
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("name")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$name((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$name(null);
                }
            } else if (name.equals("desc")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$desc((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$desc(null);
                }
            } else if (name.equals("clubId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$clubId((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$clubId(null);
                }
            } else if (name.equals("valid")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$valid((boolean) reader.nextBoolean());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$valid(null);
                }
            } else if (name.equals("menuItemsByItemType")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$menuItemsByItemType(null);
                } else {
                    objProxy.realmSet$menuItemsByItemType(new RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType>());
                    reader.beginArray();
                    while (reader.hasNext()) {
                        com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType item = MenuItemsByItemTypeRealmProxy.createUsingJsonStream(realm, reader);
                        objProxy.realmGet$menuItemsByItemType().add(item);
                    }
                    reader.endArray();
                }
            } else if (name.equals("modifiedAt")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$modifiedAt(null);
                } else if (reader.peek() == JsonToken.NUMBER) {
                    long timestamp = reader.nextLong();
                    if (timestamp > -1) {
                        objProxy.realmSet$modifiedAt(new Date(timestamp));
                    }
                } else {
                    objProxy.realmSet$modifiedAt(JsonUtils.stringToDate(reader.nextString()));
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'menuId'.");
        }
        return realm.copyToRealm(obj);
    }

    public static com.rhinodesktop.foreorder_golf_consumer1.models.Menu copyOrUpdate(Realm realm, com.rhinodesktop.foreorder_golf_consumer1.models.Menu object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
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
            return (com.rhinodesktop.foreorder_golf_consumer1.models.Menu) cachedRealmObject;
        }

        com.rhinodesktop.foreorder_golf_consumer1.models.Menu realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.rhinodesktop.foreorder_golf_consumer1.models.Menu.class);
            MenuColumnInfo columnInfo = (MenuColumnInfo) realm.getSchema().getColumnInfo(com.rhinodesktop.foreorder_golf_consumer1.models.Menu.class);
            long pkColumnIndex = columnInfo.menuIdIndex;
            Number value = ((MenuRealmProxyInterface) object).realmGet$menuId();
            long rowIndex = Table.NO_MATCH;
            if (value == null) {
                rowIndex = table.findFirstNull(pkColumnIndex);
            } else {
                rowIndex = table.findFirstLong(pkColumnIndex, value.longValue());
            }
            if (rowIndex == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.rhinodesktop.foreorder_golf_consumer1.models.Menu.class), false, Collections.<String> emptyList());
                    realmObject = new io.realm.MenuRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, realmObject, object, cache) : copy(realm, object, update, cache);
    }

    public static com.rhinodesktop.foreorder_golf_consumer1.models.Menu copy(Realm realm, com.rhinodesktop.foreorder_golf_consumer1.models.Menu newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.rhinodesktop.foreorder_golf_consumer1.models.Menu) cachedRealmObject;
        }

        // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
        com.rhinodesktop.foreorder_golf_consumer1.models.Menu realmObject = realm.createObjectInternal(com.rhinodesktop.foreorder_golf_consumer1.models.Menu.class, ((MenuRealmProxyInterface) newObject).realmGet$menuId(), false, Collections.<String>emptyList());
        cache.put(newObject, (RealmObjectProxy) realmObject);

        MenuRealmProxyInterface realmObjectSource = (MenuRealmProxyInterface) newObject;
        MenuRealmProxyInterface realmObjectCopy = (MenuRealmProxyInterface) realmObject;

        realmObjectCopy.realmSet$name(realmObjectSource.realmGet$name());
        realmObjectCopy.realmSet$desc(realmObjectSource.realmGet$desc());
        realmObjectCopy.realmSet$clubId(realmObjectSource.realmGet$clubId());
        realmObjectCopy.realmSet$valid(realmObjectSource.realmGet$valid());

        RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType> menuItemsByItemTypeList = realmObjectSource.realmGet$menuItemsByItemType();
        if (menuItemsByItemTypeList != null) {
            RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType> menuItemsByItemTypeRealmList = realmObjectCopy.realmGet$menuItemsByItemType();
            menuItemsByItemTypeRealmList.clear();
            for (int i = 0; i < menuItemsByItemTypeList.size(); i++) {
                com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType menuItemsByItemTypeItem = menuItemsByItemTypeList.get(i);
                com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType cachemenuItemsByItemType = (com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType) cache.get(menuItemsByItemTypeItem);
                if (cachemenuItemsByItemType != null) {
                    menuItemsByItemTypeRealmList.add(cachemenuItemsByItemType);
                } else {
                    menuItemsByItemTypeRealmList.add(MenuItemsByItemTypeRealmProxy.copyOrUpdate(realm, menuItemsByItemTypeItem, update, cache));
                }
            }
        }

        realmObjectCopy.realmSet$modifiedAt(realmObjectSource.realmGet$modifiedAt());
        return realmObject;
    }

    public static long insert(Realm realm, com.rhinodesktop.foreorder_golf_consumer1.models.Menu object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.rhinodesktop.foreorder_golf_consumer1.models.Menu.class);
        long tableNativePtr = table.getNativePtr();
        MenuColumnInfo columnInfo = (MenuColumnInfo) realm.getSchema().getColumnInfo(com.rhinodesktop.foreorder_golf_consumer1.models.Menu.class);
        long pkColumnIndex = columnInfo.menuIdIndex;
        Object primaryKeyValue = ((MenuRealmProxyInterface) object).realmGet$menuId();
        long rowIndex = Table.NO_MATCH;
        if (primaryKeyValue == null) {
            rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
        } else {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((MenuRealmProxyInterface) object).realmGet$menuId());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((MenuRealmProxyInterface) object).realmGet$menuId());
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, rowIndex);
        String realmGet$name = ((MenuRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
        }
        String realmGet$desc = ((MenuRealmProxyInterface) object).realmGet$desc();
        if (realmGet$desc != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.descIndex, rowIndex, realmGet$desc, false);
        }
        Number realmGet$clubId = ((MenuRealmProxyInterface) object).realmGet$clubId();
        if (realmGet$clubId != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.clubIdIndex, rowIndex, realmGet$clubId.longValue(), false);
        }
        Boolean realmGet$valid = ((MenuRealmProxyInterface) object).realmGet$valid();
        if (realmGet$valid != null) {
            Table.nativeSetBoolean(tableNativePtr, columnInfo.validIndex, rowIndex, realmGet$valid, false);
        }

        RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType> menuItemsByItemTypeList = ((MenuRealmProxyInterface) object).realmGet$menuItemsByItemType();
        if (menuItemsByItemTypeList != null) {
            OsList menuItemsByItemTypeOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.menuItemsByItemTypeIndex);
            for (com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType menuItemsByItemTypeItem : menuItemsByItemTypeList) {
                Long cacheItemIndexmenuItemsByItemType = cache.get(menuItemsByItemTypeItem);
                if (cacheItemIndexmenuItemsByItemType == null) {
                    cacheItemIndexmenuItemsByItemType = MenuItemsByItemTypeRealmProxy.insert(realm, menuItemsByItemTypeItem, cache);
                }
                menuItemsByItemTypeOsList.addRow(cacheItemIndexmenuItemsByItemType);
            }
        }
        java.util.Date realmGet$modifiedAt = ((MenuRealmProxyInterface) object).realmGet$modifiedAt();
        if (realmGet$modifiedAt != null) {
            Table.nativeSetTimestamp(tableNativePtr, columnInfo.modifiedAtIndex, rowIndex, realmGet$modifiedAt.getTime(), false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.rhinodesktop.foreorder_golf_consumer1.models.Menu.class);
        long tableNativePtr = table.getNativePtr();
        MenuColumnInfo columnInfo = (MenuColumnInfo) realm.getSchema().getColumnInfo(com.rhinodesktop.foreorder_golf_consumer1.models.Menu.class);
        long pkColumnIndex = columnInfo.menuIdIndex;
        com.rhinodesktop.foreorder_golf_consumer1.models.Menu object = null;
        while (objects.hasNext()) {
            object = (com.rhinodesktop.foreorder_golf_consumer1.models.Menu) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            Object primaryKeyValue = ((MenuRealmProxyInterface) object).realmGet$menuId();
            long rowIndex = Table.NO_MATCH;
            if (primaryKeyValue == null) {
                rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
            } else {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((MenuRealmProxyInterface) object).realmGet$menuId());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((MenuRealmProxyInterface) object).realmGet$menuId());
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, rowIndex);
            String realmGet$name = ((MenuRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
            }
            String realmGet$desc = ((MenuRealmProxyInterface) object).realmGet$desc();
            if (realmGet$desc != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.descIndex, rowIndex, realmGet$desc, false);
            }
            Number realmGet$clubId = ((MenuRealmProxyInterface) object).realmGet$clubId();
            if (realmGet$clubId != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.clubIdIndex, rowIndex, realmGet$clubId.longValue(), false);
            }
            Boolean realmGet$valid = ((MenuRealmProxyInterface) object).realmGet$valid();
            if (realmGet$valid != null) {
                Table.nativeSetBoolean(tableNativePtr, columnInfo.validIndex, rowIndex, realmGet$valid, false);
            }

            RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType> menuItemsByItemTypeList = ((MenuRealmProxyInterface) object).realmGet$menuItemsByItemType();
            if (menuItemsByItemTypeList != null) {
                OsList menuItemsByItemTypeOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.menuItemsByItemTypeIndex);
                for (com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType menuItemsByItemTypeItem : menuItemsByItemTypeList) {
                    Long cacheItemIndexmenuItemsByItemType = cache.get(menuItemsByItemTypeItem);
                    if (cacheItemIndexmenuItemsByItemType == null) {
                        cacheItemIndexmenuItemsByItemType = MenuItemsByItemTypeRealmProxy.insert(realm, menuItemsByItemTypeItem, cache);
                    }
                    menuItemsByItemTypeOsList.addRow(cacheItemIndexmenuItemsByItemType);
                }
            }
            java.util.Date realmGet$modifiedAt = ((MenuRealmProxyInterface) object).realmGet$modifiedAt();
            if (realmGet$modifiedAt != null) {
                Table.nativeSetTimestamp(tableNativePtr, columnInfo.modifiedAtIndex, rowIndex, realmGet$modifiedAt.getTime(), false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.rhinodesktop.foreorder_golf_consumer1.models.Menu object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.rhinodesktop.foreorder_golf_consumer1.models.Menu.class);
        long tableNativePtr = table.getNativePtr();
        MenuColumnInfo columnInfo = (MenuColumnInfo) realm.getSchema().getColumnInfo(com.rhinodesktop.foreorder_golf_consumer1.models.Menu.class);
        long pkColumnIndex = columnInfo.menuIdIndex;
        Object primaryKeyValue = ((MenuRealmProxyInterface) object).realmGet$menuId();
        long rowIndex = Table.NO_MATCH;
        if (primaryKeyValue == null) {
            rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
        } else {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((MenuRealmProxyInterface) object).realmGet$menuId());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((MenuRealmProxyInterface) object).realmGet$menuId());
        }
        cache.put(object, rowIndex);
        String realmGet$name = ((MenuRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.nameIndex, rowIndex, false);
        }
        String realmGet$desc = ((MenuRealmProxyInterface) object).realmGet$desc();
        if (realmGet$desc != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.descIndex, rowIndex, realmGet$desc, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.descIndex, rowIndex, false);
        }
        Number realmGet$clubId = ((MenuRealmProxyInterface) object).realmGet$clubId();
        if (realmGet$clubId != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.clubIdIndex, rowIndex, realmGet$clubId.longValue(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.clubIdIndex, rowIndex, false);
        }
        Boolean realmGet$valid = ((MenuRealmProxyInterface) object).realmGet$valid();
        if (realmGet$valid != null) {
            Table.nativeSetBoolean(tableNativePtr, columnInfo.validIndex, rowIndex, realmGet$valid, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.validIndex, rowIndex, false);
        }

        OsList menuItemsByItemTypeOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.menuItemsByItemTypeIndex);
        RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType> menuItemsByItemTypeList = ((MenuRealmProxyInterface) object).realmGet$menuItemsByItemType();
        if (menuItemsByItemTypeList != null && menuItemsByItemTypeList.size() == menuItemsByItemTypeOsList.size()) {
            // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
            int objects = menuItemsByItemTypeList.size();
            for (int i = 0; i < objects; i++) {
                com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType menuItemsByItemTypeItem = menuItemsByItemTypeList.get(i);
                Long cacheItemIndexmenuItemsByItemType = cache.get(menuItemsByItemTypeItem);
                if (cacheItemIndexmenuItemsByItemType == null) {
                    cacheItemIndexmenuItemsByItemType = MenuItemsByItemTypeRealmProxy.insertOrUpdate(realm, menuItemsByItemTypeItem, cache);
                }
                menuItemsByItemTypeOsList.setRow(i, cacheItemIndexmenuItemsByItemType);
            }
        } else {
            menuItemsByItemTypeOsList.removeAll();
            if (menuItemsByItemTypeList != null) {
                for (com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType menuItemsByItemTypeItem : menuItemsByItemTypeList) {
                    Long cacheItemIndexmenuItemsByItemType = cache.get(menuItemsByItemTypeItem);
                    if (cacheItemIndexmenuItemsByItemType == null) {
                        cacheItemIndexmenuItemsByItemType = MenuItemsByItemTypeRealmProxy.insertOrUpdate(realm, menuItemsByItemTypeItem, cache);
                    }
                    menuItemsByItemTypeOsList.addRow(cacheItemIndexmenuItemsByItemType);
                }
            }
        }

        java.util.Date realmGet$modifiedAt = ((MenuRealmProxyInterface) object).realmGet$modifiedAt();
        if (realmGet$modifiedAt != null) {
            Table.nativeSetTimestamp(tableNativePtr, columnInfo.modifiedAtIndex, rowIndex, realmGet$modifiedAt.getTime(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.modifiedAtIndex, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.rhinodesktop.foreorder_golf_consumer1.models.Menu.class);
        long tableNativePtr = table.getNativePtr();
        MenuColumnInfo columnInfo = (MenuColumnInfo) realm.getSchema().getColumnInfo(com.rhinodesktop.foreorder_golf_consumer1.models.Menu.class);
        long pkColumnIndex = columnInfo.menuIdIndex;
        com.rhinodesktop.foreorder_golf_consumer1.models.Menu object = null;
        while (objects.hasNext()) {
            object = (com.rhinodesktop.foreorder_golf_consumer1.models.Menu) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            Object primaryKeyValue = ((MenuRealmProxyInterface) object).realmGet$menuId();
            long rowIndex = Table.NO_MATCH;
            if (primaryKeyValue == null) {
                rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
            } else {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((MenuRealmProxyInterface) object).realmGet$menuId());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((MenuRealmProxyInterface) object).realmGet$menuId());
            }
            cache.put(object, rowIndex);
            String realmGet$name = ((MenuRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.nameIndex, rowIndex, false);
            }
            String realmGet$desc = ((MenuRealmProxyInterface) object).realmGet$desc();
            if (realmGet$desc != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.descIndex, rowIndex, realmGet$desc, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.descIndex, rowIndex, false);
            }
            Number realmGet$clubId = ((MenuRealmProxyInterface) object).realmGet$clubId();
            if (realmGet$clubId != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.clubIdIndex, rowIndex, realmGet$clubId.longValue(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.clubIdIndex, rowIndex, false);
            }
            Boolean realmGet$valid = ((MenuRealmProxyInterface) object).realmGet$valid();
            if (realmGet$valid != null) {
                Table.nativeSetBoolean(tableNativePtr, columnInfo.validIndex, rowIndex, realmGet$valid, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.validIndex, rowIndex, false);
            }

            OsList menuItemsByItemTypeOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.menuItemsByItemTypeIndex);
            RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType> menuItemsByItemTypeList = ((MenuRealmProxyInterface) object).realmGet$menuItemsByItemType();
            if (menuItemsByItemTypeList != null && menuItemsByItemTypeList.size() == menuItemsByItemTypeOsList.size()) {
                // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
                int objectCount = menuItemsByItemTypeList.size();
                for (int i = 0; i < objectCount; i++) {
                    com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType menuItemsByItemTypeItem = menuItemsByItemTypeList.get(i);
                    Long cacheItemIndexmenuItemsByItemType = cache.get(menuItemsByItemTypeItem);
                    if (cacheItemIndexmenuItemsByItemType == null) {
                        cacheItemIndexmenuItemsByItemType = MenuItemsByItemTypeRealmProxy.insertOrUpdate(realm, menuItemsByItemTypeItem, cache);
                    }
                    menuItemsByItemTypeOsList.setRow(i, cacheItemIndexmenuItemsByItemType);
                }
            } else {
                menuItemsByItemTypeOsList.removeAll();
                if (menuItemsByItemTypeList != null) {
                    for (com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType menuItemsByItemTypeItem : menuItemsByItemTypeList) {
                        Long cacheItemIndexmenuItemsByItemType = cache.get(menuItemsByItemTypeItem);
                        if (cacheItemIndexmenuItemsByItemType == null) {
                            cacheItemIndexmenuItemsByItemType = MenuItemsByItemTypeRealmProxy.insertOrUpdate(realm, menuItemsByItemTypeItem, cache);
                        }
                        menuItemsByItemTypeOsList.addRow(cacheItemIndexmenuItemsByItemType);
                    }
                }
            }

            java.util.Date realmGet$modifiedAt = ((MenuRealmProxyInterface) object).realmGet$modifiedAt();
            if (realmGet$modifiedAt != null) {
                Table.nativeSetTimestamp(tableNativePtr, columnInfo.modifiedAtIndex, rowIndex, realmGet$modifiedAt.getTime(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.modifiedAtIndex, rowIndex, false);
            }
        }
    }

    public static com.rhinodesktop.foreorder_golf_consumer1.models.Menu createDetachedCopy(com.rhinodesktop.foreorder_golf_consumer1.models.Menu realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.rhinodesktop.foreorder_golf_consumer1.models.Menu unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.rhinodesktop.foreorder_golf_consumer1.models.Menu();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.rhinodesktop.foreorder_golf_consumer1.models.Menu) cachedObject.object;
            }
            unmanagedObject = (com.rhinodesktop.foreorder_golf_consumer1.models.Menu) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        MenuRealmProxyInterface unmanagedCopy = (MenuRealmProxyInterface) unmanagedObject;
        MenuRealmProxyInterface realmSource = (MenuRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$menuId(realmSource.realmGet$menuId());
        unmanagedCopy.realmSet$name(realmSource.realmGet$name());
        unmanagedCopy.realmSet$desc(realmSource.realmGet$desc());
        unmanagedCopy.realmSet$clubId(realmSource.realmGet$clubId());
        unmanagedCopy.realmSet$valid(realmSource.realmGet$valid());

        // Deep copy of menuItemsByItemType
        if (currentDepth == maxDepth) {
            unmanagedCopy.realmSet$menuItemsByItemType(null);
        } else {
            RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType> managedmenuItemsByItemTypeList = realmSource.realmGet$menuItemsByItemType();
            RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType> unmanagedmenuItemsByItemTypeList = new RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType>();
            unmanagedCopy.realmSet$menuItemsByItemType(unmanagedmenuItemsByItemTypeList);
            int nextDepth = currentDepth + 1;
            int size = managedmenuItemsByItemTypeList.size();
            for (int i = 0; i < size; i++) {
                com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType item = MenuItemsByItemTypeRealmProxy.createDetachedCopy(managedmenuItemsByItemTypeList.get(i), nextDepth, maxDepth, cache);
                unmanagedmenuItemsByItemTypeList.add(item);
            }
        }
        unmanagedCopy.realmSet$modifiedAt(realmSource.realmGet$modifiedAt());

        return unmanagedObject;
    }

    static com.rhinodesktop.foreorder_golf_consumer1.models.Menu update(Realm realm, com.rhinodesktop.foreorder_golf_consumer1.models.Menu realmObject, com.rhinodesktop.foreorder_golf_consumer1.models.Menu newObject, Map<RealmModel, RealmObjectProxy> cache) {
        MenuRealmProxyInterface realmObjectTarget = (MenuRealmProxyInterface) realmObject;
        MenuRealmProxyInterface realmObjectSource = (MenuRealmProxyInterface) newObject;
        realmObjectTarget.realmSet$name(realmObjectSource.realmGet$name());
        realmObjectTarget.realmSet$desc(realmObjectSource.realmGet$desc());
        realmObjectTarget.realmSet$clubId(realmObjectSource.realmGet$clubId());
        realmObjectTarget.realmSet$valid(realmObjectSource.realmGet$valid());
        RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType> menuItemsByItemTypeList = realmObjectSource.realmGet$menuItemsByItemType();
        RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType> menuItemsByItemTypeRealmList = realmObjectTarget.realmGet$menuItemsByItemType();
        if (menuItemsByItemTypeList != null && menuItemsByItemTypeList.size() == menuItemsByItemTypeRealmList.size()) {
            // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
            int objects = menuItemsByItemTypeList.size();
            for (int i = 0; i < objects; i++) {
                com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType menuItemsByItemTypeItem = menuItemsByItemTypeList.get(i);
                com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType cachemenuItemsByItemType = (com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType) cache.get(menuItemsByItemTypeItem);
                if (cachemenuItemsByItemType != null) {
                    menuItemsByItemTypeRealmList.set(i, cachemenuItemsByItemType);
                } else {
                    menuItemsByItemTypeRealmList.set(i, MenuItemsByItemTypeRealmProxy.copyOrUpdate(realm, menuItemsByItemTypeItem, true, cache));
                }
            }
        } else {
            menuItemsByItemTypeRealmList.clear();
            if (menuItemsByItemTypeList != null) {
                for (int i = 0; i < menuItemsByItemTypeList.size(); i++) {
                    com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType menuItemsByItemTypeItem = menuItemsByItemTypeList.get(i);
                    com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType cachemenuItemsByItemType = (com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType) cache.get(menuItemsByItemTypeItem);
                    if (cachemenuItemsByItemType != null) {
                        menuItemsByItemTypeRealmList.add(cachemenuItemsByItemType);
                    } else {
                        menuItemsByItemTypeRealmList.add(MenuItemsByItemTypeRealmProxy.copyOrUpdate(realm, menuItemsByItemTypeItem, true, cache));
                    }
                }
            }
        }
        realmObjectTarget.realmSet$modifiedAt(realmObjectSource.realmGet$modifiedAt());
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("Menu = proxy[");
        stringBuilder.append("{menuId:");
        stringBuilder.append(realmGet$menuId() != null ? realmGet$menuId() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{name:");
        stringBuilder.append(realmGet$name() != null ? realmGet$name() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{desc:");
        stringBuilder.append(realmGet$desc() != null ? realmGet$desc() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{clubId:");
        stringBuilder.append(realmGet$clubId() != null ? realmGet$clubId() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{valid:");
        stringBuilder.append(realmGet$valid() != null ? realmGet$valid() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{menuItemsByItemType:");
        stringBuilder.append("RealmList<MenuItemsByItemType>[").append(realmGet$menuItemsByItemType().size()).append("]");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{modifiedAt:");
        stringBuilder.append(realmGet$modifiedAt() != null ? realmGet$modifiedAt() : "null");
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
        MenuRealmProxy aMenu = (MenuRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aMenu.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aMenu.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aMenu.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
