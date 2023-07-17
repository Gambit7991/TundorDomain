package org.domain.models.userRoles.supportClasses.address;


public class StatesAddress extends Address {
    private States state;

    public StatesAddress(Integer apartmentNumber, Integer buildingNumber,
                         String street, String city, Integer country, States state, Integer postalCode) {
        super(apartmentNumber, buildingNumber, street, city, country, postalCode);
        this.state = state;
    }
}
