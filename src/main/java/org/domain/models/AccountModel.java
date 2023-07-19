package org.domain.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.domain.models.userRoles.accountInformation.UserInfo;

import java.util.UUID;

@Getter
@Setter
@ToString(includeFieldNames = false)
@EqualsAndHashCode
public abstract class AccountModel {
    private UUID id;
    private UserInfo info;

    public AccountModel(UserInfo info, UUID id) {
        this.info = info;
        this.id = id;
    }

}