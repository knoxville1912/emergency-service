package com.example.emergency.service;

import com.example.emergency.dto.DoctorDTO;
import com.example.emergency.dto.PatientDTO;
import com.example.emergency.model.LifeData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmergencyService {

    @Autowired
    private RestTemplate restTemplate;

    public List<LifeData> getEmergencyLifeData() {
        return restTemplate.exchange(
                "http://localhost:8082/gateway/generate-life-data",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<LifeData>>(){}
        ).getBody();
    }

    public List<String> getDoctorsTelegram(List<LifeData> lifeDataList) {
        List<String> doctorsPhoneList = new ArrayList<>();
        for (LifeData lifeData : lifeDataList) {
            DoctorDTO doctorDTO = restTemplate.getForObject(
                    "http://localhost:8080/medicine/get-active-doctor-by-patient/" + lifeData.getPatientId(),
                    DoctorDTO.class
            );
            doctorsPhoneList.add(doctorDTO.getPhone());
        }
        return doctorsPhoneList;
    }

    public PatientDTO getPatientById(Long id) {
        return restTemplate.getForObject(
                "http://localhost:8080/medicine/get-patient-by-id/" + id,
                PatientDTO.class
        );
    }
}
