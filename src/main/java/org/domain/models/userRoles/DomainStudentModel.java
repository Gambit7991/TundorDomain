package org.domain.models.userRoles;

import lombok.*;
import org.domain.models.DomainUserModel;
import org.domain.models.userRoles.accountInformation.DomainUserInfo;

import java.util.UUID;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class DomainStudentModel extends DomainUserModel {
//    private final List <DomainTutorModel> domainTutorModels = new ArrayList<>();
    public DomainStudentModel(DomainUserInfo domainUserInfo, UUID id) {
        super(domainUserInfo, id);
    }

//    public void addTutor(DomainTutorModel domainTutorModel) {
//        domainTutorModels.add(domainTutorModel);
//    }

//    public void removeTutor(DomainTutorModel domainTutorModel) {
//        domainTutorModels.remove(domainTutorModel);
//    }

//    public List<DomainTutorModel> getDomainTutorModels(){
//        return this.domainTutorModels;
//    }

//    public DomainTutorModel getTutorById(int id) {
//        return domainTutorModels.stream().filter(i-> i.getId() == id).toList().get(0);
//    }

//    @Override
//    public String toString() {
//        return "DomainStudentModel{" +
//                "super=" + super.toString() +
//                "domainTutorModels=" + tutorsInformation() +
//                '}';
//    }
    public String customToString(){
        return super.toString();
    }

//    private String tutorsInformation(){
//        StringBuilder information = new StringBuilder();
//        for (DomainTutorModel a: domainTutorModels) {
//            information.append(a.customToString());
//        };
//        return information.toString();
//    }

}
