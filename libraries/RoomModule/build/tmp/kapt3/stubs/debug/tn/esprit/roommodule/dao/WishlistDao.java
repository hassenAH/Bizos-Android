package tn.esprit.roommodule.dao;

import androidx.room.Dao;
import androidx.room.Query;
import androidx.room.Transaction;
import tn.esprit.roommodule.models.UserAndWishlist;
import tn.esprit.roommodule.models.Wishlist;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"}, d2 = {"Ltn/esprit/roommodule/dao/WishlistDao;", "Ltn/esprit/roommodule/dao/EntityDao;", "Ltn/esprit/roommodule/models/Wishlist;", "RoomModule_debug"})
public abstract interface WishlistDao extends tn.esprit.roommodule.dao.EntityDao<tn.esprit.roommodule.models.Wishlist> {
}