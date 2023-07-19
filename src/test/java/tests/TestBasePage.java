package tests;

import factory.DateFactory;
import factory.UserFactory;
import org.domain.models.userRoles.Student;
import org.domain.models.userRoles.Tutor;
import org.junit.jupiter.api.BeforeEach;

public abstract class TestBasePage {
    public final UserFactory userFactory = new UserFactory();
    public final DateFactory dateFactory = new DateFactory();
    public Tutor domainTutorModel;
    public Student domainStudentModel;

    @BeforeEach
    public void precondition(){
        domainTutorModel = userFactory.getTutor();
        domainStudentModel = userFactory.getStudent();
    }

}