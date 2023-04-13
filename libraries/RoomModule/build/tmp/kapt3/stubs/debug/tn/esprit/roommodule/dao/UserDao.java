package tn.esprit.roommodule.dao;

import androidx.room.*;
import tn.esprit.roommodule.models.UserAndBookmarks;
import tn.esprit.roommodule.models.UserAndNotifications;
import tn.esprit.roommodule.models.UserAndWishlist;
import tn.esprit.roommodule.models.UserProfile;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u001b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u001b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u0019\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Ltn/esprit/roommodule/dao/UserDao;", "Ltn/esprit/roommodule/dao/EntityDao;", "Ltn/esprit/roommodule/models/UserProfile;", "getAll", "Ltn/esprit/roommodule/models/UserAndWishlist;", "userId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserWithBookmarks", "Ltn/esprit/roommodule/models/UserAndBookmarks;", "getUserWithNotifications", "Ltn/esprit/roommodule/models/UserAndNotifications;", "saveUser", "", "e", "(Ltn/esprit/roommodule/models/UserProfile;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "RoomModule_debug"})
public abstract interface UserDao extends tn.esprit.roommodule.dao.EntityDao<tn.esprit.roommodule.models.UserProfile> {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM UserProfile WHERE _id = :userId")
    @androidx.room.Transaction()
    public abstract java.lang.Object getUserWithBookmarks(@org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super tn.esprit.roommodule.models.UserAndBookmarks> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object saveUser(@org.jetbrains.annotations.NotNull()
    tn.esprit.roommodule.models.UserProfile e, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM UserProfile WHERE _id = :userId")
    @androidx.room.Transaction()
    public abstract java.lang.Object getUserWithNotifications(@org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super tn.esprit.roommodule.models.UserAndNotifications> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM UserProfile WHERE _id = :userId")
    @androidx.room.Transaction()
    public abstract java.lang.Object getAll(@org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super tn.esprit.roommodule.models.UserAndWishlist> continuation);
}