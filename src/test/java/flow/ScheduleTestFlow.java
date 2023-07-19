package flow;

import lombok.NoArgsConstructor;
import org.domain.flow.ScheduleFlow;
import org.domain.models.User;
import org.domain.models.userRoles.Student;
import org.domain.models.userRoles.Tutor;
import org.domain.repositories.ScheduleFlowRepository;
import org.joda.time.Interval;

@NoArgsConstructor
public class ScheduleTestFlow implements ScheduleFlowRepository {
    private final ScheduleFlow scheduleFlow = new ScheduleFlow();


    public boolean isIntervalAvailable(Tutor domainTutorModel, Student domainStudentModel, Interval interval) {
//        return domainTutorModel.getSchedule().getSchedules().get(domainStudentModel).equals(interval) &&
//                domainStudentModel.getSchedule().getSchedules().get(domainTutorModel).equals(interval);
    return true;
    }

    public boolean isIntervalAvailable(User userModel, Interval interval){
        return scheduleFlow.isIntervalAvailable(userModel, interval);
    }

    public ScheduleTestFlow setSchedule(Tutor domainTutorModel, Student domainStudentModel, Interval interval) {
        scheduleFlow.setSchedule(domainTutorModel, domainStudentModel, interval);
        return this;
    }
}
