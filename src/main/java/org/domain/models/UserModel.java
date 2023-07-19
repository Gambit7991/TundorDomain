package org.domain.models;

import lombok.Getter;
import lombok.Setter;
import org.domain.models.userRoles.accountInformation.UserInfo;

import java.util.UUID;


@Getter
@Setter
public abstract class UserModel extends AccountModel {

    public UserModel(UserInfo userInfo, UUID id) {
        super(userInfo, id);
    }



}
