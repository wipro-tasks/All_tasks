
package com.example.formvalidation.model;

import jakarta.validation.constraints.*;
import java.util.List;

public class Student {

    @Size(min = 3, max = 30, message = "{student.firstname.size}")
    private String firstName;

    @Size(min = 3, max = 30, message = "{student.lastname.size}")
    private String lastName;

    @NotNull(message = "{student.gender.notnull}")
    private String sex;

    @NotBlank(message = "{student.dob.notblank}")
    private String dateOfBirth;

    @Email(message = "{student.email.invalid}")
    @NotBlank(message = "{student.email.notblank}")
    private String email;

    @NotBlank(message = "{student.section.notblank}")
    private String section;

    @NotBlank(message = "{student.country.notblank}")
    private String country;

    @NotEmpty(message = "{student.subjects.notempty}")
    private List<String> subjects;

    private boolean firstAttempt;

    // Getters and Setters
}

