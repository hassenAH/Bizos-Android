package tn.esprit.roommodule.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Query;
import tn.esprit.roommodule.models.Notification;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\'J\u0019\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Ltn/esprit/roommodule/dao/NotifDao;", "Ltn/esprit/roommodule/dao/EntityDao;", "Ltn/esprit/roommodule/models/Notification;", "countNotifications", "Landroidx/lifecycle/LiveData;", "", "getByData", "data", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "RoomModule_debug"})
public abstract interface NotifDao extends tn.esprit.roommodule.dao.EntityDao<tn.esprit.roommodule.models.Notification> {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM Notification WHERE data LIKE :data")
    public abstract java.lang.Object getByData(@org.jetbrains.annotations.NotNull()
    java.lang.String data, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super tn.esprit.roommodule.models.Notification> continuation);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT COUNT(*) FROM Notification")
    public abstract androidx.lifecycle.LiveData<java.lang.Integer> countNotifications();
}