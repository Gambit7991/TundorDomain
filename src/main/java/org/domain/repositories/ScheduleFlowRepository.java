package org.domain.repositories;

import org.domain.models.DomainUserModel;
import org.domain.models.userRoles.DomainStudentModel;
import org.domain.models.userRoles.DomainTutorModel;
import org.joda.time.Interval;

public interface ScheduleFlowRepository {
    boolean isIntervalAvailable(DomainTutorModel domainTutorModel, DomainStudentModel domainStudentModel, Interval interval);

    boolean isIntervalAvailable(DomainUserModel domainUserModel, Interval interval);

    ScheduleFlowRepository setSchedule(DomainTutorModel domainTutorModel, DomainStudentModel domainStudentModel, Interval interval);
}
