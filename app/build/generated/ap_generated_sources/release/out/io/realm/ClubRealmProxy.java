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
public class ClubRealmProxy extends com.rhinodesktop.foreorder_golf_consumer1.models.Club
    implements RealmObjectProxy, ClubRealmProxyInterface {

    static final class ClubColumnInfo extends ColumnInfo {
        long clubIdIndex;
        long nameIndex;
        long phoneNumberIndex;
        long validIndex;
        long addressIndex;
        long latIndex;
        long lonIndex;
        long photoUrlIndex;
        long photoUrlThumbIndex;
        long modifiedAtIndex;
        long taxRateIndex;
        long showTaxIndex;
        long menusIndex;

        ClubColumnInfo(OsSchemaInfo schemaInfo) {
            super(13);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("Club");
            this.clubIdIndex = addColumnDetails("clubId", objectSchemaInfo);
            this.nameIndex = addColumnDetails("name", objectSchemaInfo);
            this.phoneNumberIndex = addColumnDetails("phoneNumber", objectSchemaInfo);
            this.validIndex = addColumnDetails("valid", objectSchemaInfo);
            this.addressIndex = addColumnDetails("address", objectSchemaInfo);
            this.latIndex = addColumnDetails("lat", objectSchemaInfo);
            this.lonIndex = addColumnDetails("lon", objectSchemaInfo);
            this.photoUrlIndex = addColumnDetails("photoUrl", objectSchemaInfo);
            this.photoUrlThumbIndex = addColumnDetails("photoUrlThumb", objectSchemaInfo);
            this.modifiedAtIndex = addColumnDetails("modifiedAt", objectSchemaInfo);
            this.taxRateIndex = addColumnDetails("taxRate", objectSchemaInfo);
            this.showTaxIndex = addColumnDetails("showTax", objectSchemaInfo);
            this.menusIndex = addColumnDetails("menus", objectSchemaInfo);
        }

        ClubColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new ClubColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final ClubColumnInfo src = (ClubColumnInfo) rawSrc;
            final ClubColumnInfo dst = (ClubColumnInfo) rawDst;
            dst.clubIdIndex = src.clubIdIndex;
            dst.nameIndex = src.nameIndex;
            dst.phoneNumberIndex = src.phoneNumberIndex;
            dst.validIndex = src.validIndex;
            dst.addressIndex = src.addressIndex;
            dst.latIndex = src.latIndex;
            dst.lonIndex = src.lonIndex;
            dst.photoUrlIndex = src.photoUrlIndex;
            dst.photoUrlThumbIndex = src.photoUrlThumbIndex;
            dst.modifiedAtIndex = src.modifiedAtIndex;
            dst.taxRateIndex = src.taxRateIndex;
            dst.showTaxIndex = src.showTaxIndex;
            dst.menusIndex = src.menusIndex;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private static final List<String> FIELD_NAMES;
    static {
        List<String> fieldNames = new ArrayList<String>(13);
        fieldNames.add("clubId");
        fieldNames.add("name");
        fieldNames.add("phoneNumber");
        fieldNames.add("valid");
        fieldNames.add("address");
        fieldNames.add("lat");
        fieldNames.add("lon");
        fieldNames.add("photoUrl");
        fieldNames.add("photoUrlThumb");
        fieldNames.add("modifiedAt");
        fieldNames.add("taxRate");
        fieldNames.add("showTax");
        fieldNames.add("menus");
        FIELD_NAMES = Collections.unmodifiableList(fieldNames);
    }

    private ClubColumnInfo columnInfo;
    private ProxyState<com.rhinodesktop.foreorder_golf_consumer1.models.Club> proxyState;
    private RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.Menu> menusRealmList;

    ClubRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (ClubColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.rhinodesktop.foreorder_golf_consumer1.models.Club>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
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
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'clubId' cannot be changed after object was created.");
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
    public String realmGet$phoneNumber() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phoneNumberIndex);
    }

    @Override
    public void realmSet$phoneNumber(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.phoneNumberIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phoneNumberIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phoneNumberIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phoneNumberIndex, value);
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
    public String realmGet$address() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.addressIndex);
    }

    @Override
    public void realmSet$address(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.addressIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.addressIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.addressIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.addressIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public Double realmGet$lat() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.latIndex)) {
            return null;
        }
        return (double) proxyState.getRow$realm().getDouble(columnInfo.latIndex);
    }

    @Override
    public void realmSet$lat(Double value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.latIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setDouble(columnInfo.latIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.latIndex);
            return;
        }
        proxyState.getRow$realm().setDouble(columnInfo.latIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public Double realmGet$lon() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.lonIndex)) {
            return null;
        }
        return (double) proxyState.getRow$realm().getDouble(columnInfo.lonIndex);
    }

    @Override
    public void realmSet$lon(Double value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.lonIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setDouble(columnInfo.lonIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.lonIndex);
            return;
        }
        proxyState.getRow$realm().setDouble(columnInfo.lonIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$photoUrl() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.photoUrlIndex);
    }

    @Override
    public void realmSet$photoUrl(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.photoUrlIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.photoUrlIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.photoUrlIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.photoUrlIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$photoUrlThumb() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.photoUrlThumbIndex);
    }

    @Override
    public void realmSet$photoUrlThumb(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.photoUrlThumbIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.photoUrlThumbIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.photoUrlThumbIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.photoUrlThumbIndex, value);
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

    @Override
    @SuppressWarnings("cast")
    public Double realmGet$taxRate() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.taxRateIndex)) {
            return null;
        }
        return (double) proxyState.getRow$realm().getDouble(columnInfo.taxRateIndex);
    }

    @Override
    public void realmSet$taxRate(Double value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.taxRateIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setDouble(columnInfo.taxRateIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.taxRateIndex);
            return;
        }
        proxyState.getRow$realm().setDouble(columnInfo.taxRateIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public Boolean realmGet$showTax() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.showTaxIndex)) {
            return null;
        }
        return (boolean) proxyState.getRow$realm().getBoolean(columnInfo.showTaxIndex);
    }

    @Override
    public void realmSet$showTax(Boolean value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.showTaxIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setBoolean(columnInfo.showTaxIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.showTaxIndex);
            return;
        }
        proxyState.getRow$realm().setBoolean(columnInfo.showTaxIndex, value);
    }

    @Override
    public RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.Menu> realmGet$menus() {
        proxyState.getRealm$realm().checkIfValid();
        // use the cached value if available
        if (menusRealmList != null) {
            return menusRealmList;
        } else {
            OsList osList = proxyState.getRow$realm().getModelList(columnInfo.menusIndex);
            menusRealmList = new RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.Menu>(com.rhinodesktop.foreorder_golf_consumer1.models.Menu.class, osList, proxyState.getRealm$realm());
            return menusRealmList;
        }
    }

    @Override
    public void realmSet$menus(RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.Menu> value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("menus")) {
                return;
            }
            // if the list contains unmanaged RealmObjects, convert them to managed.
            if (value != null && !value.isManaged()) {
                final Realm realm = (Realm) proxyState.getRealm$realm();
                final RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.Menu> original = value;
                value = new RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.Menu>();
                for (com.rhinodesktop.foreorder_golf_consumer1.models.Menu item : original) {
                    if (item == null || RealmObject.isManaged(item)) {
                        value.add(item);
                    } else {
                        value.add(realm.copyToRealm(item));
                    }
                }
            }
        }

        proxyState.getRealm$realm().checkIfValid();
        OsList osList = proxyState.getRow$realm().getModelList(columnInfo.menusIndex);
        // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
        if (value != null && value.size() == osList.size()) {
            int objects = value.size();
            for (int i = 0; i < objects; i++) {
                com.rhinodesktop.foreorder_golf_consumer1.models.Menu linkedObject = value.get(i);
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
                com.rhinodesktop.foreorder_golf_consumer1.models.Menu linkedObject = value.get(i);
                proxyState.checkValidObject(linkedObject);
                osList.addRow(((RealmObjectProxy) linkedObject).realmGet$proxyState().getRow$realm().getIndex());
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("Club", 13, 0);
        builder.addPersistedProperty("clubId", RealmFieldType.INTEGER, Property.PRIMARY_KEY, Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("name", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("phoneNumber", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("valid", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("address", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("lat", RealmFieldType.DOUBLE, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("lon", RealmFieldType.DOUBLE, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("photoUrl", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("photoUrlThumb", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("modifiedAt", RealmFieldType.DATE, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("taxRate", RealmFieldType.DOUBLE, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("showTax", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedLinkProperty("menus", RealmFieldType.LIST, "Menu");
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static ClubColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new ClubColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "Club";
    }

    public static List<String> getFieldNames() {
        return FIELD_NAMES;
    }

    @SuppressWarnings("cast")
    public static com.rhinodesktop.foreorder_golf_consumer1.models.Club createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = new ArrayList<String>(1);
        com.rhinodesktop.foreorder_golf_consumer1.models.Club obj = null;
        if (update) {
            Table table = realm.getTable(com.rhinodesktop.foreorder_golf_consumer1.models.Club.class);
            ClubColumnInfo columnInfo = (ClubColumnInfo) realm.getSchema().getColumnInfo(com.rhinodesktop.foreorder_golf_consumer1.models.Club.class);
            long pkColumnIndex = columnInfo.clubIdIndex;
            long rowIndex = Table.NO_MATCH;
            if (json.isNull("clubId")) {
                rowIndex = table.findFirstNull(pkColumnIndex);
            } else {
                rowIndex = table.findFirstLong(pkColumnIndex, json.getLong("clubId"));
            }
            if (rowIndex != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.rhinodesktop.foreorder_golf_consumer1.models.Club.class), false, Collections.<String> emptyList());
                    obj = new io.realm.ClubRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("menus")) {
                excludeFields.add("menus");
            }
            if (json.has("clubId")) {
                if (json.isNull("clubId")) {
                    obj = (io.realm.ClubRealmProxy) realm.createObjectInternal(com.rhinodesktop.foreorder_golf_consumer1.models.Club.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.ClubRealmProxy) realm.createObjectInternal(com.rhinodesktop.foreorder_golf_consumer1.models.Club.class, json.getInt("clubId"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'clubId'.");
            }
        }

        final ClubRealmProxyInterface objProxy = (ClubRealmProxyInterface) obj;
        if (json.has("name")) {
            if (json.isNull("name")) {
                objProxy.realmSet$name(null);
            } else {
                objProxy.realmSet$name((String) json.getString("name"));
            }
        }
        if (json.has("phoneNumber")) {
            if (json.isNull("phoneNumber")) {
                objProxy.realmSet$phoneNumber(null);
            } else {
                objProxy.realmSet$phoneNumber((String) json.getString("phoneNumber"));
            }
        }
        if (json.has("valid")) {
            if (json.isNull("valid")) {
                objProxy.realmSet$valid(null);
            } else {
                objProxy.realmSet$valid((boolean) json.getBoolean("valid"));
            }
        }
        if (json.has("address")) {
            if (json.isNull("address")) {
                objProxy.realmSet$address(null);
            } else {
                objProxy.realmSet$address((String) json.getString("address"));
            }
        }
        if (json.has("lat")) {
            if (json.isNull("lat")) {
                objProxy.realmSet$lat(null);
            } else {
                objProxy.realmSet$lat((double) json.getDouble("lat"));
            }
        }
        if (json.has("lon")) {
            if (json.isNull("lon")) {
                objProxy.realmSet$lon(null);
            } else {
                objProxy.realmSet$lon((double) json.getDouble("lon"));
            }
        }
        if (json.has("photoUrl")) {
            if (json.isNull("photoUrl")) {
                objProxy.realmSet$photoUrl(null);
            } else {
                objProxy.realmSet$photoUrl((String) json.getString("photoUrl"));
            }
        }
        if (json.has("photoUrlThumb")) {
            if (json.isNull("photoUrlThumb")) {
                objProxy.realmSet$photoUrlThumb(null);
            } else {
                objProxy.realmSet$photoUrlThumb((String) json.getString("photoUrlThumb"));
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
        if (json.has("taxRate")) {
            if (json.isNull("taxRate")) {
                objProxy.realmSet$taxRate(null);
            } else {
                objProxy.realmSet$taxRate((double) json.getDouble("taxRate"));
            }
        }
        if (json.has("showTax")) {
            if (json.isNull("showTax")) {
                objProxy.realmSet$showTax(null);
            } else {
                objProxy.realmSet$showTax((boolean) json.getBoolean("showTax"));
            }
        }
        if (json.has("menus")) {
            if (json.isNull("menus")) {
                objProxy.realmSet$menus(null);
            } else {
                objProxy.realmGet$menus().clear();
                JSONArray array = json.getJSONArray("menus");
                for (int i = 0; i < array.length(); i++) {
                    com.rhinodesktop.foreorder_golf_consumer1.models.Menu item = MenuRealmProxy.createOrUpdateUsingJsonObject(realm, array.getJSONObject(i), update);
                    objProxy.realmGet$menus().add(item);
                }
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.rhinodesktop.foreorder_golf_consumer1.models.Club createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.rhinodesktop.foreorder_golf_consumer1.models.Club obj = new com.rhinodesktop.foreorder_golf_consumer1.models.Club();
        final ClubRealmProxyInterface objProxy = (ClubRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("clubId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$clubId((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$clubId(null);
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("name")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$name((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$name(null);
                }
            } else if (name.equals("phoneNumber")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$phoneNumber((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$phoneNumber(null);
                }
            } else if (name.equals("valid")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$valid((boolean) reader.nextBoolean());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$valid(null);
                }
            } else if (name.equals("address")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$address((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$address(null);
                }
            } else if (name.equals("lat")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$lat((double) reader.nextDouble());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$lat(null);
                }
            } else if (name.equals("lon")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$lon((double) reader.nextDouble());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$lon(null);
                }
            } else if (name.equals("photoUrl")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$photoUrl((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$photoUrl(null);
                }
            } else if (name.equals("photoUrlThumb")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$photoUrlThumb((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$photoUrlThumb(null);
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
            } else if (name.equals("taxRate")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$taxRate((double) reader.nextDouble());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$taxRate(null);
                }
            } else if (name.equals("showTax")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$showTax((boolean) reader.nextBoolean());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$showTax(null);
                }
            } else if (name.equals("menus")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$menus(null);
                } else {
                    objProxy.realmSet$menus(new RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.Menu>());
                    reader.beginArray();
                    while (reader.hasNext()) {
                        com.rhinodesktop.foreorder_golf_consumer1.models.Menu item = MenuRealmProxy.createUsingJsonStream(realm, reader);
                        objProxy.realmGet$menus().add(item);
                    }
                    reader.endArray();
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'clubId'.");
        }
        return realm.copyToRealm(obj);
    }

    public static com.rhinodesktop.foreorder_golf_consumer1.models.Club copyOrUpdate(Realm realm, com.rhinodesktop.foreorder_golf_consumer1.models.Club object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
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
            return (com.rhinodesktop.foreorder_golf_consumer1.models.Club) cachedRealmObject;
        }

        com.rhinodesktop.foreorder_golf_consumer1.models.Club realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.rhinodesktop.foreorder_golf_consumer1.models.Club.class);
            ClubColumnInfo columnInfo = (ClubColumnInfo) realm.getSchema().getColumnInfo(com.rhinodesktop.foreorder_golf_consumer1.models.Club.class);
            long pkColumnIndex = columnInfo.clubIdIndex;
            Number value = ((ClubRealmProxyInterface) object).realmGet$clubId();
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
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.rhinodesktop.foreorder_golf_consumer1.models.Club.class), false, Collections.<String> emptyList());
                    realmObject = new io.realm.ClubRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, realmObject, object, cache) : copy(realm, object, update, cache);
    }

    public static com.rhinodesktop.foreorder_golf_consumer1.models.Club copy(Realm realm, com.rhinodesktop.foreorder_golf_consumer1.models.Club newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.rhinodesktop.foreorder_golf_consumer1.models.Club) cachedRealmObject;
        }

        // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
        com.rhinodesktop.foreorder_golf_consumer1.models.Club realmObject = realm.createObjectInternal(com.rhinodesktop.foreorder_golf_consumer1.models.Club.class, ((ClubRealmProxyInterface) newObject).realmGet$clubId(), false, Collections.<String>emptyList());
        cache.put(newObject, (RealmObjectProxy) realmObject);

        ClubRealmProxyInterface realmObjectSource = (ClubRealmProxyInterface) newObject;
        ClubRealmProxyInterface realmObjectCopy = (ClubRealmProxyInterface) realmObject;

        realmObjectCopy.realmSet$name(realmObjectSource.realmGet$name());
        realmObjectCopy.realmSet$phoneNumber(realmObjectSource.realmGet$phoneNumber());
        realmObjectCopy.realmSet$valid(realmObjectSource.realmGet$valid());
        realmObjectCopy.realmSet$address(realmObjectSource.realmGet$address());
        realmObjectCopy.realmSet$lat(realmObjectSource.realmGet$lat());
        realmObjectCopy.realmSet$lon(realmObjectSource.realmGet$lon());
        realmObjectCopy.realmSet$photoUrl(realmObjectSource.realmGet$photoUrl());
        realmObjectCopy.realmSet$photoUrlThumb(realmObjectSource.realmGet$photoUrlThumb());
        realmObjectCopy.realmSet$modifiedAt(realmObjectSource.realmGet$modifiedAt());
        realmObjectCopy.realmSet$taxRate(realmObjectSource.realmGet$taxRate());
        realmObjectCopy.realmSet$showTax(realmObjectSource.realmGet$showTax());

        RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.Menu> menusList = realmObjectSource.realmGet$menus();
        if (menusList != null) {
            RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.Menu> menusRealmList = realmObjectCopy.realmGet$menus();
            menusRealmList.clear();
            for (int i = 0; i < menusList.size(); i++) {
                com.rhinodesktop.foreorder_golf_consumer1.models.Menu menusItem = menusList.get(i);
                com.rhinodesktop.foreorder_golf_consumer1.models.Menu cachemenus = (com.rhinodesktop.foreorder_golf_consumer1.models.Menu) cache.get(menusItem);
                if (cachemenus != null) {
                    menusRealmList.add(cachemenus);
                } else {
                    menusRealmList.add(MenuRealmProxy.copyOrUpdate(realm, menusItem, update, cache));
                }
            }
        }

        return realmObject;
    }

    public static long insert(Realm realm, com.rhinodesktop.foreorder_golf_consumer1.models.Club object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.rhinodesktop.foreorder_golf_consumer1.models.Club.class);
        long tableNativePtr = table.getNativePtr();
        ClubColumnInfo columnInfo = (ClubColumnInfo) realm.getSchema().getColumnInfo(com.rhinodesktop.foreorder_golf_consumer1.models.Club.class);
        long pkColumnIndex = columnInfo.clubIdIndex;
        Object primaryKeyValue = ((ClubRealmProxyInterface) object).realmGet$clubId();
        long rowIndex = Table.NO_MATCH;
        if (primaryKeyValue == null) {
            rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
        } else {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((ClubRealmProxyInterface) object).realmGet$clubId());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((ClubRealmProxyInterface) object).realmGet$clubId());
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, rowIndex);
        String realmGet$name = ((ClubRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
        }
        String realmGet$phoneNumber = ((ClubRealmProxyInterface) object).realmGet$phoneNumber();
        if (realmGet$phoneNumber != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phoneNumberIndex, rowIndex, realmGet$phoneNumber, false);
        }
        Boolean realmGet$valid = ((ClubRealmProxyInterface) object).realmGet$valid();
        if (realmGet$valid != null) {
            Table.nativeSetBoolean(tableNativePtr, columnInfo.validIndex, rowIndex, realmGet$valid, false);
        }
        String realmGet$address = ((ClubRealmProxyInterface) object).realmGet$address();
        if (realmGet$address != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.addressIndex, rowIndex, realmGet$address, false);
        }
        Double realmGet$lat = ((ClubRealmProxyInterface) object).realmGet$lat();
        if (realmGet$lat != null) {
            Table.nativeSetDouble(tableNativePtr, columnInfo.latIndex, rowIndex, realmGet$lat, false);
        }
        Double realmGet$lon = ((ClubRealmProxyInterface) object).realmGet$lon();
        if (realmGet$lon != null) {
            Table.nativeSetDouble(tableNativePtr, columnInfo.lonIndex, rowIndex, realmGet$lon, false);
        }
        String realmGet$photoUrl = ((ClubRealmProxyInterface) object).realmGet$photoUrl();
        if (realmGet$photoUrl != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.photoUrlIndex, rowIndex, realmGet$photoUrl, false);
        }
        String realmGet$photoUrlThumb = ((ClubRealmProxyInterface) object).realmGet$photoUrlThumb();
        if (realmGet$photoUrlThumb != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.photoUrlThumbIndex, rowIndex, realmGet$photoUrlThumb, false);
        }
        java.util.Date realmGet$modifiedAt = ((ClubRealmProxyInterface) object).realmGet$modifiedAt();
        if (realmGet$modifiedAt != null) {
            Table.nativeSetTimestamp(tableNativePtr, columnInfo.modifiedAtIndex, rowIndex, realmGet$modifiedAt.getTime(), false);
        }
        Double realmGet$taxRate = ((ClubRealmProxyInterface) object).realmGet$taxRate();
        if (realmGet$taxRate != null) {
            Table.nativeSetDouble(tableNativePtr, columnInfo.taxRateIndex, rowIndex, realmGet$taxRate, false);
        }
        Boolean realmGet$showTax = ((ClubRealmProxyInterface) object).realmGet$showTax();
        if (realmGet$showTax != null) {
            Table.nativeSetBoolean(tableNativePtr, columnInfo.showTaxIndex, rowIndex, realmGet$showTax, false);
        }

        RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.Menu> menusList = ((ClubRealmProxyInterface) object).realmGet$menus();
        if (menusList != null) {
            OsList menusOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.menusIndex);
            for (com.rhinodesktop.foreorder_golf_consumer1.models.Menu menusItem : menusList) {
                Long cacheItemIndexmenus = cache.get(menusItem);
                if (cacheItemIndexmenus == null) {
                    cacheItemIndexmenus = MenuRealmProxy.insert(realm, menusItem, cache);
                }
                menusOsList.addRow(cacheItemIndexmenus);
            }
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.rhinodesktop.foreorder_golf_consumer1.models.Club.class);
        long tableNativePtr = table.getNativePtr();
        ClubColumnInfo columnInfo = (ClubColumnInfo) realm.getSchema().getColumnInfo(com.rhinodesktop.foreorder_golf_consumer1.models.Club.class);
        long pkColumnIndex = columnInfo.clubIdIndex;
        com.rhinodesktop.foreorder_golf_consumer1.models.Club object = null;
        while (objects.hasNext()) {
            object = (com.rhinodesktop.foreorder_golf_consumer1.models.Club) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            Object primaryKeyValue = ((ClubRealmProxyInterface) object).realmGet$clubId();
            long rowIndex = Table.NO_MATCH;
            if (primaryKeyValue == null) {
                rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
            } else {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((ClubRealmProxyInterface) object).realmGet$clubId());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((ClubRealmProxyInterface) object).realmGet$clubId());
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, rowIndex);
            String realmGet$name = ((ClubRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
            }
            String realmGet$phoneNumber = ((ClubRealmProxyInterface) object).realmGet$phoneNumber();
            if (realmGet$phoneNumber != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.phoneNumberIndex, rowIndex, realmGet$phoneNumber, false);
            }
            Boolean realmGet$valid = ((ClubRealmProxyInterface) object).realmGet$valid();
            if (realmGet$valid != null) {
                Table.nativeSetBoolean(tableNativePtr, columnInfo.validIndex, rowIndex, realmGet$valid, false);
            }
            String realmGet$address = ((ClubRealmProxyInterface) object).realmGet$address();
            if (realmGet$address != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.addressIndex, rowIndex, realmGet$address, false);
            }
            Double realmGet$lat = ((ClubRealmProxyInterface) object).realmGet$lat();
            if (realmGet$lat != null) {
                Table.nativeSetDouble(tableNativePtr, columnInfo.latIndex, rowIndex, realmGet$lat, false);
            }
            Double realmGet$lon = ((ClubRealmProxyInterface) object).realmGet$lon();
            if (realmGet$lon != null) {
                Table.nativeSetDouble(tableNativePtr, columnInfo.lonIndex, rowIndex, realmGet$lon, false);
            }
            String realmGet$photoUrl = ((ClubRealmProxyInterface) object).realmGet$photoUrl();
            if (realmGet$photoUrl != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.photoUrlIndex, rowIndex, realmGet$photoUrl, false);
            }
            String realmGet$photoUrlThumb = ((ClubRealmProxyInterface) object).realmGet$photoUrlThumb();
            if (realmGet$photoUrlThumb != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.photoUrlThumbIndex, rowIndex, realmGet$photoUrlThumb, false);
            }
            java.util.Date realmGet$modifiedAt = ((ClubRealmProxyInterface) object).realmGet$modifiedAt();
            if (realmGet$modifiedAt != null) {
                Table.nativeSetTimestamp(tableNativePtr, columnInfo.modifiedAtIndex, rowIndex, realmGet$modifiedAt.getTime(), false);
            }
            Double realmGet$taxRate = ((ClubRealmProxyInterface) object).realmGet$taxRate();
            if (realmGet$taxRate != null) {
                Table.nativeSetDouble(tableNativePtr, columnInfo.taxRateIndex, rowIndex, realmGet$taxRate, false);
            }
            Boolean realmGet$showTax = ((ClubRealmProxyInterface) object).realmGet$showTax();
            if (realmGet$showTax != null) {
                Table.nativeSetBoolean(tableNativePtr, columnInfo.showTaxIndex, rowIndex, realmGet$showTax, false);
            }

            RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.Menu> menusList = ((ClubRealmProxyInterface) object).realmGet$menus();
            if (menusList != null) {
                OsList menusOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.menusIndex);
                for (com.rhinodesktop.foreorder_golf_consumer1.models.Menu menusItem : menusList) {
                    Long cacheItemIndexmenus = cache.get(menusItem);
                    if (cacheItemIndexmenus == null) {
                        cacheItemIndexmenus = MenuRealmProxy.insert(realm, menusItem, cache);
                    }
                    menusOsList.addRow(cacheItemIndexmenus);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.rhinodesktop.foreorder_golf_consumer1.models.Club object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.rhinodesktop.foreorder_golf_consumer1.models.Club.class);
        long tableNativePtr = table.getNativePtr();
        ClubColumnInfo columnInfo = (ClubColumnInfo) realm.getSchema().getColumnInfo(com.rhinodesktop.foreorder_golf_consumer1.models.Club.class);
        long pkColumnIndex = columnInfo.clubIdIndex;
        Object primaryKeyValue = ((ClubRealmProxyInterface) object).realmGet$clubId();
        long rowIndex = Table.NO_MATCH;
        if (primaryKeyValue == null) {
            rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
        } else {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((ClubRealmProxyInterface) object).realmGet$clubId());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((ClubRealmProxyInterface) object).realmGet$clubId());
        }
        cache.put(object, rowIndex);
        String realmGet$name = ((ClubRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.nameIndex, rowIndex, false);
        }
        String realmGet$phoneNumber = ((ClubRealmProxyInterface) object).realmGet$phoneNumber();
        if (realmGet$phoneNumber != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phoneNumberIndex, rowIndex, realmGet$phoneNumber, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phoneNumberIndex, rowIndex, false);
        }
        Boolean realmGet$valid = ((ClubRealmProxyInterface) object).realmGet$valid();
        if (realmGet$valid != null) {
            Table.nativeSetBoolean(tableNativePtr, columnInfo.validIndex, rowIndex, realmGet$valid, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.validIndex, rowIndex, false);
        }
        String realmGet$address = ((ClubRealmProxyInterface) object).realmGet$address();
        if (realmGet$address != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.addressIndex, rowIndex, realmGet$address, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.addressIndex, rowIndex, false);
        }
        Double realmGet$lat = ((ClubRealmProxyInterface) object).realmGet$lat();
        if (realmGet$lat != null) {
            Table.nativeSetDouble(tableNativePtr, columnInfo.latIndex, rowIndex, realmGet$lat, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.latIndex, rowIndex, false);
        }
        Double realmGet$lon = ((ClubRealmProxyInterface) object).realmGet$lon();
        if (realmGet$lon != null) {
            Table.nativeSetDouble(tableNativePtr, columnInfo.lonIndex, rowIndex, realmGet$lon, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.lonIndex, rowIndex, false);
        }
        String realmGet$photoUrl = ((ClubRealmProxyInterface) object).realmGet$photoUrl();
        if (realmGet$photoUrl != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.photoUrlIndex, rowIndex, realmGet$photoUrl, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.photoUrlIndex, rowIndex, false);
        }
        String realmGet$photoUrlThumb = ((ClubRealmProxyInterface) object).realmGet$photoUrlThumb();
        if (realmGet$photoUrlThumb != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.photoUrlThumbIndex, rowIndex, realmGet$photoUrlThumb, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.photoUrlThumbIndex, rowIndex, false);
        }
        java.util.Date realmGet$modifiedAt = ((ClubRealmProxyInterface) object).realmGet$modifiedAt();
        if (realmGet$modifiedAt != null) {
            Table.nativeSetTimestamp(tableNativePtr, columnInfo.modifiedAtIndex, rowIndex, realmGet$modifiedAt.getTime(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.modifiedAtIndex, rowIndex, false);
        }
        Double realmGet$taxRate = ((ClubRealmProxyInterface) object).realmGet$taxRate();
        if (realmGet$taxRate != null) {
            Table.nativeSetDouble(tableNativePtr, columnInfo.taxRateIndex, rowIndex, realmGet$taxRate, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.taxRateIndex, rowIndex, false);
        }
        Boolean realmGet$showTax = ((ClubRealmProxyInterface) object).realmGet$showTax();
        if (realmGet$showTax != null) {
            Table.nativeSetBoolean(tableNativePtr, columnInfo.showTaxIndex, rowIndex, realmGet$showTax, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.showTaxIndex, rowIndex, false);
        }

        OsList menusOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.menusIndex);
        RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.Menu> menusList = ((ClubRealmProxyInterface) object).realmGet$menus();
        if (menusList != null && menusList.size() == menusOsList.size()) {
            // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
            int objects = menusList.size();
            for (int i = 0; i < objects; i++) {
                com.rhinodesktop.foreorder_golf_consumer1.models.Menu menusItem = menusList.get(i);
                Long cacheItemIndexmenus = cache.get(menusItem);
                if (cacheItemIndexmenus == null) {
                    cacheItemIndexmenus = MenuRealmProxy.insertOrUpdate(realm, menusItem, cache);
                }
                menusOsList.setRow(i, cacheItemIndexmenus);
            }
        } else {
            menusOsList.removeAll();
            if (menusList != null) {
                for (com.rhinodesktop.foreorder_golf_consumer1.models.Menu menusItem : menusList) {
                    Long cacheItemIndexmenus = cache.get(menusItem);
                    if (cacheItemIndexmenus == null) {
                        cacheItemIndexmenus = MenuRealmProxy.insertOrUpdate(realm, menusItem, cache);
                    }
                    menusOsList.addRow(cacheItemIndexmenus);
                }
            }
        }

        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.rhinodesktop.foreorder_golf_consumer1.models.Club.class);
        long tableNativePtr = table.getNativePtr();
        ClubColumnInfo columnInfo = (ClubColumnInfo) realm.getSchema().getColumnInfo(com.rhinodesktop.foreorder_golf_consumer1.models.Club.class);
        long pkColumnIndex = columnInfo.clubIdIndex;
        com.rhinodesktop.foreorder_golf_consumer1.models.Club object = null;
        while (objects.hasNext()) {
            object = (com.rhinodesktop.foreorder_golf_consumer1.models.Club) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            Object primaryKeyValue = ((ClubRealmProxyInterface) object).realmGet$clubId();
            long rowIndex = Table.NO_MATCH;
            if (primaryKeyValue == null) {
                rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
            } else {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((ClubRealmProxyInterface) object).realmGet$clubId());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((ClubRealmProxyInterface) object).realmGet$clubId());
            }
            cache.put(object, rowIndex);
            String realmGet$name = ((ClubRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.nameIndex, rowIndex, false);
            }
            String realmGet$phoneNumber = ((ClubRealmProxyInterface) object).realmGet$phoneNumber();
            if (realmGet$phoneNumber != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.phoneNumberIndex, rowIndex, realmGet$phoneNumber, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.phoneNumberIndex, rowIndex, false);
            }
            Boolean realmGet$valid = ((ClubRealmProxyInterface) object).realmGet$valid();
            if (realmGet$valid != null) {
                Table.nativeSetBoolean(tableNativePtr, columnInfo.validIndex, rowIndex, realmGet$valid, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.validIndex, rowIndex, false);
            }
            String realmGet$address = ((ClubRealmProxyInterface) object).realmGet$address();
            if (realmGet$address != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.addressIndex, rowIndex, realmGet$address, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.addressIndex, rowIndex, false);
            }
            Double realmGet$lat = ((ClubRealmProxyInterface) object).realmGet$lat();
            if (realmGet$lat != null) {
                Table.nativeSetDouble(tableNativePtr, columnInfo.latIndex, rowIndex, realmGet$lat, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.latIndex, rowIndex, false);
            }
            Double realmGet$lon = ((ClubRealmProxyInterface) object).realmGet$lon();
            if (realmGet$lon != null) {
                Table.nativeSetDouble(tableNativePtr, columnInfo.lonIndex, rowIndex, realmGet$lon, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.lonIndex, rowIndex, false);
            }
            String realmGet$photoUrl = ((ClubRealmProxyInterface) object).realmGet$photoUrl();
            if (realmGet$photoUrl != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.photoUrlIndex, rowIndex, realmGet$photoUrl, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.photoUrlIndex, rowIndex, false);
            }
            String realmGet$photoUrlThumb = ((ClubRealmProxyInterface) object).realmGet$photoUrlThumb();
            if (realmGet$photoUrlThumb != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.photoUrlThumbIndex, rowIndex, realmGet$photoUrlThumb, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.photoUrlThumbIndex, rowIndex, false);
            }
            java.util.Date realmGet$modifiedAt = ((ClubRealmProxyInterface) object).realmGet$modifiedAt();
            if (realmGet$modifiedAt != null) {
                Table.nativeSetTimestamp(tableNativePtr, columnInfo.modifiedAtIndex, rowIndex, realmGet$modifiedAt.getTime(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.modifiedAtIndex, rowIndex, false);
            }
            Double realmGet$taxRate = ((ClubRealmProxyInterface) object).realmGet$taxRate();
            if (realmGet$taxRate != null) {
                Table.nativeSetDouble(tableNativePtr, columnInfo.taxRateIndex, rowIndex, realmGet$taxRate, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.taxRateIndex, rowIndex, false);
            }
            Boolean realmGet$showTax = ((ClubRealmProxyInterface) object).realmGet$showTax();
            if (realmGet$showTax != null) {
                Table.nativeSetBoolean(tableNativePtr, columnInfo.showTaxIndex, rowIndex, realmGet$showTax, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.showTaxIndex, rowIndex, false);
            }

            OsList menusOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.menusIndex);
            RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.Menu> menusList = ((ClubRealmProxyInterface) object).realmGet$menus();
            if (menusList != null && menusList.size() == menusOsList.size()) {
                // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
                int objectCount = menusList.size();
                for (int i = 0; i < objectCount; i++) {
                    com.rhinodesktop.foreorder_golf_consumer1.models.Menu menusItem = menusList.get(i);
                    Long cacheItemIndexmenus = cache.get(menusItem);
                    if (cacheItemIndexmenus == null) {
                        cacheItemIndexmenus = MenuRealmProxy.insertOrUpdate(realm, menusItem, cache);
                    }
                    menusOsList.setRow(i, cacheItemIndexmenus);
                }
            } else {
                menusOsList.removeAll();
                if (menusList != null) {
                    for (com.rhinodesktop.foreorder_golf_consumer1.models.Menu menusItem : menusList) {
                        Long cacheItemIndexmenus = cache.get(menusItem);
                        if (cacheItemIndexmenus == null) {
                            cacheItemIndexmenus = MenuRealmProxy.insertOrUpdate(realm, menusItem, cache);
                        }
                        menusOsList.addRow(cacheItemIndexmenus);
                    }
                }
            }

        }
    }

    public static com.rhinodesktop.foreorder_golf_consumer1.models.Club createDetachedCopy(com.rhinodesktop.foreorder_golf_consumer1.models.Club realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.rhinodesktop.foreorder_golf_consumer1.models.Club unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.rhinodesktop.foreorder_golf_consumer1.models.Club();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.rhinodesktop.foreorder_golf_consumer1.models.Club) cachedObject.object;
            }
            unmanagedObject = (com.rhinodesktop.foreorder_golf_consumer1.models.Club) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        ClubRealmProxyInterface unmanagedCopy = (ClubRealmProxyInterface) unmanagedObject;
        ClubRealmProxyInterface realmSource = (ClubRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$clubId(realmSource.realmGet$clubId());
        unmanagedCopy.realmSet$name(realmSource.realmGet$name());
        unmanagedCopy.realmSet$phoneNumber(realmSource.realmGet$phoneNumber());
        unmanagedCopy.realmSet$valid(realmSource.realmGet$valid());
        unmanagedCopy.realmSet$address(realmSource.realmGet$address());
        unmanagedCopy.realmSet$lat(realmSource.realmGet$lat());
        unmanagedCopy.realmSet$lon(realmSource.realmGet$lon());
        unmanagedCopy.realmSet$photoUrl(realmSource.realmGet$photoUrl());
        unmanagedCopy.realmSet$photoUrlThumb(realmSource.realmGet$photoUrlThumb());
        unmanagedCopy.realmSet$modifiedAt(realmSource.realmGet$modifiedAt());
        unmanagedCopy.realmSet$taxRate(realmSource.realmGet$taxRate());
        unmanagedCopy.realmSet$showTax(realmSource.realmGet$showTax());

        // Deep copy of menus
        if (currentDepth == maxDepth) {
            unmanagedCopy.realmSet$menus(null);
        } else {
            RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.Menu> managedmenusList = realmSource.realmGet$menus();
            RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.Menu> unmanagedmenusList = new RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.Menu>();
            unmanagedCopy.realmSet$menus(unmanagedmenusList);
            int nextDepth = currentDepth + 1;
            int size = managedmenusList.size();
            for (int i = 0; i < size; i++) {
                com.rhinodesktop.foreorder_golf_consumer1.models.Menu item = MenuRealmProxy.createDetachedCopy(managedmenusList.get(i), nextDepth, maxDepth, cache);
                unmanagedmenusList.add(item);
            }
        }

        return unmanagedObject;
    }

    static com.rhinodesktop.foreorder_golf_consumer1.models.Club update(Realm realm, com.rhinodesktop.foreorder_golf_consumer1.models.Club realmObject, com.rhinodesktop.foreorder_golf_consumer1.models.Club newObject, Map<RealmModel, RealmObjectProxy> cache) {
        ClubRealmProxyInterface realmObjectTarget = (ClubRealmProxyInterface) realmObject;
        ClubRealmProxyInterface realmObjectSource = (ClubRealmProxyInterface) newObject;
        realmObjectTarget.realmSet$name(realmObjectSource.realmGet$name());
        realmObjectTarget.realmSet$phoneNumber(realmObjectSource.realmGet$phoneNumber());
        realmObjectTarget.realmSet$valid(realmObjectSource.realmGet$valid());
        realmObjectTarget.realmSet$address(realmObjectSource.realmGet$address());
        realmObjectTarget.realmSet$lat(realmObjectSource.realmGet$lat());
        realmObjectTarget.realmSet$lon(realmObjectSource.realmGet$lon());
        realmObjectTarget.realmSet$photoUrl(realmObjectSource.realmGet$photoUrl());
        realmObjectTarget.realmSet$photoUrlThumb(realmObjectSource.realmGet$photoUrlThumb());
        realmObjectTarget.realmSet$modifiedAt(realmObjectSource.realmGet$modifiedAt());
        realmObjectTarget.realmSet$taxRate(realmObjectSource.realmGet$taxRate());
        realmObjectTarget.realmSet$showTax(realmObjectSource.realmGet$showTax());
        RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.Menu> menusList = realmObjectSource.realmGet$menus();
        RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.Menu> menusRealmList = realmObjectTarget.realmGet$menus();
        if (menusList != null && menusList.size() == menusRealmList.size()) {
            // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
            int objects = menusList.size();
            for (int i = 0; i < objects; i++) {
                com.rhinodesktop.foreorder_golf_consumer1.models.Menu menusItem = menusList.get(i);
                com.rhinodesktop.foreorder_golf_consumer1.models.Menu cachemenus = (com.rhinodesktop.foreorder_golf_consumer1.models.Menu) cache.get(menusItem);
                if (cachemenus != null) {
                    menusRealmList.set(i, cachemenus);
                } else {
                    menusRealmList.set(i, MenuRealmProxy.copyOrUpdate(realm, menusItem, true, cache));
                }
            }
        } else {
            menusRealmList.clear();
            if (menusList != null) {
                for (int i = 0; i < menusList.size(); i++) {
                    com.rhinodesktop.foreorder_golf_consumer1.models.Menu menusItem = menusList.get(i);
                    com.rhinodesktop.foreorder_golf_consumer1.models.Menu cachemenus = (com.rhinodesktop.foreorder_golf_consumer1.models.Menu) cache.get(menusItem);
                    if (cachemenus != null) {
                        menusRealmList.add(cachemenus);
                    } else {
                        menusRealmList.add(MenuRealmProxy.copyOrUpdate(realm, menusItem, true, cache));
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
        StringBuilder stringBuilder = new StringBuilder("Club = proxy[");
        stringBuilder.append("{clubId:");
        stringBuilder.append(realmGet$clubId() != null ? realmGet$clubId() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{name:");
        stringBuilder.append(realmGet$name() != null ? realmGet$name() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phoneNumber:");
        stringBuilder.append(realmGet$phoneNumber() != null ? realmGet$phoneNumber() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{valid:");
        stringBuilder.append(realmGet$valid() != null ? realmGet$valid() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{address:");
        stringBuilder.append(realmGet$address() != null ? realmGet$address() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{lat:");
        stringBuilder.append(realmGet$lat() != null ? realmGet$lat() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{lon:");
        stringBuilder.append(realmGet$lon() != null ? realmGet$lon() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{photoUrl:");
        stringBuilder.append(realmGet$photoUrl() != null ? realmGet$photoUrl() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{photoUrlThumb:");
        stringBuilder.append(realmGet$photoUrlThumb() != null ? realmGet$photoUrlThumb() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{modifiedAt:");
        stringBuilder.append(realmGet$modifiedAt() != null ? realmGet$modifiedAt() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{taxRate:");
        stringBuilder.append(realmGet$taxRate() != null ? realmGet$taxRate() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{showTax:");
        stringBuilder.append(realmGet$showTax() != null ? realmGet$showTax() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{menus:");
        stringBuilder.append("RealmList<Menu>[").append(realmGet$menus().size()).append("]");
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
        ClubRealmProxy aClub = (ClubRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aClub.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aClub.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aClub.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
