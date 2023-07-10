package factory;

import org.domain.models.userRoles.DomainStudentModel;
import org.domain.models.userRoles.DomainTutorModel;
import org.domain.models.userRoles.accountInformation.Gender;
import org.domain.models.userRoles.accountInformation.LoginInformation;
import org.domain.models.userRoles.accountInformation.DomainUserInfo;
import org.domain.models.userRoles.supportClasses.address.Address;
import org.joda.time.DateTime;

public class UserFactory {

    public DomainTutorModel getTutor() {
        return new DomainTutorModel(DomainUserInfo.builder()
                .loginInformation(LoginInformation.builder()
                        .emailAddress("ha@gmail.com")
                        .password("123")
                        .build())
                .sex(Gender.WOMEN)
                .address(Address.builder()
                        .apartmentNumber("123")
                        .buildingNumber("23")
                        .city("Valenc")
                        .country("Spain")
                        .streetName("de la plata")
                        .build())
                .firstName("Mar")
                .lastName("Ignatiad")
                .accountWasCreated(new DateTime())
                .dateOfBirth(new DateTime(1988, 5, 30, 0, 0, 0))
                .build(),
                0);
    }

    public DomainStudentModel getStudent() {
        return new DomainStudentModel(DomainUserInfo.builder().loginInformation(LoginInformation.builder()
                        .emailAddress("ah@gmail.com")
                        .password("321")
                        .build())
                .sex(Gender.WOMEN)
                .address(Address.builder()
                        .apartmentNumber("321")
                        .buildingNumber("32")
                        .city("Madrid")
                        .country("Spain")
                        .streetName("de la plata")
                        .build())
                .dateOfBirth(new DateTime(1997, 10, 11, 0, 0, 0))
                .firstName("Tim")
                .lastName("Radionov")
                .accountWasCreated(new DateTime())
                .build(),
                1);
    }


}
