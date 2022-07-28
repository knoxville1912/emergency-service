package com.example.emergency.model;

import java.time.LocalDateTime;

public class LifeData {
    private Long id;
    private LocalDateTime dateTime;
    private Double temperature;
    private Integer diastolicPressure;
    private Integer systolicPressure;
    private Integer saturation;
    private Integer pulse;
    private Long patientId;

    public LifeData() {
    }

    public LifeData(LocalDateTime dateTime,
                    Double temperature,
                    Integer diastolicPressure,
                    Integer systolicPressure,
                    Integer saturation,
                    Integer pulse,
                    Long patientId) {
        this.dateTime = dateTime;
        this.temperature = temperature;
        this.diastolicPressure = diastolicPressure;
        this.systolicPressure = systolicPressure;
        this.saturation = saturation;
        this.pulse = pulse;
        this.patientId = patientId;
    }

    public LifeData(Long id,
                    LocalDateTime dateTime,
                    Double temperature,
                    Integer diastolicPressure,
                    Integer systolicPressure,
                    Integer saturation,
                    Integer pulse,
                    Long patientId) {
        this.id = id;
        this.dateTime = dateTime;
        this.temperature = temperature;
        this.diastolicPressure = diastolicPressure;
        this.systolicPressure = systolicPressure;
        this.saturation = saturation;
        this.pulse = pulse;
        this.patientId = patientId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
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

    public Long getPatientId() {
        return patientId;
    }

    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }

    @Override
    public String toString() {
        return "Patient_id: " + patientId + ",\n" +
                "\t date_time: " + dateTime + ",\n" +
                "\t temperature: " + temperature + ",\n" +
                "\t diastolic_pressure: " + diastolicPressure + ",\n" +
                "\t systolic_pressure: " + systolicPressure + ",\n" +
                "\t saturation: " + saturation + ",\n" +
                "\t pulse: " + pulse;
//        return "LifeData{" +
//                "date_time=" + dateTime +
//                ", temperature=" + temperature +
//                ", diastolic_pressure=" + diastolicPressure +
//                ", systolic_pressure=" + systolicPressure +
//                ", saturation=" + saturation +
//                ", pulse=" + pulse +
//                ", patient_id=" + patientId +
//                '}';
    }
}
