package com.example.btsexamapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField inscriptionField;

    @FXML
    private Button consulterButton;

    @FXML
    void onConsulterButtonClick(ActionEvent event) {
        // Récupérer le numéro d'inscription
        String inscriptionNumber = inscriptionField.getText();

        // Traitement du numéro d'inscription (vérification, appel API, etc.)
        // ...

        // Afficher les résultats (si trouvés)
        // ...
    }
}
