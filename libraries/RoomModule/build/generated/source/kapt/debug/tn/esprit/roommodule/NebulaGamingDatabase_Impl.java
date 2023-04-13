package tn.esprit.roommodule;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tn.esprit.roommodule.dao.BookmarksDao;
import tn.esprit.roommodule.dao.BookmarksDao_Impl;
import tn.esprit.roommodule.dao.NotifDao;
import tn.esprit.roommodule.dao.NotifDao_Impl;
import tn.esprit.roommodule.dao.UserDao;
import tn.esprit.roommodule.dao.UserDao_Impl;
import tn.esprit.roommodule.dao.WishlistDao;
import tn.esprit.roommodule.dao.WishlistDao_Impl;

@SuppressWarnings({"unchecked", "deprecation"})
public final class NebulaGamingDatabase_Impl extends NebulaGamingDatabase {
  private volatile BookmarksDao _bookmarksDao;

  private volatile UserDao _userDao;

  private volatile NotifDao _notifDao;

  private volatile WishlistDao _wishlistDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Bookmarks` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `title` TEXT NOT NULL, `link` TEXT NOT NULL, `description` TEXT NOT NULL, `image` TEXT NOT NULL, `userId` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `UserProfile` (`_id` TEXT NOT NULL, `name` TEXT NOT NULL, `photo` TEXT NOT NULL, `email` TEXT NOT NULL, `phone` TEXT NOT NULL, `level` INTEGER NOT NULL, PRIMARY KEY(`_id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Notification` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `title` TEXT NOT NULL, `body` TEXT NOT NULL, `data` TEXT NOT NULL, `userId` TEXT NOT NULL, `src` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Wishlist` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `name` TEXT NOT NULL, `price` REAL NOT NULL, `image` TEXT, `idProd` TEXT NOT NULL, `userId` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'bcb7839d02a8a07b9a6aa1d6abf24fa8')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `Bookmarks`");
        _db.execSQL("DROP TABLE IF EXISTS `UserProfile`");
        _db.execSQL("DROP TABLE IF EXISTS `Notification`");
        _db.execSQL("DROP TABLE IF EXISTS `Wishlist`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsBookmarks = new HashMap<String, TableInfo.Column>(6);
        _columnsBookmarks.put("id", new TableInfo.Column("id", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBookmarks.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBookmarks.put("link", new TableInfo.Column("link", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBookmarks.put("description", new TableInfo.Column("description", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBookmarks.put("image", new TableInfo.Column("image", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBookmarks.put("userId", new TableInfo.Column("userId", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysBookmarks = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesBookmarks = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoBookmarks = new TableInfo("Bookmarks", _columnsBookmarks, _foreignKeysBookmarks, _indicesBookmarks);
        final TableInfo _existingBookmarks = TableInfo.read(_db, "Bookmarks");
        if (! _infoBookmarks.equals(_existingBookmarks)) {
          return new RoomOpenHelper.ValidationResult(false, "Bookmarks(tn.esprit.roommodule.models.Bookmarks).\n"
                  + " Expected:\n" + _infoBookmarks + "\n"
                  + " Found:\n" + _existingBookmarks);
        }
        final HashMap<String, TableInfo.Column> _columnsUserProfile = new HashMap<String, TableInfo.Column>(6);
        _columnsUserProfile.put("_id", new TableInfo.Column("_id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserProfile.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserProfile.put("photo", new TableInfo.Column("photo", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserProfile.put("email", new TableInfo.Column("email", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserProfile.put("phone", new TableInfo.Column("phone", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserProfile.put("level", new TableInfo.Column("level", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysUserProfile = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesUserProfile = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoUserProfile = new TableInfo("UserProfile", _columnsUserProfile, _foreignKeysUserProfile, _indicesUserProfile);
        final TableInfo _existingUserProfile = TableInfo.read(_db, "UserProfile");
        if (! _infoUserProfile.equals(_existingUserProfile)) {
          return new RoomOpenHelper.ValidationResult(false, "UserProfile(tn.esprit.roommodule.models.UserProfile).\n"
                  + " Expected:\n" + _infoUserProfile + "\n"
                  + " Found:\n" + _existingUserProfile);
        }
        final HashMap<String, TableInfo.Column> _columnsNotification = new HashMap<String, TableInfo.Column>(6);
        _columnsNotification.put("id", new TableInfo.Column("id", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNotification.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNotification.put("body", new TableInfo.Column("body", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNotification.put("data", new TableInfo.Column("data", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNotification.put("userId", new TableInfo.Column("userId", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNotification.put("src", new TableInfo.Column("src", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysNotification = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesNotification = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoNotification = new TableInfo("Notification", _columnsNotification, _foreignKeysNotification, _indicesNotification);
        final TableInfo _existingNotification = TableInfo.read(_db, "Notification");
        if (! _infoNotification.equals(_existingNotification)) {
          return new RoomOpenHelper.ValidationResult(false, "Notification(tn.esprit.roommodule.models.Notification).\n"
                  + " Expected:\n" + _infoNotification + "\n"
                  + " Found:\n" + _existingNotification);
        }
        final HashMap<String, TableInfo.Column> _columnsWishlist = new HashMap<String, TableInfo.Column>(6);
        _columnsWishlist.put("id", new TableInfo.Column("id", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWishlist.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWishlist.put("price", new TableInfo.Column("price", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWishlist.put("image", new TableInfo.Column("image", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWishlist.put("idProd", new TableInfo.Column("idProd", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWishlist.put("userId", new TableInfo.Column("userId", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysWishlist = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesWishlist = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoWishlist = new TableInfo("Wishlist", _columnsWishlist, _foreignKeysWishlist, _indicesWishlist);
        final TableInfo _existingWishlist = TableInfo.read(_db, "Wishlist");
        if (! _infoWishlist.equals(_existingWishlist)) {
          return new RoomOpenHelper.ValidationResult(false, "Wishlist(tn.esprit.roommodule.models.Wishlist).\n"
                  + " Expected:\n" + _infoWishlist + "\n"
                  + " Found:\n" + _existingWishlist);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "bcb7839d02a8a07b9a6aa1d6abf24fa8", "3dcaf871e5431b1ff8365bac79fb98fc");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "Bookmarks","UserProfile","Notification","Wishlist");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `Bookmarks`");
      _db.execSQL("DELETE FROM `UserProfile`");
      _db.execSQL("DELETE FROM `Notification`");
      _db.execSQL("DELETE FROM `Wishlist`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(BookmarksDao.class, BookmarksDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(UserDao.class, UserDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(NotifDao.class, NotifDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(WishlistDao.class, WishlistDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  public List<Migration> getAutoMigrations(
      @NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecsMap) {
    return Arrays.asList();
  }

  @Override
  public BookmarksDao bookmarksDao() {
    if (_bookmarksDao != null) {
      return _bookmarksDao;
    } else {
      synchronized(this) {
        if(_bookmarksDao == null) {
          _bookmarksDao = new BookmarksDao_Impl(this);
        }
        return _bookmarksDao;
      }
    }
  }

  @Override
  public UserDao userDao() {
    if (_userDao != null) {
      return _userDao;
    } else {
      synchronized(this) {
        if(_userDao == null) {
          _userDao = new UserDao_Impl(this);
        }
        return _userDao;
      }
    }
  }

  @Override
  public NotifDao notifDao() {
    if (_notifDao != null) {
      return _notifDao;
    } else {
      synchronized(this) {
        if(_notifDao == null) {
          _notifDao = new NotifDao_Impl(this);
        }
        return _notifDao;
      }
    }
  }

  @Override
  public WishlistDao wishlistDao() {
    if (_wishlistDao != null) {
      return _wishlistDao;
    } else {
      synchronized(this) {
        if(_wishlistDao == null) {
          _wishlistDao = new WishlistDao_Impl(this);
        }
        return _wishlistDao;
      }
    }
  }
}
