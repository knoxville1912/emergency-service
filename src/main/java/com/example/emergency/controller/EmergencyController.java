package com.example.emergency.controller;

import com.example.emergency.model.LifeData;
import com.example.emergency.service.TelegramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.net.MalformedURLException;
import java.util.List;

@RestController
@RequestMapping("/emergency")
public class EmergencyController {

    @Autowired
    private TelegramService telegramService;

    @PostMapping()
    public void getPatientIdWithEmergencyLifeData(@RequestBody List<LifeData> lifeDataList) throws MalformedURLException {
        telegramService.sendMessage(lifeDataList);
    }
}
