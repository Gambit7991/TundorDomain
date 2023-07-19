package factory;

import org.domain.models.userRoles.StudentModel;
import org.domain.models.userRoles.TutorModel;
import org.domain.models.userRoles.accountInformation.UserInfo;
import org.domain.models.userRoles.accountInformation.Gender;
import org.domain.models.userRoles.accountInformation.LoginInfo;
import org.domain.models.userRoles.supportClasses.address.Address;
import org.joda.time.DateTime;

import java.sql.Timestamp;
import java.util.UUID;

public class UserFactory {

    public TutorModel getTutor() {
        return new TutorModel(UserInfo.builder()
                .loginInfo(LoginInfo.builder()
                        .email("ha@gmail.com")
                        .password("123")
                        .build())
                .sex(Gender.WOMAN)
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
                UUID.randomUUID());
    }

    public StudentModel getStudent() {
        return new StudentModel(UserInfo.builder().loginInfo(LoginInfo.builder()
                        .email("ah@gmail.com")
                        .password("321")
                        .build())
                .sex(Gender.WOMAN)
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
