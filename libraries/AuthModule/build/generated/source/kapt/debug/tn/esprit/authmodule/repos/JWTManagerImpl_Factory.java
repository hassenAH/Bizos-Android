// Generated by Dagger (https://dagger.dev).
package tn.esprit.authmodule.repos;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class JWTManagerImpl_Factory implements Factory<JWTManagerImpl> {
  @Override
  public JWTManagerImpl get() {
    return newInstance();
  }

  public static JWTManagerImpl_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static JWTManagerImpl newInstance() {
    return new JWTManagerImpl();
  }

  private static final class InstanceHolder {
    private static final JWTManagerImpl_Factory INSTANCE = new JWTManagerImpl_Factory();
  }
}
