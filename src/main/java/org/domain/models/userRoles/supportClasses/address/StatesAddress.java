package org.domain.models.userRoles.supportClasses.address;


public class StatesAddress extends Address {
    private States state;

    public StatesAddress(String apartmentNumber, String buildingNumber, String streetName, String city, String country, States state) {
        super(apartmentNumber, buildingNumber, streetName, city, country);
        this.state = state;
    }
}
