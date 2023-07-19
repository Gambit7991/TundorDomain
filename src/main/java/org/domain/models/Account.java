package org.domain.models;

import lombok.*;
import org.domain.models.userRoles.accountInformation.UserInfo;

import java.util.UUID;

@Getter
@Setter
@ToString(includeFieldNames = false)
@EqualsAndHashCode
@Builder
public abstract class Account {
    private UUID id;
    private UserInfo info;

    public Account(UserInfo info, UUID id) {
        this.info = info;
        this.id = id;
    }

}