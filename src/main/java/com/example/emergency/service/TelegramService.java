package com.example.emergency.service;

import com.example.emergency.model.LifeData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.List;

@Service
public class TelegramService {

    @Autowired
    private EmergencyService emergencyService;

    public void sendMessage(List<LifeData> lifeDataList) throws MalformedURLException {
        HttpURLConnection con = null;

        String txt = lifeDataList.toString();

        List<String> doctorsTelegramList = emergencyService.getDoctorsTelegram(lifeDataList);

        for (String doctorsTelegram : doctorsTelegramList) {
            String[] tgTokenChatId = doctorsTelegram.split(",");
            String tgToken = tgTokenChatId[0];
            String chatId = tgTokenChatId[1];
            String urlToken = "https://api.telegram.org/bot" + tgToken + "/sendMessage";
            String urlParameters = "chat_id=" + chatId + "&text=" + txt;
            byte[] postData = urlParameters.getBytes(StandardCharsets.UTF_8);
            try {

                URL url = new URL(urlToken);
                con = (HttpURLConnection) url.openConnection();

                con.setDoOutput(true);
                con.setRequestMethod("POST");
                con.setRequestProperty("User-Agent", "Java upread.ru client");
                con.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");

                try (DataOutputStream wr = new DataOutputStream(con.getOutputStream())) {
                    wr.write(postData);
                }

                StringBuilder content;

                try (BufferedReader br = new BufferedReader(
                        new InputStreamReader(con.getInputStream()))) {
                    String line;
                    content = new StringBuilder();

                    while ((line = br.readLine()) != null) {
                        content.append(line);
                        content.append(System.lineSeparator());
                    }
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            } finally {
                if (con != null) {
                    con.disconnect();
                }
            }
        }

    }
}

