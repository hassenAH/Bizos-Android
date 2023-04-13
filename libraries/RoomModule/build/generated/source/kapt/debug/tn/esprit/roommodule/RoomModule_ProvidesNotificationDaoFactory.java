// Generated by Dagger (https://dagger.dev).
package tn.esprit.roommodule;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import tn.esprit.roommodule.dao.NotifDao;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RoomModule_ProvidesNotificationDaoFactory implements Factory<NotifDao> {
  private final RoomModule module;

  private final Provider<NebulaGamingDatabase> databaseProvider;

  public RoomModule_ProvidesNotificationDaoFactory(RoomModule module,
      Provider<NebulaGamingDatabase> databaseProvider) {
    this.module = module;
    this.databaseProvider = databaseProvider;
  }

  @Override
  public NotifDao get() {
    return providesNotificationDao(module, databaseProvider.get());
  }

  public static RoomModule_ProvidesNotificationDaoFactory create(RoomModule module,
      Provider<NebulaGamingDatabase> databaseProvider) {
    return new RoomModule_ProvidesNotificationDaoFactory(module, databaseProvider);
  }

  public static NotifDao providesNotificationDao(RoomModule instance,
      NebulaGamingDatabase database) {
    return Preconditions.checkNotNullFromProvides(instance.providesNotificationDao(database));
  }
}