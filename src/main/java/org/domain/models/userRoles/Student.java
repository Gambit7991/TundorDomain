package org.domain.models.userRoles;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.domain.models.User;
import org.domain.models.userRoles.accountInformation.UserInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Student extends User {
    private final List<Tutor> domainTutorModels = new ArrayList<>();
    @Builder
    public Student(UserInfo info, UUID id) {
        super(info, id);
    }

    public void addTutor(Tutor tutor) {
        domainTutorModels.add(tutor);
    }
//
    public void removeTutor(Tutor tutor) {
        domainTutorModels.remove(tutor);
    }

//    public List<DomainTutorModel> getDomainTutorModels(){
//        return this.domainTutorModels;
//    }

//    public DomainTutorModel getTutorById(int id) {
//        return domainTutorModels.stream().filter(i-> i.getId() == id).toList().get(0);
//    }

    public String customToString(){
        return super.toString();
    }
    @Override
    public String toString() {
        return "DomainStudentModel{" +
                "super=" + super.toString() +
                "domainTutorModels=" + tutorsInformation() +
                '}';
    }

    private String tutorsInformation(){
        StringBuilder information = new StringBuilder();
        for (Tutor a: domainTutorModels) {
            information.append(a.customToString());
        };
        return information.toString();
    }

}
