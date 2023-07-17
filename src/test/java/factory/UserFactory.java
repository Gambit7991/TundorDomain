package factory;

import org.domain.models.userRoles.DomainStudentModel;
import org.domain.models.userRoles.DomainTutorModel;
import org.domain.models.userRoles.accountInformation.DomainUserInfo;
import org.domain.models.userRoles.accountInformation.Gender;
import org.domain.models.userRoles.accountInformation.LoginInformation;
import org.domain.models.userRoles.supportClasses.address.Address;
import org.joda.time.DateTime;

import java.sql.Timestamp;
import java.util.UUID;

public class UserFactory {

    public DomainTutorModel getTutor() {
        return new DomainTutorModel(DomainUserInfo.builder()
                .loginInfo(LoginInformation.builder()
                        .emailAddress("ha@gmail.com")
                        .password("123")
                        .build())
                .sex(Gender.WOMEN)
                .address(Address.builder()
                        .aptNum(123)
                        .buildingNumber(123)
                        .city("Valenc")
                        .countryId(123)
                        .street("de la plata")
                        .build())
                .firstName("Mar")
                .lastName("Ignatiad")
                .createdTime(new Timestamp(DateTime.now().getMillis()))
                .birthday(new Timestamp(new DateTime(1988, 5, 30, 0, 0, 0).getMillis()))
                .build(),
                0);
    }

    public DomainStudentModel getStudent() {
        return new DomainStudentModel(DomainUserInfo.builder().loginInfo(LoginInformation.builder()
                        .emailAddress("ah@gmail.com")
                        .password("321")
                        .build())
                .sex(Gender.WOMEN)
                .address(Address.builder()
                        .aptNum(321)
                        .buildingNumber(32)
                        .city("Madrid")
                        .countryId(123)
                        .street("de la plata")
                        .build())
                .birthday(new Timestamp(new DateTime(1997, 10, 11, 0, 0, 0).getMillis()))
                .firstName("Tim")
                .lastName("Radionov")
                .createdTime(new Timestamp(new DateTime().getMillis()))
                .build(),
                UUID.randomUUID());
    }


}
