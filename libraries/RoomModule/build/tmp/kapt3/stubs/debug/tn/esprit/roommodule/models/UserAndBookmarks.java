package tn.esprit.roommodule.models;

import androidx.room.Embedded;
import androidx.room.Relation;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u00c6\u0003J\'\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0016"}, d2 = {"Ltn/esprit/roommodule/models/UserAndBookmarks;", "", "user", "Ltn/esprit/roommodule/models/UserProfile;", "bookmarks", "", "Ltn/esprit/roommodule/models/Bookmarks;", "(Ltn/esprit/roommodule/models/UserProfile;Ljava/util/List;)V", "getBookmarks", "()Ljava/util/List;", "getUser", "()Ltn/esprit/roommodule/models/UserProfile;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "RoomModule_debug"})
public final class UserAndBookmarks {
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Embedded()
    private final tn.esprit.roommodule.models.UserProfile user = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Relation(parentColumn = "_id", entityColumn = "userId")
    private final java.util.List<tn.esprit.roommodule.models.Bookmarks> bookmarks = null;
    
    @org.jetbrains.annotations.NotNull()
    public final tn.esprit.roommodule.models.UserAndBookmarks copy(@org.jetbrains.annotations.Nullable()
    tn.esprit.roommodule.models.UserProfile user, @org.jetbrains.annotations.Nullable()
    java.util.List<tn.esprit.roommodule.models.Bookmarks> bookmarks) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public UserAndBookmarks(@org.jetbrains.annotations.Nullable()
    tn.esprit.roommodule.models.UserProfile user, @org.jetbrains.annotations.Nullable()
    java.util.List<tn.esprit.roommodule.models.Bookmarks> bookmarks) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final tn.esprit.roommodule.models.UserProfile component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final tn.esprit.roommodule.models.UserProfile getUser() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<tn.esprit.roommodule.models.Bookmarks> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<tn.esprit.roommodule.models.Bookmarks> getBookmarks() {
        return null;
    }
}