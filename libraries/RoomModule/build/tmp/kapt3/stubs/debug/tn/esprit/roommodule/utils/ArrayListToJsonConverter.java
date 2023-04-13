package tn.esprit.roommodule.utils;

import androidx.room.TypeConverter;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0007J\u0018\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0007J\"\u0010\t\u001a\u0002H\u0001\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005H\u0082\b\u00a2\u0006\u0002\u0010\f\u00a8\u0006\r"}, d2 = {"Ltn/esprit/roommodule/utils/ArrayListToJsonConverter;", "T", "", "()V", "toJson", "", "value", "", "toList", "fromJson", "Lcom/google/gson/Gson;", "json", "(Lcom/google/gson/Gson;Ljava/lang/String;)Ljava/lang/Object;", "RoomModule_debug"})
public abstract class ArrayListToJsonConverter<T extends java.lang.Object> {
    
    public ArrayListToJsonConverter() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public final java.lang.String toJson(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends T> value) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public final java.util.List<T> toList(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
        return null;
    }
}