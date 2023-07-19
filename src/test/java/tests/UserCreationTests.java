package tests;

import factory.UserFactory;
import org.domain.models.userRoles.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserCreationTests {
    UserFactory userFactory = new UserFactory();

    @Test
    public void createStudent(){
        Assertions.assertEquals(userFactory.getStudent().getInfo().getFirstName(), "Tim");
    }

    @Test
    public void builder(){
        Student student = Student.builder().userInfo(userFactory.getStudent().getInfo()).build();
        Assertions.assertNotNull(student);
    }
}
