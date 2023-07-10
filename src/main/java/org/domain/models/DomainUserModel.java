package org.domain.models;

import lombok.Getter;
import lombok.Setter;
import org.domain.models.userRoles.accountInformation.BankCard;
import org.domain.models.userRoles.accountInformation.Schedule;
import org.domain.models.userRoles.accountInformation.DomainUserInfo;
import org.joda.time.Interval;

import java.util.ArrayList;


@Getter
@Setter
public abstract class DomainUserModel extends DomainAccountModel {

    private final Schedule schedule = new Schedule();
    private ArrayList<BankCard> bankCards = new ArrayList<>();


    public DomainUserModel(DomainUserInfo domainUserInfo, int id) {
        super(domainUserInfo, id);
    }

    public Interval getSchedule(DomainUserModel domainUserModel){
        return schedule.getSchedules().get(domainUserModel);
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
