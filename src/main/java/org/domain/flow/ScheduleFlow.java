package org.domain.flow;

import org.domain.models.DomainUserModel;
import org.domain.models.userRoles.DomainStudentModel;
import org.domain.models.userRoles.DomainTutorModel;
import org.domain.repositories.ScheduleFlowRepository;
import org.joda.time.Interval;

import java.util.List;

public class ScheduleFlow implements ScheduleFlowRepository {

    /**
     * isIntervalAvailable takes two schedules, concatenates them and checks if any of schedules overlapping interval
     *
     * @param domainTutorModel
     * @param domainStudentModel
     * @param interval
     * @return true in case that none of schedules overlapping interval
     */
    public boolean isIntervalAvailable(DomainTutorModel domainTutorModel, DomainStudentModel domainStudentModel, Interval interval) {
        List<Interval> resultInterval = domainTutorModel.getSchedule().getFullSchedule();
        List<Interval> studentInterval = domainStudentModel.getSchedule().getFullSchedule();
        resultInterval.retainAll(studentInterval);
        resultInterval.addAll(studentInterval);
        return resultInterval.stream().noneMatch(i -> i.overlaps(interval));
    }

    public boolean isIntervalAvailable(DomainUserModel domainUserModel, Interval interval) {
        return domainUserModel.getSchedule().getSchedules().values().stream().noneMatch(i -> i.overlaps(interval));
    }

    /**
     * @param domainTutorModel    - domainTutorModel to set schedule
     * @param domainStudentModel  - domainStudentModel to set schedule
     * @param interval - schedule to set
     *                 in if statement we are checking if interval overlapping domainStudentModel or domainTutorModel schedule
     * @return - false if set schedule is impossible
     */
    public ScheduleFlow setSchedule(DomainTutorModel domainTutorModel, DomainStudentModel domainStudentModel, Interval interval) {
        if (isIntervalAvailable(domainTutorModel, domainStudentModel, interval)) {
            domainTutorModel.getSchedule().addSchedule(domainStudentModel, interval);
            domainStudentModel.getSchedule().addSchedule(domainTutorModel, interval);
        }
        return this;
    }

    public boolean isScheduled(DomainTutorModel domainTutorModel, DomainStudentModel domainStudentModel){
        Interval tutorInterval = domainTutorModel.getSchedule(domainStudentModel);
        if(tutorInterval == null) return false;
        return tutorInterval.equals(domainStudentModel.getSchedule(domainTutorModel));
    }
}
