package org.domain.models.userRoles;

import org.domain.models.DomainAccountModel;
import org.domain.models.userRoles.accountInformation.SignUpInformation;

public class DomainAdminModel extends DomainAccountModel {

    public DomainAdminModel(SignUpInformation signUpInformation, int id) {
        super(signUpInformation, id);
    }
}
