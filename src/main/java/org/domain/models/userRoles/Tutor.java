package org.domain.models.userRoles;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.domain.models.User;
import org.domain.models.userRoles.accountInformation.UserInfo;

import java.util.UUID;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Tutor extends User {
//    private final List<Student> students = new ArrayList<>();

    @Builder
    public Tutor(UserInfo info, UUID id) {
        super(info, id);
    }

//    public void addStudent(Student student) {
//        students.add(student);
//    }
//
//    public void removeStudent(Student student) {
//        students.remove(student);
//    }

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
//                "domainStudentModels=" + studentsInformation() +
                '}';
    }
//    private String studentsInformation(){
//        StringBuilder information = new StringBuilder();
//        for (Student a: students) {
//            information.append(a.customToString());
//        };
//        return information.toString();
//
//    }
}
