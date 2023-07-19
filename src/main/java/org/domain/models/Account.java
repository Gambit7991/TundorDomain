package org.domain.models;

import lombok.*;
import org.domain.models.userRoles.accountInformation.UserInfo;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@ToString(includeFieldNames = false)
@EqualsAndHashCode
public abstract class Account {
    private UUID id;
    private UserInfo info;

    public Account(UUID id, UserInfo info) {
        this.id = id;
        this.info = info;
    }
}