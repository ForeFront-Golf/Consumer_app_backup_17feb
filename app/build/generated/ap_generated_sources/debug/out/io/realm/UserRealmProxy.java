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
public class UserRealmProxy extends com.rhinodesktop.foreorder_golf_consumer1.models.User
    implements RealmObjectProxy, UserRealmProxyInterface {

    static final class UserColumnInfo extends ColumnInfo {
        long userIdIndex;
        long firstNameIndex;
        long lastNameIndex;
        long phoneNumberIndex;
        long ageIndex;
        long dobIndex;
        long emailIndex;
        long permLvlIndex;
        long ratingIndex;
        long profilePhotoUrlIndex;
        long validIndex;
        long ratingCountIndex;
        long signUpCompleteIndex;
        long phoneValidIndex;
        long bannedIndex;
        long modifiedAtIndex;

        UserColumnInfo(OsSchemaInfo schemaInfo) {
            super(16);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("User");
            this.userIdIndex = addColumnDetails("userId", objectSchemaInfo);
            this.firstNameIndex = addColumnDetails("firstName", objectSchemaInfo);
            this.lastNameIndex = addColumnDetails("lastName", objectSchemaInfo);
            this.phoneNumberIndex = addColumnDetails("phoneNumber", objectSchemaInfo);
            this.ageIndex = addColumnDetails("age", objectSchemaInfo);
            this.dobIndex = addColumnDetails("dob", objectSchemaInfo);
            this.emailIndex = addColumnDetails("email", objectSchemaInfo);
            this.permLvlIndex = addColumnDetails("permLvl", objectSchemaInfo);
            this.ratingIndex = addColumnDetails("rating", objectSchemaInfo);
            this.profilePhotoUrlIndex = addColumnDetails("profilePhotoUrl", objectSchemaInfo);
            this.validIndex = addColumnDetails("valid", objectSchemaInfo);
            this.ratingCountIndex = addColumnDetails("ratingCount", objectSchemaInfo);
            this.signUpCompleteIndex = addColumnDetails("signUpComplete", objectSchemaInfo);
            this.phoneValidIndex = addColumnDetails("phoneValid", objectSchemaInfo);
            this.bannedIndex = addColumnDetails("banned", objectSchemaInfo);
            this.modifiedAtIndex = addColumnDetails("modifiedAt", objectSchemaInfo);
        }

        UserColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new UserColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final UserColumnInfo src = (UserColumnInfo) rawSrc;
            final UserColumnInfo dst = (UserColumnInfo) rawDst;
            dst.userIdIndex = src.userIdIndex;
            dst.firstNameIndex = src.firstNameIndex;
            dst.lastNameIndex = src.lastNameIndex;
            dst.phoneNumberIndex = src.phoneNumberIndex;
            dst.ageIndex = src.ageIndex;
            dst.dobIndex = src.dobIndex;
            dst.emailIndex = src.emailIndex;
            dst.permLvlIndex = src.permLvlIndex;
            dst.ratingIndex = src.ratingIndex;
            dst.profilePhotoUrlIndex = src.profilePhotoUrlIndex;
            dst.validIndex = src.validIndex;
            dst.ratingCountIndex = src.ratingCountIndex;
            dst.signUpCompleteIndex = src.signUpCompleteIndex;
            dst.phoneValidIndex = src.phoneValidIndex;
            dst.bannedIndex = src.bannedIndex;
            dst.modifiedAtIndex = src.modifiedAtIndex;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private static final List<String> FIELD_NAMES;
    static {
        List<String> fieldNames = new ArrayList<String>(16);
        fieldNames.add("userId");
        fieldNames.add("firstName");
        fieldNames.add("lastName");
        fieldNames.add("phoneNumber");
        fieldNames.add("age");
        fieldNames.add("dob");
        fieldNames.add("email");
        fieldNames.add("permLvl");
        fieldNames.add("rating");
        fieldNames.add("profilePhotoUrl");
        fieldNames.add("valid");
        fieldNames.add("ratingCount");
        fieldNames.add("signUpComplete");
        fieldNames.add("phoneValid");
        fieldNames.add("banned");
        fieldNames.add("modifiedAt");
        FIELD_NAMES = Collections.unmodifiableList(fieldNames);
    }

    private UserColumnInfo columnInfo;
    private ProxyState<com.rhinodesktop.foreorder_golf_consumer1.models.User> proxyState;

    UserRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (UserColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.rhinodesktop.foreorder_golf_consumer1.models.User>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public Integer realmGet$userId() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.userIdIndex)) {
            return null;
        }
        return (int) proxyState.getRow$realm().getLong(columnInfo.userIdIndex);
    }

    @Override
    public void realmSet$userId(Integer value) {
        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'userId' cannot be changed after object was created.");
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$firstName() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.firstNameIndex);
    }

    @Override
    public void realmSet$firstName(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.firstNameIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.firstNameIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.firstNameIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.firstNameIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$lastName() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.lastNameIndex);
    }

    @Override
    public void realmSet$lastName(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.lastNameIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.lastNameIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.lastNameIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.lastNameIndex, value);
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
    public Integer realmGet$age() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.ageIndex)) {
            return null;
        }
        return (int) proxyState.getRow$realm().getLong(columnInfo.ageIndex);
    }

    @Override
    public void realmSet$age(Integer value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.ageIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setLong(columnInfo.ageIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.ageIndex);
            return;
        }
        proxyState.getRow$realm().setLong(columnInfo.ageIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$dob() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.dobIndex);
    }

    @Override
    public void realmSet$dob(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.dobIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.dobIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.dobIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.dobIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$email() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.emailIndex);
    }

    @Override
    public void realmSet$email(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.emailIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.emailIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.emailIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.emailIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$permLvl() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.permLvlIndex);
    }

    @Override
    public void realmSet$permLvl(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.permLvlIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.permLvlIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.permLvlIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.permLvlIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public Float realmGet$rating() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.ratingIndex)) {
            return null;
        }
        return (float) proxyState.getRow$realm().getFloat(columnInfo.ratingIndex);
    }

    @Override
    public void realmSet$rating(Float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.ratingIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setFloat(columnInfo.ratingIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.ratingIndex);
            return;
        }
        proxyState.getRow$realm().setFloat(columnInfo.ratingIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$profilePhotoUrl() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.profilePhotoUrlIndex);
    }

    @Override
    public void realmSet$profilePhotoUrl(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.profilePhotoUrlIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.profilePhotoUrlIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.profilePhotoUrlIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.profilePhotoUrlIndex, value);
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
    public Integer realmGet$ratingCount() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.ratingCountIndex)) {
            return null;
        }
        return (int) proxyState.getRow$realm().getLong(columnInfo.ratingCountIndex);
    }

    @Override
    public void realmSet$ratingCount(Integer value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.ratingCountIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setLong(columnInfo.ratingCountIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.ratingCountIndex);
            return;
        }
        proxyState.getRow$realm().setLong(columnInfo.ratingCountIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public Boolean realmGet$signUpComplete() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.signUpCompleteIndex)) {
            return null;
        }
        return (boolean) proxyState.getRow$realm().getBoolean(columnInfo.signUpCompleteIndex);
    }

    @Override
    public void realmSet$signUpComplete(Boolean value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.signUpCompleteIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setBoolean(columnInfo.signUpCompleteIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.signUpCompleteIndex);
            return;
        }
        proxyState.getRow$realm().setBoolean(columnInfo.signUpCompleteIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public Boolean realmGet$phoneValid() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.phoneValidIndex)) {
            return null;
        }
        return (boolean) proxyState.getRow$realm().getBoolean(columnInfo.phoneValidIndex);
    }

    @Override
    public void realmSet$phoneValid(Boolean value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.phoneValidIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setBoolean(columnInfo.phoneValidIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phoneValidIndex);
            return;
        }
        proxyState.getRow$realm().setBoolean(columnInfo.phoneValidIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public Boolean realmGet$banned() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.bannedIndex)) {
            return null;
        }
        return (boolean) proxyState.getRow$realm().getBoolean(columnInfo.bannedIndex);
    }

    @Override
    public void realmSet$banned(Boolean value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.bannedIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setBoolean(columnInfo.bannedIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.bannedIndex);
            return;
        }
        proxyState.getRow$realm().setBoolean(columnInfo.bannedIndex, value);
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
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("User", 16, 0);
        builder.addPersistedProperty("userId", RealmFieldType.INTEGER, Property.PRIMARY_KEY, Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("firstName", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("lastName", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("phoneNumber", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("age", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("dob", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("email", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("permLvl", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("rating", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("profilePhotoUrl", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("valid", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("ratingCount", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("signUpComplete", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("phoneValid", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("banned", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("modifiedAt", RealmFieldType.DATE, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static UserColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new UserColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "User";
    }

    public static List<String> getFieldNames() {
        return FIELD_NAMES;
    }

    @SuppressWarnings("cast")
    public static com.rhinodesktop.foreorder_golf_consumer1.models.User createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.rhinodesktop.foreorder_golf_consumer1.models.User obj = null;
        if (update) {
            Table table = realm.getTable(com.rhinodesktop.foreorder_golf_consumer1.models.User.class);
            UserColumnInfo columnInfo = (UserColumnInfo) realm.getSchema().getColumnInfo(com.rhinodesktop.foreorder_golf_consumer1.models.User.class);
            long pkColumnIndex = columnInfo.userIdIndex;
            long rowIndex = Table.NO_MATCH;
            if (json.isNull("userId")) {
                rowIndex = table.findFirstNull(pkColumnIndex);
            } else {
                rowIndex = table.findFirstLong(pkColumnIndex, json.getLong("userId"));
            }
            if (rowIndex != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.rhinodesktop.foreorder_golf_consumer1.models.User.class), false, Collections.<String> emptyList());
                    obj = new io.realm.UserRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("userId")) {
                if (json.isNull("userId")) {
                    obj = (io.realm.UserRealmProxy) realm.createObjectInternal(com.rhinodesktop.foreorder_golf_consumer1.models.User.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.UserRealmProxy) realm.createObjectInternal(com.rhinodesktop.foreorder_golf_consumer1.models.User.class, json.getInt("userId"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'userId'.");
            }
        }

        final UserRealmProxyInterface objProxy = (UserRealmProxyInterface) obj;
        if (json.has("firstName")) {
            if (json.isNull("firstName")) {
                objProxy.realmSet$firstName(null);
            } else {
                objProxy.realmSet$firstName((String) json.getString("firstName"));
            }
        }
        if (json.has("lastName")) {
            if (json.isNull("lastName")) {
                objProxy.realmSet$lastName(null);
            } else {
                objProxy.realmSet$lastName((String) json.getString("lastName"));
            }
        }
        if (json.has("phoneNumber")) {
            if (json.isNull("phoneNumber")) {
                objProxy.realmSet$phoneNumber(null);
            } else {
                objProxy.realmSet$phoneNumber((String) json.getString("phoneNumber"));
            }
        }
        if (json.has("age")) {
            if (json.isNull("age")) {
                objProxy.realmSet$age(null);
            } else {
                objProxy.realmSet$age((int) json.getInt("age"));
            }
        }
        if (json.has("dob")) {
            if (json.isNull("dob")) {
                objProxy.realmSet$dob(null);
            } else {
                objProxy.realmSet$dob((String) json.getString("dob"));
            }
        }
        if (json.has("email")) {
            if (json.isNull("email")) {
                objProxy.realmSet$email(null);
            } else {
                objProxy.realmSet$email((String) json.getString("email"));
            }
        }
        if (json.has("permLvl")) {
            if (json.isNull("permLvl")) {
                objProxy.realmSet$permLvl(null);
            } else {
                objProxy.realmSet$permLvl((String) json.getString("permLvl"));
            }
        }
        if (json.has("rating")) {
            if (json.isNull("rating")) {
                objProxy.realmSet$rating(null);
            } else {
                objProxy.realmSet$rating((float) json.getDouble("rating"));
            }
        }
        if (json.has("profilePhotoUrl")) {
            if (json.isNull("profilePhotoUrl")) {
                objProxy.realmSet$profilePhotoUrl(null);
            } else {
                objProxy.realmSet$profilePhotoUrl((String) json.getString("profilePhotoUrl"));
            }
        }
        if (json.has("valid")) {
            if (json.isNull("valid")) {
                objProxy.realmSet$valid(null);
            } else {
                objProxy.realmSet$valid((boolean) json.getBoolean("valid"));
            }
        }
        if (json.has("ratingCount")) {
            if (json.isNull("ratingCount")) {
                objProxy.realmSet$ratingCount(null);
            } else {
                objProxy.realmSet$ratingCount((int) json.getInt("ratingCount"));
            }
        }
        if (json.has("signUpComplete")) {
            if (json.isNull("signUpComplete")) {
                objProxy.realmSet$signUpComplete(null);
            } else {
                objProxy.realmSet$signUpComplete((boolean) json.getBoolean("signUpComplete"));
            }
        }
        if (json.has("phoneValid")) {
            if (json.isNull("phoneValid")) {
                objProxy.realmSet$phoneValid(null);
            } else {
                objProxy.realmSet$phoneValid((boolean) json.getBoolean("phoneValid"));
            }
        }
        if (json.has("banned")) {
            if (json.isNull("banned")) {
                objProxy.realmSet$banned(null);
            } else {
                objProxy.realmSet$banned((boolean) json.getBoolean("banned"));
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
    public static com.rhinodesktop.foreorder_golf_consumer1.models.User createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.rhinodesktop.foreorder_golf_consumer1.models.User obj = new com.rhinodesktop.foreorder_golf_consumer1.models.User();
        final UserRealmProxyInterface objProxy = (UserRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("userId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$userId((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$userId(null);
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("firstName")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$firstName((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$firstName(null);
                }
            } else if (name.equals("lastName")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$lastName((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$lastName(null);
                }
            } else if (name.equals("phoneNumber")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$phoneNumber((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$phoneNumber(null);
                }
            } else if (name.equals("age")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$age((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$age(null);
                }
            } else if (name.equals("dob")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$dob((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$dob(null);
                }
            } else if (name.equals("email")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$email((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$email(null);
                }
            } else if (name.equals("permLvl")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$permLvl((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$permLvl(null);
                }
            } else if (name.equals("rating")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$rating((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$rating(null);
                }
            } else if (name.equals("profilePhotoUrl")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$profilePhotoUrl((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$profilePhotoUrl(null);
                }
            } else if (name.equals("valid")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$valid((boolean) reader.nextBoolean());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$valid(null);
                }
            } else if (name.equals("ratingCount")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$ratingCount((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$ratingCount(null);
                }
            } else if (name.equals("signUpComplete")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$signUpComplete((boolean) reader.nextBoolean());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$signUpComplete(null);
                }
            } else if (name.equals("phoneValid")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$phoneValid((boolean) reader.nextBoolean());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$phoneValid(null);
                }
            } else if (name.equals("banned")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$banned((boolean) reader.nextBoolean());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$banned(null);
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
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'userId'.");
        }
        return realm.copyToRealm(obj);
    }

    public static com.rhinodesktop.foreorder_golf_consumer1.models.User copyOrUpdate(Realm realm, com.rhinodesktop.foreorder_golf_consumer1.models.User object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
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
            return (com.rhinodesktop.foreorder_golf_consumer1.models.User) cachedRealmObject;
        }

        com.rhinodesktop.foreorder_golf_consumer1.models.User realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.rhinodesktop.foreorder_golf_consumer1.models.User.class);
            UserColumnInfo columnInfo = (UserColumnInfo) realm.getSchema().getColumnInfo(com.rhinodesktop.foreorder_golf_consumer1.models.User.class);
            long pkColumnIndex = columnInfo.userIdIndex;
            Number value = ((UserRealmProxyInterface) object).realmGet$userId();
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
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.rhinodesktop.foreorder_golf_consumer1.models.User.class), false, Collections.<String> emptyList());
                    realmObject = new io.realm.UserRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, realmObject, object, cache) : copy(realm, object, update, cache);
    }

    public static com.rhinodesktop.foreorder_golf_consumer1.models.User copy(Realm realm, com.rhinodesktop.foreorder_golf_consumer1.models.User newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.rhinodesktop.foreorder_golf_consumer1.models.User) cachedRealmObject;
        }

        // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
        com.rhinodesktop.foreorder_golf_consumer1.models.User realmObject = realm.createObjectInternal(com.rhinodesktop.foreorder_golf_consumer1.models.User.class, ((UserRealmProxyInterface) newObject).realmGet$userId(), false, Collections.<String>emptyList());
        cache.put(newObject, (RealmObjectProxy) realmObject);

        UserRealmProxyInterface realmObjectSource = (UserRealmProxyInterface) newObject;
        UserRealmProxyInterface realmObjectCopy = (UserRealmProxyInterface) realmObject;

        realmObjectCopy.realmSet$firstName(realmObjectSource.realmGet$firstName());
        realmObjectCopy.realmSet$lastName(realmObjectSource.realmGet$lastName());
        realmObjectCopy.realmSet$phoneNumber(realmObjectSource.realmGet$phoneNumber());
        realmObjectCopy.realmSet$age(realmObjectSource.realmGet$age());
        realmObjectCopy.realmSet$dob(realmObjectSource.realmGet$dob());
        realmObjectCopy.realmSet$email(realmObjectSource.realmGet$email());
        realmObjectCopy.realmSet$permLvl(realmObjectSource.realmGet$permLvl());
        realmObjectCopy.realmSet$rating(realmObjectSource.realmGet$rating());
        realmObjectCopy.realmSet$profilePhotoUrl(realmObjectSource.realmGet$profilePhotoUrl());
        realmObjectCopy.realmSet$valid(realmObjectSource.realmGet$valid());
        realmObjectCopy.realmSet$ratingCount(realmObjectSource.realmGet$ratingCount());
        realmObjectCopy.realmSet$signUpComplete(realmObjectSource.realmGet$signUpComplete());
        realmObjectCopy.realmSet$phoneValid(realmObjectSource.realmGet$phoneValid());
        realmObjectCopy.realmSet$banned(realmObjectSource.realmGet$banned());
        realmObjectCopy.realmSet$modifiedAt(realmObjectSource.realmGet$modifiedAt());
        return realmObject;
    }

    public static long insert(Realm realm, com.rhinodesktop.foreorder_golf_consumer1.models.User object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.rhinodesktop.foreorder_golf_consumer1.models.User.class);
        long tableNativePtr = table.getNativePtr();
        UserColumnInfo columnInfo = (UserColumnInfo) realm.getSchema().getColumnInfo(com.rhinodesktop.foreorder_golf_consumer1.models.User.class);
        long pkColumnIndex = columnInfo.userIdIndex;
        Object primaryKeyValue = ((UserRealmProxyInterface) object).realmGet$userId();
        long rowIndex = Table.NO_MATCH;
        if (primaryKeyValue == null) {
            rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
        } else {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((UserRealmProxyInterface) object).realmGet$userId());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((UserRealmProxyInterface) object).realmGet$userId());
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, rowIndex);
        String realmGet$firstName = ((UserRealmProxyInterface) object).realmGet$firstName();
        if (realmGet$firstName != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.firstNameIndex, rowIndex, realmGet$firstName, false);
        }
        String realmGet$lastName = ((UserRealmProxyInterface) object).realmGet$lastName();
        if (realmGet$lastName != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.lastNameIndex, rowIndex, realmGet$lastName, false);
        }
        String realmGet$phoneNumber = ((UserRealmProxyInterface) object).realmGet$phoneNumber();
        if (realmGet$phoneNumber != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phoneNumberIndex, rowIndex, realmGet$phoneNumber, false);
        }
        Number realmGet$age = ((UserRealmProxyInterface) object).realmGet$age();
        if (realmGet$age != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.ageIndex, rowIndex, realmGet$age.longValue(), false);
        }
        String realmGet$dob = ((UserRealmProxyInterface) object).realmGet$dob();
        if (realmGet$dob != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.dobIndex, rowIndex, realmGet$dob, false);
        }
        String realmGet$email = ((UserRealmProxyInterface) object).realmGet$email();
        if (realmGet$email != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.emailIndex, rowIndex, realmGet$email, false);
        }
        String realmGet$permLvl = ((UserRealmProxyInterface) object).realmGet$permLvl();
        if (realmGet$permLvl != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.permLvlIndex, rowIndex, realmGet$permLvl, false);
        }
        Float realmGet$rating = ((UserRealmProxyInterface) object).realmGet$rating();
        if (realmGet$rating != null) {
            Table.nativeSetFloat(tableNativePtr, columnInfo.ratingIndex, rowIndex, realmGet$rating, false);
        }
        String realmGet$profilePhotoUrl = ((UserRealmProxyInterface) object).realmGet$profilePhotoUrl();
        if (realmGet$profilePhotoUrl != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.profilePhotoUrlIndex, rowIndex, realmGet$profilePhotoUrl, false);
        }
        Boolean realmGet$valid = ((UserRealmProxyInterface) object).realmGet$valid();
        if (realmGet$valid != null) {
            Table.nativeSetBoolean(tableNativePtr, columnInfo.validIndex, rowIndex, realmGet$valid, false);
        }
        Number realmGet$ratingCount = ((UserRealmProxyInterface) object).realmGet$ratingCount();
        if (realmGet$ratingCount != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.ratingCountIndex, rowIndex, realmGet$ratingCount.longValue(), false);
        }
        Boolean realmGet$signUpComplete = ((UserRealmProxyInterface) object).realmGet$signUpComplete();
        if (realmGet$signUpComplete != null) {
            Table.nativeSetBoolean(tableNativePtr, columnInfo.signUpCompleteIndex, rowIndex, realmGet$signUpComplete, false);
        }
        Boolean realmGet$phoneValid = ((UserRealmProxyInterface) object).realmGet$phoneValid();
        if (realmGet$phoneValid != null) {
            Table.nativeSetBoolean(tableNativePtr, columnInfo.phoneValidIndex, rowIndex, realmGet$phoneValid, false);
        }
        Boolean realmGet$banned = ((UserRealmProxyInterface) object).realmGet$banned();
        if (realmGet$banned != null) {
            Table.nativeSetBoolean(tableNativePtr, columnInfo.bannedIndex, rowIndex, realmGet$banned, false);
        }
        java.util.Date realmGet$modifiedAt = ((UserRealmProxyInterface) object).realmGet$modifiedAt();
        if (realmGet$modifiedAt != null) {
            Table.nativeSetTimestamp(tableNativePtr, columnInfo.modifiedAtIndex, rowIndex, realmGet$modifiedAt.getTime(), false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.rhinodesktop.foreorder_golf_consumer1.models.User.class);
        long tableNativePtr = table.getNativePtr();
        UserColumnInfo columnInfo = (UserColumnInfo) realm.getSchema().getColumnInfo(com.rhinodesktop.foreorder_golf_consumer1.models.User.class);
        long pkColumnIndex = columnInfo.userIdIndex;
        com.rhinodesktop.foreorder_golf_consumer1.models.User object = null;
        while (objects.hasNext()) {
            object = (com.rhinodesktop.foreorder_golf_consumer1.models.User) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            Object primaryKeyValue = ((UserRealmProxyInterface) object).realmGet$userId();
            long rowIndex = Table.NO_MATCH;
            if (primaryKeyValue == null) {
                rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
            } else {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((UserRealmProxyInterface) object).realmGet$userId());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((UserRealmProxyInterface) object).realmGet$userId());
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, rowIndex);
            String realmGet$firstName = ((UserRealmProxyInterface) object).realmGet$firstName();
            if (realmGet$firstName != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.firstNameIndex, rowIndex, realmGet$firstName, false);
            }
            String realmGet$lastName = ((UserRealmProxyInterface) object).realmGet$lastName();
            if (realmGet$lastName != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.lastNameIndex, rowIndex, realmGet$lastName, false);
            }
            String realmGet$phoneNumber = ((UserRealmProxyInterface) object).realmGet$phoneNumber();
            if (realmGet$phoneNumber != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.phoneNumberIndex, rowIndex, realmGet$phoneNumber, false);
            }
            Number realmGet$age = ((UserRealmProxyInterface) object).realmGet$age();
            if (realmGet$age != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.ageIndex, rowIndex, realmGet$age.longValue(), false);
            }
            String realmGet$dob = ((UserRealmProxyInterface) object).realmGet$dob();
            if (realmGet$dob != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.dobIndex, rowIndex, realmGet$dob, false);
            }
            String realmGet$email = ((UserRealmProxyInterface) object).realmGet$email();
            if (realmGet$email != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.emailIndex, rowIndex, realmGet$email, false);
            }
            String realmGet$permLvl = ((UserRealmProxyInterface) object).realmGet$permLvl();
            if (realmGet$permLvl != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.permLvlIndex, rowIndex, realmGet$permLvl, false);
            }
            Float realmGet$rating = ((UserRealmProxyInterface) object).realmGet$rating();
            if (realmGet$rating != null) {
                Table.nativeSetFloat(tableNativePtr, columnInfo.ratingIndex, rowIndex, realmGet$rating, false);
            }
            String realmGet$profilePhotoUrl = ((UserRealmProxyInterface) object).realmGet$profilePhotoUrl();
            if (realmGet$profilePhotoUrl != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.profilePhotoUrlIndex, rowIndex, realmGet$profilePhotoUrl, false);
            }
            Boolean realmGet$valid = ((UserRealmProxyInterface) object).realmGet$valid();
            if (realmGet$valid != null) {
                Table.nativeSetBoolean(tableNativePtr, columnInfo.validIndex, rowIndex, realmGet$valid, false);
            }
            Number realmGet$ratingCount = ((UserRealmProxyInterface) object).realmGet$ratingCount();
            if (realmGet$ratingCount != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.ratingCountIndex, rowIndex, realmGet$ratingCount.longValue(), false);
            }
            Boolean realmGet$signUpComplete = ((UserRealmProxyInterface) object).realmGet$signUpComplete();
            if (realmGet$signUpComplete != null) {
                Table.nativeSetBoolean(tableNativePtr, columnInfo.signUpCompleteIndex, rowIndex, realmGet$signUpComplete, false);
            }
            Boolean realmGet$phoneValid = ((UserRealmProxyInterface) object).realmGet$phoneValid();
            if (realmGet$phoneValid != null) {
                Table.nativeSetBoolean(tableNativePtr, columnInfo.phoneValidIndex, rowIndex, realmGet$phoneValid, false);
            }
            Boolean realmGet$banned = ((UserRealmProxyInterface) object).realmGet$banned();
            if (realmGet$banned != null) {
                Table.nativeSetBoolean(tableNativePtr, columnInfo.bannedIndex, rowIndex, realmGet$banned, false);
            }
            java.util.Date realmGet$modifiedAt = ((UserRealmProxyInterface) object).realmGet$modifiedAt();
            if (realmGet$modifiedAt != null) {
                Table.nativeSetTimestamp(tableNativePtr, columnInfo.modifiedAtIndex, rowIndex, realmGet$modifiedAt.getTime(), false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.rhinodesktop.foreorder_golf_consumer1.models.User object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.rhinodesktop.foreorder_golf_consumer1.models.User.class);
        long tableNativePtr = table.getNativePtr();
        UserColumnInfo columnInfo = (UserColumnInfo) realm.getSchema().getColumnInfo(com.rhinodesktop.foreorder_golf_consumer1.models.User.class);
        long pkColumnIndex = columnInfo.userIdIndex;
        Object primaryKeyValue = ((UserRealmProxyInterface) object).realmGet$userId();
        long rowIndex = Table.NO_MATCH;
        if (primaryKeyValue == null) {
            rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
        } else {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((UserRealmProxyInterface) object).realmGet$userId());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((UserRealmProxyInterface) object).realmGet$userId());
        }
        cache.put(object, rowIndex);
        String realmGet$firstName = ((UserRealmProxyInterface) object).realmGet$firstName();
        if (realmGet$firstName != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.firstNameIndex, rowIndex, realmGet$firstName, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.firstNameIndex, rowIndex, false);
        }
        String realmGet$lastName = ((UserRealmProxyInterface) object).realmGet$lastName();
        if (realmGet$lastName != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.lastNameIndex, rowIndex, realmGet$lastName, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.lastNameIndex, rowIndex, false);
        }
        String realmGet$phoneNumber = ((UserRealmProxyInterface) object).realmGet$phoneNumber();
        if (realmGet$phoneNumber != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phoneNumberIndex, rowIndex, realmGet$phoneNumber, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phoneNumberIndex, rowIndex, false);
        }
        Number realmGet$age = ((UserRealmProxyInterface) object).realmGet$age();
        if (realmGet$age != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.ageIndex, rowIndex, realmGet$age.longValue(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.ageIndex, rowIndex, false);
        }
        String realmGet$dob = ((UserRealmProxyInterface) object).realmGet$dob();
        if (realmGet$dob != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.dobIndex, rowIndex, realmGet$dob, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.dobIndex, rowIndex, false);
        }
        String realmGet$email = ((UserRealmProxyInterface) object).realmGet$email();
        if (realmGet$email != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.emailIndex, rowIndex, realmGet$email, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.emailIndex, rowIndex, false);
        }
        String realmGet$permLvl = ((UserRealmProxyInterface) object).realmGet$permLvl();
        if (realmGet$permLvl != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.permLvlIndex, rowIndex, realmGet$permLvl, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.permLvlIndex, rowIndex, false);
        }
        Float realmGet$rating = ((UserRealmProxyInterface) object).realmGet$rating();
        if (realmGet$rating != null) {
            Table.nativeSetFloat(tableNativePtr, columnInfo.ratingIndex, rowIndex, realmGet$rating, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.ratingIndex, rowIndex, false);
        }
        String realmGet$profilePhotoUrl = ((UserRealmProxyInterface) object).realmGet$profilePhotoUrl();
        if (realmGet$profilePhotoUrl != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.profilePhotoUrlIndex, rowIndex, realmGet$profilePhotoUrl, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.profilePhotoUrlIndex, rowIndex, false);
        }
        Boolean realmGet$valid = ((UserRealmProxyInterface) object).realmGet$valid();
        if (realmGet$valid != null) {
            Table.nativeSetBoolean(tableNativePtr, columnInfo.validIndex, rowIndex, realmGet$valid, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.validIndex, rowIndex, false);
        }
        Number realmGet$ratingCount = ((UserRealmProxyInterface) object).realmGet$ratingCount();
        if (realmGet$ratingCount != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.ratingCountIndex, rowIndex, realmGet$ratingCount.longValue(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.ratingCountIndex, rowIndex, false);
        }
        Boolean realmGet$signUpComplete = ((UserRealmProxyInterface) object).realmGet$signUpComplete();
        if (realmGet$signUpComplete != null) {
            Table.nativeSetBoolean(tableNativePtr, columnInfo.signUpCompleteIndex, rowIndex, realmGet$signUpComplete, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.signUpCompleteIndex, rowIndex, false);
        }
        Boolean realmGet$phoneValid = ((UserRealmProxyInterface) object).realmGet$phoneValid();
        if (realmGet$phoneValid != null) {
            Table.nativeSetBoolean(tableNativePtr, columnInfo.phoneValidIndex, rowIndex, realmGet$phoneValid, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phoneValidIndex, rowIndex, false);
        }
        Boolean realmGet$banned = ((UserRealmProxyInterface) object).realmGet$banned();
        if (realmGet$banned != null) {
            Table.nativeSetBoolean(tableNativePtr, columnInfo.bannedIndex, rowIndex, realmGet$banned, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.bannedIndex, rowIndex, false);
        }
        java.util.Date realmGet$modifiedAt = ((UserRealmProxyInterface) object).realmGet$modifiedAt();
        if (realmGet$modifiedAt != null) {
            Table.nativeSetTimestamp(tableNativePtr, columnInfo.modifiedAtIndex, rowIndex, realmGet$modifiedAt.getTime(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.modifiedAtIndex, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.rhinodesktop.foreorder_golf_consumer1.models.User.class);
        long tableNativePtr = table.getNativePtr();
        UserColumnInfo columnInfo = (UserColumnInfo) realm.getSchema().getColumnInfo(com.rhinodesktop.foreorder_golf_consumer1.models.User.class);
        long pkColumnIndex = columnInfo.userIdIndex;
        com.rhinodesktop.foreorder_golf_consumer1.models.User object = null;
        while (objects.hasNext()) {
            object = (com.rhinodesktop.foreorder_golf_consumer1.models.User) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            Object primaryKeyValue = ((UserRealmProxyInterface) object).realmGet$userId();
            long rowIndex = Table.NO_MATCH;
            if (primaryKeyValue == null) {
                rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
            } else {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((UserRealmProxyInterface) object).realmGet$userId());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((UserRealmProxyInterface) object).realmGet$userId());
            }
            cache.put(object, rowIndex);
            String realmGet$firstName = ((UserRealmProxyInterface) object).realmGet$firstName();
            if (realmGet$firstName != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.firstNameIndex, rowIndex, realmGet$firstName, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.firstNameIndex, rowIndex, false);
            }
            String realmGet$lastName = ((UserRealmProxyInterface) object).realmGet$lastName();
            if (realmGet$lastName != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.lastNameIndex, rowIndex, realmGet$lastName, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.lastNameIndex, rowIndex, false);
            }
            String realmGet$phoneNumber = ((UserRealmProxyInterface) object).realmGet$phoneNumber();
            if (realmGet$phoneNumber != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.phoneNumberIndex, rowIndex, realmGet$phoneNumber, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.phoneNumberIndex, rowIndex, false);
            }
            Number realmGet$age = ((UserRealmProxyInterface) object).realmGet$age();
            if (realmGet$age != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.ageIndex, rowIndex, realmGet$age.longValue(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.ageIndex, rowIndex, false);
            }
            String realmGet$dob = ((UserRealmProxyInterface) object).realmGet$dob();
            if (realmGet$dob != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.dobIndex, rowIndex, realmGet$dob, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.dobIndex, rowIndex, false);
            }
            String realmGet$email = ((UserRealmProxyInterface) object).realmGet$email();
            if (realmGet$email != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.emailIndex, rowIndex, realmGet$email, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.emailIndex, rowIndex, false);
            }
            String realmGet$permLvl = ((UserRealmProxyInterface) object).realmGet$permLvl();
            if (realmGet$permLvl != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.permLvlIndex, rowIndex, realmGet$permLvl, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.permLvlIndex, rowIndex, false);
            }
            Float realmGet$rating = ((UserRealmProxyInterface) object).realmGet$rating();
            if (realmGet$rating != null) {
                Table.nativeSetFloat(tableNativePtr, columnInfo.ratingIndex, rowIndex, realmGet$rating, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.ratingIndex, rowIndex, false);
            }
            String realmGet$profilePhotoUrl = ((UserRealmProxyInterface) object).realmGet$profilePhotoUrl();
            if (realmGet$profilePhotoUrl != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.profilePhotoUrlIndex, rowIndex, realmGet$profilePhotoUrl, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.profilePhotoUrlIndex, rowIndex, false);
            }
            Boolean realmGet$valid = ((UserRealmProxyInterface) object).realmGet$valid();
            if (realmGet$valid != null) {
                Table.nativeSetBoolean(tableNativePtr, columnInfo.validIndex, rowIndex, realmGet$valid, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.validIndex, rowIndex, false);
            }
            Number realmGet$ratingCount = ((UserRealmProxyInterface) object).realmGet$ratingCount();
            if (realmGet$ratingCount != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.ratingCountIndex, rowIndex, realmGet$ratingCount.longValue(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.ratingCountIndex, rowIndex, false);
            }
            Boolean realmGet$signUpComplete = ((UserRealmProxyInterface) object).realmGet$signUpComplete();
            if (realmGet$signUpComplete != null) {
                Table.nativeSetBoolean(tableNativePtr, columnInfo.signUpCompleteIndex, rowIndex, realmGet$signUpComplete, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.signUpCompleteIndex, rowIndex, false);
            }
            Boolean realmGet$phoneValid = ((UserRealmProxyInterface) object).realmGet$phoneValid();
            if (realmGet$phoneValid != null) {
                Table.nativeSetBoolean(tableNativePtr, columnInfo.phoneValidIndex, rowIndex, realmGet$phoneValid, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.phoneValidIndex, rowIndex, false);
            }
            Boolean realmGet$banned = ((UserRealmProxyInterface) object).realmGet$banned();
            if (realmGet$banned != null) {
                Table.nativeSetBoolean(tableNativePtr, columnInfo.bannedIndex, rowIndex, realmGet$banned, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.bannedIndex, rowIndex, false);
            }
            java.util.Date realmGet$modifiedAt = ((UserRealmProxyInterface) object).realmGet$modifiedAt();
            if (realmGet$modifiedAt != null) {
                Table.nativeSetTimestamp(tableNativePtr, columnInfo.modifiedAtIndex, rowIndex, realmGet$modifiedAt.getTime(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.modifiedAtIndex, rowIndex, false);
            }
        }
    }

    public static com.rhinodesktop.foreorder_golf_consumer1.models.User createDetachedCopy(com.rhinodesktop.foreorder_golf_consumer1.models.User realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.rhinodesktop.foreorder_golf_consumer1.models.User unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.rhinodesktop.foreorder_golf_consumer1.models.User();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.rhinodesktop.foreorder_golf_consumer1.models.User) cachedObject.object;
            }
            unmanagedObject = (com.rhinodesktop.foreorder_golf_consumer1.models.User) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        UserRealmProxyInterface unmanagedCopy = (UserRealmProxyInterface) unmanagedObject;
        UserRealmProxyInterface realmSource = (UserRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$userId(realmSource.realmGet$userId());
        unmanagedCopy.realmSet$firstName(realmSource.realmGet$firstName());
        unmanagedCopy.realmSet$lastName(realmSource.realmGet$lastName());
        unmanagedCopy.realmSet$phoneNumber(realmSource.realmGet$phoneNumber());
        unmanagedCopy.realmSet$age(realmSource.realmGet$age());
        unmanagedCopy.realmSet$dob(realmSource.realmGet$dob());
        unmanagedCopy.realmSet$email(realmSource.realmGet$email());
        unmanagedCopy.realmSet$permLvl(realmSource.realmGet$permLvl());
        unmanagedCopy.realmSet$rating(realmSource.realmGet$rating());
        unmanagedCopy.realmSet$profilePhotoUrl(realmSource.realmGet$profilePhotoUrl());
        unmanagedCopy.realmSet$valid(realmSource.realmGet$valid());
        unmanagedCopy.realmSet$ratingCount(realmSource.realmGet$ratingCount());
        unmanagedCopy.realmSet$signUpComplete(realmSource.realmGet$signUpComplete());
        unmanagedCopy.realmSet$phoneValid(realmSource.realmGet$phoneValid());
        unmanagedCopy.realmSet$banned(realmSource.realmGet$banned());
        unmanagedCopy.realmSet$modifiedAt(realmSource.realmGet$modifiedAt());

        return unmanagedObject;
    }

    static com.rhinodesktop.foreorder_golf_consumer1.models.User update(Realm realm, com.rhinodesktop.foreorder_golf_consumer1.models.User realmObject, com.rhinodesktop.foreorder_golf_consumer1.models.User newObject, Map<RealmModel, RealmObjectProxy> cache) {
        UserRealmProxyInterface realmObjectTarget = (UserRealmProxyInterface) realmObject;
        UserRealmProxyInterface realmObjectSource = (UserRealmProxyInterface) newObject;
        realmObjectTarget.realmSet$firstName(realmObjectSource.realmGet$firstName());
        realmObjectTarget.realmSet$lastName(realmObjectSource.realmGet$lastName());
        realmObjectTarget.realmSet$phoneNumber(realmObjectSource.realmGet$phoneNumber());
        realmObjectTarget.realmSet$age(realmObjectSource.realmGet$age());
        realmObjectTarget.realmSet$dob(realmObjectSource.realmGet$dob());
        realmObjectTarget.realmSet$email(realmObjectSource.realmGet$email());
        realmObjectTarget.realmSet$permLvl(realmObjectSource.realmGet$permLvl());
        realmObjectTarget.realmSet$rating(realmObjectSource.realmGet$rating());
        realmObjectTarget.realmSet$profilePhotoUrl(realmObjectSource.realmGet$profilePhotoUrl());
        realmObjectTarget.realmSet$valid(realmObjectSource.realmGet$valid());
        realmObjectTarget.realmSet$ratingCount(realmObjectSource.realmGet$ratingCount());
        realmObjectTarget.realmSet$signUpComplete(realmObjectSource.realmGet$signUpComplete());
        realmObjectTarget.realmSet$phoneValid(realmObjectSource.realmGet$phoneValid());
        realmObjectTarget.realmSet$banned(realmObjectSource.realmGet$banned());
        realmObjectTarget.realmSet$modifiedAt(realmObjectSource.realmGet$modifiedAt());
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("User = proxy[");
        stringBuilder.append("{userId:");
        stringBuilder.append(realmGet$userId() != null ? realmGet$userId() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{firstName:");
        stringBuilder.append(realmGet$firstName() != null ? realmGet$firstName() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{lastName:");
        stringBuilder.append(realmGet$lastName() != null ? realmGet$lastName() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phoneNumber:");
        stringBuilder.append(realmGet$phoneNumber() != null ? realmGet$phoneNumber() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{age:");
        stringBuilder.append(realmGet$age() != null ? realmGet$age() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{dob:");
        stringBuilder.append(realmGet$dob() != null ? realmGet$dob() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{email:");
        stringBuilder.append(realmGet$email() != null ? realmGet$email() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{permLvl:");
        stringBuilder.append(realmGet$permLvl() != null ? realmGet$permLvl() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{rating:");
        stringBuilder.append(realmGet$rating() != null ? realmGet$rating() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{profilePhotoUrl:");
        stringBuilder.append(realmGet$profilePhotoUrl() != null ? realmGet$profilePhotoUrl() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{valid:");
        stringBuilder.append(realmGet$valid() != null ? realmGet$valid() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{ratingCount:");
        stringBuilder.append(realmGet$ratingCount() != null ? realmGet$ratingCount() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{signUpComplete:");
        stringBuilder.append(realmGet$signUpComplete() != null ? realmGet$signUpComplete() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phoneValid:");
        stringBuilder.append(realmGet$phoneValid() != null ? realmGet$phoneValid() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{banned:");
        stringBuilder.append(realmGet$banned() != null ? realmGet$banned() : "null");
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
        UserRealmProxy aUser = (UserRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aUser.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aUser.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aUser.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
