package org.domain.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.domain.models.userRoles.accountInformation.BankCard;
import org.domain.models.userRoles.accountInformation.SignUpInformation;

import java.util.ArrayList;

@Getter
@Setter
@ToString(includeFieldNames = false)
@EqualsAndHashCode
public abstract class DomainAccountModel {
    private final SignUpInformation signUpInformation;
    private ArrayList<BankCard> bankCards = new ArrayList<>();
    private final int id;
    private String mainPicture;
    private ArrayList<String> pictures;

    public DomainAccountModel(SignUpInformation signUpInformation, int id) {
        this.signUpInformation = signUpInformation;
        this.id = id;
    }

    public SignUpInformation getSignUpInformation(){
        return this.signUpInformation;
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