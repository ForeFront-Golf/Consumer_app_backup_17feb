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
public class MembershipRealmProxy extends com.rhinodesktop.foreorder_golf_consumer1.models.Membership
    implements RealmObjectProxy, MembershipRealmProxyInterface {

    static final class MembershipColumnInfo extends ColumnInfo {
        long clubIdIndex;
        long clubIndex;
        long firstNameIndex;
        long lastNameIndex;
        long memberCodeIndex;
        long membershipIdIndex;
        long notesIndex;
        long phoneNumberIndex;
        long userIdIndex;
        long validIndex;

        MembershipColumnInfo(OsSchemaInfo schemaInfo) {
            super(10);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("Membership");
            this.clubIdIndex = addColumnDetails("clubId", objectSchemaInfo);
            this.clubIndex = addColumnDetails("club", objectSchemaInfo);
            this.firstNameIndex = addColumnDetails("firstName", objectSchemaInfo);
            this.lastNameIndex = addColumnDetails("lastName", objectSchemaInfo);
            this.memberCodeIndex = addColumnDetails("memberCode", objectSchemaInfo);
            this.membershipIdIndex = addColumnDetails("membershipId", objectSchemaInfo);
            this.notesIndex = addColumnDetails("notes", objectSchemaInfo);
            this.phoneNumberIndex = addColumnDetails("phoneNumber", objectSchemaInfo);
            this.userIdIndex = addColumnDetails("userId", objectSchemaInfo);
            this.validIndex = addColumnDetails("valid", objectSchemaInfo);
        }

        MembershipColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new MembershipColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final MembershipColumnInfo src = (MembershipColumnInfo) rawSrc;
            final MembershipColumnInfo dst = (MembershipColumnInfo) rawDst;
            dst.clubIdIndex = src.clubIdIndex;
            dst.clubIndex = src.clubIndex;
            dst.firstNameIndex = src.firstNameIndex;
            dst.lastNameIndex = src.lastNameIndex;
            dst.memberCodeIndex = src.memberCodeIndex;
            dst.membershipIdIndex = src.membershipIdIndex;
            dst.notesIndex = src.notesIndex;
            dst.phoneNumberIndex = src.phoneNumberIndex;
            dst.userIdIndex = src.userIdIndex;
            dst.validIndex = src.validIndex;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private static final List<String> FIELD_NAMES;
    static {
        List<String> fieldNames = new ArrayList<String>(10);
        fieldNames.add("clubId");
        fieldNames.add("club");
        fieldNames.add("firstName");
        fieldNames.add("lastName");
        fieldNames.add("memberCode");
        fieldNames.add("membershipId");
        fieldNames.add("notes");
        fieldNames.add("phoneNumber");
        fieldNames.add("userId");
        fieldNames.add("valid");
        FIELD_NAMES = Collections.unmodifiableList(fieldNames);
    }

    private MembershipColumnInfo columnInfo;
    private ProxyState<com.rhinodesktop.foreorder_golf_consumer1.models.Membership> proxyState;

    MembershipRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (MembershipColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.rhinodesktop.foreorder_golf_consumer1.models.Membership>(this);
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
    public com.rhinodesktop.foreorder_golf_consumer1.models.Club realmGet$club() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNullLink(columnInfo.clubIndex)) {
            return null;
        }
        return proxyState.getRealm$realm().get(com.rhinodesktop.foreorder_golf_consumer1.models.Club.class, proxyState.getRow$realm().getLink(columnInfo.clubIndex), false, Collections.<String>emptyList());
    }

    @Override
    public void realmSet$club(com.rhinodesktop.foreorder_golf_consumer1.models.Club value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("club")) {
                return;
            }
            if (value != null && !RealmObject.isManaged(value)) {
                value = ((Realm) proxyState.getRealm$realm()).copyToRealm(value);
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                // Table#nullifyLink() does not support default value. Just using Row.
                row.nullifyLink(columnInfo.clubIndex);
                return;
            }
            proxyState.checkValidObject(value);
            row.getTable().setLink(columnInfo.clubIndex, row.getIndex(), ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getIndex(), true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().nullifyLink(columnInfo.clubIndex);
            return;
        }
        proxyState.checkValidObject(value);
        proxyState.getRow$realm().setLink(columnInfo.clubIndex, ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getIndex());
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
    public String realmGet$memberCode() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.memberCodeIndex);
    }

    @Override
    public void realmSet$memberCode(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.memberCodeIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.memberCodeIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.memberCodeIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.memberCodeIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public Integer realmGet$membershipId() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.membershipIdIndex)) {
            return null;
        }
        return (int) proxyState.getRow$realm().getLong(columnInfo.membershipIdIndex);
    }

    @Override
    public void realmSet$membershipId(Integer value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.membershipIdIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setLong(columnInfo.membershipIdIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.membershipIdIndex);
            return;
        }
        proxyState.getRow$realm().setLong(columnInfo.membershipIdIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$notes() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.notesIndex);
    }

    @Override
    public void realmSet$notes(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.notesIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.notesIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.notesIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.notesIndex, value);
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
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.userIdIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setLong(columnInfo.userIdIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.userIdIndex);
            return;
        }
        proxyState.getRow$realm().setLong(columnInfo.userIdIndex, value);
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

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("Membership", 10, 0);
        builder.addPersistedProperty("clubId", RealmFieldType.INTEGER, Property.PRIMARY_KEY, Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedLinkProperty("club", RealmFieldType.OBJECT, "Club");
        builder.addPersistedProperty("firstName", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("lastName", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("memberCode", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("membershipId", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("notes", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("phoneNumber", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("userId", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("valid", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static MembershipColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new MembershipColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "Membership";
    }

    public static List<String> getFieldNames() {
        return FIELD_NAMES;
    }

    @SuppressWarnings("cast")
    public static com.rhinodesktop.foreorder_golf_consumer1.models.Membership createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = new ArrayList<String>(1);
        com.rhinodesktop.foreorder_golf_consumer1.models.Membership obj = null;
        if (update) {
            Table table = realm.getTable(com.rhinodesktop.foreorder_golf_consumer1.models.Membership.class);
            MembershipColumnInfo columnInfo = (MembershipColumnInfo) realm.getSchema().getColumnInfo(com.rhinodesktop.foreorder_golf_consumer1.models.Membership.class);
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
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.rhinodesktop.foreorder_golf_consumer1.models.Membership.class), false, Collections.<String> emptyList());
                    obj = new io.realm.MembershipRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("club")) {
                excludeFields.add("club");
            }
            if (json.has("clubId")) {
                if (json.isNull("clubId")) {
                    obj = (io.realm.MembershipRealmProxy) realm.createObjectInternal(com.rhinodesktop.foreorder_golf_consumer1.models.Membership.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.MembershipRealmProxy) realm.createObjectInternal(com.rhinodesktop.foreorder_golf_consumer1.models.Membership.class, json.getInt("clubId"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'clubId'.");
            }
        }

        final MembershipRealmProxyInterface objProxy = (MembershipRealmProxyInterface) obj;
        if (json.has("club")) {
            if (json.isNull("club")) {
                objProxy.realmSet$club(null);
            } else {
                com.rhinodesktop.foreorder_golf_consumer1.models.Club clubObj = ClubRealmProxy.createOrUpdateUsingJsonObject(realm, json.getJSONObject("club"), update);
                objProxy.realmSet$club(clubObj);
            }
        }
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
        if (json.has("memberCode")) {
            if (json.isNull("memberCode")) {
                objProxy.realmSet$memberCode(null);
            } else {
                objProxy.realmSet$memberCode((String) json.getString("memberCode"));
            }
        }
        if (json.has("membershipId")) {
            if (json.isNull("membershipId")) {
                objProxy.realmSet$membershipId(null);
            } else {
                objProxy.realmSet$membershipId((int) json.getInt("membershipId"));
            }
        }
        if (json.has("notes")) {
            if (json.isNull("notes")) {
                objProxy.realmSet$notes(null);
            } else {
                objProxy.realmSet$notes((String) json.getString("notes"));
            }
        }
        if (json.has("phoneNumber")) {
            if (json.isNull("phoneNumber")) {
                objProxy.realmSet$phoneNumber(null);
            } else {
                objProxy.realmSet$phoneNumber((String) json.getString("phoneNumber"));
            }
        }
        if (json.has("userId")) {
            if (json.isNull("userId")) {
                objProxy.realmSet$userId(null);
            } else {
                objProxy.realmSet$userId((int) json.getInt("userId"));
            }
        }
        if (json.has("valid")) {
            if (json.isNull("valid")) {
                objProxy.realmSet$valid(null);
            } else {
                objProxy.realmSet$valid((boolean) json.getBoolean("valid"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.rhinodesktop.foreorder_golf_consumer1.models.Membership createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.rhinodesktop.foreorder_golf_consumer1.models.Membership obj = new com.rhinodesktop.foreorder_golf_consumer1.models.Membership();
        final MembershipRealmProxyInterface objProxy = (MembershipRealmProxyInterface) obj;
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
            } else if (name.equals("club")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$club(null);
                } else {
                    com.rhinodesktop.foreorder_golf_consumer1.models.Club clubObj = ClubRealmProxy.createUsingJsonStream(realm, reader);
                    objProxy.realmSet$club(clubObj);
                }
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
            } else if (name.equals("memberCode")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$memberCode((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$memberCode(null);
                }
            } else if (name.equals("membershipId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$membershipId((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$membershipId(null);
                }
            } else if (name.equals("notes")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$notes((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$notes(null);
                }
            } else if (name.equals("phoneNumber")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$phoneNumber((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$phoneNumber(null);
                }
            } else if (name.equals("userId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$userId((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$userId(null);
                }
            } else if (name.equals("valid")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$valid((boolean) reader.nextBoolean());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$valid(null);
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

    public static com.rhinodesktop.foreorder_golf_consumer1.models.Membership copyOrUpdate(Realm realm, com.rhinodesktop.foreorder_golf_consumer1.models.Membership object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
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
            return (com.rhinodesktop.foreorder_golf_consumer1.models.Membership) cachedRealmObject;
        }

        com.rhinodesktop.foreorder_golf_consumer1.models.Membership realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.rhinodesktop.foreorder_golf_consumer1.models.Membership.class);
            MembershipColumnInfo columnInfo = (MembershipColumnInfo) realm.getSchema().getColumnInfo(com.rhinodesktop.foreorder_golf_consumer1.models.Membership.class);
            long pkColumnIndex = columnInfo.clubIdIndex;
            Number value = ((MembershipRealmProxyInterface) object).realmGet$clubId();
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
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.rhinodesktop.foreorder_golf_consumer1.models.Membership.class), false, Collections.<String> emptyList());
                    realmObject = new io.realm.MembershipRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, realmObject, object, cache) : copy(realm, object, update, cache);
    }

    public static com.rhinodesktop.foreorder_golf_consumer1.models.Membership copy(Realm realm, com.rhinodesktop.foreorder_golf_consumer1.models.Membership newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.rhinodesktop.foreorder_golf_consumer1.models.Membership) cachedRealmObject;
        }

        // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
        com.rhinodesktop.foreorder_golf_consumer1.models.Membership realmObject = realm.createObjectInternal(com.rhinodesktop.foreorder_golf_consumer1.models.Membership.class, ((MembershipRealmProxyInterface) newObject).realmGet$clubId(), false, Collections.<String>emptyList());
        cache.put(newObject, (RealmObjectProxy) realmObject);

        MembershipRealmProxyInterface realmObjectSource = (MembershipRealmProxyInterface) newObject;
        MembershipRealmProxyInterface realmObjectCopy = (MembershipRealmProxyInterface) realmObject;


        com.rhinodesktop.foreorder_golf_consumer1.models.Club clubObj = realmObjectSource.realmGet$club();
        if (clubObj == null) {
            realmObjectCopy.realmSet$club(null);
        } else {
            com.rhinodesktop.foreorder_golf_consumer1.models.Club cacheclub = (com.rhinodesktop.foreorder_golf_consumer1.models.Club) cache.get(clubObj);
            if (cacheclub != null) {
                realmObjectCopy.realmSet$club(cacheclub);
            } else {
                realmObjectCopy.realmSet$club(ClubRealmProxy.copyOrUpdate(realm, clubObj, update, cache));
            }
        }
        realmObjectCopy.realmSet$firstName(realmObjectSource.realmGet$firstName());
        realmObjectCopy.realmSet$lastName(realmObjectSource.realmGet$lastName());
        realmObjectCopy.realmSet$memberCode(realmObjectSource.realmGet$memberCode());
        realmObjectCopy.realmSet$membershipId(realmObjectSource.realmGet$membershipId());
        realmObjectCopy.realmSet$notes(realmObjectSource.realmGet$notes());
        realmObjectCopy.realmSet$phoneNumber(realmObjectSource.realmGet$phoneNumber());
        realmObjectCopy.realmSet$userId(realmObjectSource.realmGet$userId());
        realmObjectCopy.realmSet$valid(realmObjectSource.realmGet$valid());
        return realmObject;
    }

    public static long insert(Realm realm, com.rhinodesktop.foreorder_golf_consumer1.models.Membership object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.rhinodesktop.foreorder_golf_consumer1.models.Membership.class);
        long tableNativePtr = table.getNativePtr();
        MembershipColumnInfo columnInfo = (MembershipColumnInfo) realm.getSchema().getColumnInfo(com.rhinodesktop.foreorder_golf_consumer1.models.Membership.class);
        long pkColumnIndex = columnInfo.clubIdIndex;
        Object primaryKeyValue = ((MembershipRealmProxyInterface) object).realmGet$clubId();
        long rowIndex = Table.NO_MATCH;
        if (primaryKeyValue == null) {
            rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
        } else {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((MembershipRealmProxyInterface) object).realmGet$clubId());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((MembershipRealmProxyInterface) object).realmGet$clubId());
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, rowIndex);

        com.rhinodesktop.foreorder_golf_consumer1.models.Club clubObj = ((MembershipRealmProxyInterface) object).realmGet$club();
        if (clubObj != null) {
            Long cacheclub = cache.get(clubObj);
            if (cacheclub == null) {
                cacheclub = ClubRealmProxy.insert(realm, clubObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.clubIndex, rowIndex, cacheclub, false);
        }
        String realmGet$firstName = ((MembershipRealmProxyInterface) object).realmGet$firstName();
        if (realmGet$firstName != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.firstNameIndex, rowIndex, realmGet$firstName, false);
        }
        String realmGet$lastName = ((MembershipRealmProxyInterface) object).realmGet$lastName();
        if (realmGet$lastName != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.lastNameIndex, rowIndex, realmGet$lastName, false);
        }
        String realmGet$memberCode = ((MembershipRealmProxyInterface) object).realmGet$memberCode();
        if (realmGet$memberCode != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.memberCodeIndex, rowIndex, realmGet$memberCode, false);
        }
        Number realmGet$membershipId = ((MembershipRealmProxyInterface) object).realmGet$membershipId();
        if (realmGet$membershipId != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.membershipIdIndex, rowIndex, realmGet$membershipId.longValue(), false);
        }
        String realmGet$notes = ((MembershipRealmProxyInterface) object).realmGet$notes();
        if (realmGet$notes != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.notesIndex, rowIndex, realmGet$notes, false);
        }
        String realmGet$phoneNumber = ((MembershipRealmProxyInterface) object).realmGet$phoneNumber();
        if (realmGet$phoneNumber != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phoneNumberIndex, rowIndex, realmGet$phoneNumber, false);
        }
        Number realmGet$userId = ((MembershipRealmProxyInterface) object).realmGet$userId();
        if (realmGet$userId != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.userIdIndex, rowIndex, realmGet$userId.longValue(), false);
        }
        Boolean realmGet$valid = ((MembershipRealmProxyInterface) object).realmGet$valid();
        if (realmGet$valid != null) {
            Table.nativeSetBoolean(tableNativePtr, columnInfo.validIndex, rowIndex, realmGet$valid, false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.rhinodesktop.foreorder_golf_consumer1.models.Membership.class);
        long tableNativePtr = table.getNativePtr();
        MembershipColumnInfo columnInfo = (MembershipColumnInfo) realm.getSchema().getColumnInfo(com.rhinodesktop.foreorder_golf_consumer1.models.Membership.class);
        long pkColumnIndex = columnInfo.clubIdIndex;
        com.rhinodesktop.foreorder_golf_consumer1.models.Membership object = null;
        while (objects.hasNext()) {
            object = (com.rhinodesktop.foreorder_golf_consumer1.models.Membership) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            Object primaryKeyValue = ((MembershipRealmProxyInterface) object).realmGet$clubId();
            long rowIndex = Table.NO_MATCH;
            if (primaryKeyValue == null) {
                rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
            } else {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((MembershipRealmProxyInterface) object).realmGet$clubId());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((MembershipRealmProxyInterface) object).realmGet$clubId());
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, rowIndex);

            com.rhinodesktop.foreorder_golf_consumer1.models.Club clubObj = ((MembershipRealmProxyInterface) object).realmGet$club();
            if (clubObj != null) {
                Long cacheclub = cache.get(clubObj);
                if (cacheclub == null) {
                    cacheclub = ClubRealmProxy.insert(realm, clubObj, cache);
                }
                table.setLink(columnInfo.clubIndex, rowIndex, cacheclub, false);
            }
            String realmGet$firstName = ((MembershipRealmProxyInterface) object).realmGet$firstName();
            if (realmGet$firstName != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.firstNameIndex, rowIndex, realmGet$firstName, false);
            }
            String realmGet$lastName = ((MembershipRealmProxyInterface) object).realmGet$lastName();
            if (realmGet$lastName != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.lastNameIndex, rowIndex, realmGet$lastName, false);
            }
            String realmGet$memberCode = ((MembershipRealmProxyInterface) object).realmGet$memberCode();
            if (realmGet$memberCode != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.memberCodeIndex, rowIndex, realmGet$memberCode, false);
            }
            Number realmGet$membershipId = ((MembershipRealmProxyInterface) object).realmGet$membershipId();
            if (realmGet$membershipId != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.membershipIdIndex, rowIndex, realmGet$membershipId.longValue(), false);
            }
            String realmGet$notes = ((MembershipRealmProxyInterface) object).realmGet$notes();
            if (realmGet$notes != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.notesIndex, rowIndex, realmGet$notes, false);
            }
            String realmGet$phoneNumber = ((MembershipRealmProxyInterface) object).realmGet$phoneNumber();
            if (realmGet$phoneNumber != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.phoneNumberIndex, rowIndex, realmGet$phoneNumber, false);
            }
            Number realmGet$userId = ((MembershipRealmProxyInterface) object).realmGet$userId();
            if (realmGet$userId != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.userIdIndex, rowIndex, realmGet$userId.longValue(), false);
            }
            Boolean realmGet$valid = ((MembershipRealmProxyInterface) object).realmGet$valid();
            if (realmGet$valid != null) {
                Table.nativeSetBoolean(tableNativePtr, columnInfo.validIndex, rowIndex, realmGet$valid, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.rhinodesktop.foreorder_golf_consumer1.models.Membership object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.rhinodesktop.foreorder_golf_consumer1.models.Membership.class);
        long tableNativePtr = table.getNativePtr();
        MembershipColumnInfo columnInfo = (MembershipColumnInfo) realm.getSchema().getColumnInfo(com.rhinodesktop.foreorder_golf_consumer1.models.Membership.class);
        long pkColumnIndex = columnInfo.clubIdIndex;
        Object primaryKeyValue = ((MembershipRealmProxyInterface) object).realmGet$clubId();
        long rowIndex = Table.NO_MATCH;
        if (primaryKeyValue == null) {
            rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
        } else {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((MembershipRealmProxyInterface) object).realmGet$clubId());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((MembershipRealmProxyInterface) object).realmGet$clubId());
        }
        cache.put(object, rowIndex);

        com.rhinodesktop.foreorder_golf_consumer1.models.Club clubObj = ((MembershipRealmProxyInterface) object).realmGet$club();
        if (clubObj != null) {
            Long cacheclub = cache.get(clubObj);
            if (cacheclub == null) {
                cacheclub = ClubRealmProxy.insertOrUpdate(realm, clubObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.clubIndex, rowIndex, cacheclub, false);
        } else {
            Table.nativeNullifyLink(tableNativePtr, columnInfo.clubIndex, rowIndex);
        }
        String realmGet$firstName = ((MembershipRealmProxyInterface) object).realmGet$firstName();
        if (realmGet$firstName != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.firstNameIndex, rowIndex, realmGet$firstName, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.firstNameIndex, rowIndex, false);
        }
        String realmGet$lastName = ((MembershipRealmProxyInterface) object).realmGet$lastName();
        if (realmGet$lastName != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.lastNameIndex, rowIndex, realmGet$lastName, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.lastNameIndex, rowIndex, false);
        }
        String realmGet$memberCode = ((MembershipRealmProxyInterface) object).realmGet$memberCode();
        if (realmGet$memberCode != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.memberCodeIndex, rowIndex, realmGet$memberCode, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.memberCodeIndex, rowIndex, false);
        }
        Number realmGet$membershipId = ((MembershipRealmProxyInterface) object).realmGet$membershipId();
        if (realmGet$membershipId != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.membershipIdIndex, rowIndex, realmGet$membershipId.longValue(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.membershipIdIndex, rowIndex, false);
        }
        String realmGet$notes = ((MembershipRealmProxyInterface) object).realmGet$notes();
        if (realmGet$notes != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.notesIndex, rowIndex, realmGet$notes, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.notesIndex, rowIndex, false);
        }
        String realmGet$phoneNumber = ((MembershipRealmProxyInterface) object).realmGet$phoneNumber();
        if (realmGet$phoneNumber != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phoneNumberIndex, rowIndex, realmGet$phoneNumber, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phoneNumberIndex, rowIndex, false);
        }
        Number realmGet$userId = ((MembershipRealmProxyInterface) object).realmGet$userId();
        if (realmGet$userId != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.userIdIndex, rowIndex, realmGet$userId.longValue(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.userIdIndex, rowIndex, false);
        }
        Boolean realmGet$valid = ((MembershipRealmProxyInterface) object).realmGet$valid();
        if (realmGet$valid != null) {
            Table.nativeSetBoolean(tableNativePtr, columnInfo.validIndex, rowIndex, realmGet$valid, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.validIndex, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.rhinodesktop.foreorder_golf_consumer1.models.Membership.class);
        long tableNativePtr = table.getNativePtr();
        MembershipColumnInfo columnInfo = (MembershipColumnInfo) realm.getSchema().getColumnInfo(com.rhinodesktop.foreorder_golf_consumer1.models.Membership.class);
        long pkColumnIndex = columnInfo.clubIdIndex;
        com.rhinodesktop.foreorder_golf_consumer1.models.Membership object = null;
        while (objects.hasNext()) {
            object = (com.rhinodesktop.foreorder_golf_consumer1.models.Membership) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            Object primaryKeyValue = ((MembershipRealmProxyInterface) object).realmGet$clubId();
            long rowIndex = Table.NO_MATCH;
            if (primaryKeyValue == null) {
                rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
            } else {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((MembershipRealmProxyInterface) object).realmGet$clubId());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((MembershipRealmProxyInterface) object).realmGet$clubId());
            }
            cache.put(object, rowIndex);

            com.rhinodesktop.foreorder_golf_consumer1.models.Club clubObj = ((MembershipRealmProxyInterface) object).realmGet$club();
            if (clubObj != null) {
                Long cacheclub = cache.get(clubObj);
                if (cacheclub == null) {
                    cacheclub = ClubRealmProxy.insertOrUpdate(realm, clubObj, cache);
                }
                Table.nativeSetLink(tableNativePtr, columnInfo.clubIndex, rowIndex, cacheclub, false);
            } else {
                Table.nativeNullifyLink(tableNativePtr, columnInfo.clubIndex, rowIndex);
            }
            String realmGet$firstName = ((MembershipRealmProxyInterface) object).realmGet$firstName();
            if (realmGet$firstName != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.firstNameIndex, rowIndex, realmGet$firstName, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.firstNameIndex, rowIndex, false);
            }
            String realmGet$lastName = ((MembershipRealmProxyInterface) object).realmGet$lastName();
            if (realmGet$lastName != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.lastNameIndex, rowIndex, realmGet$lastName, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.lastNameIndex, rowIndex, false);
            }
            String realmGet$memberCode = ((MembershipRealmProxyInterface) object).realmGet$memberCode();
            if (realmGet$memberCode != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.memberCodeIndex, rowIndex, realmGet$memberCode, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.memberCodeIndex, rowIndex, false);
            }
            Number realmGet$membershipId = ((MembershipRealmProxyInterface) object).realmGet$membershipId();
            if (realmGet$membershipId != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.membershipIdIndex, rowIndex, realmGet$membershipId.longValue(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.membershipIdIndex, rowIndex, false);
            }
            String realmGet$notes = ((MembershipRealmProxyInterface) object).realmGet$notes();
            if (realmGet$notes != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.notesIndex, rowIndex, realmGet$notes, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.notesIndex, rowIndex, false);
            }
            String realmGet$phoneNumber = ((MembershipRealmProxyInterface) object).realmGet$phoneNumber();
            if (realmGet$phoneNumber != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.phoneNumberIndex, rowIndex, realmGet$phoneNumber, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.phoneNumberIndex, rowIndex, false);
            }
            Number realmGet$userId = ((MembershipRealmProxyInterface) object).realmGet$userId();
            if (realmGet$userId != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.userIdIndex, rowIndex, realmGet$userId.longValue(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.userIdIndex, rowIndex, false);
            }
            Boolean realmGet$valid = ((MembershipRealmProxyInterface) object).realmGet$valid();
            if (realmGet$valid != null) {
                Table.nativeSetBoolean(tableNativePtr, columnInfo.validIndex, rowIndex, realmGet$valid, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.validIndex, rowIndex, false);
            }
        }
    }

    public static com.rhinodesktop.foreorder_golf_consumer1.models.Membership createDetachedCopy(com.rhinodesktop.foreorder_golf_consumer1.models.Membership realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.rhinodesktop.foreorder_golf_consumer1.models.Membership unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.rhinodesktop.foreorder_golf_consumer1.models.Membership();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.rhinodesktop.foreorder_golf_consumer1.models.Membership) cachedObject.object;
            }
            unmanagedObject = (com.rhinodesktop.foreorder_golf_consumer1.models.Membership) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        MembershipRealmProxyInterface unmanagedCopy = (MembershipRealmProxyInterface) unmanagedObject;
        MembershipRealmProxyInterface realmSource = (MembershipRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$clubId(realmSource.realmGet$clubId());

        // Deep copy of club
        unmanagedCopy.realmSet$club(ClubRealmProxy.createDetachedCopy(realmSource.realmGet$club(), currentDepth + 1, maxDepth, cache));
        unmanagedCopy.realmSet$firstName(realmSource.realmGet$firstName());
        unmanagedCopy.realmSet$lastName(realmSource.realmGet$lastName());
        unmanagedCopy.realmSet$memberCode(realmSource.realmGet$memberCode());
        unmanagedCopy.realmSet$membershipId(realmSource.realmGet$membershipId());
        unmanagedCopy.realmSet$notes(realmSource.realmGet$notes());
        unmanagedCopy.realmSet$phoneNumber(realmSource.realmGet$phoneNumber());
        unmanagedCopy.realmSet$userId(realmSource.realmGet$userId());
        unmanagedCopy.realmSet$valid(realmSource.realmGet$valid());

        return unmanagedObject;
    }

    static com.rhinodesktop.foreorder_golf_consumer1.models.Membership update(Realm realm, com.rhinodesktop.foreorder_golf_consumer1.models.Membership realmObject, com.rhinodesktop.foreorder_golf_consumer1.models.Membership newObject, Map<RealmModel, RealmObjectProxy> cache) {
        MembershipRealmProxyInterface realmObjectTarget = (MembershipRealmProxyInterface) realmObject;
        MembershipRealmProxyInterface realmObjectSource = (MembershipRealmProxyInterface) newObject;
        com.rhinodesktop.foreorder_golf_consumer1.models.Club clubObj = realmObjectSource.realmGet$club();
        if (clubObj == null) {
            realmObjectTarget.realmSet$club(null);
        } else {
            com.rhinodesktop.foreorder_golf_consumer1.models.Club cacheclub = (com.rhinodesktop.foreorder_golf_consumer1.models.Club) cache.get(clubObj);
            if (cacheclub != null) {
                realmObjectTarget.realmSet$club(cacheclub);
            } else {
                realmObjectTarget.realmSet$club(ClubRealmProxy.copyOrUpdate(realm, clubObj, true, cache));
            }
        }
        realmObjectTarget.realmSet$firstName(realmObjectSource.realmGet$firstName());
        realmObjectTarget.realmSet$lastName(realmObjectSource.realmGet$lastName());
        realmObjectTarget.realmSet$memberCode(realmObjectSource.realmGet$memberCode());
        realmObjectTarget.realmSet$membershipId(realmObjectSource.realmGet$membershipId());
        realmObjectTarget.realmSet$notes(realmObjectSource.realmGet$notes());
        realmObjectTarget.realmSet$phoneNumber(realmObjectSource.realmGet$phoneNumber());
        realmObjectTarget.realmSet$userId(realmObjectSource.realmGet$userId());
        realmObjectTarget.realmSet$valid(realmObjectSource.realmGet$valid());
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("Membership = proxy[");
        stringBuilder.append("{clubId:");
        stringBuilder.append(realmGet$clubId() != null ? realmGet$clubId() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{club:");
        stringBuilder.append(realmGet$club() != null ? "Club" : "null");
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
        stringBuilder.append("{memberCode:");
        stringBuilder.append(realmGet$memberCode() != null ? realmGet$memberCode() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{membershipId:");
        stringBuilder.append(realmGet$membershipId() != null ? realmGet$membershipId() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{notes:");
        stringBuilder.append(realmGet$notes() != null ? realmGet$notes() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phoneNumber:");
        stringBuilder.append(realmGet$phoneNumber() != null ? realmGet$phoneNumber() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{userId:");
        stringBuilder.append(realmGet$userId() != null ? realmGet$userId() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{valid:");
        stringBuilder.append(realmGet$valid() != null ? realmGet$valid() : "null");
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
        MembershipRealmProxy aMembership = (MembershipRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aMembership.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aMembership.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aMembership.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
