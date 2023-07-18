package org.domain.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.domain.models.userRoles.accountInformation.DomainUserInfo;

import java.util.UUID;

@Getter
@Setter
@ToString(includeFieldNames = false)
@EqualsAndHashCode
public abstract class DomainAccountModel {
    private UUID id;
    private DomainUserInfo info;

    public DomainAccountModel(DomainUserInfo info, UUID id) {
        this.info = info;
        this.id = id;
    }

}