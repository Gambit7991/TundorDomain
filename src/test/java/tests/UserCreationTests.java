package tests;

import factory.UserFactory;
import org.domain.models.userRoles.Admin;
import org.domain.models.userRoles.Student;
import org.domain.models.userRoles.Tutor;
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
        Student student = Student.builder().info(userFactory.getStudent().getInfo()).build();
        Assertions.assertNotNull(student);
    }
    @Test
    public void builderAdmin(){
        Admin admin = Admin.builder().info(userFactory.getStudent().getInfo()).build();
        Assertions.assertNotNull(admin);
    }
    @Test
    public void builderTutor(){
        Tutor student = Tutor.builder().userInfo(userFactory.getStudent().getInfo()).build();
        Assertions.assertNotNull(student);
    }
}
