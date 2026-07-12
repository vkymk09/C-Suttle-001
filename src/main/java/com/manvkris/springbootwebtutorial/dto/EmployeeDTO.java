package com.manvkris.springbootwebtutorial.dto;

import java.time.LocalDate;
import java.util.Objects;


public class EmployeeDTO {

    private Long ID;

    private String name;

    private String email;

    private Integer age;

    private LocalDate dateOfJoining;

    private Boolean isActive;

    public EmployeeDTO() {

    }

    public EmployeeDTO(Long ID, String name, String email, Integer age, LocalDate dateOfJoining, Boolean isActive) {
        this.ID = ID;
        this.name = name;
        email = email;
        this.age = age;
        this.dateOfJoining = dateOfJoining;
        this.isActive = isActive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public LocalDate getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(LocalDate dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeDTO that = (EmployeeDTO) o;
        return Objects.equals(ID, that.ID) && Objects.equals(name, that.name) && Objects.equals(email, that.email) && Objects.equals(age, that.age) && Objects.equals(dateOfJoining, that.dateOfJoining) && Objects.equals(isActive, that.isActive)
        ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, name, email, age, dateOfJoining, isActive);
    }
}
