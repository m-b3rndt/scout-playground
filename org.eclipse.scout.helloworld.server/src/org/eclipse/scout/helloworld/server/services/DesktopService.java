/**
 *
 */
package org.eclipse.scout.helloworld.server.services;

import org.eclipse.scout.commons.exception.ProcessingException;
import org.eclipse.scout.helloworld.shared.services.DesktopFormData;
import org.eclipse.scout.helloworld.shared.services.IDesktopService;
import org.eclipse.scout.service.AbstractService;

/**
 * @author M
 */
public class DesktopService extends AbstractService implements IDesktopService {

  @Override
  public DesktopFormData load(DesktopFormData formData) throws ProcessingException {
    formData.getMessage().setValue("Hello, World");
    return formData;
  }
}
