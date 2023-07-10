package org.domain.models.userRoles;

import org.domain.models.DomainAccountModel;
import org.domain.models.userRoles.accountInformation.DomainUserInfo;

public class DomainAdminModel extends DomainAccountModel {

    public DomainAdminModel(DomainUserInfo domainUserInfo, int id) {
        super(domainUserInfo, id);
    }
}
