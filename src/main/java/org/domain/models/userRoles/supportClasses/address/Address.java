package org.domain.models.userRoles.supportClasses.address;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor @AllArgsConstructor
@Builder
@ToString(includeFieldNames = false)
public class Address {
    private Integer aptNum;
    private Integer buildingNumber;
    private String street;
    private String city;
    private Integer countryId;
    private Integer postalCode;
}
