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
public class OptionGroupRealmProxy extends com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup
    implements RealmObjectProxy, OptionGroupRealmProxyInterface {

    static final class OptionGroupColumnInfo extends ColumnInfo {
        long optionGroupIdIndex;
        long singleChoiceIndex;
        long validIndex;
        long nameIndex;
        long descIndex;
        long requiredIndex;
        long optionItemsIndex;
        long modifiedAtIndex;

        OptionGroupColumnInfo(OsSchemaInfo schemaInfo) {
            super(8);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("OptionGroup");
            this.optionGroupIdIndex = addColumnDetails("optionGroupId", objectSchemaInfo);
            this.singleChoiceIndex = addColumnDetails("singleChoice", objectSchemaInfo);
            this.validIndex = addColumnDetails("valid", objectSchemaInfo);
            this.nameIndex = addColumnDetails("name", objectSchemaInfo);
            this.descIndex = addColumnDetails("desc", objectSchemaInfo);
            this.requiredIndex = addColumnDetails("required", objectSchemaInfo);
            this.optionItemsIndex = addColumnDetails("optionItems", objectSchemaInfo);
            this.modifiedAtIndex = addColumnDetails("modifiedAt", objectSchemaInfo);
        }

        OptionGroupColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new OptionGroupColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final OptionGroupColumnInfo src = (OptionGroupColumnInfo) rawSrc;
            final OptionGroupColumnInfo dst = (OptionGroupColumnInfo) rawDst;
            dst.optionGroupIdIndex = src.optionGroupIdIndex;
            dst.singleChoiceIndex = src.singleChoiceIndex;
            dst.validIndex = src.validIndex;
            dst.nameIndex = src.nameIndex;
            dst.descIndex = src.descIndex;
            dst.requiredIndex = src.requiredIndex;
            dst.optionItemsIndex = src.optionItemsIndex;
            dst.modifiedAtIndex = src.modifiedAtIndex;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private static final List<String> FIELD_NAMES;
    static {
        List<String> fieldNames = new ArrayList<String>(8);
        fieldNames.add("optionGroupId");
        fieldNames.add("singleChoice");
        fieldNames.add("valid");
        fieldNames.add("name");
        fieldNames.add("desc");
        fieldNames.add("required");
        fieldNames.add("optionItems");
        fieldNames.add("modifiedAt");
        FIELD_NAMES = Collections.unmodifiableList(fieldNames);
    }

    private OptionGroupColumnInfo columnInfo;
    private ProxyState<com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup> proxyState;
    private RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.OptionItem> optionItemsRealmList;

    OptionGroupRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (OptionGroupColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public Integer realmGet$optionGroupId() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.optionGroupIdIndex)) {
            return null;
        }
        return (int) proxyState.getRow$realm().getLong(columnInfo.optionGroupIdIndex);
    }

    @Override
    public void realmSet$optionGroupId(Integer value) {
        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'optionGroupId' cannot be changed after object was created.");
    }

    @Override
    @SuppressWarnings("cast")
    public Boolean realmGet$singleChoice() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.singleChoiceIndex)) {
            return null;
        }
        return (boolean) proxyState.getRow$realm().getBoolean(columnInfo.singleChoiceIndex);
    }

    @Override
    public void realmSet$singleChoice(Boolean value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.singleChoiceIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setBoolean(columnInfo.singleChoiceIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.singleChoiceIndex);
            return;
        }
        proxyState.getRow$realm().setBoolean(columnInfo.singleChoiceIndex, value);
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
    public Boolean realmGet$required() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.requiredIndex)) {
            return null;
        }
        return (boolean) proxyState.getRow$realm().getBoolean(columnInfo.requiredIndex);
    }

    @Override
    public void realmSet$required(Boolean value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.requiredIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setBoolean(columnInfo.requiredIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.requiredIndex);
            return;
        }
        proxyState.getRow$realm().setBoolean(columnInfo.requiredIndex, value);
    }

    @Override
    public RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.OptionItem> realmGet$optionItems() {
        proxyState.getRealm$realm().checkIfValid();
        // use the cached value if available
        if (optionItemsRealmList != null) {
            return optionItemsRealmList;
        } else {
            OsList osList = proxyState.getRow$realm().getModelList(columnInfo.optionItemsIndex);
            optionItemsRealmList = new RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.OptionItem>(com.rhinodesktop.foreorder_golf_consumer1.models.OptionItem.class, osList, proxyState.getRealm$realm());
            return optionItemsRealmList;
        }
    }

    @Override
    public void realmSet$optionItems(RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.OptionItem> value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("optionItems")) {
                return;
            }
            // if the list contains unmanaged RealmObjects, convert them to managed.
            if (value != null && !value.isManaged()) {
                final Realm realm = (Realm) proxyState.getRealm$realm();
                final RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.OptionItem> original = value;
                value = new RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.OptionItem>();
                for (com.rhinodesktop.foreorder_golf_consumer1.models.OptionItem item : original) {
                    if (item == null || RealmObject.isManaged(item)) {
                        value.add(item);
                    } else {
                        value.add(realm.copyToRealm(item));
                    }
                }
            }
        }

        proxyState.getRealm$realm().checkIfValid();
        OsList osList = proxyState.getRow$realm().getModelList(columnInfo.optionItemsIndex);
        // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
        if (value != null && value.size() == osList.size()) {
            int objects = value.size();
            for (int i = 0; i < objects; i++) {
                com.rhinodesktop.foreorder_golf_consumer1.models.OptionItem linkedObject = value.get(i);
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
                com.rhinodesktop.foreorder_golf_consumer1.models.OptionItem linkedObject = value.get(i);
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
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("OptionGroup", 8, 0);
        builder.addPersistedProperty("optionGroupId", RealmFieldType.INTEGER, Property.PRIMARY_KEY, Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("singleChoice", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("valid", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("name", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("desc", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("required", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedLinkProperty("optionItems", RealmFieldType.LIST, "OptionItem");
        builder.addPersistedProperty("modifiedAt", RealmFieldType.DATE, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static OptionGroupColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new OptionGroupColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "OptionGroup";
    }

    public static List<String> getFieldNames() {
        return FIELD_NAMES;
    }

    @SuppressWarnings("cast")
    public static com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = new ArrayList<String>(1);
        com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup obj = null;
        if (update) {
            Table table = realm.getTable(com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup.class);
            OptionGroupColumnInfo columnInfo = (OptionGroupColumnInfo) realm.getSchema().getColumnInfo(com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup.class);
            long pkColumnIndex = columnInfo.optionGroupIdIndex;
            long rowIndex = Table.NO_MATCH;
            if (json.isNull("optionGroupId")) {
                rowIndex = table.findFirstNull(pkColumnIndex);
            } else {
                rowIndex = table.findFirstLong(pkColumnIndex, json.getLong("optionGroupId"));
            }
            if (rowIndex != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup.class), false, Collections.<String> emptyList());
                    obj = new io.realm.OptionGroupRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("optionItems")) {
                excludeFields.add("optionItems");
            }
            if (json.has("optionGroupId")) {
                if (json.isNull("optionGroupId")) {
                    obj = (io.realm.OptionGroupRealmProxy) realm.createObjectInternal(com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.OptionGroupRealmProxy) realm.createObjectInternal(com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup.class, json.getInt("optionGroupId"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'optionGroupId'.");
            }
        }

        final OptionGroupRealmProxyInterface objProxy = (OptionGroupRealmProxyInterface) obj;
        if (json.has("singleChoice")) {
            if (json.isNull("singleChoice")) {
                objProxy.realmSet$singleChoice(null);
            } else {
                objProxy.realmSet$singleChoice((boolean) json.getBoolean("singleChoice"));
            }
        }
        if (json.has("valid")) {
            if (json.isNull("valid")) {
                objProxy.realmSet$valid(null);
            } else {
                objProxy.realmSet$valid((boolean) json.getBoolean("valid"));
            }
        }
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
        if (json.has("required")) {
            if (json.isNull("required")) {
                objProxy.realmSet$required(null);
            } else {
                objProxy.realmSet$required((boolean) json.getBoolean("required"));
            }
        }
        if (json.has("optionItems")) {
            if (json.isNull("optionItems")) {
                objProxy.realmSet$optionItems(null);
            } else {
                objProxy.realmGet$optionItems().clear();
                JSONArray array = json.getJSONArray("optionItems");
                for (int i = 0; i < array.length(); i++) {
                    com.rhinodesktop.foreorder_golf_consumer1.models.OptionItem item = OptionItemRealmProxy.createOrUpdateUsingJsonObject(realm, array.getJSONObject(i), update);
                    objProxy.realmGet$optionItems().add(item);
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
    public static com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup obj = new com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup();
        final OptionGroupRealmProxyInterface objProxy = (OptionGroupRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("optionGroupId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$optionGroupId((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$optionGroupId(null);
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("singleChoice")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$singleChoice((boolean) reader.nextBoolean());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$singleChoice(null);
                }
            } else if (name.equals("valid")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$valid((boolean) reader.nextBoolean());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$valid(null);
                }
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
            } else if (name.equals("required")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$required((boolean) reader.nextBoolean());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$required(null);
                }
            } else if (name.equals("optionItems")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$optionItems(null);
                } else {
                    objProxy.realmSet$optionItems(new RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.OptionItem>());
                    reader.beginArray();
                    while (reader.hasNext()) {
                        com.rhinodesktop.foreorder_golf_consumer1.models.OptionItem item = OptionItemRealmProxy.createUsingJsonStream(realm, reader);
                        objProxy.realmGet$optionItems().add(item);
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
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'optionGroupId'.");
        }
        return realm.copyToRealm(obj);
    }

    public static com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup copyOrUpdate(Realm realm, com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
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
            return (com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup) cachedRealmObject;
        }

        com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup.class);
            OptionGroupColumnInfo columnInfo = (OptionGroupColumnInfo) realm.getSchema().getColumnInfo(com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup.class);
            long pkColumnIndex = columnInfo.optionGroupIdIndex;
            Number value = ((OptionGroupRealmProxyInterface) object).realmGet$optionGroupId();
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
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup.class), false, Collections.<String> emptyList());
                    realmObject = new io.realm.OptionGroupRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, realmObject, object, cache) : copy(realm, object, update, cache);
    }

    public static com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup copy(Realm realm, com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup) cachedRealmObject;
        }

        // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
        com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup realmObject = realm.createObjectInternal(com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup.class, ((OptionGroupRealmProxyInterface) newObject).realmGet$optionGroupId(), false, Collections.<String>emptyList());
        cache.put(newObject, (RealmObjectProxy) realmObject);

        OptionGroupRealmProxyInterface realmObjectSource = (OptionGroupRealmProxyInterface) newObject;
        OptionGroupRealmProxyInterface realmObjectCopy = (OptionGroupRealmProxyInterface) realmObject;

        realmObjectCopy.realmSet$singleChoice(realmObjectSource.realmGet$singleChoice());
        realmObjectCopy.realmSet$valid(realmObjectSource.realmGet$valid());
        realmObjectCopy.realmSet$name(realmObjectSource.realmGet$name());
        realmObjectCopy.realmSet$desc(realmObjectSource.realmGet$desc());
        realmObjectCopy.realmSet$required(realmObjectSource.realmGet$required());

        RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.OptionItem> optionItemsList = realmObjectSource.realmGet$optionItems();
        if (optionItemsList != null) {
            RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.OptionItem> optionItemsRealmList = realmObjectCopy.realmGet$optionItems();
            optionItemsRealmList.clear();
            for (int i = 0; i < optionItemsList.size(); i++) {
                com.rhinodesktop.foreorder_golf_consumer1.models.OptionItem optionItemsItem = optionItemsList.get(i);
                com.rhinodesktop.foreorder_golf_consumer1.models.OptionItem cacheoptionItems = (com.rhinodesktop.foreorder_golf_consumer1.models.OptionItem) cache.get(optionItemsItem);
                if (cacheoptionItems != null) {
                    optionItemsRealmList.add(cacheoptionItems);
                } else {
                    optionItemsRealmList.add(OptionItemRealmProxy.copyOrUpdate(realm, optionItemsItem, update, cache));
                }
            }
        }

        realmObjectCopy.realmSet$modifiedAt(realmObjectSource.realmGet$modifiedAt());
        return realmObject;
    }

    public static long insert(Realm realm, com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup.class);
        long tableNativePtr = table.getNativePtr();
        OptionGroupColumnInfo columnInfo = (OptionGroupColumnInfo) realm.getSchema().getColumnInfo(com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup.class);
        long pkColumnIndex = columnInfo.optionGroupIdIndex;
        Object primaryKeyValue = ((OptionGroupRealmProxyInterface) object).realmGet$optionGroupId();
        long rowIndex = Table.NO_MATCH;
        if (primaryKeyValue == null) {
            rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
        } else {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((OptionGroupRealmProxyInterface) object).realmGet$optionGroupId());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((OptionGroupRealmProxyInterface) object).realmGet$optionGroupId());
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, rowIndex);
        Boolean realmGet$singleChoice = ((OptionGroupRealmProxyInterface) object).realmGet$singleChoice();
        if (realmGet$singleChoice != null) {
            Table.nativeSetBoolean(tableNativePtr, columnInfo.singleChoiceIndex, rowIndex, realmGet$singleChoice, false);
        }
        Boolean realmGet$valid = ((OptionGroupRealmProxyInterface) object).realmGet$valid();
        if (realmGet$valid != null) {
            Table.nativeSetBoolean(tableNativePtr, columnInfo.validIndex, rowIndex, realmGet$valid, false);
        }
        String realmGet$name = ((OptionGroupRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
        }
        String realmGet$desc = ((OptionGroupRealmProxyInterface) object).realmGet$desc();
        if (realmGet$desc != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.descIndex, rowIndex, realmGet$desc, false);
        }
        Boolean realmGet$required = ((OptionGroupRealmProxyInterface) object).realmGet$required();
        if (realmGet$required != null) {
            Table.nativeSetBoolean(tableNativePtr, columnInfo.requiredIndex, rowIndex, realmGet$required, false);
        }

        RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.OptionItem> optionItemsList = ((OptionGroupRealmProxyInterface) object).realmGet$optionItems();
        if (optionItemsList != null) {
            OsList optionItemsOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.optionItemsIndex);
            for (com.rhinodesktop.foreorder_golf_consumer1.models.OptionItem optionItemsItem : optionItemsList) {
                Long cacheItemIndexoptionItems = cache.get(optionItemsItem);
                if (cacheItemIndexoptionItems == null) {
                    cacheItemIndexoptionItems = OptionItemRealmProxy.insert(realm, optionItemsItem, cache);
                }
                optionItemsOsList.addRow(cacheItemIndexoptionItems);
            }
        }
        java.util.Date realmGet$modifiedAt = ((OptionGroupRealmProxyInterface) object).realmGet$modifiedAt();
        if (realmGet$modifiedAt != null) {
            Table.nativeSetTimestamp(tableNativePtr, columnInfo.modifiedAtIndex, rowIndex, realmGet$modifiedAt.getTime(), false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup.class);
        long tableNativePtr = table.getNativePtr();
        OptionGroupColumnInfo columnInfo = (OptionGroupColumnInfo) realm.getSchema().getColumnInfo(com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup.class);
        long pkColumnIndex = columnInfo.optionGroupIdIndex;
        com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup object = null;
        while (objects.hasNext()) {
            object = (com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            Object primaryKeyValue = ((OptionGroupRealmProxyInterface) object).realmGet$optionGroupId();
            long rowIndex = Table.NO_MATCH;
            if (primaryKeyValue == null) {
                rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
            } else {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((OptionGroupRealmProxyInterface) object).realmGet$optionGroupId());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((OptionGroupRealmProxyInterface) object).realmGet$optionGroupId());
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, rowIndex);
            Boolean realmGet$singleChoice = ((OptionGroupRealmProxyInterface) object).realmGet$singleChoice();
            if (realmGet$singleChoice != null) {
                Table.nativeSetBoolean(tableNativePtr, columnInfo.singleChoiceIndex, rowIndex, realmGet$singleChoice, false);
            }
            Boolean realmGet$valid = ((OptionGroupRealmProxyInterface) object).realmGet$valid();
            if (realmGet$valid != null) {
                Table.nativeSetBoolean(tableNativePtr, columnInfo.validIndex, rowIndex, realmGet$valid, false);
            }
            String realmGet$name = ((OptionGroupRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
            }
            String realmGet$desc = ((OptionGroupRealmProxyInterface) object).realmGet$desc();
            if (realmGet$desc != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.descIndex, rowIndex, realmGet$desc, false);
            }
            Boolean realmGet$required = ((OptionGroupRealmProxyInterface) object).realmGet$required();
            if (realmGet$required != null) {
                Table.nativeSetBoolean(tableNativePtr, columnInfo.requiredIndex, rowIndex, realmGet$required, false);
            }

            RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.OptionItem> optionItemsList = ((OptionGroupRealmProxyInterface) object).realmGet$optionItems();
            if (optionItemsList != null) {
                OsList optionItemsOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.optionItemsIndex);
                for (com.rhinodesktop.foreorder_golf_consumer1.models.OptionItem optionItemsItem : optionItemsList) {
                    Long cacheItemIndexoptionItems = cache.get(optionItemsItem);
                    if (cacheItemIndexoptionItems == null) {
                        cacheItemIndexoptionItems = OptionItemRealmProxy.insert(realm, optionItemsItem, cache);
                    }
                    optionItemsOsList.addRow(cacheItemIndexoptionItems);
                }
            }
            java.util.Date realmGet$modifiedAt = ((OptionGroupRealmProxyInterface) object).realmGet$modifiedAt();
            if (realmGet$modifiedAt != null) {
                Table.nativeSetTimestamp(tableNativePtr, columnInfo.modifiedAtIndex, rowIndex, realmGet$modifiedAt.getTime(), false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup.class);
        long tableNativePtr = table.getNativePtr();
        OptionGroupColumnInfo columnInfo = (OptionGroupColumnInfo) realm.getSchema().getColumnInfo(com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup.class);
        long pkColumnIndex = columnInfo.optionGroupIdIndex;
        Object primaryKeyValue = ((OptionGroupRealmProxyInterface) object).realmGet$optionGroupId();
        long rowIndex = Table.NO_MATCH;
        if (primaryKeyValue == null) {
            rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
        } else {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((OptionGroupRealmProxyInterface) object).realmGet$optionGroupId());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((OptionGroupRealmProxyInterface) object).realmGet$optionGroupId());
        }
        cache.put(object, rowIndex);
        Boolean realmGet$singleChoice = ((OptionGroupRealmProxyInterface) object).realmGet$singleChoice();
        if (realmGet$singleChoice != null) {
            Table.nativeSetBoolean(tableNativePtr, columnInfo.singleChoiceIndex, rowIndex, realmGet$singleChoice, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.singleChoiceIndex, rowIndex, false);
        }
        Boolean realmGet$valid = ((OptionGroupRealmProxyInterface) object).realmGet$valid();
        if (realmGet$valid != null) {
            Table.nativeSetBoolean(tableNativePtr, columnInfo.validIndex, rowIndex, realmGet$valid, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.validIndex, rowIndex, false);
        }
        String realmGet$name = ((OptionGroupRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.nameIndex, rowIndex, false);
        }
        String realmGet$desc = ((OptionGroupRealmProxyInterface) object).realmGet$desc();
        if (realmGet$desc != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.descIndex, rowIndex, realmGet$desc, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.descIndex, rowIndex, false);
        }
        Boolean realmGet$required = ((OptionGroupRealmProxyInterface) object).realmGet$required();
        if (realmGet$required != null) {
            Table.nativeSetBoolean(tableNativePtr, columnInfo.requiredIndex, rowIndex, realmGet$required, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.requiredIndex, rowIndex, false);
        }

        OsList optionItemsOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.optionItemsIndex);
        RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.OptionItem> optionItemsList = ((OptionGroupRealmProxyInterface) object).realmGet$optionItems();
        if (optionItemsList != null && optionItemsList.size() == optionItemsOsList.size()) {
            // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
            int objects = optionItemsList.size();
            for (int i = 0; i < objects; i++) {
                com.rhinodesktop.foreorder_golf_consumer1.models.OptionItem optionItemsItem = optionItemsList.get(i);
                Long cacheItemIndexoptionItems = cache.get(optionItemsItem);
                if (cacheItemIndexoptionItems == null) {
                    cacheItemIndexoptionItems = OptionItemRealmProxy.insertOrUpdate(realm, optionItemsItem, cache);
                }
                optionItemsOsList.setRow(i, cacheItemIndexoptionItems);
            }
        } else {
            optionItemsOsList.removeAll();
            if (optionItemsList != null) {
                for (com.rhinodesktop.foreorder_golf_consumer1.models.OptionItem optionItemsItem : optionItemsList) {
                    Long cacheItemIndexoptionItems = cache.get(optionItemsItem);
                    if (cacheItemIndexoptionItems == null) {
                        cacheItemIndexoptionItems = OptionItemRealmProxy.insertOrUpdate(realm, optionItemsItem, cache);
                    }
                    optionItemsOsList.addRow(cacheItemIndexoptionItems);
                }
            }
        }

        java.util.Date realmGet$modifiedAt = ((OptionGroupRealmProxyInterface) object).realmGet$modifiedAt();
        if (realmGet$modifiedAt != null) {
            Table.nativeSetTimestamp(tableNativePtr, columnInfo.modifiedAtIndex, rowIndex, realmGet$modifiedAt.getTime(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.modifiedAtIndex, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup.class);
        long tableNativePtr = table.getNativePtr();
        OptionGroupColumnInfo columnInfo = (OptionGroupColumnInfo) realm.getSchema().getColumnInfo(com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup.class);
        long pkColumnIndex = columnInfo.optionGroupIdIndex;
        com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup object = null;
        while (objects.hasNext()) {
            object = (com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            Object primaryKeyValue = ((OptionGroupRealmProxyInterface) object).realmGet$optionGroupId();
            long rowIndex = Table.NO_MATCH;
            if (primaryKeyValue == null) {
                rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
            } else {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((OptionGroupRealmProxyInterface) object).realmGet$optionGroupId());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((OptionGroupRealmProxyInterface) object).realmGet$optionGroupId());
            }
            cache.put(object, rowIndex);
            Boolean realmGet$singleChoice = ((OptionGroupRealmProxyInterface) object).realmGet$singleChoice();
            if (realmGet$singleChoice != null) {
                Table.nativeSetBoolean(tableNativePtr, columnInfo.singleChoiceIndex, rowIndex, realmGet$singleChoice, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.singleChoiceIndex, rowIndex, false);
            }
            Boolean realmGet$valid = ((OptionGroupRealmProxyInterface) object).realmGet$valid();
            if (realmGet$valid != null) {
                Table.nativeSetBoolean(tableNativePtr, columnInfo.validIndex, rowIndex, realmGet$valid, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.validIndex, rowIndex, false);
            }
            String realmGet$name = ((OptionGroupRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.nameIndex, rowIndex, false);
            }
            String realmGet$desc = ((OptionGroupRealmProxyInterface) object).realmGet$desc();
            if (realmGet$desc != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.descIndex, rowIndex, realmGet$desc, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.descIndex, rowIndex, false);
            }
            Boolean realmGet$required = ((OptionGroupRealmProxyInterface) object).realmGet$required();
            if (realmGet$required != null) {
                Table.nativeSetBoolean(tableNativePtr, columnInfo.requiredIndex, rowIndex, realmGet$required, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.requiredIndex, rowIndex, false);
            }

            OsList optionItemsOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.optionItemsIndex);
            RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.OptionItem> optionItemsList = ((OptionGroupRealmProxyInterface) object).realmGet$optionItems();
            if (optionItemsList != null && optionItemsList.size() == optionItemsOsList.size()) {
                // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
                int objectCount = optionItemsList.size();
                for (int i = 0; i < objectCount; i++) {
                    com.rhinodesktop.foreorder_golf_consumer1.models.OptionItem optionItemsItem = optionItemsList.get(i);
                    Long cacheItemIndexoptionItems = cache.get(optionItemsItem);
                    if (cacheItemIndexoptionItems == null) {
                        cacheItemIndexoptionItems = OptionItemRealmProxy.insertOrUpdate(realm, optionItemsItem, cache);
                    }
                    optionItemsOsList.setRow(i, cacheItemIndexoptionItems);
                }
            } else {
                optionItemsOsList.removeAll();
                if (optionItemsList != null) {
                    for (com.rhinodesktop.foreorder_golf_consumer1.models.OptionItem optionItemsItem : optionItemsList) {
                        Long cacheItemIndexoptionItems = cache.get(optionItemsItem);
                        if (cacheItemIndexoptionItems == null) {
                            cacheItemIndexoptionItems = OptionItemRealmProxy.insertOrUpdate(realm, optionItemsItem, cache);
                        }
                        optionItemsOsList.addRow(cacheItemIndexoptionItems);
                    }
                }
            }

            java.util.Date realmGet$modifiedAt = ((OptionGroupRealmProxyInterface) object).realmGet$modifiedAt();
            if (realmGet$modifiedAt != null) {
                Table.nativeSetTimestamp(tableNativePtr, columnInfo.modifiedAtIndex, rowIndex, realmGet$modifiedAt.getTime(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.modifiedAtIndex, rowIndex, false);
            }
        }
    }

    public static com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup createDetachedCopy(com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup) cachedObject.object;
            }
            unmanagedObject = (com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        OptionGroupRealmProxyInterface unmanagedCopy = (OptionGroupRealmProxyInterface) unmanagedObject;
        OptionGroupRealmProxyInterface realmSource = (OptionGroupRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$optionGroupId(realmSource.realmGet$optionGroupId());
        unmanagedCopy.realmSet$singleChoice(realmSource.realmGet$singleChoice());
        unmanagedCopy.realmSet$valid(realmSource.realmGet$valid());
        unmanagedCopy.realmSet$name(realmSource.realmGet$name());
        unmanagedCopy.realmSet$desc(realmSource.realmGet$desc());
        unmanagedCopy.realmSet$required(realmSource.realmGet$required());

        // Deep copy of optionItems
        if (currentDepth == maxDepth) {
            unmanagedCopy.realmSet$optionItems(null);
        } else {
            RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.OptionItem> managedoptionItemsList = realmSource.realmGet$optionItems();
            RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.OptionItem> unmanagedoptionItemsList = new RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.OptionItem>();
            unmanagedCopy.realmSet$optionItems(unmanagedoptionItemsList);
            int nextDepth = currentDepth + 1;
            int size = managedoptionItemsList.size();
            for (int i = 0; i < size; i++) {
                com.rhinodesktop.foreorder_golf_consumer1.models.OptionItem item = OptionItemRealmProxy.createDetachedCopy(managedoptionItemsList.get(i), nextDepth, maxDepth, cache);
                unmanagedoptionItemsList.add(item);
            }
        }
        unmanagedCopy.realmSet$modifiedAt(realmSource.realmGet$modifiedAt());

        return unmanagedObject;
    }

    static com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup update(Realm realm, com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup realmObject, com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup newObject, Map<RealmModel, RealmObjectProxy> cache) {
        OptionGroupRealmProxyInterface realmObjectTarget = (OptionGroupRealmProxyInterface) realmObject;
        OptionGroupRealmProxyInterface realmObjectSource = (OptionGroupRealmProxyInterface) newObject;
        realmObjectTarget.realmSet$singleChoice(realmObjectSource.realmGet$singleChoice());
        realmObjectTarget.realmSet$valid(realmObjectSource.realmGet$valid());
        realmObjectTarget.realmSet$name(realmObjectSource.realmGet$name());
        realmObjectTarget.realmSet$desc(realmObjectSource.realmGet$desc());
        realmObjectTarget.realmSet$required(realmObjectSource.realmGet$required());
        RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.OptionItem> optionItemsList = realmObjectSource.realmGet$optionItems();
        RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.OptionItem> optionItemsRealmList = realmObjectTarget.realmGet$optionItems();
        if (optionItemsList != null && optionItemsList.size() == optionItemsRealmList.size()) {
            // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
            int objects = optionItemsList.size();
            for (int i = 0; i < objects; i++) {
                com.rhinodesktop.foreorder_golf_consumer1.models.OptionItem optionItemsItem = optionItemsList.get(i);
                com.rhinodesktop.foreorder_golf_consumer1.models.OptionItem cacheoptionItems = (com.rhinodesktop.foreorder_golf_consumer1.models.OptionItem) cache.get(optionItemsItem);
                if (cacheoptionItems != null) {
                    optionItemsRealmList.set(i, cacheoptionItems);
                } else {
                    optionItemsRealmList.set(i, OptionItemRealmProxy.copyOrUpdate(realm, optionItemsItem, true, cache));
                }
            }
        } else {
            optionItemsRealmList.clear();
            if (optionItemsList != null) {
                for (int i = 0; i < optionItemsList.size(); i++) {
                    com.rhinodesktop.foreorder_golf_consumer1.models.OptionItem optionItemsItem = optionItemsList.get(i);
                    com.rhinodesktop.foreorder_golf_consumer1.models.OptionItem cacheoptionItems = (com.rhinodesktop.foreorder_golf_consumer1.models.OptionItem) cache.get(optionItemsItem);
                    if (cacheoptionItems != null) {
                        optionItemsRealmList.add(cacheoptionItems);
                    } else {
                        optionItemsRealmList.add(OptionItemRealmProxy.copyOrUpdate(realm, optionItemsItem, true, cache));
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
        StringBuilder stringBuilder = new StringBuilder("OptionGroup = proxy[");
        stringBuilder.append("{optionGroupId:");
        stringBuilder.append(realmGet$optionGroupId() != null ? realmGet$optionGroupId() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{singleChoice:");
        stringBuilder.append(realmGet$singleChoice() != null ? realmGet$singleChoice() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{valid:");
        stringBuilder.append(realmGet$valid() != null ? realmGet$valid() : "null");
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
        stringBuilder.append("{required:");
        stringBuilder.append(realmGet$required() != null ? realmGet$required() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{optionItems:");
        stringBuilder.append("RealmList<OptionItem>[").append(realmGet$optionItems().size()).append("]");
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
        OptionGroupRealmProxy aOptionGroup = (OptionGroupRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aOptionGroup.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aOptionGroup.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aOptionGroup.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
