package tn.esprit.roommodule;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import tn.esprit.roommodule.dao.BookmarksDao;
import tn.esprit.roommodule.dao.NotifDao;
import tn.esprit.roommodule.dao.UserDao;
import tn.esprit.roommodule.dao.WishlistDao;
import tn.esprit.roommodule.models.Bookmarks;
import tn.esprit.roommodule.models.Notification;
import tn.esprit.roommodule.models.UserProfile;
import tn.esprit.roommodule.models.Wishlist;

@androidx.room.Database(entities = {tn.esprit.roommodule.models.Bookmarks.class, tn.esprit.roommodule.models.UserProfile.class, tn.esprit.roommodule.models.Notification.class, tn.esprit.roommodule.models.Wishlist.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\nH&\u00a8\u0006\f"}, d2 = {"Ltn/esprit/roommodule/NebulaGamingDatabase;", "Landroidx/room/RoomDatabase;", "()V", "bookmarksDao", "Ltn/esprit/roommodule/dao/BookmarksDao;", "notifDao", "Ltn/esprit/roommodule/dao/NotifDao;", "userDao", "Ltn/esprit/roommodule/dao/UserDao;", "wishlistDao", "Ltn/esprit/roommodule/dao/WishlistDao;", "Companion", "RoomModule_debug"})
public abstract class NebulaGamingDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull()
    public static final tn.esprit.roommodule.NebulaGamingDatabase.Companion Companion = null;
    @kotlin.jvm.Volatile()
    private static volatile tn.esprit.roommodule.NebulaGamingDatabase INSTANCE;
    
    public NebulaGamingDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract tn.esprit.roommodule.dao.BookmarksDao bookmarksDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract tn.esprit.roommodule.dao.UserDao userDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract tn.esprit.roommodule.dao.NotifDao notifDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract tn.esprit.roommodule.dao.WishlistDao wishlistDao();
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Ltn/esprit/roommodule/NebulaGamingDatabase$Companion;", "", "()V", "INSTANCE", "Ltn/esprit/roommodule/NebulaGamingDatabase;", "getInstance", "context", "Landroid/content/Context;", "RoomModule_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final tn.esprit.roommodule.NebulaGamingDatabase getInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
    }
}