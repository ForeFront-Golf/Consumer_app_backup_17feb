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
public class MenuItemRealmProxy extends com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem
    implements RealmObjectProxy, MenuItemRealmProxyInterface {

    static final class MenuItemColumnInfo extends ColumnInfo {
        long menuItemIdIndex;
        long availableIndex;
        long validIndex;
        long descIndex;
        long menuIdIndex;
        long nameIndex;
        long priceIndex;
        long stockIndex;
        long photoUrlIndex;
        long photoUrlThumbIndex;
        long addedTaxRateIndex;
        long itemTypesIndex;
        long optionGroupsIndex;
        long modifiedAtIndex;

        MenuItemColumnInfo(OsSchemaInfo schemaInfo) {
            super(14);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("MenuItem");
            this.menuItemIdIndex = addColumnDetails("menuItemId", objectSchemaInfo);
            this.availableIndex = addColumnDetails("available", objectSchemaInfo);
            this.validIndex = addColumnDetails("valid", objectSchemaInfo);
            this.descIndex = addColumnDetails("desc", objectSchemaInfo);
            this.menuIdIndex = addColumnDetails("menuId", objectSchemaInfo);
            this.nameIndex = addColumnDetails("name", objectSchemaInfo);
            this.priceIndex = addColumnDetails("price", objectSchemaInfo);
            this.stockIndex = addColumnDetails("stock", objectSchemaInfo);
            this.photoUrlIndex = addColumnDetails("photoUrl", objectSchemaInfo);
            this.photoUrlThumbIndex = addColumnDetails("photoUrlThumb", objectSchemaInfo);
            this.addedTaxRateIndex = addColumnDetails("addedTaxRate", objectSchemaInfo);
            this.itemTypesIndex = addColumnDetails("itemTypes", objectSchemaInfo);
            this.optionGroupsIndex = addColumnDetails("optionGroups", objectSchemaInfo);
            this.modifiedAtIndex = addColumnDetails("modifiedAt", objectSchemaInfo);
        }

        MenuItemColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new MenuItemColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final MenuItemColumnInfo src = (MenuItemColumnInfo) rawSrc;
            final MenuItemColumnInfo dst = (MenuItemColumnInfo) rawDst;
            dst.menuItemIdIndex = src.menuItemIdIndex;
            dst.availableIndex = src.availableIndex;
            dst.validIndex = src.validIndex;
            dst.descIndex = src.descIndex;
            dst.menuIdIndex = src.menuIdIndex;
            dst.nameIndex = src.nameIndex;
            dst.priceIndex = src.priceIndex;
            dst.stockIndex = src.stockIndex;
            dst.photoUrlIndex = src.photoUrlIndex;
            dst.photoUrlThumbIndex = src.photoUrlThumbIndex;
            dst.addedTaxRateIndex = src.addedTaxRateIndex;
            dst.itemTypesIndex = src.itemTypesIndex;
            dst.optionGroupsIndex = src.optionGroupsIndex;
            dst.modifiedAtIndex = src.modifiedAtIndex;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private static final List<String> FIELD_NAMES;
    static {
        List<String> fieldNames = new ArrayList<String>(14);
        fieldNames.add("menuItemId");
        fieldNames.add("available");
        fieldNames.add("valid");
        fieldNames.add("desc");
        fieldNames.add("menuId");
        fieldNames.add("name");
        fieldNames.add("price");
        fieldNames.add("stock");
        fieldNames.add("photoUrl");
        fieldNames.add("photoUrlThumb");
        fieldNames.add("addedTaxRate");
        fieldNames.add("itemTypes");
        fieldNames.add("optionGroups");
        fieldNames.add("modifiedAt");
        FIELD_NAMES = Collections.unmodifiableList(fieldNames);
    }

    private MenuItemColumnInfo columnInfo;
    private ProxyState<com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem> proxyState;
    private RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.ItemType> itemTypesRealmList;
    private RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup> optionGroupsRealmList;

    MenuItemRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (MenuItemColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public Integer realmGet$menuItemId() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.menuItemIdIndex)) {
            return null;
        }
        return (int) proxyState.getRow$realm().getLong(columnInfo.menuItemIdIndex);
    }

    @Override
    public void realmSet$menuItemId(Integer value) {
        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'menuItemId' cannot be changed after object was created.");
    }

    @Override
    @SuppressWarnings("cast")
    public Boolean realmGet$available() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.availableIndex)) {
            return null;
        }
        return (boolean) proxyState.getRow$realm().getBoolean(columnInfo.availableIndex);
    }

    @Override
    public void realmSet$available(Boolean value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.availableIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setBoolean(columnInfo.availableIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.availableIndex);
            return;
        }
        proxyState.getRow$realm().setBoolean(columnInfo.availableIndex, value);
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
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.menuIdIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setLong(columnInfo.menuIdIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.menuIdIndex);
            return;
        }
        proxyState.getRow$realm().setLong(columnInfo.menuIdIndex, value);
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
    public Float realmGet$price() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.priceIndex)) {
            return null;
        }
        return (float) proxyState.getRow$realm().getFloat(columnInfo.priceIndex);
    }

    @Override
    public void realmSet$price(Float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.priceIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setFloat(columnInfo.priceIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.priceIndex);
            return;
        }
        proxyState.getRow$realm().setFloat(columnInfo.priceIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public Integer realmGet$stock() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.stockIndex)) {
            return null;
        }
        return (int) proxyState.getRow$realm().getLong(columnInfo.stockIndex);
    }

    @Override
    public void realmSet$stock(Integer value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.stockIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setLong(columnInfo.stockIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.stockIndex);
            return;
        }
        proxyState.getRow$realm().setLong(columnInfo.stockIndex, value);
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
    public Double realmGet$addedTaxRate() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.addedTaxRateIndex)) {
            return null;
        }
        return (double) proxyState.getRow$realm().getDouble(columnInfo.addedTaxRateIndex);
    }

    @Override
    public void realmSet$addedTaxRate(Double value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.addedTaxRateIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setDouble(columnInfo.addedTaxRateIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.addedTaxRateIndex);
            return;
        }
        proxyState.getRow$realm().setDouble(columnInfo.addedTaxRateIndex, value);
    }

    @Override
    public RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.ItemType> realmGet$itemTypes() {
        proxyState.getRealm$realm().checkIfValid();
        // use the cached value if available
        if (itemTypesRealmList != null) {
            return itemTypesRealmList;
        } else {
            OsList osList = proxyState.getRow$realm().getModelList(columnInfo.itemTypesIndex);
            itemTypesRealmList = new RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.ItemType>(com.rhinodesktop.foreorder_golf_consumer1.models.ItemType.class, osList, proxyState.getRealm$realm());
            return itemTypesRealmList;
        }
    }

    @Override
    public void realmSet$itemTypes(RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.ItemType> value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("itemTypes")) {
                return;
            }
            // if the list contains unmanaged RealmObjects, convert them to managed.
            if (value != null && !value.isManaged()) {
                final Realm realm = (Realm) proxyState.getRealm$realm();
                final RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.ItemType> original = value;
                value = new RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.ItemType>();
                for (com.rhinodesktop.foreorder_golf_consumer1.models.ItemType item : original) {
                    if (item == null || RealmObject.isManaged(item)) {
                        value.add(item);
                    } else {
                        value.add(realm.copyToRealm(item));
                    }
                }
            }
        }

        proxyState.getRealm$realm().checkIfValid();
        OsList osList = proxyState.getRow$realm().getModelList(columnInfo.itemTypesIndex);
        // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
        if (value != null && value.size() == osList.size()) {
            int objects = value.size();
            for (int i = 0; i < objects; i++) {
                com.rhinodesktop.foreorder_golf_consumer1.models.ItemType linkedObject = value.get(i);
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
                com.rhinodesktop.foreorder_golf_consumer1.models.ItemType linkedObject = value.get(i);
                proxyState.checkValidObject(linkedObject);
                osList.addRow(((RealmObjectProxy) linkedObject).realmGet$proxyState().getRow$realm().getIndex());
            }
        }
    }

    @Override
    public RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup> realmGet$optionGroups() {
        proxyState.getRealm$realm().checkIfValid();
        // use the cached value if available
        if (optionGroupsRealmList != null) {
            return optionGroupsRealmList;
        } else {
            OsList osList = proxyState.getRow$realm().getModelList(columnInfo.optionGroupsIndex);
            optionGroupsRealmList = new RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup>(com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup.class, osList, proxyState.getRealm$realm());
            return optionGroupsRealmList;
        }
    }

    @Override
    public void realmSet$optionGroups(RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup> value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("optionGroups")) {
                return;
            }
            // if the list contains unmanaged RealmObjects, convert them to managed.
            if (value != null && !value.isManaged()) {
                final Realm realm = (Realm) proxyState.getRealm$realm();
                final RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup> original = value;
                value = new RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup>();
                for (com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup item : original) {
                    if (item == null || RealmObject.isManaged(item)) {
                        value.add(item);
                    } else {
                        value.add(realm.copyToRealm(item));
                    }
                }
            }
        }

        proxyState.getRealm$realm().checkIfValid();
        OsList osList = proxyState.getRow$realm().getModelList(columnInfo.optionGroupsIndex);
        // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
        if (value != null && value.size() == osList.size()) {
            int objects = value.size();
            for (int i = 0; i < objects; i++) {
                com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup linkedObject = value.get(i);
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
                com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup linkedObject = value.get(i);
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
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("MenuItem", 14, 0);
        builder.addPersistedProperty("menuItemId", RealmFieldType.INTEGER, Property.PRIMARY_KEY, Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("available", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("valid", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("desc", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("menuId", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("name", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("price", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("stock", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("photoUrl", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("photoUrlThumb", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("addedTaxRate", RealmFieldType.DOUBLE, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedLinkProperty("itemTypes", RealmFieldType.LIST, "ItemType");
        builder.addPersistedLinkProperty("optionGroups", RealmFieldType.LIST, "OptionGroup");
        builder.addPersistedProperty("modifiedAt", RealmFieldType.DATE, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static MenuItemColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new MenuItemColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "MenuItem";
    }

    public static List<String> getFieldNames() {
        return FIELD_NAMES;
    }

    @SuppressWarnings("cast")
    public static com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = new ArrayList<String>(2);
        com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem obj = null;
        if (update) {
            Table table = realm.getTable(com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem.class);
            MenuItemColumnInfo columnInfo = (MenuItemColumnInfo) realm.getSchema().getColumnInfo(com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem.class);
            long pkColumnIndex = columnInfo.menuItemIdIndex;
            long rowIndex = Table.NO_MATCH;
            if (json.isNull("menuItemId")) {
                rowIndex = table.findFirstNull(pkColumnIndex);
            } else {
                rowIndex = table.findFirstLong(pkColumnIndex, json.getLong("menuItemId"));
            }
            if (rowIndex != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem.class), false, Collections.<String> emptyList());
                    obj = new io.realm.MenuItemRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("itemTypes")) {
                excludeFields.add("itemTypes");
            }
            if (json.has("optionGroups")) {
                excludeFields.add("optionGroups");
            }
            if (json.has("menuItemId")) {
                if (json.isNull("menuItemId")) {
                    obj = (io.realm.MenuItemRealmProxy) realm.createObjectInternal(com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.MenuItemRealmProxy) realm.createObjectInternal(com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem.class, json.getInt("menuItemId"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'menuItemId'.");
            }
        }

        final MenuItemRealmProxyInterface objProxy = (MenuItemRealmProxyInterface) obj;
        if (json.has("available")) {
            if (json.isNull("available")) {
                objProxy.realmSet$available(null);
            } else {
                objProxy.realmSet$available((boolean) json.getBoolean("available"));
            }
        }
        if (json.has("valid")) {
            if (json.isNull("valid")) {
                objProxy.realmSet$valid(null);
            } else {
                objProxy.realmSet$valid((boolean) json.getBoolean("valid"));
            }
        }
        if (json.has("desc")) {
            if (json.isNull("desc")) {
                objProxy.realmSet$desc(null);
            } else {
                objProxy.realmSet$desc((String) json.getString("desc"));
            }
        }
        if (json.has("menuId")) {
            if (json.isNull("menuId")) {
                objProxy.realmSet$menuId(null);
            } else {
                objProxy.realmSet$menuId((int) json.getInt("menuId"));
            }
        }
        if (json.has("name")) {
            if (json.isNull("name")) {
                objProxy.realmSet$name(null);
            } else {
                objProxy.realmSet$name((String) json.getString("name"));
            }
        }
        if (json.has("price")) {
            if (json.isNull("price")) {
                objProxy.realmSet$price(null);
            } else {
                objProxy.realmSet$price((float) json.getDouble("price"));
            }
        }
        if (json.has("stock")) {
            if (json.isNull("stock")) {
                objProxy.realmSet$stock(null);
            } else {
                objProxy.realmSet$stock((int) json.getInt("stock"));
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
        if (json.has("addedTaxRate")) {
            if (json.isNull("addedTaxRate")) {
                objProxy.realmSet$addedTaxRate(null);
            } else {
                objProxy.realmSet$addedTaxRate((double) json.getDouble("addedTaxRate"));
            }
        }
        if (json.has("itemTypes")) {
            if (json.isNull("itemTypes")) {
                objProxy.realmSet$itemTypes(null);
            } else {
                objProxy.realmGet$itemTypes().clear();
                JSONArray array = json.getJSONArray("itemTypes");
                for (int i = 0; i < array.length(); i++) {
                    com.rhinodesktop.foreorder_golf_consumer1.models.ItemType item = ItemTypeRealmProxy.createOrUpdateUsingJsonObject(realm, array.getJSONObject(i), update);
                    objProxy.realmGet$itemTypes().add(item);
                }
            }
        }
        if (json.has("optionGroups")) {
            if (json.isNull("optionGroups")) {
                objProxy.realmSet$optionGroups(null);
            } else {
                objProxy.realmGet$optionGroups().clear();
                JSONArray array = json.getJSONArray("optionGroups");
                for (int i = 0; i < array.length(); i++) {
                    com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup item = OptionGroupRealmProxy.createOrUpdateUsingJsonObject(realm, array.getJSONObject(i), update);
                    objProxy.realmGet$optionGroups().add(item);
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
    public static com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem obj = new com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem();
        final MenuItemRealmProxyInterface objProxy = (MenuItemRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("menuItemId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$menuItemId((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$menuItemId(null);
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("available")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$available((boolean) reader.nextBoolean());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$available(null);
                }
            } else if (name.equals("valid")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$valid((boolean) reader.nextBoolean());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$valid(null);
                }
            } else if (name.equals("desc")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$desc((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$desc(null);
                }
            } else if (name.equals("menuId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$menuId((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$menuId(null);
                }
            } else if (name.equals("name")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$name((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$name(null);
                }
            } else if (name.equals("price")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$price((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$price(null);
                }
            } else if (name.equals("stock")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$stock((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$stock(null);
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
            } else if (name.equals("addedTaxRate")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$addedTaxRate((double) reader.nextDouble());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$addedTaxRate(null);
                }
            } else if (name.equals("itemTypes")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$itemTypes(null);
                } else {
                    objProxy.realmSet$itemTypes(new RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.ItemType>());
                    reader.beginArray();
                    while (reader.hasNext()) {
                        com.rhinodesktop.foreorder_golf_consumer1.models.ItemType item = ItemTypeRealmProxy.createUsingJsonStream(realm, reader);
                        objProxy.realmGet$itemTypes().add(item);
                    }
                    reader.endArray();
                }
            } else if (name.equals("optionGroups")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$optionGroups(null);
                } else {
                    objProxy.realmSet$optionGroups(new RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup>());
                    reader.beginArray();
                    while (reader.hasNext()) {
                        com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup item = OptionGroupRealmProxy.createUsingJsonStream(realm, reader);
                        objProxy.realmGet$optionGroups().add(item);
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
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'menuItemId'.");
        }
        return realm.copyToRealm(obj);
    }

    public static com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem copyOrUpdate(Realm realm, com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
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
            return (com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem) cachedRealmObject;
        }

        com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem.class);
            MenuItemColumnInfo columnInfo = (MenuItemColumnInfo) realm.getSchema().getColumnInfo(com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem.class);
            long pkColumnIndex = columnInfo.menuItemIdIndex;
            Number value = ((MenuItemRealmProxyInterface) object).realmGet$menuItemId();
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
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem.class), false, Collections.<String> emptyList());
                    realmObject = new io.realm.MenuItemRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, realmObject, object, cache) : copy(realm, object, update, cache);
    }

    public static com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem copy(Realm realm, com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem) cachedRealmObject;
        }

        // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
        com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem realmObject = realm.createObjectInternal(com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem.class, ((MenuItemRealmProxyInterface) newObject).realmGet$menuItemId(), false, Collections.<String>emptyList());
        cache.put(newObject, (RealmObjectProxy) realmObject);

        MenuItemRealmProxyInterface realmObjectSource = (MenuItemRealmProxyInterface) newObject;
        MenuItemRealmProxyInterface realmObjectCopy = (MenuItemRealmProxyInterface) realmObject;

        realmObjectCopy.realmSet$available(realmObjectSource.realmGet$available());
        realmObjectCopy.realmSet$valid(realmObjectSource.realmGet$valid());
        realmObjectCopy.realmSet$desc(realmObjectSource.realmGet$desc());
        realmObjectCopy.realmSet$menuId(realmObjectSource.realmGet$menuId());
        realmObjectCopy.realmSet$name(realmObjectSource.realmGet$name());
        realmObjectCopy.realmSet$price(realmObjectSource.realmGet$price());
        realmObjectCopy.realmSet$stock(realmObjectSource.realmGet$stock());
        realmObjectCopy.realmSet$photoUrl(realmObjectSource.realmGet$photoUrl());
        realmObjectCopy.realmSet$photoUrlThumb(realmObjectSource.realmGet$photoUrlThumb());
        realmObjectCopy.realmSet$addedTaxRate(realmObjectSource.realmGet$addedTaxRate());

        RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.ItemType> itemTypesList = realmObjectSource.realmGet$itemTypes();
        if (itemTypesList != null) {
            RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.ItemType> itemTypesRealmList = realmObjectCopy.realmGet$itemTypes();
            itemTypesRealmList.clear();
            for (int i = 0; i < itemTypesList.size(); i++) {
                com.rhinodesktop.foreorder_golf_consumer1.models.ItemType itemTypesItem = itemTypesList.get(i);
                com.rhinodesktop.foreorder_golf_consumer1.models.ItemType cacheitemTypes = (com.rhinodesktop.foreorder_golf_consumer1.models.ItemType) cache.get(itemTypesItem);
                if (cacheitemTypes != null) {
                    itemTypesRealmList.add(cacheitemTypes);
                } else {
                    itemTypesRealmList.add(ItemTypeRealmProxy.copyOrUpdate(realm, itemTypesItem, update, cache));
                }
            }
        }


        RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup> optionGroupsList = realmObjectSource.realmGet$optionGroups();
        if (optionGroupsList != null) {
            RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup> optionGroupsRealmList = realmObjectCopy.realmGet$optionGroups();
            optionGroupsRealmList.clear();
            for (int i = 0; i < optionGroupsList.size(); i++) {
                com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup optionGroupsItem = optionGroupsList.get(i);
                com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup cacheoptionGroups = (com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup) cache.get(optionGroupsItem);
                if (cacheoptionGroups != null) {
                    optionGroupsRealmList.add(cacheoptionGroups);
                } else {
                    optionGroupsRealmList.add(OptionGroupRealmProxy.copyOrUpdate(realm, optionGroupsItem, update, cache));
                }
            }
        }

        realmObjectCopy.realmSet$modifiedAt(realmObjectSource.realmGet$modifiedAt());
        return realmObject;
    }

    public static long insert(Realm realm, com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem.class);
        long tableNativePtr = table.getNativePtr();
        MenuItemColumnInfo columnInfo = (MenuItemColumnInfo) realm.getSchema().getColumnInfo(com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem.class);
        long pkColumnIndex = columnInfo.menuItemIdIndex;
        Object primaryKeyValue = ((MenuItemRealmProxyInterface) object).realmGet$menuItemId();
        long rowIndex = Table.NO_MATCH;
        if (primaryKeyValue == null) {
            rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
        } else {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((MenuItemRealmProxyInterface) object).realmGet$menuItemId());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((MenuItemRealmProxyInterface) object).realmGet$menuItemId());
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, rowIndex);
        Boolean realmGet$available = ((MenuItemRealmProxyInterface) object).realmGet$available();
        if (realmGet$available != null) {
            Table.nativeSetBoolean(tableNativePtr, columnInfo.availableIndex, rowIndex, realmGet$available, false);
        }
        Boolean realmGet$valid = ((MenuItemRealmProxyInterface) object).realmGet$valid();
        if (realmGet$valid != null) {
            Table.nativeSetBoolean(tableNativePtr, columnInfo.validIndex, rowIndex, realmGet$valid, false);
        }
        String realmGet$desc = ((MenuItemRealmProxyInterface) object).realmGet$desc();
        if (realmGet$desc != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.descIndex, rowIndex, realmGet$desc, false);
        }
        Number realmGet$menuId = ((MenuItemRealmProxyInterface) object).realmGet$menuId();
        if (realmGet$menuId != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.menuIdIndex, rowIndex, realmGet$menuId.longValue(), false);
        }
        String realmGet$name = ((MenuItemRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
        }
        Float realmGet$price = ((MenuItemRealmProxyInterface) object).realmGet$price();
        if (realmGet$price != null) {
            Table.nativeSetFloat(tableNativePtr, columnInfo.priceIndex, rowIndex, realmGet$price, false);
        }
        Number realmGet$stock = ((MenuItemRealmProxyInterface) object).realmGet$stock();
        if (realmGet$stock != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.stockIndex, rowIndex, realmGet$stock.longValue(), false);
        }
        String realmGet$photoUrl = ((MenuItemRealmProxyInterface) object).realmGet$photoUrl();
        if (realmGet$photoUrl != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.photoUrlIndex, rowIndex, realmGet$photoUrl, false);
        }
        String realmGet$photoUrlThumb = ((MenuItemRealmProxyInterface) object).realmGet$photoUrlThumb();
        if (realmGet$photoUrlThumb != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.photoUrlThumbIndex, rowIndex, realmGet$photoUrlThumb, false);
        }
        Double realmGet$addedTaxRate = ((MenuItemRealmProxyInterface) object).realmGet$addedTaxRate();
        if (realmGet$addedTaxRate != null) {
            Table.nativeSetDouble(tableNativePtr, columnInfo.addedTaxRateIndex, rowIndex, realmGet$addedTaxRate, false);
        }

        RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.ItemType> itemTypesList = ((MenuItemRealmProxyInterface) object).realmGet$itemTypes();
        if (itemTypesList != null) {
            OsList itemTypesOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.itemTypesIndex);
            for (com.rhinodesktop.foreorder_golf_consumer1.models.ItemType itemTypesItem : itemTypesList) {
                Long cacheItemIndexitemTypes = cache.get(itemTypesItem);
                if (cacheItemIndexitemTypes == null) {
                    cacheItemIndexitemTypes = ItemTypeRealmProxy.insert(realm, itemTypesItem, cache);
                }
                itemTypesOsList.addRow(cacheItemIndexitemTypes);
            }
        }

        RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup> optionGroupsList = ((MenuItemRealmProxyInterface) object).realmGet$optionGroups();
        if (optionGroupsList != null) {
            OsList optionGroupsOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.optionGroupsIndex);
            for (com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup optionGroupsItem : optionGroupsList) {
                Long cacheItemIndexoptionGroups = cache.get(optionGroupsItem);
                if (cacheItemIndexoptionGroups == null) {
                    cacheItemIndexoptionGroups = OptionGroupRealmProxy.insert(realm, optionGroupsItem, cache);
                }
                optionGroupsOsList.addRow(cacheItemIndexoptionGroups);
            }
        }
        java.util.Date realmGet$modifiedAt = ((MenuItemRealmProxyInterface) object).realmGet$modifiedAt();
        if (realmGet$modifiedAt != null) {
            Table.nativeSetTimestamp(tableNativePtr, columnInfo.modifiedAtIndex, rowIndex, realmGet$modifiedAt.getTime(), false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem.class);
        long tableNativePtr = table.getNativePtr();
        MenuItemColumnInfo columnInfo = (MenuItemColumnInfo) realm.getSchema().getColumnInfo(com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem.class);
        long pkColumnIndex = columnInfo.menuItemIdIndex;
        com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem object = null;
        while (objects.hasNext()) {
            object = (com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            Object primaryKeyValue = ((MenuItemRealmProxyInterface) object).realmGet$menuItemId();
            long rowIndex = Table.NO_MATCH;
            if (primaryKeyValue == null) {
                rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
            } else {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((MenuItemRealmProxyInterface) object).realmGet$menuItemId());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((MenuItemRealmProxyInterface) object).realmGet$menuItemId());
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, rowIndex);
            Boolean realmGet$available = ((MenuItemRealmProxyInterface) object).realmGet$available();
            if (realmGet$available != null) {
                Table.nativeSetBoolean(tableNativePtr, columnInfo.availableIndex, rowIndex, realmGet$available, false);
            }
            Boolean realmGet$valid = ((MenuItemRealmProxyInterface) object).realmGet$valid();
            if (realmGet$valid != null) {
                Table.nativeSetBoolean(tableNativePtr, columnInfo.validIndex, rowIndex, realmGet$valid, false);
            }
            String realmGet$desc = ((MenuItemRealmProxyInterface) object).realmGet$desc();
            if (realmGet$desc != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.descIndex, rowIndex, realmGet$desc, false);
            }
            Number realmGet$menuId = ((MenuItemRealmProxyInterface) object).realmGet$menuId();
            if (realmGet$menuId != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.menuIdIndex, rowIndex, realmGet$menuId.longValue(), false);
            }
            String realmGet$name = ((MenuItemRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
            }
            Float realmGet$price = ((MenuItemRealmProxyInterface) object).realmGet$price();
            if (realmGet$price != null) {
                Table.nativeSetFloat(tableNativePtr, columnInfo.priceIndex, rowIndex, realmGet$price, false);
            }
            Number realmGet$stock = ((MenuItemRealmProxyInterface) object).realmGet$stock();
            if (realmGet$stock != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.stockIndex, rowIndex, realmGet$stock.longValue(), false);
            }
            String realmGet$photoUrl = ((MenuItemRealmProxyInterface) object).realmGet$photoUrl();
            if (realmGet$photoUrl != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.photoUrlIndex, rowIndex, realmGet$photoUrl, false);
            }
            String realmGet$photoUrlThumb = ((MenuItemRealmProxyInterface) object).realmGet$photoUrlThumb();
            if (realmGet$photoUrlThumb != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.photoUrlThumbIndex, rowIndex, realmGet$photoUrlThumb, false);
            }
            Double realmGet$addedTaxRate = ((MenuItemRealmProxyInterface) object).realmGet$addedTaxRate();
            if (realmGet$addedTaxRate != null) {
                Table.nativeSetDouble(tableNativePtr, columnInfo.addedTaxRateIndex, rowIndex, realmGet$addedTaxRate, false);
            }

            RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.ItemType> itemTypesList = ((MenuItemRealmProxyInterface) object).realmGet$itemTypes();
            if (itemTypesList != null) {
                OsList itemTypesOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.itemTypesIndex);
                for (com.rhinodesktop.foreorder_golf_consumer1.models.ItemType itemTypesItem : itemTypesList) {
                    Long cacheItemIndexitemTypes = cache.get(itemTypesItem);
                    if (cacheItemIndexitemTypes == null) {
                        cacheItemIndexitemTypes = ItemTypeRealmProxy.insert(realm, itemTypesItem, cache);
                    }
                    itemTypesOsList.addRow(cacheItemIndexitemTypes);
                }
            }

            RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup> optionGroupsList = ((MenuItemRealmProxyInterface) object).realmGet$optionGroups();
            if (optionGroupsList != null) {
                OsList optionGroupsOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.optionGroupsIndex);
                for (com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup optionGroupsItem : optionGroupsList) {
                    Long cacheItemIndexoptionGroups = cache.get(optionGroupsItem);
                    if (cacheItemIndexoptionGroups == null) {
                        cacheItemIndexoptionGroups = OptionGroupRealmProxy.insert(realm, optionGroupsItem, cache);
                    }
                    optionGroupsOsList.addRow(cacheItemIndexoptionGroups);
                }
            }
            java.util.Date realmGet$modifiedAt = ((MenuItemRealmProxyInterface) object).realmGet$modifiedAt();
            if (realmGet$modifiedAt != null) {
                Table.nativeSetTimestamp(tableNativePtr, columnInfo.modifiedAtIndex, rowIndex, realmGet$modifiedAt.getTime(), false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem.class);
        long tableNativePtr = table.getNativePtr();
        MenuItemColumnInfo columnInfo = (MenuItemColumnInfo) realm.getSchema().getColumnInfo(com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem.class);
        long pkColumnIndex = columnInfo.menuItemIdIndex;
        Object primaryKeyValue = ((MenuItemRealmProxyInterface) object).realmGet$menuItemId();
        long rowIndex = Table.NO_MATCH;
        if (primaryKeyValue == null) {
            rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
        } else {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((MenuItemRealmProxyInterface) object).realmGet$menuItemId());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((MenuItemRealmProxyInterface) object).realmGet$menuItemId());
        }
        cache.put(object, rowIndex);
        Boolean realmGet$available = ((MenuItemRealmProxyInterface) object).realmGet$available();
        if (realmGet$available != null) {
            Table.nativeSetBoolean(tableNativePtr, columnInfo.availableIndex, rowIndex, realmGet$available, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.availableIndex, rowIndex, false);
        }
        Boolean realmGet$valid = ((MenuItemRealmProxyInterface) object).realmGet$valid();
        if (realmGet$valid != null) {
            Table.nativeSetBoolean(tableNativePtr, columnInfo.validIndex, rowIndex, realmGet$valid, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.validIndex, rowIndex, false);
        }
        String realmGet$desc = ((MenuItemRealmProxyInterface) object).realmGet$desc();
        if (realmGet$desc != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.descIndex, rowIndex, realmGet$desc, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.descIndex, rowIndex, false);
        }
        Number realmGet$menuId = ((MenuItemRealmProxyInterface) object).realmGet$menuId();
        if (realmGet$menuId != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.menuIdIndex, rowIndex, realmGet$menuId.longValue(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.menuIdIndex, rowIndex, false);
        }
        String realmGet$name = ((MenuItemRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.nameIndex, rowIndex, false);
        }
        Float realmGet$price = ((MenuItemRealmProxyInterface) object).realmGet$price();
        if (realmGet$price != null) {
            Table.nativeSetFloat(tableNativePtr, columnInfo.priceIndex, rowIndex, realmGet$price, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.priceIndex, rowIndex, false);
        }
        Number realmGet$stock = ((MenuItemRealmProxyInterface) object).realmGet$stock();
        if (realmGet$stock != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.stockIndex, rowIndex, realmGet$stock.longValue(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.stockIndex, rowIndex, false);
        }
        String realmGet$photoUrl = ((MenuItemRealmProxyInterface) object).realmGet$photoUrl();
        if (realmGet$photoUrl != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.photoUrlIndex, rowIndex, realmGet$photoUrl, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.photoUrlIndex, rowIndex, false);
        }
        String realmGet$photoUrlThumb = ((MenuItemRealmProxyInterface) object).realmGet$photoUrlThumb();
        if (realmGet$photoUrlThumb != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.photoUrlThumbIndex, rowIndex, realmGet$photoUrlThumb, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.photoUrlThumbIndex, rowIndex, false);
        }
        Double realmGet$addedTaxRate = ((MenuItemRealmProxyInterface) object).realmGet$addedTaxRate();
        if (realmGet$addedTaxRate != null) {
            Table.nativeSetDouble(tableNativePtr, columnInfo.addedTaxRateIndex, rowIndex, realmGet$addedTaxRate, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.addedTaxRateIndex, rowIndex, false);
        }

        OsList itemTypesOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.itemTypesIndex);
        RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.ItemType> itemTypesList = ((MenuItemRealmProxyInterface) object).realmGet$itemTypes();
        if (itemTypesList != null && itemTypesList.size() == itemTypesOsList.size()) {
            // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
            int objects = itemTypesList.size();
            for (int i = 0; i < objects; i++) {
                com.rhinodesktop.foreorder_golf_consumer1.models.ItemType itemTypesItem = itemTypesList.get(i);
                Long cacheItemIndexitemTypes = cache.get(itemTypesItem);
                if (cacheItemIndexitemTypes == null) {
                    cacheItemIndexitemTypes = ItemTypeRealmProxy.insertOrUpdate(realm, itemTypesItem, cache);
                }
                itemTypesOsList.setRow(i, cacheItemIndexitemTypes);
            }
        } else {
            itemTypesOsList.removeAll();
            if (itemTypesList != null) {
                for (com.rhinodesktop.foreorder_golf_consumer1.models.ItemType itemTypesItem : itemTypesList) {
                    Long cacheItemIndexitemTypes = cache.get(itemTypesItem);
                    if (cacheItemIndexitemTypes == null) {
                        cacheItemIndexitemTypes = ItemTypeRealmProxy.insertOrUpdate(realm, itemTypesItem, cache);
                    }
                    itemTypesOsList.addRow(cacheItemIndexitemTypes);
                }
            }
        }


        OsList optionGroupsOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.optionGroupsIndex);
        RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup> optionGroupsList = ((MenuItemRealmProxyInterface) object).realmGet$optionGroups();
        if (optionGroupsList != null && optionGroupsList.size() == optionGroupsOsList.size()) {
            // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
            int objects = optionGroupsList.size();
            for (int i = 0; i < objects; i++) {
                com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup optionGroupsItem = optionGroupsList.get(i);
                Long cacheItemIndexoptionGroups = cache.get(optionGroupsItem);
                if (cacheItemIndexoptionGroups == null) {
                    cacheItemIndexoptionGroups = OptionGroupRealmProxy.insertOrUpdate(realm, optionGroupsItem, cache);
                }
                optionGroupsOsList.setRow(i, cacheItemIndexoptionGroups);
            }
        } else {
            optionGroupsOsList.removeAll();
            if (optionGroupsList != null) {
                for (com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup optionGroupsItem : optionGroupsList) {
                    Long cacheItemIndexoptionGroups = cache.get(optionGroupsItem);
                    if (cacheItemIndexoptionGroups == null) {
                        cacheItemIndexoptionGroups = OptionGroupRealmProxy.insertOrUpdate(realm, optionGroupsItem, cache);
                    }
                    optionGroupsOsList.addRow(cacheItemIndexoptionGroups);
                }
            }
        }

        java.util.Date realmGet$modifiedAt = ((MenuItemRealmProxyInterface) object).realmGet$modifiedAt();
        if (realmGet$modifiedAt != null) {
            Table.nativeSetTimestamp(tableNativePtr, columnInfo.modifiedAtIndex, rowIndex, realmGet$modifiedAt.getTime(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.modifiedAtIndex, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem.class);
        long tableNativePtr = table.getNativePtr();
        MenuItemColumnInfo columnInfo = (MenuItemColumnInfo) realm.getSchema().getColumnInfo(com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem.class);
        long pkColumnIndex = columnInfo.menuItemIdIndex;
        com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem object = null;
        while (objects.hasNext()) {
            object = (com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            Object primaryKeyValue = ((MenuItemRealmProxyInterface) object).realmGet$menuItemId();
            long rowIndex = Table.NO_MATCH;
            if (primaryKeyValue == null) {
                rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
            } else {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((MenuItemRealmProxyInterface) object).realmGet$menuItemId());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((MenuItemRealmProxyInterface) object).realmGet$menuItemId());
            }
            cache.put(object, rowIndex);
            Boolean realmGet$available = ((MenuItemRealmProxyInterface) object).realmGet$available();
            if (realmGet$available != null) {
                Table.nativeSetBoolean(tableNativePtr, columnInfo.availableIndex, rowIndex, realmGet$available, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.availableIndex, rowIndex, false);
            }
            Boolean realmGet$valid = ((MenuItemRealmProxyInterface) object).realmGet$valid();
            if (realmGet$valid != null) {
                Table.nativeSetBoolean(tableNativePtr, columnInfo.validIndex, rowIndex, realmGet$valid, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.validIndex, rowIndex, false);
            }
            String realmGet$desc = ((MenuItemRealmProxyInterface) object).realmGet$desc();
            if (realmGet$desc != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.descIndex, rowIndex, realmGet$desc, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.descIndex, rowIndex, false);
            }
            Number realmGet$menuId = ((MenuItemRealmProxyInterface) object).realmGet$menuId();
            if (realmGet$menuId != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.menuIdIndex, rowIndex, realmGet$menuId.longValue(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.menuIdIndex, rowIndex, false);
            }
            String realmGet$name = ((MenuItemRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.nameIndex, rowIndex, false);
            }
            Float realmGet$price = ((MenuItemRealmProxyInterface) object).realmGet$price();
            if (realmGet$price != null) {
                Table.nativeSetFloat(tableNativePtr, columnInfo.priceIndex, rowIndex, realmGet$price, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.priceIndex, rowIndex, false);
            }
            Number realmGet$stock = ((MenuItemRealmProxyInterface) object).realmGet$stock();
            if (realmGet$stock != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.stockIndex, rowIndex, realmGet$stock.longValue(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.stockIndex, rowIndex, false);
            }
            String realmGet$photoUrl = ((MenuItemRealmProxyInterface) object).realmGet$photoUrl();
            if (realmGet$photoUrl != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.photoUrlIndex, rowIndex, realmGet$photoUrl, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.photoUrlIndex, rowIndex, false);
            }
            String realmGet$photoUrlThumb = ((MenuItemRealmProxyInterface) object).realmGet$photoUrlThumb();
            if (realmGet$photoUrlThumb != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.photoUrlThumbIndex, rowIndex, realmGet$photoUrlThumb, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.photoUrlThumbIndex, rowIndex, false);
            }
            Double realmGet$addedTaxRate = ((MenuItemRealmProxyInterface) object).realmGet$addedTaxRate();
            if (realmGet$addedTaxRate != null) {
                Table.nativeSetDouble(tableNativePtr, columnInfo.addedTaxRateIndex, rowIndex, realmGet$addedTaxRate, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.addedTaxRateIndex, rowIndex, false);
            }

            OsList itemTypesOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.itemTypesIndex);
            RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.ItemType> itemTypesList = ((MenuItemRealmProxyInterface) object).realmGet$itemTypes();
            if (itemTypesList != null && itemTypesList.size() == itemTypesOsList.size()) {
                // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
                int objectCount = itemTypesList.size();
                for (int i = 0; i < objectCount; i++) {
                    com.rhinodesktop.foreorder_golf_consumer1.models.ItemType itemTypesItem = itemTypesList.get(i);
                    Long cacheItemIndexitemTypes = cache.get(itemTypesItem);
                    if (cacheItemIndexitemTypes == null) {
                        cacheItemIndexitemTypes = ItemTypeRealmProxy.insertOrUpdate(realm, itemTypesItem, cache);
                    }
                    itemTypesOsList.setRow(i, cacheItemIndexitemTypes);
                }
            } else {
                itemTypesOsList.removeAll();
                if (itemTypesList != null) {
                    for (com.rhinodesktop.foreorder_golf_consumer1.models.ItemType itemTypesItem : itemTypesList) {
                        Long cacheItemIndexitemTypes = cache.get(itemTypesItem);
                        if (cacheItemIndexitemTypes == null) {
                            cacheItemIndexitemTypes = ItemTypeRealmProxy.insertOrUpdate(realm, itemTypesItem, cache);
                        }
                        itemTypesOsList.addRow(cacheItemIndexitemTypes);
                    }
                }
            }


            OsList optionGroupsOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.optionGroupsIndex);
            RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup> optionGroupsList = ((MenuItemRealmProxyInterface) object).realmGet$optionGroups();
            if (optionGroupsList != null && optionGroupsList.size() == optionGroupsOsList.size()) {
                // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
                int objectCount = optionGroupsList.size();
                for (int i = 0; i < objectCount; i++) {
                    com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup optionGroupsItem = optionGroupsList.get(i);
                    Long cacheItemIndexoptionGroups = cache.get(optionGroupsItem);
                    if (cacheItemIndexoptionGroups == null) {
                        cacheItemIndexoptionGroups = OptionGroupRealmProxy.insertOrUpdate(realm, optionGroupsItem, cache);
                    }
                    optionGroupsOsList.setRow(i, cacheItemIndexoptionGroups);
                }
            } else {
                optionGroupsOsList.removeAll();
                if (optionGroupsList != null) {
                    for (com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup optionGroupsItem : optionGroupsList) {
                        Long cacheItemIndexoptionGroups = cache.get(optionGroupsItem);
                        if (cacheItemIndexoptionGroups == null) {
                            cacheItemIndexoptionGroups = OptionGroupRealmProxy.insertOrUpdate(realm, optionGroupsItem, cache);
                        }
                        optionGroupsOsList.addRow(cacheItemIndexoptionGroups);
                    }
                }
            }

            java.util.Date realmGet$modifiedAt = ((MenuItemRealmProxyInterface) object).realmGet$modifiedAt();
            if (realmGet$modifiedAt != null) {
                Table.nativeSetTimestamp(tableNativePtr, columnInfo.modifiedAtIndex, rowIndex, realmGet$modifiedAt.getTime(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.modifiedAtIndex, rowIndex, false);
            }
        }
    }

    public static com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem createDetachedCopy(com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem) cachedObject.object;
            }
            unmanagedObject = (com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        MenuItemRealmProxyInterface unmanagedCopy = (MenuItemRealmProxyInterface) unmanagedObject;
        MenuItemRealmProxyInterface realmSource = (MenuItemRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$menuItemId(realmSource.realmGet$menuItemId());
        unmanagedCopy.realmSet$available(realmSource.realmGet$available());
        unmanagedCopy.realmSet$valid(realmSource.realmGet$valid());
        unmanagedCopy.realmSet$desc(realmSource.realmGet$desc());
        unmanagedCopy.realmSet$menuId(realmSource.realmGet$menuId());
        unmanagedCopy.realmSet$name(realmSource.realmGet$name());
        unmanagedCopy.realmSet$price(realmSource.realmGet$price());
        unmanagedCopy.realmSet$stock(realmSource.realmGet$stock());
        unmanagedCopy.realmSet$photoUrl(realmSource.realmGet$photoUrl());
        unmanagedCopy.realmSet$photoUrlThumb(realmSource.realmGet$photoUrlThumb());
        unmanagedCopy.realmSet$addedTaxRate(realmSource.realmGet$addedTaxRate());

        // Deep copy of itemTypes
        if (currentDepth == maxDepth) {
            unmanagedCopy.realmSet$itemTypes(null);
        } else {
            RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.ItemType> manageditemTypesList = realmSource.realmGet$itemTypes();
            RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.ItemType> unmanageditemTypesList = new RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.ItemType>();
            unmanagedCopy.realmSet$itemTypes(unmanageditemTypesList);
            int nextDepth = currentDepth + 1;
            int size = manageditemTypesList.size();
            for (int i = 0; i < size; i++) {
                com.rhinodesktop.foreorder_golf_consumer1.models.ItemType item = ItemTypeRealmProxy.createDetachedCopy(manageditemTypesList.get(i), nextDepth, maxDepth, cache);
                unmanageditemTypesList.add(item);
            }
        }

        // Deep copy of optionGroups
        if (currentDepth == maxDepth) {
            unmanagedCopy.realmSet$optionGroups(null);
        } else {
            RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup> managedoptionGroupsList = realmSource.realmGet$optionGroups();
            RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup> unmanagedoptionGroupsList = new RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup>();
            unmanagedCopy.realmSet$optionGroups(unmanagedoptionGroupsList);
            int nextDepth = currentDepth + 1;
            int size = managedoptionGroupsList.size();
            for (int i = 0; i < size; i++) {
                com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup item = OptionGroupRealmProxy.createDetachedCopy(managedoptionGroupsList.get(i), nextDepth, maxDepth, cache);
                unmanagedoptionGroupsList.add(item);
            }
        }
        unmanagedCopy.realmSet$modifiedAt(realmSource.realmGet$modifiedAt());

        return unmanagedObject;
    }

    static com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem update(Realm realm, com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem realmObject, com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem newObject, Map<RealmModel, RealmObjectProxy> cache) {
        MenuItemRealmProxyInterface realmObjectTarget = (MenuItemRealmProxyInterface) realmObject;
        MenuItemRealmProxyInterface realmObjectSource = (MenuItemRealmProxyInterface) newObject;
        realmObjectTarget.realmSet$available(realmObjectSource.realmGet$available());
        realmObjectTarget.realmSet$valid(realmObjectSource.realmGet$valid());
        realmObjectTarget.realmSet$desc(realmObjectSource.realmGet$desc());
        realmObjectTarget.realmSet$menuId(realmObjectSource.realmGet$menuId());
        realmObjectTarget.realmSet$name(realmObjectSource.realmGet$name());
        realmObjectTarget.realmSet$price(realmObjectSource.realmGet$price());
        realmObjectTarget.realmSet$stock(realmObjectSource.realmGet$stock());
        realmObjectTarget.realmSet$photoUrl(realmObjectSource.realmGet$photoUrl());
        realmObjectTarget.realmSet$photoUrlThumb(realmObjectSource.realmGet$photoUrlThumb());
        realmObjectTarget.realmSet$addedTaxRate(realmObjectSource.realmGet$addedTaxRate());
        RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.ItemType> itemTypesList = realmObjectSource.realmGet$itemTypes();
        RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.ItemType> itemTypesRealmList = realmObjectTarget.realmGet$itemTypes();
        if (itemTypesList != null && itemTypesList.size() == itemTypesRealmList.size()) {
            // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
            int objects = itemTypesList.size();
            for (int i = 0; i < objects; i++) {
                com.rhinodesktop.foreorder_golf_consumer1.models.ItemType itemTypesItem = itemTypesList.get(i);
                com.rhinodesktop.foreorder_golf_consumer1.models.ItemType cacheitemTypes = (com.rhinodesktop.foreorder_golf_consumer1.models.ItemType) cache.get(itemTypesItem);
                if (cacheitemTypes != null) {
                    itemTypesRealmList.set(i, cacheitemTypes);
                } else {
                    itemTypesRealmList.set(i, ItemTypeRealmProxy.copyOrUpdate(realm, itemTypesItem, true, cache));
                }
            }
        } else {
            itemTypesRealmList.clear();
            if (itemTypesList != null) {
                for (int i = 0; i < itemTypesList.size(); i++) {
                    com.rhinodesktop.foreorder_golf_consumer1.models.ItemType itemTypesItem = itemTypesList.get(i);
                    com.rhinodesktop.foreorder_golf_consumer1.models.ItemType cacheitemTypes = (com.rhinodesktop.foreorder_golf_consumer1.models.ItemType) cache.get(itemTypesItem);
                    if (cacheitemTypes != null) {
                        itemTypesRealmList.add(cacheitemTypes);
                    } else {
                        itemTypesRealmList.add(ItemTypeRealmProxy.copyOrUpdate(realm, itemTypesItem, true, cache));
                    }
                }
            }
        }
        RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup> optionGroupsList = realmObjectSource.realmGet$optionGroups();
        RealmList<com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup> optionGroupsRealmList = realmObjectTarget.realmGet$optionGroups();
        if (optionGroupsList != null && optionGroupsList.size() == optionGroupsRealmList.size()) {
            // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
            int objects = optionGroupsList.size();
            for (int i = 0; i < objects; i++) {
                com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup optionGroupsItem = optionGroupsList.get(i);
                com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup cacheoptionGroups = (com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup) cache.get(optionGroupsItem);
                if (cacheoptionGroups != null) {
                    optionGroupsRealmList.set(i, cacheoptionGroups);
                } else {
                    optionGroupsRealmList.set(i, OptionGroupRealmProxy.copyOrUpdate(realm, optionGroupsItem, true, cache));
                }
            }
        } else {
            optionGroupsRealmList.clear();
            if (optionGroupsList != null) {
                for (int i = 0; i < optionGroupsList.size(); i++) {
                    com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup optionGroupsItem = optionGroupsList.get(i);
                    com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup cacheoptionGroups = (com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup) cache.get(optionGroupsItem);
                    if (cacheoptionGroups != null) {
                        optionGroupsRealmList.add(cacheoptionGroups);
                    } else {
                        optionGroupsRealmList.add(OptionGroupRealmProxy.copyOrUpdate(realm, optionGroupsItem, true, cache));
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
        StringBuilder stringBuilder = new StringBuilder("MenuItem = proxy[");
        stringBuilder.append("{menuItemId:");
        stringBuilder.append(realmGet$menuItemId() != null ? realmGet$menuItemId() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{available:");
        stringBuilder.append(realmGet$available() != null ? realmGet$available() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{valid:");
        stringBuilder.append(realmGet$valid() != null ? realmGet$valid() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{desc:");
        stringBuilder.append(realmGet$desc() != null ? realmGet$desc() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{menuId:");
        stringBuilder.append(realmGet$menuId() != null ? realmGet$menuId() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{name:");
        stringBuilder.append(realmGet$name() != null ? realmGet$name() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{price:");
        stringBuilder.append(realmGet$price() != null ? realmGet$price() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{stock:");
        stringBuilder.append(realmGet$stock() != null ? realmGet$stock() : "null");
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
        stringBuilder.append("{addedTaxRate:");
        stringBuilder.append(realmGet$addedTaxRate() != null ? realmGet$addedTaxRate() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{itemTypes:");
        stringBuilder.append("RealmList<ItemType>[").append(realmGet$itemTypes().size()).append("]");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{optionGroups:");
        stringBuilder.append("RealmList<OptionGroup>[").append(realmGet$optionGroups().size()).append("]");
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
        MenuItemRealmProxy aMenuItem = (MenuItemRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aMenuItem.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aMenuItem.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aMenuItem.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
