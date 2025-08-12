package model;



import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.List;

public class Student {

    @Size(min = 3, max = 30, message = "{firstName.size}")
    private String firstName;

    @Size(min = 3, max = 30, message = "{lastName.size}")
    private String lastName;

    @NotNull(message = "{gender.notblank}")
    private String sex;

    @NotBlank(message = "{dob.notblank}")
    private String dateOfBirth;

    @NotBlank(message = "{email.notblank}")
    private String email;

    @NotBlank(message = "{section.notblank}")
    private String section;

    @NotBlank(message = "{country.notblank}")
    private String country;

    private boolean firstAttempt;

    @NotEmpty(message = "{subjects.notblank}")
    private List<String> subjects;

    // Getters and setters
}
