package io.realm;


import android.util.JsonReader;
import io.realm.internal.ColumnInfo;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.RealmProxyMediator;
import io.realm.internal.Row;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

@io.realm.annotations.RealmModule
class DefaultRealmModuleMediator extends RealmProxyMediator {

    private static final Set<Class<? extends RealmModel>> MODEL_CLASSES;
    static {
        Set<Class<? extends RealmModel>> modelClasses = new HashSet<Class<? extends RealmModel>>(11);
        modelClasses.add(com.rhinodesktop.foreorder_golf_consumer1.models.Club.class);
        modelClasses.add(com.rhinodesktop.foreorder_golf_consumer1.models.ItemType.class);
        modelClasses.add(com.rhinodesktop.foreorder_golf_consumer1.models.Membership.class);
        modelClasses.add(com.rhinodesktop.foreorder_golf_consumer1.models.Menu.class);
        modelClasses.add(com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem.class);
        modelClasses.add(com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType.class);
        modelClasses.add(com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup.class);
        modelClasses.add(com.rhinodesktop.foreorder_golf_consumer1.models.OptionItem.class);
        modelClasses.add(com.rhinodesktop.foreorder_golf_consumer1.models.Session.class);
        modelClasses.add(com.rhinodesktop.foreorder_golf_consumer1.models.User.class);
        modelClasses.add(com.rhinodesktop.foreorder_golf_consumer1.models.UserLocation.class);
        MODEL_CLASSES = Collections.unmodifiableSet(modelClasses);
    }

    @Override
    public Map<Class<? extends RealmModel>, OsObjectSchemaInfo> getExpectedObjectSchemaInfoMap() {
        Map<Class<? extends RealmModel>, OsObjectSchemaInfo> infoMap = new HashMap<Class<? extends RealmModel>, OsObjectSchemaInfo>(11);
        infoMap.put(com.rhinodesktop.foreorder_golf_consumer1.models.Club.class, io.realm.ClubRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.rhinodesktop.foreorder_golf_consumer1.models.ItemType.class, io.realm.ItemTypeRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.rhinodesktop.foreorder_golf_consumer1.models.Membership.class, io.realm.MembershipRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.rhinodesktop.foreorder_golf_consumer1.models.Menu.class, io.realm.MenuRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem.class, io.realm.MenuItemRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType.class, io.realm.MenuItemsByItemTypeRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup.class, io.realm.OptionGroupRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.rhinodesktop.foreorder_golf_consumer1.models.OptionItem.class, io.realm.OptionItemRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.rhinodesktop.foreorder_golf_consumer1.models.Session.class, io.realm.SessionRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.rhinodesktop.foreorder_golf_consumer1.models.User.class, io.realm.UserRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.rhinodesktop.foreorder_golf_consumer1.models.UserLocation.class, io.realm.UserLocationRealmProxy.getExpectedObjectSchemaInfo());
        return infoMap;
    }

    @Override
    public ColumnInfo createColumnInfo(Class<? extends RealmModel> clazz, OsSchemaInfo schemaInfo) {
        checkClass(clazz);

        if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.Club.class)) {
            return io.realm.ClubRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.ItemType.class)) {
            return io.realm.ItemTypeRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.Membership.class)) {
            return io.realm.MembershipRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.Menu.class)) {
            return io.realm.MenuRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem.class)) {
            return io.realm.MenuItemRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType.class)) {
            return io.realm.MenuItemsByItemTypeRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup.class)) {
            return io.realm.OptionGroupRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.OptionItem.class)) {
            return io.realm.OptionItemRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.Session.class)) {
            return io.realm.SessionRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.User.class)) {
            return io.realm.UserRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.UserLocation.class)) {
            return io.realm.UserLocationRealmProxy.createColumnInfo(schemaInfo);
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public List<String> getFieldNames(Class<? extends RealmModel> clazz) {
        checkClass(clazz);

        if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.Club.class)) {
            return io.realm.ClubRealmProxy.getFieldNames();
        }
        if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.ItemType.class)) {
            return io.realm.ItemTypeRealmProxy.getFieldNames();
        }
        if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.Membership.class)) {
            return io.realm.MembershipRealmProxy.getFieldNames();
        }
        if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.Menu.class)) {
            return io.realm.MenuRealmProxy.getFieldNames();
        }
        if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem.class)) {
            return io.realm.MenuItemRealmProxy.getFieldNames();
        }
        if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType.class)) {
            return io.realm.MenuItemsByItemTypeRealmProxy.getFieldNames();
        }
        if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup.class)) {
            return io.realm.OptionGroupRealmProxy.getFieldNames();
        }
        if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.OptionItem.class)) {
            return io.realm.OptionItemRealmProxy.getFieldNames();
        }
        if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.Session.class)) {
            return io.realm.SessionRealmProxy.getFieldNames();
        }
        if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.User.class)) {
            return io.realm.UserRealmProxy.getFieldNames();
        }
        if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.UserLocation.class)) {
            return io.realm.UserLocationRealmProxy.getFieldNames();
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public String getSimpleClassNameImpl(Class<? extends RealmModel> clazz) {
        checkClass(clazz);

        if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.Club.class)) {
            return io.realm.ClubRealmProxy.getSimpleClassName();
        }
        if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.ItemType.class)) {
            return io.realm.ItemTypeRealmProxy.getSimpleClassName();
        }
        if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.Membership.class)) {
            return io.realm.MembershipRealmProxy.getSimpleClassName();
        }
        if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.Menu.class)) {
            return io.realm.MenuRealmProxy.getSimpleClassName();
        }
        if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem.class)) {
            return io.realm.MenuItemRealmProxy.getSimpleClassName();
        }
        if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType.class)) {
            return io.realm.MenuItemsByItemTypeRealmProxy.getSimpleClassName();
        }
        if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup.class)) {
            return io.realm.OptionGroupRealmProxy.getSimpleClassName();
        }
        if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.OptionItem.class)) {
            return io.realm.OptionItemRealmProxy.getSimpleClassName();
        }
        if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.Session.class)) {
            return io.realm.SessionRealmProxy.getSimpleClassName();
        }
        if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.User.class)) {
            return io.realm.UserRealmProxy.getSimpleClassName();
        }
        if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.UserLocation.class)) {
            return io.realm.UserLocationRealmProxy.getSimpleClassName();
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public <E extends RealmModel> E newInstance(Class<E> clazz, Object baseRealm, Row row, ColumnInfo columnInfo, boolean acceptDefaultValue, List<String> excludeFields) {
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        try {
            objectContext.set((BaseRealm) baseRealm, row, columnInfo, acceptDefaultValue, excludeFields);
            checkClass(clazz);

            if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.Club.class)) {
                return clazz.cast(new io.realm.ClubRealmProxy());
            }
            if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.ItemType.class)) {
                return clazz.cast(new io.realm.ItemTypeRealmProxy());
            }
            if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.Membership.class)) {
                return clazz.cast(new io.realm.MembershipRealmProxy());
            }
            if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.Menu.class)) {
                return clazz.cast(new io.realm.MenuRealmProxy());
            }
            if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem.class)) {
                return clazz.cast(new io.realm.MenuItemRealmProxy());
            }
            if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType.class)) {
                return clazz.cast(new io.realm.MenuItemsByItemTypeRealmProxy());
            }
            if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup.class)) {
                return clazz.cast(new io.realm.OptionGroupRealmProxy());
            }
            if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.OptionItem.class)) {
                return clazz.cast(new io.realm.OptionItemRealmProxy());
            }
            if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.Session.class)) {
                return clazz.cast(new io.realm.SessionRealmProxy());
            }
            if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.User.class)) {
                return clazz.cast(new io.realm.UserRealmProxy());
            }
            if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.UserLocation.class)) {
                return clazz.cast(new io.realm.UserLocationRealmProxy());
            }
            throw getMissingProxyClassException(clazz);
        } finally {
            objectContext.clear();
        }
    }

    @Override
    public Set<Class<? extends RealmModel>> getModelClasses() {
        return MODEL_CLASSES;
    }

    @Override
    public <E extends RealmModel> E copyOrUpdate(Realm realm, E obj, boolean update, Map<RealmModel, RealmObjectProxy> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<E> clazz = (Class<E>) ((obj instanceof RealmObjectProxy) ? obj.getClass().getSuperclass() : obj.getClass());

        if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.Club.class)) {
            return clazz.cast(io.realm.ClubRealmProxy.copyOrUpdate(realm, (com.rhinodesktop.foreorder_golf_consumer1.models.Club) obj, update, cache));
        }
        if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.ItemType.class)) {
            return clazz.cast(io.realm.ItemTypeRealmProxy.copyOrUpdate(realm, (com.rhinodesktop.foreorder_golf_consumer1.models.ItemType) obj, update, cache));
        }
        if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.Membership.class)) {
            return clazz.cast(io.realm.MembershipRealmProxy.copyOrUpdate(realm, (com.rhinodesktop.foreorder_golf_consumer1.models.Membership) obj, update, cache));
        }
        if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.Menu.class)) {
            return clazz.cast(io.realm.MenuRealmProxy.copyOrUpdate(realm, (com.rhinodesktop.foreorder_golf_consumer1.models.Menu) obj, update, cache));
        }
        if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem.class)) {
            return clazz.cast(io.realm.MenuItemRealmProxy.copyOrUpdate(realm, (com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem) obj, update, cache));
        }
        if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType.class)) {
            return clazz.cast(io.realm.MenuItemsByItemTypeRealmProxy.copyOrUpdate(realm, (com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType) obj, update, cache));
        }
        if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup.class)) {
            return clazz.cast(io.realm.OptionGroupRealmProxy.copyOrUpdate(realm, (com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup) obj, update, cache));
        }
        if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.OptionItem.class)) {
            return clazz.cast(io.realm.OptionItemRealmProxy.copyOrUpdate(realm, (com.rhinodesktop.foreorder_golf_consumer1.models.OptionItem) obj, update, cache));
        }
        if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.Session.class)) {
            return clazz.cast(io.realm.SessionRealmProxy.copyOrUpdate(realm, (com.rhinodesktop.foreorder_golf_consumer1.models.Session) obj, update, cache));
        }
        if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.User.class)) {
            return clazz.cast(io.realm.UserRealmProxy.copyOrUpdate(realm, (com.rhinodesktop.foreorder_golf_consumer1.models.User) obj, update, cache));
        }
        if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.UserLocation.class)) {
            return clazz.cast(io.realm.UserLocationRealmProxy.copyOrUpdate(realm, (com.rhinodesktop.foreorder_golf_consumer1.models.UserLocation) obj, update, cache));
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public void insert(Realm realm, RealmModel object, Map<RealmModel, Long> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((object instanceof RealmObjectProxy) ? object.getClass().getSuperclass() : object.getClass());

        if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.Club.class)) {
            io.realm.ClubRealmProxy.insert(realm, (com.rhinodesktop.foreorder_golf_consumer1.models.Club) object, cache);
        } else if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.ItemType.class)) {
            io.realm.ItemTypeRealmProxy.insert(realm, (com.rhinodesktop.foreorder_golf_consumer1.models.ItemType) object, cache);
        } else if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.Membership.class)) {
            io.realm.MembershipRealmProxy.insert(realm, (com.rhinodesktop.foreorder_golf_consumer1.models.Membership) object, cache);
        } else if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.Menu.class)) {
            io.realm.MenuRealmProxy.insert(realm, (com.rhinodesktop.foreorder_golf_consumer1.models.Menu) object, cache);
        } else if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem.class)) {
            io.realm.MenuItemRealmProxy.insert(realm, (com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem) object, cache);
        } else if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType.class)) {
            io.realm.MenuItemsByItemTypeRealmProxy.insert(realm, (com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType) object, cache);
        } else if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup.class)) {
            io.realm.OptionGroupRealmProxy.insert(realm, (com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup) object, cache);
        } else if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.OptionItem.class)) {
            io.realm.OptionItemRealmProxy.insert(realm, (com.rhinodesktop.foreorder_golf_consumer1.models.OptionItem) object, cache);
        } else if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.Session.class)) {
            io.realm.SessionRealmProxy.insert(realm, (com.rhinodesktop.foreorder_golf_consumer1.models.Session) object, cache);
        } else if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.User.class)) {
            io.realm.UserRealmProxy.insert(realm, (com.rhinodesktop.foreorder_golf_consumer1.models.User) object, cache);
        } else if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.UserLocation.class)) {
            io.realm.UserLocationRealmProxy.insert(realm, (com.rhinodesktop.foreorder_golf_consumer1.models.UserLocation) object, cache);
        } else {
            throw getMissingProxyClassException(clazz);
        }
    }

    @Override
    public void insert(Realm realm, Collection<? extends RealmModel> objects) {
        Iterator<? extends RealmModel> iterator = objects.iterator();
        RealmModel object = null;
        Map<RealmModel, Long> cache = new HashMap<RealmModel, Long>(objects.size());
        if (iterator.hasNext()) {
            //  access the first element to figure out the clazz for the routing below
            object = iterator.next();
            // This cast is correct because obj is either
            // generated by RealmProxy or the original type extending directly from RealmObject
            @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((object instanceof RealmObjectProxy) ? object.getClass().getSuperclass() : object.getClass());

            if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.Club.class)) {
                io.realm.ClubRealmProxy.insert(realm, (com.rhinodesktop.foreorder_golf_consumer1.models.Club) object, cache);
            } else if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.ItemType.class)) {
                io.realm.ItemTypeRealmProxy.insert(realm, (com.rhinodesktop.foreorder_golf_consumer1.models.ItemType) object, cache);
            } else if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.Membership.class)) {
                io.realm.MembershipRealmProxy.insert(realm, (com.rhinodesktop.foreorder_golf_consumer1.models.Membership) object, cache);
            } else if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.Menu.class)) {
                io.realm.MenuRealmProxy.insert(realm, (com.rhinodesktop.foreorder_golf_consumer1.models.Menu) object, cache);
            } else if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem.class)) {
                io.realm.MenuItemRealmProxy.insert(realm, (com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem) object, cache);
            } else if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType.class)) {
                io.realm.MenuItemsByItemTypeRealmProxy.insert(realm, (com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType) object, cache);
            } else if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup.class)) {
                io.realm.OptionGroupRealmProxy.insert(realm, (com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup) object, cache);
            } else if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.OptionItem.class)) {
                io.realm.OptionItemRealmProxy.insert(realm, (com.rhinodesktop.foreorder_golf_consumer1.models.OptionItem) object, cache);
            } else if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.Session.class)) {
                io.realm.SessionRealmProxy.insert(realm, (com.rhinodesktop.foreorder_golf_consumer1.models.Session) object, cache);
            } else if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.User.class)) {
                io.realm.UserRealmProxy.insert(realm, (com.rhinodesktop.foreorder_golf_consumer1.models.User) object, cache);
            } else if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.UserLocation.class)) {
                io.realm.UserLocationRealmProxy.insert(realm, (com.rhinodesktop.foreorder_golf_consumer1.models.UserLocation) object, cache);
            } else {
                throw getMissingProxyClassException(clazz);
            }
            if (iterator.hasNext()) {
                if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.Club.class)) {
                    io.realm.ClubRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.ItemType.class)) {
                    io.realm.ItemTypeRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.Membership.class)) {
                    io.realm.MembershipRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.Menu.class)) {
                    io.realm.MenuRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem.class)) {
                    io.realm.MenuItemRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType.class)) {
                    io.realm.MenuItemsByItemTypeRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup.class)) {
                    io.realm.OptionGroupRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.OptionItem.class)) {
                    io.realm.OptionItemRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.Session.class)) {
                    io.realm.SessionRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.User.class)) {
                    io.realm.UserRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.UserLocation.class)) {
                    io.realm.UserLocationRealmProxy.insert(realm, iterator, cache);
                } else {
                    throw getMissingProxyClassException(clazz);
                }
            }
        }
    }

    @Override
    public void insertOrUpdate(Realm realm, RealmModel obj, Map<RealmModel, Long> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((obj instanceof RealmObjectProxy) ? obj.getClass().getSuperclass() : obj.getClass());

        if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.Club.class)) {
            io.realm.ClubRealmProxy.insertOrUpdate(realm, (com.rhinodesktop.foreorder_golf_consumer1.models.Club) obj, cache);
        } else if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.ItemType.class)) {
            io.realm.ItemTypeRealmProxy.insertOrUpdate(realm, (com.rhinodesktop.foreorder_golf_consumer1.models.ItemType) obj, cache);
        } else if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.Membership.class)) {
            io.realm.MembershipRealmProxy.insertOrUpdate(realm, (com.rhinodesktop.foreorder_golf_consumer1.models.Membership) obj, cache);
        } else if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.Menu.class)) {
            io.realm.MenuRealmProxy.insertOrUpdate(realm, (com.rhinodesktop.foreorder_golf_consumer1.models.Menu) obj, cache);
        } else if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem.class)) {
            io.realm.MenuItemRealmProxy.insertOrUpdate(realm, (com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem) obj, cache);
        } else if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType.class)) {
            io.realm.MenuItemsByItemTypeRealmProxy.insertOrUpdate(realm, (com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType) obj, cache);
        } else if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup.class)) {
            io.realm.OptionGroupRealmProxy.insertOrUpdate(realm, (com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup) obj, cache);
        } else if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.OptionItem.class)) {
            io.realm.OptionItemRealmProxy.insertOrUpdate(realm, (com.rhinodesktop.foreorder_golf_consumer1.models.OptionItem) obj, cache);
        } else if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.Session.class)) {
            io.realm.SessionRealmProxy.insertOrUpdate(realm, (com.rhinodesktop.foreorder_golf_consumer1.models.Session) obj, cache);
        } else if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.User.class)) {
            io.realm.UserRealmProxy.insertOrUpdate(realm, (com.rhinodesktop.foreorder_golf_consumer1.models.User) obj, cache);
        } else if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.UserLocation.class)) {
            io.realm.UserLocationRealmProxy.insertOrUpdate(realm, (com.rhinodesktop.foreorder_golf_consumer1.models.UserLocation) obj, cache);
        } else {
            throw getMissingProxyClassException(clazz);
        }
    }

    @Override
    public void insertOrUpdate(Realm realm, Collection<? extends RealmModel> objects) {
        Iterator<? extends RealmModel> iterator = objects.iterator();
        RealmModel object = null;
        Map<RealmModel, Long> cache = new HashMap<RealmModel, Long>(objects.size());
        if (iterator.hasNext()) {
            //  access the first element to figure out the clazz for the routing below
            object = iterator.next();
            // This cast is correct because obj is either
            // generated by RealmProxy or the original type extending directly from RealmObject
            @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((object instanceof RealmObjectProxy) ? object.getClass().getSuperclass() : object.getClass());

            if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.Club.class)) {
                io.realm.ClubRealmProxy.insertOrUpdate(realm, (com.rhinodesktop.foreorder_golf_consumer1.models.Club) object, cache);
            } else if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.ItemType.class)) {
                io.realm.ItemTypeRealmProxy.insertOrUpdate(realm, (com.rhinodesktop.foreorder_golf_consumer1.models.ItemType) object, cache);
            } else if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.Membership.class)) {
                io.realm.MembershipRealmProxy.insertOrUpdate(realm, (com.rhinodesktop.foreorder_golf_consumer1.models.Membership) object, cache);
            } else if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.Menu.class)) {
                io.realm.MenuRealmProxy.insertOrUpdate(realm, (com.rhinodesktop.foreorder_golf_consumer1.models.Menu) object, cache);
            } else if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem.class)) {
                io.realm.MenuItemRealmProxy.insertOrUpdate(realm, (com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem) object, cache);
            } else if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType.class)) {
                io.realm.MenuItemsByItemTypeRealmProxy.insertOrUpdate(realm, (com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType) object, cache);
            } else if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup.class)) {
                io.realm.OptionGroupRealmProxy.insertOrUpdate(realm, (com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup) object, cache);
            } else if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.OptionItem.class)) {
                io.realm.OptionItemRealmProxy.insertOrUpdate(realm, (com.rhinodesktop.foreorder_golf_consumer1.models.OptionItem) object, cache);
            } else if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.Session.class)) {
                io.realm.SessionRealmProxy.insertOrUpdate(realm, (com.rhinodesktop.foreorder_golf_consumer1.models.Session) object, cache);
            } else if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.User.class)) {
                io.realm.UserRealmProxy.insertOrUpdate(realm, (com.rhinodesktop.foreorder_golf_consumer1.models.User) object, cache);
            } else if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.UserLocation.class)) {
                io.realm.UserLocationRealmProxy.insertOrUpdate(realm, (com.rhinodesktop.foreorder_golf_consumer1.models.UserLocation) object, cache);
            } else {
                throw getMissingProxyClassException(clazz);
            }
            if (iterator.hasNext()) {
                if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.Club.class)) {
                    io.realm.ClubRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.ItemType.class)) {
                    io.realm.ItemTypeRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.Membership.class)) {
                    io.realm.MembershipRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.Menu.class)) {
                    io.realm.MenuRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem.class)) {
                    io.realm.MenuItemRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType.class)) {
                    io.realm.MenuItemsByItemTypeRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup.class)) {
                    io.realm.OptionGroupRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.OptionItem.class)) {
                    io.realm.OptionItemRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.Session.class)) {
                    io.realm.SessionRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.User.class)) {
                    io.realm.UserRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.UserLocation.class)) {
                    io.realm.UserLocationRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else {
                    throw getMissingProxyClassException(clazz);
                }
            }
        }
    }

    @Override
    public <E extends RealmModel> E createOrUpdateUsingJsonObject(Class<E> clazz, Realm realm, JSONObject json, boolean update)
        throws JSONException {
        checkClass(clazz);

        if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.Club.class)) {
            return clazz.cast(io.realm.ClubRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.ItemType.class)) {
            return clazz.cast(io.realm.ItemTypeRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.Membership.class)) {
            return clazz.cast(io.realm.MembershipRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.Menu.class)) {
            return clazz.cast(io.realm.MenuRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem.class)) {
            return clazz.cast(io.realm.MenuItemRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType.class)) {
            return clazz.cast(io.realm.MenuItemsByItemTypeRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup.class)) {
            return clazz.cast(io.realm.OptionGroupRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.OptionItem.class)) {
            return clazz.cast(io.realm.OptionItemRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.Session.class)) {
            return clazz.cast(io.realm.SessionRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.User.class)) {
            return clazz.cast(io.realm.UserRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.UserLocation.class)) {
            return clazz.cast(io.realm.UserLocationRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public <E extends RealmModel> E createUsingJsonStream(Class<E> clazz, Realm realm, JsonReader reader)
        throws IOException {
        checkClass(clazz);

        if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.Club.class)) {
            return clazz.cast(io.realm.ClubRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.ItemType.class)) {
            return clazz.cast(io.realm.ItemTypeRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.Membership.class)) {
            return clazz.cast(io.realm.MembershipRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.Menu.class)) {
            return clazz.cast(io.realm.MenuRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem.class)) {
            return clazz.cast(io.realm.MenuItemRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType.class)) {
            return clazz.cast(io.realm.MenuItemsByItemTypeRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup.class)) {
            return clazz.cast(io.realm.OptionGroupRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.OptionItem.class)) {
            return clazz.cast(io.realm.OptionItemRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.Session.class)) {
            return clazz.cast(io.realm.SessionRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.User.class)) {
            return clazz.cast(io.realm.UserRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.UserLocation.class)) {
            return clazz.cast(io.realm.UserLocationRealmProxy.createUsingJsonStream(realm, reader));
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public <E extends RealmModel> E createDetachedCopy(E realmObject, int maxDepth, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<E> clazz = (Class<E>) realmObject.getClass().getSuperclass();

        if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.Club.class)) {
            return clazz.cast(io.realm.ClubRealmProxy.createDetachedCopy((com.rhinodesktop.foreorder_golf_consumer1.models.Club) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.ItemType.class)) {
            return clazz.cast(io.realm.ItemTypeRealmProxy.createDetachedCopy((com.rhinodesktop.foreorder_golf_consumer1.models.ItemType) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.Membership.class)) {
            return clazz.cast(io.realm.MembershipRealmProxy.createDetachedCopy((com.rhinodesktop.foreorder_golf_consumer1.models.Membership) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.Menu.class)) {
            return clazz.cast(io.realm.MenuRealmProxy.createDetachedCopy((com.rhinodesktop.foreorder_golf_consumer1.models.Menu) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem.class)) {
            return clazz.cast(io.realm.MenuItemRealmProxy.createDetachedCopy((com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType.class)) {
            return clazz.cast(io.realm.MenuItemsByItemTypeRealmProxy.createDetachedCopy((com.rhinodesktop.foreorder_golf_consumer1.models.MenuItemsByItemType) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup.class)) {
            return clazz.cast(io.realm.OptionGroupRealmProxy.createDetachedCopy((com.rhinodesktop.foreorder_golf_consumer1.models.OptionGroup) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.OptionItem.class)) {
            return clazz.cast(io.realm.OptionItemRealmProxy.createDetachedCopy((com.rhinodesktop.foreorder_golf_consumer1.models.OptionItem) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.Session.class)) {
            return clazz.cast(io.realm.SessionRealmProxy.createDetachedCopy((com.rhinodesktop.foreorder_golf_consumer1.models.Session) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.User.class)) {
            return clazz.cast(io.realm.UserRealmProxy.createDetachedCopy((com.rhinodesktop.foreorder_golf_consumer1.models.User) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.rhinodesktop.foreorder_golf_consumer1.models.UserLocation.class)) {
            return clazz.cast(io.realm.UserLocationRealmProxy.createDetachedCopy((com.rhinodesktop.foreorder_golf_consumer1.models.UserLocation) realmObject, 0, maxDepth, cache));
        }
        throw getMissingProxyClassException(clazz);
    }

}
