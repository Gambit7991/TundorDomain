package flow;

import lombok.NoArgsConstructor;
import org.domain.flow.ScheduleFlow;
import org.domain.models.UserModel;
import org.domain.models.userRoles.StudentModel;
import org.domain.models.userRoles.TutorModel;
import org.domain.repositories.ScheduleFlowRepository;
import org.joda.time.Interval;

@NoArgsConstructor
public class ScheduleTestFlow implements ScheduleFlowRepository {
    private final ScheduleFlow scheduleFlow = new ScheduleFlow();


    public boolean isIntervalAvailable(TutorModel domainTutorModel, StudentModel domainStudentModel, Interval interval) {
//        return domainTutorModel.getSchedule().getSchedules().get(domainStudentModel).equals(interval) &&
//                domainStudentModel.getSchedule().getSchedules().get(domainTutorModel).equals(interval);
    return true;
    }

    public boolean isIntervalAvailable(UserModel userModel, Interval interval){
        return scheduleFlow.isIntervalAvailable(userModel, interval);
    }

    public ScheduleTestFlow setSchedule(TutorModel domainTutorModel, StudentModel domainStudentModel, Interval interval) {
        scheduleFlow.setSchedule(domainTutorModel, domainStudentModel, interval);
        return this;
    }
}
