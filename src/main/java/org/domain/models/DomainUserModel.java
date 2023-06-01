package org.domain.models;

import lombok.Getter;
import lombok.Setter;
import org.domain.models.userRoles.accountInformation.Schedule;
import org.domain.models.userRoles.accountInformation.SignUpInformation;
import org.joda.time.Interval;


@Getter
@Setter
public abstract class DomainUserModel extends DomainAccountModel {

    private final Schedule schedule = new Schedule();

    public DomainUserModel(SignUpInformation signUpInformation, int id) {
        super(signUpInformation, id);
    }

    public Interval getSchedule(DomainUserModel domainUserModel){
        return schedule.getSchedules().get(domainUserModel);
    }
}
