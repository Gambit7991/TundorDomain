package org.domain.models.userRoles;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import org.domain.models.User;
import org.domain.models.userRoles.accountInformation.UserInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Getter
@EqualsAndHashCode(callSuper = false)
public class Tutor extends User {
    private final List<Student> domainStudentModels = new ArrayList<>();

    public Tutor(UserInfo userInfo, UUID id) {
        super(userInfo, id);
    }

    public void addStudent(Student domainStudentModel) {
        domainStudentModels.add(domainStudentModel);
    }

    public void removeStudent(Student domainStudentModel) {
        domainStudentModels.remove(domainStudentModel);
    }

//    public DomainStudentModel getStudentById(int id) {
//        return domainStudentModels.stream().filter(i-> i.getId() == id).toList().get(0);
//    }

    public String customToString(){
        return super.toString();
    }

    @Override
    public String toString() {
        return "DomainTutorModel{" +
                "super=" + super.toString() +
                "domainStudentModels=" + studentsInformation() +
                '}';
    }
    private String studentsInformation(){
        StringBuilder information = new StringBuilder();
        for (Student a: domainStudentModels) {
            information.append(a.customToString());
        };
        return information.toString();

    }
}
