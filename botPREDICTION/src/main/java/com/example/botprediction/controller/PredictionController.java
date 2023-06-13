package com.example.botprediction.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.botprediction.entities.Prediction;
import com.example.botprediction.model.PredictionDTO;
import com.example.botprediction.service.PredictionService;

@RestController
@RequestMapping("/predictions")
public class PredictionController {
    private final PredictionService predictionService;

    public PredictionController(PredictionService predictionService) {
        this.predictionService = predictionService;
    }

    @PostMapping
    public PredictionDTO createPrediction(@RequestBody PredictionDTO predictionDTO) {
        Prediction prediction = mapPredictionDtoToEntity(predictionDTO);
        Prediction savedPrediction = predictionService.savePrediction(prediction);
        return mapPredictionEntityToDto(savedPrediction);
    }

	private PredictionDTO mapPredictionEntityToDto(Prediction savedPrediction) {
		// TODO Auto-generated method stub
		return null;
	}

	private Prediction mapPredictionDtoToEntity(PredictionDTO predictionDTO) {
		// TODO Auto-generated method stub
		return null;
	}

    // Altri metodi per il recupero, l'aggiornamento e la cancellazione delle predizioni
}
