package com.example.emergency.dto;

import java.time.LocalDate;

public class DoctorDTO {
    private Long id;
    private String name;
    private LocalDate birthDate;
    private String speciality;
    private String mail;
    private String phone;
    private LocalDate startDate;
    private LocalDate endDate;

    public DoctorDTO() {
    }

    public DoctorDTO(Long id, String name, LocalDate birthDate, String speciality, String mail, String phone, LocalDate startDate, LocalDate endDate) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.speciality = speciality;
        this.mail = mail;
        this.phone = phone;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public DoctorDTO(String name, LocalDate birthDate, String speciality, String mail, String phone, LocalDate startDate, LocalDate endDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.speciality = speciality;
        this.mail = mail;
        this.phone = phone;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "DoctorDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", speciality='" + speciality + '\'' +
                ", mail='" + mail + '\'' +
                ", phone='" + phone + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
