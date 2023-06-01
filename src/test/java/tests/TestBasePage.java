package tests;

import factory.DateFactory;
import factory.UserFactory;
import org.domain.models.userRoles.DomainStudentModel;
import org.domain.models.userRoles.DomainTutorModel;
import org.junit.jupiter.api.BeforeEach;

public abstract class TestBasePage {
    public final UserFactory userFactory = new UserFactory();
    public final DateFactory dateFactory = new DateFactory();
    public DomainTutorModel domainTutorModel;
    public DomainStudentModel domainStudentModel;

    @BeforeEach
    public void precondition(){
        domainTutorModel = userFactory.getTutor();
        domainStudentModel = userFactory.getStudent();
    }

}