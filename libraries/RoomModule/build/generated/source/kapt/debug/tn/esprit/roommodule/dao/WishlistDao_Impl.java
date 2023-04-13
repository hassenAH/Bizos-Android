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
import tn.esprit.roommodule.models.Wishlist;

@SuppressWarnings({"unchecked", "deprecation"})
public final class WishlistDao_Impl implements WishlistDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Wishlist> __insertionAdapterOfWishlist;

  private final EntityDeletionOrUpdateAdapter<Wishlist> __deletionAdapterOfWishlist;

  private final EntityDeletionOrUpdateAdapter<Wishlist> __updateAdapterOfWishlist;

  public WishlistDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfWishlist = new EntityInsertionAdapter<Wishlist>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `Wishlist` (`id`,`name`,`price`,`image`,`idProd`,`userId`) VALUES (?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Wishlist value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        stmt.bindDouble(3, value.getPrice());
        if (value.getImage() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getImage());
        }
        if (value.getIdProd() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getIdProd());
        }
        if (value.getUserId() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getUserId());
        }
      }
    };
    this.__deletionAdapterOfWishlist = new EntityDeletionOrUpdateAdapter<Wishlist>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `Wishlist` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Wishlist value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
      }
    };
    this.__updateAdapterOfWishlist = new EntityDeletionOrUpdateAdapter<Wishlist>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `Wishlist` SET `id` = ?,`name` = ?,`price` = ?,`image` = ?,`idProd` = ?,`userId` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Wishlist value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        stmt.bindDouble(3, value.getPrice());
        if (value.getImage() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getImage());
        }
        if (value.getIdProd() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getIdProd());
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
  public Object create(final Wishlist e, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfWishlist.insert(e);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object addAll(final List<? extends Wishlist> e,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfWishlist.insert(e);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object delete(final Wishlist e, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfWishlist.handle(e);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object update(final Wishlist e, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfWishlist.handle(e);
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
