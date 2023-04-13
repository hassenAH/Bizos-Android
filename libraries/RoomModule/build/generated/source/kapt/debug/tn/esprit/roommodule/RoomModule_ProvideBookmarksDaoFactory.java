// Generated by Dagger (https://dagger.dev).
package tn.esprit.roommodule;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import tn.esprit.roommodule.dao.BookmarksDao;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RoomModule_ProvideBookmarksDaoFactory implements Factory<BookmarksDao> {
  private final RoomModule module;

  private final Provider<NebulaGamingDatabase> databaseProvider;

  public RoomModule_ProvideBookmarksDaoFactory(RoomModule module,
      Provider<NebulaGamingDatabase> databaseProvider) {
    this.module = module;
    this.databaseProvider = databaseProvider;
  }

  @Override
  public BookmarksDao get() {
    return provideBookmarksDao(module, databaseProvider.get());
  }

  public static RoomModule_ProvideBookmarksDaoFactory create(RoomModule module,
      Provider<NebulaGamingDatabase> databaseProvider) {
    return new RoomModule_ProvideBookmarksDaoFactory(module, databaseProvider);
  }

  public static BookmarksDao provideBookmarksDao(RoomModule instance,
      NebulaGamingDatabase database) {
    return Preconditions.checkNotNullFromProvides(instance.provideBookmarksDao(database));
  }
}