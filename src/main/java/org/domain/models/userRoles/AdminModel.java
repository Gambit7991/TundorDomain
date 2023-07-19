package org.domain.models.userRoles;

import org.domain.models.AccountModel;
import org.domain.models.userRoles.accountInformation.UserInfo;

import java.util.UUID;

public class AdminModel extends AccountModel {

    public AdminModel(UserInfo userInfo, UUID id) {
        super(userInfo, id);
    }
}
