package com.example.emergency.dto;

import java.time.LocalDate;

public class PatientDTO {
    private Long id;
    private String name;
    private String city;
    private LocalDate dateBirth;
    private String numberOMS;

    public PatientDTO() {
    }

    public PatientDTO(Long id, String name, String city, LocalDate dateBirth, String numberOMS) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.dateBirth = dateBirth;
        this.numberOMS = numberOMS;
    }

    public PatientDTO(String name, String city, LocalDate dateBirth, String numberOMS) {
        this.name = name;
        this.city = city;
        this.dateBirth = dateBirth;
        this.numberOMS = numberOMS;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public LocalDate getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(LocalDate dateBirth) {
        this.dateBirth = dateBirth;
    }

    public String getNumberOMS() {
        return numberOMS;
    }

    public void setNumberOMS(String numberOMS) {
        this.numberOMS = numberOMS;
    }
}
