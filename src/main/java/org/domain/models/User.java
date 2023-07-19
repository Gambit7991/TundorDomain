package org.domain.models;

import lombok.Getter;
import lombok.Setter;
import org.domain.models.userRoles.accountInformation.UserInfo;

import java.util.UUID;


@Getter
@Setter
public abstract class User extends Account {
    public User(UserInfo Info, UUID id) {
        super(id, Info);
    }


}
