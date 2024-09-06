package rest.pojo.rerponse;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Users {
    String id;
    String login;
    @JsonProperty("first_name")
    String firstName;
    @JsonProperty("last_name")
    String lastName;
    String email;
    @JsonProperty("restrict_email")
    String restrictEmail;
    @JsonProperty("user_type")
    String userType;
    String timezone;
    String language;
    String status;
    @JsonProperty("deactivation_date")
    String deactivationDate;
    String level;
    String points;
    @JsonProperty("created_on")
    String createdOn;
    @JsonProperty("last_updated")
    String lastUpdated;
    @JsonProperty("last_updated_timestamp")
    String lastUpdatedTimestamp;
    String avatar;
    String bio;
    @JsonProperty("login_key")
    String loginKey;
    String password;


    public Users(Users users) {
        super();
    }
}
