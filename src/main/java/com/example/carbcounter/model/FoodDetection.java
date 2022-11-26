package com.example.carbcounter.model;

import org.deeplearning4j.nn.modelimport.keras.KerasModelImport;
import org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException;
import org.deeplearning4j.nn.modelimport.keras.exceptions.UnsupportedKerasConfigurationException;
import org.deeplearning4j.nn.multilayer.MultiLayerNetwork;
import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.factory.Nd4j;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.util.Base64;

public class FoodDetection {

    public static void detectFood(String base64) throws IOException, UnsupportedKerasConfigurationException, InvalidKerasConfigurationException {
        String simpleMlp = new ClassPathResource(
                "model_v1.h5").getFile().getPath();
        MultiLayerNetwork model = KerasModelImport.
                importKerasSequentialModelAndWeights(simpleMlp);

        byte[] decodedBytes = Base64.getDecoder().decode(base64);
        System.out.println(model.summary());
//        System.out.println(decodedBytes);
//        INDArray input;
//        input.put
//        String prediction = model.output()
    }
}
