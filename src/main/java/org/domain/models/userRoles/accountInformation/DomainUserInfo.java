package org.domain.models.userRoles.accountInformation;

import lombok.*;
import org.domain.models.userRoles.supportClasses.address.Address;
import org.joda.time.DateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString(includeFieldNames = false)
public class DomainUserInfo {
    private String firstName;
    private String lastName;
    private DateTime dateOfBirth;
    private Gender sex;
    private Address address;
    private LoginInformation loginInformation;
    private DateTime accountWasCreated;
    private String phoneNumber;

}
