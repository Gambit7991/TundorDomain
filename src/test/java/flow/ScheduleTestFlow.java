package flow;

import lombok.NoArgsConstructor;
import org.domain.flow.ScheduleFlow;
import org.domain.models.DomainUserModel;
import org.domain.models.userRoles.DomainStudentModel;
import org.domain.models.userRoles.DomainTutorModel;
import org.domain.repositories.ScheduleFlowRepository;
import org.joda.time.Interval;

@NoArgsConstructor
public class ScheduleTestFlow implements ScheduleFlowRepository {
    private final ScheduleFlow scheduleFlow = new ScheduleFlow();


    public boolean isIntervalAvailable(DomainTutorModel domainTutorModel, DomainStudentModel domainStudentModel, Interval interval) {
        return domainTutorModel.getSchedule().getSchedules().get(domainStudentModel).equals(interval) &&
                domainStudentModel.getSchedule().getSchedules().get(domainTutorModel).equals(interval);
    }

    public boolean isIntervalAvailable(DomainUserModel domainUserModel, Interval interval){
        return scheduleFlow.isIntervalAvailable(domainUserModel, interval);
    }

    public ScheduleTestFlow setSchedule(DomainTutorModel domainTutorModel, DomainStudentModel domainStudentModel, Interval interval) {
        scheduleFlow.setSchedule(domainTutorModel, domainStudentModel, interval);
        return this;
    }
}
