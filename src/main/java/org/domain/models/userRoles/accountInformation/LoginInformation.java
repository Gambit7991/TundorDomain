package org.domain.models.userRoles.accountInformation;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString(includeFieldNames = false)
public class LoginInformation {
    private int id;
    private String email;
    private String password;
}
