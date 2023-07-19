package org.domain.repositories;

import org.domain.models.UserModel;
import org.domain.models.userRoles.StudentModel;
import org.domain.models.userRoles.TutorModel;
import org.joda.time.Interval;

public interface ScheduleFlowRepository {
    boolean isIntervalAvailable(TutorModel domainTutorModel, StudentModel domainStudentModel, Interval interval);

    boolean isIntervalAvailable(UserModel userModel, Interval interval);

    ScheduleFlowRepository setSchedule(TutorModel domainTutorModel, StudentModel domainStudentModel, Interval interval);
}
