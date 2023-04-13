package tn.esprit.roommodule.dao;

import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import tn.esprit.roommodule.models.Bookmarks;

@SuppressWarnings({"unchecked", "deprecation"})
public final class BookmarksDao_Impl implements BookmarksDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Bookmarks> __insertionAdapterOfBookmarks;

  private final EntityDeletionOrUpdateAdapter<Bookmarks> __deletionAdapterOfBookmarks;

  private final EntityDeletionOrUpdateAdapter<Bookmarks> __updateAdapterOfBookmarks;

  public BookmarksDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfBookmarks = new EntityInsertionAdapter<Bookmarks>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `Bookmarks` (`id`,`title`,`link`,`description`,`image`,`userId`) VALUES (?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Bookmarks value) {
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
        if (value.getLink() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getLink());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDescription());
        }
        if (value.getImage() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getImage());
        }
        if (value.getUserId() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getUserId());
        }
      }
    };
    this.__deletionAdapterOfBookmarks = new EntityDeletionOrUpdateAdapter<Bookmarks>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `Bookmarks` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Bookmarks value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
      }
    };
    this.__updateAdapterOfBookmarks = new EntityDeletionOrUpdateAdapter<Bookmarks>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `Bookmarks` SET `id` = ?,`title` = ?,`link` = ?,`description` = ?,`image` = ?,`userId` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Bookmarks value) {
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
        if (value.getLink() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getLink());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDescription());
        }
        if (value.getImage() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getImage());
        }
        if (value.getUserId() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getUserId());
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
  public Object create(final Bookmarks e, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfBookmarks.insert(e);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object addAll(final List<? extends Bookmarks> e,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfBookmarks.insert(e);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object delete(final Bookmarks e, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfBookmarks.handle(e);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object update(final Bookmarks e, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfBookmarks.handle(e);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
