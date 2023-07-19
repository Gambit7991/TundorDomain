package org.domain.models.userRoles;

import org.domain.models.Account;
import org.domain.models.userRoles.accountInformation.UserInfo;

import java.util.UUID;

public class Admin extends Account {

    public Admin(UserInfo userInfo, UUID id) {
        super(userInfo, id);
    }
}
