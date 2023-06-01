package org.domain.models.userRoles.supportClasses.address;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@Builder
@ToString(includeFieldNames = false)
public class Address {
    private String apartmentNumber;
    private String buildingNumber;
    private String streetName;
    private String city;
    private String country;

    public Address(String apartmentNumber, String buildingNumber, String streetName, String city, String country) {
        this.apartmentNumber = apartmentNumber;
        this.buildingNumber = buildingNumber;
        this.streetName = streetName;
        this.city = city;
        this.country = country;
    }
}
