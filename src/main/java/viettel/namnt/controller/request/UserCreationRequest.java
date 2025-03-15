package viettel.namnt.controller.request;

import lombok.Getter;
import lombok.ToString;
import viettel.namnt.common.Gender;
import viettel.namnt.common.UserType;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Getter
@ToString
public class UserCreationRequest implements Serializable {
    private String firstName;
    private String lastName;
    private Gender gender;
    private Date birthday;
    private String username;
    private String email;
    private String phone;
    private UserType type;
    private List<AddressRequest> addresses; // home,office
}

