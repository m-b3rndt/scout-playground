package org.eclipse.scout.helloworld.server.services.common.security;

import java.security.AllPermission;
import java.security.Permissions;

import org.eclipse.scout.rt.server.services.common.security.AbstractAccessControlService;
import org.eclipse.scout.rt.shared.security.RemoteServiceAccessPermission;

public class AccessControlService extends AbstractAccessControlService {

  @Override
  protected Permissions execLoadPermissions() {
    Permissions permissions = new Permissions();
    permissions.add(new RemoteServiceAccessPermission("*.shared.*", "*"));
    //TODO M fill access control service
    permissions.add(new AllPermission());
    return permissions;
  }

}
