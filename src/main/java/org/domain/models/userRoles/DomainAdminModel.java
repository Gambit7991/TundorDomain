package org.domain.models.userRoles;

import org.domain.models.DomainAccountModel;
import org.domain.models.userRoles.accountInformation.DomainUserInfo;

import java.util.UUID;

public class DomainAdminModel extends DomainAccountModel {

    public DomainAdminModel(DomainUserInfo domainUserInfo, UUID id) {
        super(domainUserInfo, id);
    }
}
