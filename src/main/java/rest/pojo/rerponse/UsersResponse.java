package rest.pojo.rerponse;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public record UsersResponse(String id,
                            String login,
                            String firstName,
                            String lastName,
                            String email,
                            String restrictEmail,
                            String userType,
                            String timezone,
                            String language,
                            String status,
                            String deactivationDate,
                            String level,
                            String points,
                            String createdOn,
                            String lastUpdated,
                            String lastUpdatedTimestamp,
                            String avatar,
                            String bio,
                            String loginKey,
                            String password

) {
}
