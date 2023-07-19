package org.domain.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.domain.models.userRoles.accountInformation.UserInfo;

import java.util.UUID;


@Getter
@Setter

public abstract class User extends Account {
    @Builder
    public User(UserInfo userInfo, UUID id) {
        super(id, userInfo);
    }


}
