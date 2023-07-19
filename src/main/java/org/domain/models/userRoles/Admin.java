package org.domain.models.userRoles;

import lombok.*;
import lombok.experimental.SuperBuilder;
import org.domain.models.Account;
import org.domain.models.userRoles.accountInformation.UserInfo;

import java.util.UUID;

@Getter
@Setter
public class Admin extends Account {

    @Builder
    public Admin(UUID id, UserInfo info){
        super(id, info);
    }
}
