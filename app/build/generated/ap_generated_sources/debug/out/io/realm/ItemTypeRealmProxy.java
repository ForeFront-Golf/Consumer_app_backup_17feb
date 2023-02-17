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
public class ItemTypeRealmProxy extends com.rhinodesktop.foreorder_golf_consumer1.models.ItemType
    implements RealmObjectProxy, ItemTypeRealmProxyInterface {

    static final class ItemTypeColumnInfo extends ColumnInfo {
        long itemTypeIdIndex;
        long nameIndex;
        long descIndex;
        long modifiedAtIndex;

        ItemTypeColumnInfo(OsSchemaInfo schemaInfo) {
            super(4);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("ItemType");
            this.itemTypeIdIndex = addColumnDetails("itemTypeId", objectSchemaInfo);
            this.nameIndex = addColumnDetails("name", objectSchemaInfo);
            this.descIndex = addColumnDetails("desc", objectSchemaInfo);
            this.modifiedAtIndex = addColumnDetails("modifiedAt", objectSchemaInfo);
        }

        ItemTypeColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new ItemTypeColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final ItemTypeColumnInfo src = (ItemTypeColumnInfo) rawSrc;
            final ItemTypeColumnInfo dst = (ItemTypeColumnInfo) rawDst;
            dst.itemTypeIdIndex = src.itemTypeIdIndex;
            dst.nameIndex = src.nameIndex;
            dst.descIndex = src.descIndex;
            dst.modifiedAtIndex = src.modifiedAtIndex;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private static final List<String> FIELD_NAMES;
    static {
        List<String> fieldNames = new ArrayList<String>(4);
        fieldNames.add("itemTypeId");
        fieldNames.add("name");
        fieldNames.add("desc");
        fieldNames.add("modifiedAt");
        FIELD_NAMES = Collections.unmodifiableList(fieldNames);
    }

    private ItemTypeColumnInfo columnInfo;
    private ProxyState<com.rhinodesktop.foreorder_golf_consumer1.models.ItemType> proxyState;

    ItemTypeRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (ItemTypeColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.rhinodesktop.foreorder_golf_consumer1.models.ItemType>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public Integer realmGet$itemTypeId() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.itemTypeIdIndex)) {
            return null;
        }
        return (int) proxyState.getRow$realm().getLong(columnInfo.itemTypeIdIndex);
    }

    @Override
    public void realmSet$itemTypeId(Integer value) {
        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'itemTypeId' cannot be changed after object was created.");
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
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("ItemType", 4, 0);
        builder.addPersistedProperty("itemTypeId", RealmFieldType.INTEGER, Property.PRIMARY_KEY, Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("name", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("desc", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("modifiedAt", RealmFieldType.DATE, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static ItemTypeColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new ItemTypeColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "ItemType";
    }

    public static List<String> getFieldNames() {
        return FIELD_NAMES;
    }

    @SuppressWarnings("cast")
    public static com.rhinodesktop.foreorder_golf_consumer1.models.ItemType createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.rhinodesktop.foreorder_golf_consumer1.models.ItemType obj = null;
        if (update) {
            Table table = realm.getTable(com.rhinodesktop.foreorder_golf_consumer1.models.ItemType.class);
            ItemTypeColumnInfo columnInfo = (ItemTypeColumnInfo) realm.getSchema().getColumnInfo(com.rhinodesktop.foreorder_golf_consumer1.models.ItemType.class);
            long pkColumnIndex = columnInfo.itemTypeIdIndex;
            long rowIndex = Table.NO_MATCH;
            if (json.isNull("itemTypeId")) {
                rowIndex = table.findFirstNull(pkColumnIndex);
            } else {
                rowIndex = table.findFirstLong(pkColumnIndex, json.getLong("itemTypeId"));
            }
            if (rowIndex != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.rhinodesktop.foreorder_golf_consumer1.models.ItemType.class), false, Collections.<String> emptyList());
                    obj = new io.realm.ItemTypeRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("itemTypeId")) {
                if (json.isNull("itemTypeId")) {
                    obj = (io.realm.ItemTypeRealmProxy) realm.createObjectInternal(com.rhinodesktop.foreorder_golf_consumer1.models.ItemType.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.ItemTypeRealmProxy) realm.createObjectInternal(com.rhinodesktop.foreorder_golf_consumer1.models.ItemType.class, json.getInt("itemTypeId"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'itemTypeId'.");
            }
        }

        final ItemTypeRealmProxyInterface objProxy = (ItemTypeRealmProxyInterface) obj;
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
    public static com.rhinodesktop.foreorder_golf_consumer1.models.ItemType createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.rhinodesktop.foreorder_golf_consumer1.models.ItemType obj = new com.rhinodesktop.foreorder_golf_consumer1.models.ItemType();
        final ItemTypeRealmProxyInterface objProxy = (ItemTypeRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("itemTypeId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$itemTypeId((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$itemTypeId(null);
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
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'itemTypeId'.");
        }
        return realm.copyToRealm(obj);
    }

    public static com.rhinodesktop.foreorder_golf_consumer1.models.ItemType copyOrUpdate(Realm realm, com.rhinodesktop.foreorder_golf_consumer1.models.ItemType object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
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
            return (com.rhinodesktop.foreorder_golf_consumer1.models.ItemType) cachedRealmObject;
        }

        com.rhinodesktop.foreorder_golf_consumer1.models.ItemType realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.rhinodesktop.foreorder_golf_consumer1.models.ItemType.class);
            ItemTypeColumnInfo columnInfo = (ItemTypeColumnInfo) realm.getSchema().getColumnInfo(com.rhinodesktop.foreorder_golf_consumer1.models.ItemType.class);
            long pkColumnIndex = columnInfo.itemTypeIdIndex;
            Number value = ((ItemTypeRealmProxyInterface) object).realmGet$itemTypeId();
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
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.rhinodesktop.foreorder_golf_consumer1.models.ItemType.class), false, Collections.<String> emptyList());
                    realmObject = new io.realm.ItemTypeRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, realmObject, object, cache) : copy(realm, object, update, cache);
    }

    public static com.rhinodesktop.foreorder_golf_consumer1.models.ItemType copy(Realm realm, com.rhinodesktop.foreorder_golf_consumer1.models.ItemType newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.rhinodesktop.foreorder_golf_consumer1.models.ItemType) cachedRealmObject;
        }

        // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
        com.rhinodesktop.foreorder_golf_consumer1.models.ItemType realmObject = realm.createObjectInternal(com.rhinodesktop.foreorder_golf_consumer1.models.ItemType.class, ((ItemTypeRealmProxyInterface) newObject).realmGet$itemTypeId(), false, Collections.<String>emptyList());
        cache.put(newObject, (RealmObjectProxy) realmObject);

        ItemTypeRealmProxyInterface realmObjectSource = (ItemTypeRealmProxyInterface) newObject;
        ItemTypeRealmProxyInterface realmObjectCopy = (ItemTypeRealmProxyInterface) realmObject;

        realmObjectCopy.realmSet$name(realmObjectSource.realmGet$name());
        realmObjectCopy.realmSet$desc(realmObjectSource.realmGet$desc());
        realmObjectCopy.realmSet$modifiedAt(realmObjectSource.realmGet$modifiedAt());
        return realmObject;
    }

    public static long insert(Realm realm, com.rhinodesktop.foreorder_golf_consumer1.models.ItemType object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.rhinodesktop.foreorder_golf_consumer1.models.ItemType.class);
        long tableNativePtr = table.getNativePtr();
        ItemTypeColumnInfo columnInfo = (ItemTypeColumnInfo) realm.getSchema().getColumnInfo(com.rhinodesktop.foreorder_golf_consumer1.models.ItemType.class);
        long pkColumnIndex = columnInfo.itemTypeIdIndex;
        Object primaryKeyValue = ((ItemTypeRealmProxyInterface) object).realmGet$itemTypeId();
        long rowIndex = Table.NO_MATCH;
        if (primaryKeyValue == null) {
            rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
        } else {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((ItemTypeRealmProxyInterface) object).realmGet$itemTypeId());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((ItemTypeRealmProxyInterface) object).realmGet$itemTypeId());
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, rowIndex);
        String realmGet$name = ((ItemTypeRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
        }
        String realmGet$desc = ((ItemTypeRealmProxyInterface) object).realmGet$desc();
        if (realmGet$desc != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.descIndex, rowIndex, realmGet$desc, false);
        }
        java.util.Date realmGet$modifiedAt = ((ItemTypeRealmProxyInterface) object).realmGet$modifiedAt();
        if (realmGet$modifiedAt != null) {
            Table.nativeSetTimestamp(tableNativePtr, columnInfo.modifiedAtIndex, rowIndex, realmGet$modifiedAt.getTime(), false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.rhinodesktop.foreorder_golf_consumer1.models.ItemType.class);
        long tableNativePtr = table.getNativePtr();
        ItemTypeColumnInfo columnInfo = (ItemTypeColumnInfo) realm.getSchema().getColumnInfo(com.rhinodesktop.foreorder_golf_consumer1.models.ItemType.class);
        long pkColumnIndex = columnInfo.itemTypeIdIndex;
        com.rhinodesktop.foreorder_golf_consumer1.models.ItemType object = null;
        while (objects.hasNext()) {
            object = (com.rhinodesktop.foreorder_golf_consumer1.models.ItemType) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            Object primaryKeyValue = ((ItemTypeRealmProxyInterface) object).realmGet$itemTypeId();
            long rowIndex = Table.NO_MATCH;
            if (primaryKeyValue == null) {
                rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
            } else {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((ItemTypeRealmProxyInterface) object).realmGet$itemTypeId());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((ItemTypeRealmProxyInterface) object).realmGet$itemTypeId());
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, rowIndex);
            String realmGet$name = ((ItemTypeRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
            }
            String realmGet$desc = ((ItemTypeRealmProxyInterface) object).realmGet$desc();
            if (realmGet$desc != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.descIndex, rowIndex, realmGet$desc, false);
            }
            java.util.Date realmGet$modifiedAt = ((ItemTypeRealmProxyInterface) object).realmGet$modifiedAt();
            if (realmGet$modifiedAt != null) {
                Table.nativeSetTimestamp(tableNativePtr, columnInfo.modifiedAtIndex, rowIndex, realmGet$modifiedAt.getTime(), false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.rhinodesktop.foreorder_golf_consumer1.models.ItemType object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.rhinodesktop.foreorder_golf_consumer1.models.ItemType.class);
        long tableNativePtr = table.getNativePtr();
        ItemTypeColumnInfo columnInfo = (ItemTypeColumnInfo) realm.getSchema().getColumnInfo(com.rhinodesktop.foreorder_golf_consumer1.models.ItemType.class);
        long pkColumnIndex = columnInfo.itemTypeIdIndex;
        Object primaryKeyValue = ((ItemTypeRealmProxyInterface) object).realmGet$itemTypeId();
        long rowIndex = Table.NO_MATCH;
        if (primaryKeyValue == null) {
            rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
        } else {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((ItemTypeRealmProxyInterface) object).realmGet$itemTypeId());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((ItemTypeRealmProxyInterface) object).realmGet$itemTypeId());
        }
        cache.put(object, rowIndex);
        String realmGet$name = ((ItemTypeRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.nameIndex, rowIndex, false);
        }
        String realmGet$desc = ((ItemTypeRealmProxyInterface) object).realmGet$desc();
        if (realmGet$desc != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.descIndex, rowIndex, realmGet$desc, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.descIndex, rowIndex, false);
        }
        java.util.Date realmGet$modifiedAt = ((ItemTypeRealmProxyInterface) object).realmGet$modifiedAt();
        if (realmGet$modifiedAt != null) {
            Table.nativeSetTimestamp(tableNativePtr, columnInfo.modifiedAtIndex, rowIndex, realmGet$modifiedAt.getTime(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.modifiedAtIndex, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.rhinodesktop.foreorder_golf_consumer1.models.ItemType.class);
        long tableNativePtr = table.getNativePtr();
        ItemTypeColumnInfo columnInfo = (ItemTypeColumnInfo) realm.getSchema().getColumnInfo(com.rhinodesktop.foreorder_golf_consumer1.models.ItemType.class);
        long pkColumnIndex = columnInfo.itemTypeIdIndex;
        com.rhinodesktop.foreorder_golf_consumer1.models.ItemType object = null;
        while (objects.hasNext()) {
            object = (com.rhinodesktop.foreorder_golf_consumer1.models.ItemType) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            Object primaryKeyValue = ((ItemTypeRealmProxyInterface) object).realmGet$itemTypeId();
            long rowIndex = Table.NO_MATCH;
            if (primaryKeyValue == null) {
                rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
            } else {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((ItemTypeRealmProxyInterface) object).realmGet$itemTypeId());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((ItemTypeRealmProxyInterface) object).realmGet$itemTypeId());
            }
            cache.put(object, rowIndex);
            String realmGet$name = ((ItemTypeRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.nameIndex, rowIndex, false);
            }
            String realmGet$desc = ((ItemTypeRealmProxyInterface) object).realmGet$desc();
            if (realmGet$desc != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.descIndex, rowIndex, realmGet$desc, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.descIndex, rowIndex, false);
            }
            java.util.Date realmGet$modifiedAt = ((ItemTypeRealmProxyInterface) object).realmGet$modifiedAt();
            if (realmGet$modifiedAt != null) {
                Table.nativeSetTimestamp(tableNativePtr, columnInfo.modifiedAtIndex, rowIndex, realmGet$modifiedAt.getTime(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.modifiedAtIndex, rowIndex, false);
            }
        }
    }

    public static com.rhinodesktop.foreorder_golf_consumer1.models.ItemType createDetachedCopy(com.rhinodesktop.foreorder_golf_consumer1.models.ItemType realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.rhinodesktop.foreorder_golf_consumer1.models.ItemType unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.rhinodesktop.foreorder_golf_consumer1.models.ItemType();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.rhinodesktop.foreorder_golf_consumer1.models.ItemType) cachedObject.object;
            }
            unmanagedObject = (com.rhinodesktop.foreorder_golf_consumer1.models.ItemType) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        ItemTypeRealmProxyInterface unmanagedCopy = (ItemTypeRealmProxyInterface) unmanagedObject;
        ItemTypeRealmProxyInterface realmSource = (ItemTypeRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$itemTypeId(realmSource.realmGet$itemTypeId());
        unmanagedCopy.realmSet$name(realmSource.realmGet$name());
        unmanagedCopy.realmSet$desc(realmSource.realmGet$desc());
        unmanagedCopy.realmSet$modifiedAt(realmSource.realmGet$modifiedAt());

        return unmanagedObject;
    }

    static com.rhinodesktop.foreorder_golf_consumer1.models.ItemType update(Realm realm, com.rhinodesktop.foreorder_golf_consumer1.models.ItemType realmObject, com.rhinodesktop.foreorder_golf_consumer1.models.ItemType newObject, Map<RealmModel, RealmObjectProxy> cache) {
        ItemTypeRealmProxyInterface realmObjectTarget = (ItemTypeRealmProxyInterface) realmObject;
        ItemTypeRealmProxyInterface realmObjectSource = (ItemTypeRealmProxyInterface) newObject;
        realmObjectTarget.realmSet$name(realmObjectSource.realmGet$name());
        realmObjectTarget.realmSet$desc(realmObjectSource.realmGet$desc());
        realmObjectTarget.realmSet$modifiedAt(realmObjectSource.realmGet$modifiedAt());
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("ItemType = proxy[");
        stringBuilder.append("{itemTypeId:");
        stringBuilder.append(realmGet$itemTypeId() != null ? realmGet$itemTypeId() : "null");
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
        ItemTypeRealmProxy aItemType = (ItemTypeRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aItemType.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aItemType.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aItemType.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
