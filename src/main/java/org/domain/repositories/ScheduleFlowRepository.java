package org.domain.repositories;

import org.domain.models.User;
import org.domain.models.userRoles.Student;
import org.domain.models.userRoles.Tutor;
import org.joda.time.Interval;

public interface ScheduleFlowRepository {
    boolean isIntervalAvailable(Tutor domainTutorModel, Student domainStudentModel, Interval interval);

    boolean isIntervalAvailable(User userModel, Interval interval);

    ScheduleFlowRepository setSchedule(Tutor domainTutorModel, Student domainStudentModel, Interval interval);
}
