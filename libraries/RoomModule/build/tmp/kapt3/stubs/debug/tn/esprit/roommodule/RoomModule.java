package tn.esprit.roommodule;

import android.content.Context;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;
import tn.esprit.roommodule.dao.BookmarksDao;
import tn.esprit.roommodule.dao.NotifDao;
import tn.esprit.roommodule.dao.UserDao;
import tn.esprit.roommodule.dao.WishlistDao;
import javax.inject.Singleton;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0010"}, d2 = {"Ltn/esprit/roommodule/RoomModule;", "", "()V", "provideBookmarksDao", "Ltn/esprit/roommodule/dao/BookmarksDao;", "database", "Ltn/esprit/roommodule/NebulaGamingDatabase;", "provideRoomDatabase", "context", "Landroid/content/Context;", "provideUserDao", "Ltn/esprit/roommodule/dao/UserDao;", "providesNotificationDao", "Ltn/esprit/roommodule/dao/NotifDao;", "providesWishlistDao", "Ltn/esprit/roommodule/dao/WishlistDao;", "RoomModule_debug"})
@dagger.Module()
public final class RoomModule {
    
    public RoomModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final tn.esprit.roommodule.NebulaGamingDatabase provideRoomDatabase(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final tn.esprit.roommodule.dao.BookmarksDao provideBookmarksDao(@org.jetbrains.annotations.NotNull()
    tn.esprit.roommodule.NebulaGamingDatabase database) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final tn.esprit.roommodule.dao.UserDao provideUserDao(@org.jetbrains.annotations.NotNull()
    tn.esprit.roommodule.NebulaGamingDatabase database) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final tn.esprit.roommodule.dao.NotifDao providesNotificationDao(@org.jetbrains.annotations.NotNull()
    tn.esprit.roommodule.NebulaGamingDatabase database) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final tn.esprit.roommodule.dao.WishlistDao providesWishlistDao(@org.jetbrains.annotations.NotNull()
    tn.esprit.roommodule.NebulaGamingDatabase database) {
        return null;
    }
}