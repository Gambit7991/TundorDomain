package org.domain.models;

import lombok.Getter;
import lombok.Setter;
import org.domain.models.userRoles.accountInformation.DomainUserInfo;

import java.util.UUID;


@Getter
@Setter
public abstract class DomainUserModel extends DomainAccountModel {

    public DomainUserModel(DomainUserInfo domainUserInfo, UUID id) {
        super(domainUserInfo, id);
    }



}
