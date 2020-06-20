package com.dmmaycon.ui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class MainController {
	
    @FXML
	protected void btnTela1Action(ActionEvent e) {
		Main.trocaTela("tela1");
	}
	
    @FXML
	protected void btnTela2Action(ActionEvent e) {
		Main.trocaTela("tela2");
	}
	
    @FXML
	protected void btnTela3Action(ActionEvent e) {
		Main.trocaTela("tela3");
	}
	
    @FXML
	protected void btnTelaPrincipal(ActionEvent e) {
		Main.trocaTela("telaPrincipal");
	}
	
}
