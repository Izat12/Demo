package rest.pojo.rerponse;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE) // все филды как private идут
@JsonIgnoreProperties(ignoreUnknown = true) // игнорирует поля которые мы не упомянули
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Courses {
        //name:IT
        //description:Course at IT
        //code:123456
        //price:12000
        String id;
        String creator_id;
        String name;

    }

