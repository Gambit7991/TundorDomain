package tests;

import flow.ScheduleTestFlow;
import org.domain.models.userRoles.DomainStudentModel;
import org.joda.time.Interval;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ScheduleTests extends TestBasePage {
    private final ScheduleTestFlow scheduleTestFlow = new ScheduleTestFlow();
    private Interval interval;

    @BeforeEach
    public void preCondition() {
        interval = dateFactory.generateInterval();
    }

    @Test
    public void positiveScheduleSetting() {
        Assertions.assertTrue(scheduleTestFlow
                .setSchedule(domainTutorModel, domainStudentModel, interval)
                .isIntervalAvailable(domainTutorModel, domainStudentModel, interval));
    }

    @Test
    public void negativeScheduleSetting() {
        Interval overlappingInterval = dateFactory.generateIntervalWithOverlapping(interval);
        Assertions.assertFalse(scheduleTestFlow
                .setSchedule(domainTutorModel, domainStudentModel, interval)
                .setSchedule(domainTutorModel, domainStudentModel, overlappingInterval)
                .isIntervalAvailable(domainTutorModel, domainStudentModel, overlappingInterval));
    }

    @Test
    public void negativeMapOverridesPreviousValue() {
        DomainStudentModel domainStudentModel2 = userFactory.getStudent();
        scheduleTestFlow.setSchedule(domainTutorModel, domainStudentModel, interval);
        domainTutorModel.getSchedule().getSchedules().put(domainStudentModel2, interval);
        Assertions.assertEquals(domainTutorModel.getSchedule().getSchedules().get(domainStudentModel2), interval);
    }

    @Test
    public void negativeMapAvoidsMemoryLeak() {
        DomainStudentModel domainStudentModel2 = userFactory.getStudent();
        scheduleTestFlow.setSchedule(domainTutorModel, domainStudentModel, interval);
        domainTutorModel.getSchedule().getSchedules().put(domainStudentModel2, interval);
        Assertions.assertEquals(domainTutorModel.getSchedule().getSchedules().size(), 1);
    }
}
