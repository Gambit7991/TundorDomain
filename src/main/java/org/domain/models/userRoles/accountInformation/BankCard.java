package org.domain.models.userRoles.accountInformation;

import lombok.*;
import org.joda.time.DateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class BankCard {
    private String cardNumber;
    private DateTime date;
    private int securityNumber;

}
