package org.domain.models.userRoles.accountInformation;

import lombok.*;
import org.domain.models.User;
import org.domain.models.userRoles.supportClasses.address.Address;
import org.joda.time.Interval;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString(includeFieldNames = false)
public class UserInfo {
    private UUID id;
    private LoginInfo loginInfo;
    private Timestamp createdTime;
    private Timestamp birthday;
    private String firstName;
    private String lastName;
    private Gender sex;
    private String phoneNumber;
    private String mainPicture;
    private Address address;
    private ArrayList<String> album;
    private final Schedule schedule = new Schedule();
    private ArrayList<BankCard> bankCards = new ArrayList<>();

    public Interval getSchedule(User userModel){
        return schedule.getSchedules().get(userModel);
    }

    public void addCard(BankCard bankCard) {
        bankCards.add(bankCard);
    }

    public void removeCard(BankCard bankCard) {
        bankCards.remove(bankCard);
    }

    public BankCard getCard(int i) {
        return bankCards.get(i);
    }

    public ArrayList<BankCard> getAllCards() {
        return new ArrayList<>(bankCards);
    }

}
