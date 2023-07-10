package org.domain.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.domain.models.userRoles.accountInformation.DomainUserInfo;

import java.util.ArrayList;

@Getter
@Setter
@ToString(includeFieldNames = false)
@EqualsAndHashCode
public abstract class DomainAccountModel {
    private final DomainUserInfo domainUserInfo;
    private final int id;
    private String mainPicture;
    private ArrayList<String> pictures;

    public DomainAccountModel(DomainUserInfo domainUserInfo, int id) {
        this.domainUserInfo = domainUserInfo;
        this.id = id;
    }

    public DomainUserInfo getDomainUserInfo(){
        return this.domainUserInfo;
    }


}