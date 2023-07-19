package tests;

import factory.DateFactory;
import factory.UserFactory;
import org.domain.models.userRoles.StudentModel;
import org.domain.models.userRoles.TutorModel;
import org.junit.jupiter.api.BeforeEach;

public abstract class TestBasePage {
    public final UserFactory userFactory = new UserFactory();
    public final DateFactory dateFactory = new DateFactory();
    public TutorModel domainTutorModel;
    public StudentModel domainStudentModel;

    @BeforeEach
    public void precondition(){
        domainTutorModel = userFactory.getTutor();
        domainStudentModel = userFactory.getStudent();
    }

}