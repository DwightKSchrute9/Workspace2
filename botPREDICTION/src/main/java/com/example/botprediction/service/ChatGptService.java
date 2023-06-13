package com.example.botprediction.service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.stereotype.Service;
import com.example.botprediction.entities.Prediction;


@Service
public class ChatGptService {
    private static final String OPENAI_API_KEY = "YOUR_OPENAI_API_KEY";
    private static final String API_ENDPOINT = "https://api.openai.com/v1/engines/davinci-codex/completions";

    public String getPredictionText(Prediction prediction) {
        // Costruisci la richiesta per ChatGPT utilizzando i dati della predizione
        String message = buildChatGptMessage(prediction);

        try {
            // Effettua la chiamata all'API di ChatGPT
            String response = callChatGptApi(message);
            // Estrai la risposta da ChatGPT dal corpo della risposta
            String predictionText = extractPredictionFromResponse(response);
            return predictionText;
        } catch (IOException | InterruptedException e) {
            // Gestisci eventuali errori
            e.printStackTrace();
            return null;
        }
    }

    private String buildChatGptMessage(Prediction prediction) {
        // Costruisci il messaggio da inviare a ChatGPT utilizzando i dati della predizione
        // Ad esempio, puoi combinare i dati delle squadre e delle partite per formare un messaggio significativo
        return "Message for ChatGPT";
    }

    private String callChatGptApi(String message) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(API_ENDPOINT))
                .header("Authorization", "Bearer " + OPENAI_API_KEY)
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(buildChatGptRequestBody(message)))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }

    private String buildChatGptRequestBody(String message) {
        JSONObject requestBody = new JSONObject();
        try {
			requestBody.put("prompt", message);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        try {
			requestBody.put("max_tokens", 100);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        // Altre opzioni per la richiesta all'API di ChatGPT

        return requestBody.toString();
    }

    private String extractPredictionFromResponse(String response) {
        // Estrai la risposta da ChatGPT dal corpo della risposta
        // Ad esempio, puoi analizzare il JSON di risposta e recuperare la predizione
        return "Prediction from ChatGPT";
    }
}
