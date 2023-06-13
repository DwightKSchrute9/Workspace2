package com.example.botprediction.service;

import org.springframework.stereotype.Service;

import com.example.botprediction.entities.Prediction;
import com.example.botprediction.repository.PredictionRepository;

@Service
public class PredictionService {
    private final PredictionRepository predictionRepository;
    private final ChatGptService chatGptService;

    public PredictionService(PredictionRepository predictionRepository, ChatGptService chatGptService) {
        this.predictionRepository = predictionRepository;
        this.chatGptService = chatGptService;
    }

    public Prediction savePrediction(Prediction prediction) {
        // Esegui qui la logica di business necessaria
        // ad esempio, calcola la probabilità di vittoria utilizzando i dati forniti

        // Interagisci con ChatGPT per ottenere la predizione
        String predictionText = chatGptService.getPredictionText(prediction);

        // Salva la predizione nel database
        prediction.setPredictionText(predictionText);
        return predictionRepository.save(prediction);
    }

    // Altri metodi di servizio per le predizioni
}