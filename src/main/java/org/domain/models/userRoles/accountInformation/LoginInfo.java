package org.domain.models.userRoles.accountInformation;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString(includeFieldNames = false)
public class LoginInfo {
    private int id;
    private String email;
    private String password;
}
