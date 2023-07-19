package org.domain.flow;

import org.domain.models.User;
import org.domain.models.userRoles.Student;
import org.domain.models.userRoles.Tutor;
import org.domain.repositories.ScheduleFlowRepository;
import org.joda.time.Interval;

public class ScheduleFlow implements ScheduleFlowRepository {

    /**
     * isIntervalAvailable takes two schedules, concatenates them and checks if any of schedules overlapping interval
     *
     * @param domainTutorModel
     * @param domainStudentModel
     * @param interval
     * @return true in case that none of schedules overlapping interval
     */
    public boolean isIntervalAvailable(Tutor domainTutorModel, Student domainStudentModel, Interval interval) {
//        List<Interval> resultInterval = domainTutorModel.getSchedule().getFullSchedule();
//        List<Interval> studentInterval = domainStudentModel.getSchedule().getFullSchedule();
//        resultInterval.retainAll(studentInterval);
//        resultInterval.addAll(studentInterval);
//        return resultInterval.stream().noneMatch(i -> i.overlaps(interval));
        return true;
    }

    public boolean isIntervalAvailable(User userModel, Interval interval) {
//        return domainUserModel.getSchedule().getSchedules().values().stream().noneMatch(i -> i.overlaps(interval));
        return true;
    }

    /**
     * @param domainTutorModel    - domainTutorModel to set schedule
     * @param domainStudentModel  - domainStudentModel to set schedule
     * @param interval - schedule to set
     *                 in if statement we are checking if interval overlapping domainStudentModel or domainTutorModel schedule
     * @return - false if set schedule is impossible
     */
    public ScheduleFlow setSchedule(Tutor domainTutorModel, Student domainStudentModel, Interval interval) {
//        if (isIntervalAvailable(domainTutorModel, domainStudentModel, interval)) {
//            domainTutorModel.getSchedule().addSchedule(domainStudentModel, interval);
//            domainStudentModel.getSchedule().addSchedule(domainTutorModel, interval);
//        }
        return this;
    }

    public boolean isScheduled(Tutor domainTutorModel, Student domainStudentModel){
//        Interval tutorInterval = domainTutorModel.getSchedule(domainStudentModel);
//        if(tutorInterval == null) return false;
//        return tutorInterval.equals(domainStudentModel.getSchedule(domainTutorModel));
        return true;
    }
}
