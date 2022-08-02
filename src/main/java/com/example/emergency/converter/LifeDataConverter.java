package com.example.emergency.converter;

import com.example.emergency.dto.LifeDataWithPatientNameDTO;
import com.example.emergency.model.LifeData;
import com.example.emergency.service.EmergencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
public class LifeDataConverter {

    @Autowired
    private EmergencyService emergencyService;

    public LifeDataWithPatientNameDTO toDTO(LifeData lifeData) {
        DateTimeFormatter formatter = DateTimeFormatter
                .ofPattern("HH:mm:ss dd.MM.yyyy");
        return new LifeDataWithPatientNameDTO(emergencyService.getPatientById(lifeData.getPatientId()).getName(),
                lifeData.getDateTime().format(formatter),
                lifeData.getTemperature(),
                lifeData.getDiastolicPressure(),
                lifeData.getSystolicPressure(),
                lifeData.getSaturation(),
                lifeData.getPulse());
    }

}
