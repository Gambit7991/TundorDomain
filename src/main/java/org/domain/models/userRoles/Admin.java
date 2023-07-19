package org.domain.models.userRoles;

import lombok.Builder;
import org.domain.models.Account;
import org.domain.models.userRoles.accountInformation.UserInfo;

import java.util.UUID;

public class Admin extends Account {

    @Builder
    public Admin(UserInfo userInfo, UUID id) {
        super(userInfo, id);
    }
}
