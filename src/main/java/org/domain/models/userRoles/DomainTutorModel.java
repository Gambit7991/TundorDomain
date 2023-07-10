package org.domain.models.userRoles;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import org.domain.models.DomainUserModel;
import org.domain.models.userRoles.accountInformation.DomainUserInfo;

import java.util.ArrayList;
import java.util.List;

@Getter
@EqualsAndHashCode(callSuper = false)
public class DomainTutorModel extends DomainUserModel {
    private final List<DomainStudentModel> domainStudentModels = new ArrayList<>();

    public DomainTutorModel(DomainUserInfo domainUserInfo, int id) {
        super(domainUserInfo, id);
    }

    public void addStudent(DomainStudentModel domainStudentModel) {
        domainStudentModels.add(domainStudentModel);
    }

    public void removeStudent(DomainStudentModel domainStudentModel) {
        domainStudentModels.remove(domainStudentModel);
    }

    public DomainStudentModel getStudentById(int id) {
        return domainStudentModels.stream().filter(i-> i.getId() == id).toList().get(0);
    }

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
        for (DomainStudentModel a: domainStudentModels) {
            information.append(a.customToString());
        };
        return information.toString();

    }
}
