package tn.esprit.roommodule.dao;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import tn.esprit.roommodule.models.Notification;

@SuppressWarnings({"unchecked", "deprecation"})
public final class NotifDao_Impl implements NotifDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Notification> __insertionAdapterOfNotification;

  private final EntityDeletionOrUpdateAdapter<Notification> __deletionAdapterOfNotification;

  private final EntityDeletionOrUpdateAdapter<Notification> __updateAdapterOfNotification;

  public NotifDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfNotification = new EntityInsertionAdapter<Notification>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `Notification` (`id`,`title`,`body`,`data`,`userId`,`src`) VALUES (?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Notification value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        if (value.getBody() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getBody());
        }
        if (value.getData() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getData());
        }
        if (value.getUserId() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getUserId());
        }
        if (value.getSrc() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getSrc());
        }
      }
    };
    this.__deletionAdapterOfNotification = new EntityDeletionOrUpdateAdapter<Notification>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `Notification` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Notification value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
      }
    };
    this.__updateAdapterOfNotification = new EntityDeletionOrUpdateAdapter<Notification>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `Notification` SET `id` = ?,`title` = ?,`body` = ?,`data` = ?,`userId` = ?,`src` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Notification value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        if (value.getBody() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getBody());
        }
        if (value.getData() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getData());
        }
        if (value.getUserId() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getUserId());
        }
        if (value.getSrc() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getSrc());
        }
        if (value.getId() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindLong(7, value.getId());
        }
      }
    };
  }

  @Override
  public Object create(final Notification e, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfNotification.insert(e);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object addAll(final List<? extends Notification> e,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfNotification.insert(e);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object delete(final Notification e, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfNotification.handle(e);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object update(final Notification e, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfNotification.handle(e);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object getByData(final String data,
      final Continuation<? super Notification> continuation) {
    final String _sql = "SELECT * FROM Notification WHERE data LIKE ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (data == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, data);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<Notification>() {
      @Override
      public Notification call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfBody = CursorUtil.getColumnIndexOrThrow(_cursor, "body");
          final int _cursorIndexOfData = CursorUtil.getColumnIndexOrThrow(_cursor, "data");
          final int _cursorIndexOfUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "userId");
          final int _cursorIndexOfSrc = CursorUtil.getColumnIndexOrThrow(_cursor, "src");
          final Notification _result;
          if(_cursor.moveToFirst()) {
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
            _result = new Notification(_tmpId,_tmpTitle,_tmpBody,_tmpData,_tmpUserId,_tmpSrc);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  @Override
  public LiveData<Integer> countNotifications() {
    final String _sql = "SELECT COUNT(*) FROM Notification";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"Notification"}, false, new Callable<Integer>() {
      @Override
      public Integer call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Integer _result;
          if(_cursor.moveToFirst()) {
            final Integer _tmp;
            if (_cursor.isNull(0)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(0);
            }
            _result = _tmp;
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
