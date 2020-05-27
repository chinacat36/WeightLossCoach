package org.launchcode.WeightLossCoach.models;

import javax.persistence.Entity;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;


@Entity
public class newClient extends AbstractEntity{

    @NotBlank(message="Required.")
    private String firstName;

    @NotBlank(message = "Required.")
    private String lastName;

    @NotBlank(message = "Required.")
    @Email(message = "Invalid Email.")
    private String email;

    private String activityLevel;

    private String height;

    private int weight;

    private String medicalHistory;

    @NotBlank(message = "Required")
    private String briefDescription;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getActivityLevel() {
        return activityLevel;
    }

    public void setActivityLevel(String activityLevel) {
        this.activityLevel = activityLevel;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    public String getBriefDescription() {
        return briefDescription;
    }

    public void setBriefDescription(String briefDescription) {
        this.briefDescription = briefDescription;
    }

    @Override
    public String toString() {
        return "newClient{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", activityLevel='" + activityLevel + '\'' +
                ", height='" + height + '\'' +
                ", weight=" + weight +
                ", medicalHistory='" + medicalHistory + '\'' +
                ", briefDescription='" + briefDescription + '\'' +
                '}';
    }
}