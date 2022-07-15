package com.example.emergency.service;

import com.example.emergency.model.LifeData;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class EmergencyService {
    public List<LifeData> getEmergencyLifeData() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.exchange(
                "http://localhost:8082/gateway/generate-life-data",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<LifeData>>(){}
        ).getBody();
    }
}
