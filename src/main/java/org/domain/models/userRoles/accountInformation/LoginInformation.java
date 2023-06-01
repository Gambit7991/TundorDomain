package org.domain.models.userRoles.accountInformation;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString(includeFieldNames = false)
public class LoginInformation {
    private String emailAddress;
    private String password;
}
