package com.example.emergency.dto;

import java.time.LocalDateTime;

public class LifeDataWithPatientNameDTO {
    private String name;
    private String dateTime;
    private Double temperature;
    private Integer diastolicPressure;
    private Integer systolicPressure;
    private Integer saturation;
    private Integer pulse;

    public LifeDataWithPatientNameDTO() {
    }

    public LifeDataWithPatientNameDTO(String name,
                                      String dateTime,
                                      Double temperature,
                                      Integer diastolicPressure,
                                      Integer systolicPressure,
                                      Integer saturation,
                                      Integer pulse) {
        this.name = name;
        this.dateTime = dateTime;
        this.temperature = temperature;
        this.diastolicPressure = diastolicPressure;
        this.systolicPressure = systolicPressure;
        this.saturation = saturation;
        this.pulse = pulse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public Integer getDiastolicPressure() {
        return diastolicPressure;
    }

    public void setDiastolicPressure(Integer diastolicPressure) {
        this.diastolicPressure = diastolicPressure;
    }

    public Integer getSystolicPressure() {
        return systolicPressure;
    }

    public void setSystolicPressure(Integer systolicPressure) {
        this.systolicPressure = systolicPressure;
    }

    public Integer getSaturation() {
        return saturation;
    }

    public void setSaturation(Integer saturation) {
        this.saturation = saturation;
    }

    public Integer getPulse() {
        return pulse;
    }

    public void setPulse(Integer pulse) {
        this.pulse = pulse;
    }

    @Override
    public String toString() {
        return "Patient: " + name + ",\n" +
                "\t date_time: " + dateTime + ",\n" +
                "\t temperature: " + temperature + ",\n" +
                "\t diastolic_pressure: " + diastolicPressure + ",\n" +
                "\t systolic_pressure: " + systolicPressure + ",\n" +
                "\t saturation: " + saturation + ",\n" +
                "\t pulse: " + pulse;
    }
}
