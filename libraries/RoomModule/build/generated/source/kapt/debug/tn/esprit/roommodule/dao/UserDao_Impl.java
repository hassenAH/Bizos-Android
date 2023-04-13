package tn.esprit.roommodule.dao;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.collection.ArrayMap;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import tn.esprit.roommodule.models.Bookmarks;
import tn.esprit.roommodule.models.Notification;
import tn.esprit.roommodule.models.UserAndBookmarks;
import tn.esprit.roommodule.models.UserAndNotifications;
import tn.esprit.roommodule.models.UserAndWishlist;
import tn.esprit.roommodule.models.UserProfile;
import tn.esprit.roommodule.models.Wishlist;

@SuppressWarnings({"unchecked", "deprecation"})
public final class UserDao_Impl implements UserDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<UserProfile> __insertionAdapterOfUserProfile;

  private final EntityInsertionAdapter<UserProfile> __insertionAdapterOfUserProfile_1;

  private final EntityDeletionOrUpdateAdapter<UserProfile> __deletionAdapterOfUserProfile;

  private final EntityDeletionOrUpdateAdapter<UserProfile> __updateAdapterOfUserProfile;

  public UserDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfUserProfile = new EntityInsertionAdapter<UserProfile>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `UserProfile` (`_id`,`name`,`photo`,`email`,`phone`,`level`) VALUES (?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, UserProfile value) {
        if (value.get_id() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.get_id());
        }
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getPhoto() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getPhoto());
        }
        if (value.getEmail() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getEmail());
        }
        if (value.getPhone() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getPhone());
        }
        stmt.bindLong(6, value.getLevel());
      }
    };
    this.__insertionAdapterOfUserProfile_1 = new EntityInsertionAdapter<UserProfile>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `UserProfile` (`_id`,`name`,`photo`,`email`,`phone`,`level`) VALUES (?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, UserProfile value) {
        if (value.get_id() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.get_id());
        }
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getPhoto() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getPhoto());
        }
        if (value.getEmail() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getEmail());
        }
        if (value.getPhone() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getPhone());
        }
        stmt.bindLong(6, value.getLevel());
      }
    };
    this.__deletionAdapterOfUserProfile = new EntityDeletionOrUpdateAdapter<UserProfile>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `UserProfile` WHERE `_id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, UserProfile value) {
        if (value.get_id() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.get_id());
        }
      }
    };
    this.__updateAdapterOfUserProfile = new EntityDeletionOrUpdateAdapter<UserProfile>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `UserProfile` SET `_id` = ?,`name` = ?,`photo` = ?,`email` = ?,`phone` = ?,`level` = ? WHERE `_id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, UserProfile value) {
        if (value.get_id() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.get_id());
        }
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getPhoto() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getPhoto());
        }
        if (value.getEmail() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getEmail());
        }
        if (value.getPhone() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getPhone());
        }
        stmt.bindLong(6, value.getLevel());
        if (value.get_id() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.get_id());
        }
      }
    };
  }

  @Override
  public Object create(final UserProfile e, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfUserProfile.insert(e);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object addAll(final List<? extends UserProfile> e,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfUserProfile.insert(e);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object saveUser(final UserProfile e, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfUserProfile_1.insert(e);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object delete(final UserProfile e, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfUserProfile.handle(e);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object update(final UserProfile e, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfUserProfile.handle(e);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object getUserWithBookmarks(final String userId,
      final Continuation<? super UserAndBookmarks> continuation) {
    final String _sql = "SELECT * FROM UserProfile WHERE _id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (userId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, userId);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, true, _cancellationSignal, new Callable<UserAndBookmarks>() {
      @Override
      public UserAndBookmarks call() throws Exception {
        __db.beginTransaction();
        try {
          final Cursor _cursor = DBUtil.query(__db, _statement, true, null);
          try {
            final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "_id");
            final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
            final int _cursorIndexOfPhoto = CursorUtil.getColumnIndexOrThrow(_cursor, "photo");
            final int _cursorIndexOfEmail = CursorUtil.getColumnIndexOrThrow(_cursor, "email");
            final int _cursorIndexOfPhone = CursorUtil.getColumnIndexOrThrow(_cursor, "phone");
            final int _cursorIndexOfLevel = CursorUtil.getColumnIndexOrThrow(_cursor, "level");
            final ArrayMap<String, ArrayList<Bookmarks>> _collectionBookmarks = new ArrayMap<String, ArrayList<Bookmarks>>();
            while (_cursor.moveToNext()) {
              if (!_cursor.isNull(_cursorIndexOfId)) {
                final String _tmpKey = _cursor.getString(_cursorIndexOfId);
                ArrayList<Bookmarks> _tmpBookmarksCollection = _collectionBookmarks.get(_tmpKey);
                if (_tmpBookmarksCollection == null) {
                  _tmpBookmarksCollection = new ArrayList<Bookmarks>();
                  _collectionBookmarks.put(_tmpKey, _tmpBookmarksCollection);
                }
              }
            }
            _cursor.moveToPosition(-1);
            __fetchRelationshipBookmarksAstnEspritRoommoduleModelsBookmarks(_collectionBookmarks);
            final UserAndBookmarks _result;
            if(_cursor.moveToFirst()) {
              final UserProfile _tmpUser;
              if (! (_cursor.isNull(_cursorIndexOfId) && _cursor.isNull(_cursorIndexOfName) && _cursor.isNull(_cursorIndexOfPhoto) && _cursor.isNull(_cursorIndexOfEmail) && _cursor.isNull(_cursorIndexOfPhone) && _cursor.isNull(_cursorIndexOfLevel))) {
                final String _tmp_id;
                if (_cursor.isNull(_cursorIndexOfId)) {
                  _tmp_id = null;
                } else {
                  _tmp_id = _cursor.getString(_cursorIndexOfId);
                }
                final String _tmpName;
                if (_cursor.isNull(_cursorIndexOfName)) {
                  _tmpName = null;
                } else {
                  _tmpName = _cursor.getString(_cursorIndexOfName);
                }
                final String _tmpPhoto;
                if (_cursor.isNull(_cursorIndexOfPhoto)) {
                  _tmpPhoto = null;
                } else {
                  _tmpPhoto = _cursor.getString(_cursorIndexOfPhoto);
                }
                final String _tmpEmail;
                if (_cursor.isNull(_cursorIndexOfEmail)) {
                  _tmpEmail = null;
                } else {
                  _tmpEmail = _cursor.getString(_cursorIndexOfEmail);
                }
                final String _tmpPhone;
                if (_cursor.isNull(_cursorIndexOfPhone)) {
                  _tmpPhone = null;
                } else {
                  _tmpPhone = _cursor.getString(_cursorIndexOfPhone);
                }
                final int _tmpLevel;
                _tmpLevel = _cursor.getInt(_cursorIndexOfLevel);
                _tmpUser = new UserProfile(_tmp_id,_tmpName,_tmpPhoto,_tmpEmail,_tmpPhone,_tmpLevel);
              }  else  {
                _tmpUser = null;
              }
              ArrayList<Bookmarks> _tmpBookmarksCollection_1 = null;
              if (!_cursor.isNull(_cursorIndexOfId)) {
                final String _tmpKey_1 = _cursor.getString(_cursorIndexOfId);
                _tmpBookmarksCollection_1 = _collectionBookmarks.get(_tmpKey_1);
              }
              if (_tmpBookmarksCollection_1 == null) {
                _tmpBookmarksCollection_1 = new ArrayList<Bookmarks>();
              }
              _result = new UserAndBookmarks(_tmpUser,_tmpBookmarksCollection_1);
            } else {
              _result = null;
            }
            __db.setTransactionSuccessful();
            return _result;
          } finally {
            _cursor.close();
            _statement.release();
          }
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object getUserWithNotifications(final String userId,
      final Continuation<? super UserAndNotifications> continuation) {
    final String _sql = "SELECT * FROM UserProfile WHERE _id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (userId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, userId);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, true, _cancellationSignal, new Callable<UserAndNotifications>() {
      @Override
      public UserAndNotifications call() throws Exception {
        __db.beginTransaction();
        try {
          final Cursor _cursor = DBUtil.query(__db, _statement, true, null);
          try {
            final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "_id");
            final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
            final int _cursorIndexOfPhoto = CursorUtil.getColumnIndexOrThrow(_cursor, "photo");
            final int _cursorIndexOfEmail = CursorUtil.getColumnIndexOrThrow(_cursor, "email");
            final int _cursorIndexOfPhone = CursorUtil.getColumnIndexOrThrow(_cursor, "phone");
            final int _cursorIndexOfLevel = CursorUtil.getColumnIndexOrThrow(_cursor, "level");
            final ArrayMap<String, ArrayList<Notification>> _collectionNotifications = new ArrayMap<String, ArrayList<Notification>>();
            while (_cursor.moveToNext()) {
              if (!_cursor.isNull(_cursorIndexOfId)) {
                final String _tmpKey = _cursor.getString(_cursorIndexOfId);
                ArrayList<Notification> _tmpNotificationsCollection = _collectionNotifications.get(_tmpKey);
                if (_tmpNotificationsCollection == null) {
                  _tmpNotificationsCollection = new ArrayList<Notification>();
                  _collectionNotifications.put(_tmpKey, _tmpNotificationsCollection);
                }
              }
            }
            _cursor.moveToPosition(-1);
            __fetchRelationshipNotificationAstnEspritRoommoduleModelsNotification(_collectionNotifications);
            final UserAndNotifications _result;
            if(_cursor.moveToFirst()) {
              final UserProfile _tmpUser;
              if (! (_cursor.isNull(_cursorIndexOfId) && _cursor.isNull(_cursorIndexOfName) && _cursor.isNull(_cursorIndexOfPhoto) && _cursor.isNull(_cursorIndexOfEmail) && _cursor.isNull(_cursorIndexOfPhone) && _cursor.isNull(_cursorIndexOfLevel))) {
                final String _tmp_id;
                if (_cursor.isNull(_cursorIndexOfId)) {
                  _tmp_id = null;
                } else {
                  _tmp_id = _cursor.getString(_cursorIndexOfId);
                }
                final String _tmpName;
                if (_cursor.isNull(_cursorIndexOfName)) {
                  _tmpName = null;
                } else {
                  _tmpName = _cursor.getString(_cursorIndexOfName);
                }
                final String _tmpPhoto;
                if (_cursor.isNull(_cursorIndexOfPhoto)) {
                  _tmpPhoto = null;
                } else {
                  _tmpPhoto = _cursor.getString(_cursorIndexOfPhoto);
                }
                final String _tmpEmail;
                if (_cursor.isNull(_cursorIndexOfEmail)) {
                  _tmpEmail = null;
                } else {
                  _tmpEmail = _cursor.getString(_cursorIndexOfEmail);
                }
                final String _tmpPhone;
                if (_cursor.isNull(_cursorIndexOfPhone)) {
                  _tmpPhone = null;
                } else {
                  _tmpPhone = _cursor.getString(_cursorIndexOfPhone);
                }
                final int _tmpLevel;
                _tmpLevel = _cursor.getInt(_cursorIndexOfLevel);
                _tmpUser = new UserProfile(_tmp_id,_tmpName,_tmpPhoto,_tmpEmail,_tmpPhone,_tmpLevel);
              }  else  {
                _tmpUser = null;
              }
              ArrayList<Notification> _tmpNotificationsCollection_1 = null;
              if (!_cursor.isNull(_cursorIndexOfId)) {
                final String _tmpKey_1 = _cursor.getString(_cursorIndexOfId);
                _tmpNotificationsCollection_1 = _collectionNotifications.get(_tmpKey_1);
              }
              if (_tmpNotificationsCollection_1 == null) {
                _tmpNotificationsCollection_1 = new ArrayList<Notification>();
              }
              _result = new UserAndNotifications(_tmpUser,_tmpNotificationsCollection_1);
            } else {
              _result = null;
            }
            __db.setTransactionSuccessful();
            return _result;
          } finally {
            _cursor.close();
            _statement.release();
          }
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object getAll(final String userId,
      final Continuation<? super UserAndWishlist> continuation) {
    final String _sql = "SELECT * FROM UserProfile WHERE _id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (userId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, userId);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, true, _cancellationSignal, new Callable<UserAndWishlist>() {
      @Override
      public UserAndWishlist call() throws Exception {
        __db.beginTransaction();
        try {
          final Cursor _cursor = DBUtil.query(__db, _statement, true, null);
          try {
            final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "_id");
            final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
            final int _cursorIndexOfPhoto = CursorUtil.getColumnIndexOrThrow(_cursor, "photo");
            final int _cursorIndexOfEmail = CursorUtil.getColumnIndexOrThrow(_cursor, "email");
            final int _cursorIndexOfPhone = CursorUtil.getColumnIndexOrThrow(_cursor, "phone");
            final int _cursorIndexOfLevel = CursorUtil.getColumnIndexOrThrow(_cursor, "level");
            final ArrayMap<String, ArrayList<Wishlist>> _collectionWishlistItems = new ArrayMap<String, ArrayList<Wishlist>>();
            while (_cursor.moveToNext()) {
              if (!_cursor.isNull(_cursorIndexOfId)) {
                final String _tmpKey = _cursor.getString(_cursorIndexOfId);
                ArrayList<Wishlist> _tmpWishlistItemsCollection = _collectionWishlistItems.get(_tmpKey);
                if (_tmpWishlistItemsCollection == null) {
                  _tmpWishlistItemsCollection = new ArrayList<Wishlist>();
                  _collectionWishlistItems.put(_tmpKey, _tmpWishlistItemsCollection);
                }
              }
            }
            _cursor.moveToPosition(-1);
            __fetchRelationshipWishlistAstnEspritRoommoduleModelsWishlist(_collectionWishlistItems);
            final UserAndWishlist _result;
            if(_cursor.moveToFirst()) {
              final UserProfile _tmpUser;
              if (! (_cursor.isNull(_cursorIndexOfId) && _cursor.isNull(_cursorIndexOfName) && _cursor.isNull(_cursorIndexOfPhoto) && _cursor.isNull(_cursorIndexOfEmail) && _cursor.isNull(_cursorIndexOfPhone) && _cursor.isNull(_cursorIndexOfLevel))) {
                final String _tmp_id;
                if (_cursor.isNull(_cursorIndexOfId)) {
                  _tmp_id = null;
                } else {
                  _tmp_id = _cursor.getString(_cursorIndexOfId);
                }
                final String _tmpName;
                if (_cursor.isNull(_cursorIndexOfName)) {
                  _tmpName = null;
                } else {
                  _tmpName = _cursor.getString(_cursorIndexOfName);
                }
                final String _tmpPhoto;
                if (_cursor.isNull(_cursorIndexOfPhoto)) {
                  _tmpPhoto = null;
                } else {
                  _tmpPhoto = _cursor.getString(_cursorIndexOfPhoto);
                }
                final String _tmpEmail;
                if (_cursor.isNull(_cursorIndexOfEmail)) {
                  _tmpEmail = null;
                } else {
                  _tmpEmail = _cursor.getString(_cursorIndexOfEmail);
                }
                final String _tmpPhone;
                if (_cursor.isNull(_cursorIndexOfPhone)) {
                  _tmpPhone = null;
                } else {
                  _tmpPhone = _cursor.getString(_cursorIndexOfPhone);
                }
                final int _tmpLevel;
                _tmpLevel = _cursor.getInt(_cursorIndexOfLevel);
                _tmpUser = new UserProfile(_tmp_id,_tmpName,_tmpPhoto,_tmpEmail,_tmpPhone,_tmpLevel);
              }  else  {
                _tmpUser = null;
              }
              ArrayList<Wishlist> _tmpWishlistItemsCollection_1 = null;
              if (!_cursor.isNull(_cursorIndexOfId)) {
                final String _tmpKey_1 = _cursor.getString(_cursorIndexOfId);
                _tmpWishlistItemsCollection_1 = _collectionWishlistItems.get(_tmpKey_1);
              }
              if (_tmpWishlistItemsCollection_1 == null) {
                _tmpWishlistItemsCollection_1 = new ArrayList<Wishlist>();
              }
              _result = new UserAndWishlist(_tmpUser,_tmpWishlistItemsCollection_1);
            } else {
              _result = null;
            }
            __db.setTransactionSuccessful();
            return _result;
          } finally {
            _cursor.close();
            _statement.release();
          }
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }

  private void __fetchRelationshipBookmarksAstnEspritRoommoduleModelsBookmarks(
      final ArrayMap<String, ArrayList<Bookmarks>> _map) {
    final Set<String> __mapKeySet = _map.keySet();
    if (__mapKeySet.isEmpty()) {
      return;
    }
    // check if the size is too big, if so divide;
    if(_map.size() > RoomDatabase.MAX_BIND_PARAMETER_CNT) {
      ArrayMap<String, ArrayList<Bookmarks>> _tmpInnerMap = new ArrayMap<String, ArrayList<Bookmarks>>(androidx.room.RoomDatabase.MAX_BIND_PARAMETER_CNT);
      int _tmpIndex = 0;
      int _mapIndex = 0;
      final int _limit = _map.size();
      while(_mapIndex < _limit) {
        _tmpInnerMap.put(_map.keyAt(_mapIndex), _map.valueAt(_mapIndex));
        _mapIndex++;
        _tmpIndex++;
        if(_tmpIndex == RoomDatabase.MAX_BIND_PARAMETER_CNT) {
          __fetchRelationshipBookmarksAstnEspritRoommoduleModelsBookmarks(_tmpInnerMap);
          _tmpInnerMap = new ArrayMap<String, ArrayList<Bookmarks>>(RoomDatabase.MAX_BIND_PARAMETER_CNT);
          _tmpIndex = 0;
        }
      }
      if(_tmpIndex > 0) {
        __fetchRelationshipBookmarksAstnEspritRoommoduleModelsBookmarks(_tmpInnerMap);
      }
      return;
    }
    StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("SELECT `id`,`title`,`link`,`description`,`image`,`userId` FROM `Bookmarks` WHERE `userId` IN (");
    final int _inputSize = __mapKeySet.size();
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append(")");
    final String _sql = _stringBuilder.toString();
    final int _argCount = 0 + _inputSize;
    final RoomSQLiteQuery _stmt = RoomSQLiteQuery.acquire(_sql, _argCount);
    int _argIndex = 1;
    for (String _item : __mapKeySet) {
      if (_item == null) {
        _stmt.bindNull(_argIndex);
      } else {
        _stmt.bindString(_argIndex, _item);
      }
      _argIndex ++;
    }
    final Cursor _cursor = DBUtil.query(__db, _stmt, false, null);
    try {
      final int _itemKeyIndex = CursorUtil.getColumnIndex(_cursor, "userId");
      if (_itemKeyIndex == -1) {
        return;
      }
      final int _cursorIndexOfId = 0;
      final int _cursorIndexOfTitle = 1;
      final int _cursorIndexOfLink = 2;
      final int _cursorIndexOfDescription = 3;
      final int _cursorIndexOfImage = 4;
      final int _cursorIndexOfUserId = 5;
      while(_cursor.moveToNext()) {
        if (!_cursor.isNull(_itemKeyIndex)) {
          final String _tmpKey = _cursor.getString(_itemKeyIndex);
          ArrayList<Bookmarks> _tmpRelation = _map.get(_tmpKey);
          if (_tmpRelation != null) {
            final Bookmarks _item_1;
            final Integer _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getInt(_cursorIndexOfId);
            }
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpLink;
            if (_cursor.isNull(_cursorIndexOfLink)) {
              _tmpLink = null;
            } else {
              _tmpLink = _cursor.getString(_cursorIndexOfLink);
            }
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            final String _tmpImage;
            if (_cursor.isNull(_cursorIndexOfImage)) {
              _tmpImage = null;
            } else {
              _tmpImage = _cursor.getString(_cursorIndexOfImage);
            }
            final String _tmpUserId;
            if (_cursor.isNull(_cursorIndexOfUserId)) {
              _tmpUserId = null;
            } else {
              _tmpUserId = _cursor.getString(_cursorIndexOfUserId);
            }
            _item_1 = new Bookmarks(_tmpId,_tmpTitle,_tmpLink,_tmpDescription,_tmpImage,_tmpUserId);
            _tmpRelation.add(_item_1);
          }
        }
      }
    } finally {
      _cursor.close();
    }
  }

  private void __fetchRelationshipNotificationAstnEspritRoommoduleModelsNotification(
      final ArrayMap<String, ArrayList<Notification>> _map) {
    final Set<String> __mapKeySet = _map.keySet();
    if (__mapKeySet.isEmpty()) {
      return;
    }
    // check if the size is too big, if so divide;
    if(_map.size() > RoomDatabase.MAX_BIND_PARAMETER_CNT) {
      ArrayMap<String, ArrayList<Notification>> _tmpInnerMap = new ArrayMap<String, ArrayList<Notification>>(androidx.room.RoomDatabase.MAX_BIND_PARAMETER_CNT);
      int _tmpIndex = 0;
      int _mapIndex = 0;
      final int _limit = _map.size();
      while(_mapIndex < _limit) {
        _tmpInnerMap.put(_map.keyAt(_mapIndex), _map.valueAt(_mapIndex));
        _mapIndex++;
        _tmpIndex++;
        if(_tmpIndex == RoomDatabase.MAX_BIND_PARAMETER_CNT) {
          __fetchRelationshipNotificationAstnEspritRoommoduleModelsNotification(_tmpInnerMap);
          _tmpInnerMap = new ArrayMap<String, ArrayList<Notification>>(RoomDatabase.MAX_BIND_PARAMETER_CNT);
          _tmpIndex = 0;
        }
      }
      if(_tmpIndex > 0) {
        __fetchRelationshipNotificationAstnEspritRoommoduleModelsNotification(_tmpInnerMap);
      }
      return;
    }
    StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("SELECT `id`,`title`,`body`,`data`,`userId`,`src` FROM `Notification` WHERE `userId` IN (");
    final int _inputSize = __mapKeySet.size();
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append(")");
    final String _sql = _stringBuilder.toString();
    final int _argCount = 0 + _inputSize;
    final RoomSQLiteQuery _stmt = RoomSQLiteQuery.acquire(_sql, _argCount);
    int _argIndex = 1;
    for (String _item : __mapKeySet) {
      if (_item == null) {
        _stmt.bindNull(_argIndex);
      } else {
        _stmt.bindString(_argIndex, _item);
      }
      _argIndex ++;
    }
    final Cursor _cursor = DBUtil.query(__db, _stmt, false, null);
    try {
      final int _itemKeyIndex = CursorUtil.getColumnIndex(_cursor, "userId");
      if (_itemKeyIndex == -1) {
        return;
      }
      final int _cursorIndexOfId = 0;
      final int _cursorIndexOfTitle = 1;
      final int _cursorIndexOfBody = 2;
      final int _cursorIndexOfData = 3;
      final int _cursorIndexOfUserId = 4;
      final int _cursorIndexOfSrc = 5;
      while(_cursor.moveToNext()) {
        if (!_cursor.isNull(_itemKeyIndex)) {
          final String _tmpKey = _cursor.getString(_itemKeyIndex);
          ArrayList<Notification> _tmpRelation = _map.get(_tmpKey);
          if (_tmpRelation != null) {
            final Notification _item_1;
            final Integer _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getInt(_cursorIndexOfId);
            }
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpBody;
            if (_cursor.isNull(_cursorIndexOfBody)) {
              _tmpBody = null;
            } else {
              _tmpBody = _cursor.getString(_cursorIndexOfBody);
            }
            final String _tmpData;
            if (_cursor.isNull(_cursorIndexOfData)) {
              _tmpData = null;
            } else {
              _tmpData = _cursor.getString(_cursorIndexOfData);
            }
            final String _tmpUserId;
            if (_cursor.isNull(_cursorIndexOfUserId)) {
              _tmpUserId = null;
            } else {
              _tmpUserId = _cursor.getString(_cursorIndexOfUserId);
            }
            final String _tmpSrc;
            if (_cursor.isNull(_cursorIndexOfSrc)) {
              _tmpSrc = null;
            } else {
              _tmpSrc = _cursor.getString(_cursorIndexOfSrc);
            }
            _item_1 = new Notification(_tmpId,_tmpTitle,_tmpBody,_tmpData,_tmpUserId,_tmpSrc);
            _tmpRelation.add(_item_1);
          }
        }
      }
    } finally {
      _cursor.close();
    }
  }

  private void __fetchRelationshipWishlistAstnEspritRoommoduleModelsWishlist(
      final ArrayMap<String, ArrayList<Wishlist>> _map) {
    final Set<String> __mapKeySet = _map.keySet();
    if (__mapKeySet.isEmpty()) {
      return;
    }
    // check if the size is too big, if so divide;
    if(_map.size() > RoomDatabase.MAX_BIND_PARAMETER_CNT) {
      ArrayMap<String, ArrayList<Wishlist>> _tmpInnerMap = new ArrayMap<String, ArrayList<Wishlist>>(androidx.room.RoomDatabase.MAX_BIND_PARAMETER_CNT);
      int _tmpIndex = 0;
      int _mapIndex = 0;
      final int _limit = _map.size();
      while(_mapIndex < _limit) {
        _tmpInnerMap.put(_map.keyAt(_mapIndex), _map.valueAt(_mapIndex));
        _mapIndex++;
        _tmpIndex++;
        if(_tmpIndex == RoomDatabase.MAX_BIND_PARAMETER_CNT) {
          __fetchRelationshipWishlistAstnEspritRoommoduleModelsWishlist(_tmpInnerMap);
          _tmpInnerMap = new ArrayMap<String, ArrayList<Wishlist>>(RoomDatabase.MAX_BIND_PARAMETER_CNT);
          _tmpIndex = 0;
        }
      }
      if(_tmpIndex > 0) {
        __fetchRelationshipWishlistAstnEspritRoommoduleModelsWishlist(_tmpInnerMap);
      }
      return;
    }
    StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("SELECT `id`,`name`,`price`,`image`,`idProd`,`userId` FROM `Wishlist` WHERE `userId` IN (");
    final int _inputSize = __mapKeySet.size();
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append(")");
    final String _sql = _stringBuilder.toString();
    final int _argCount = 0 + _inputSize;
    final RoomSQLiteQuery _stmt = RoomSQLiteQuery.acquire(_sql, _argCount);
    int _argIndex = 1;
    for (String _item : __mapKeySet) {
      if (_item == null) {
        _stmt.bindNull(_argIndex);
      } else {
        _stmt.bindString(_argIndex, _item);
      }
      _argIndex ++;
    }
    final Cursor _cursor = DBUtil.query(__db, _stmt, false, null);
    try {
      final int _itemKeyIndex = CursorUtil.getColumnIndex(_cursor, "userId");
      if (_itemKeyIndex == -1) {
        return;
      }
      final int _cursorIndexOfId = 0;
      final int _cursorIndexOfName = 1;
      final int _cursorIndexOfPrice = 2;
      final int _cursorIndexOfImage = 3;
      final int _cursorIndexOfIdProd = 4;
      final int _cursorIndexOfUserId = 5;
      while(_cursor.moveToNext()) {
        if (!_cursor.isNull(_itemKeyIndex)) {
          final String _tmpKey = _cursor.getString(_itemKeyIndex);
          ArrayList<Wishlist> _tmpRelation = _map.get(_tmpKey);
          if (_tmpRelation != null) {
            final Wishlist _item_1;
            final Integer _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getInt(_cursorIndexOfId);
            }
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final float _tmpPrice;
            _tmpPrice = _cursor.getFloat(_cursorIndexOfPrice);
            final String _tmpImage;
            if (_cursor.isNull(_cursorIndexOfImage)) {
              _tmpImage = null;
            } else {
              _tmpImage = _cursor.getString(_cursorIndexOfImage);
            }
            final String _tmpIdProd;
            if (_cursor.isNull(_cursorIndexOfIdProd)) {
              _tmpIdProd = null;
            } else {
              _tmpIdProd = _cursor.getString(_cursorIndexOfIdProd);
            }
            final String _tmpUserId;
            if (_cursor.isNull(_cursorIndexOfUserId)) {
              _tmpUserId = null;
            } else {
              _tmpUserId = _cursor.getString(_cursorIndexOfUserId);
            }
            _item_1 = new Wishlist(_tmpId,_tmpName,_tmpPrice,_tmpImage,_tmpIdProd,_tmpUserId);
            _tmpRelation.add(_item_1);
          }
        }
      }
    } finally {
      _cursor.close();
    }
  }
}
