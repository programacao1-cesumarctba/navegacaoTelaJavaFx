package com.dmmaycon.ui;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	
	public static Stage myStage;
	public static Scene sceneTela1, sceneTela2, sceneTela3, sceneTelaPrincipal;
	
	@Override
	public void start(Stage primaryStage) {		
		try {
			myStage = primaryStage;
			
			// carrega as telas fxml
			Parent telaPrincipalFXML = FXMLLoader.load(getClass().getResource("Main.fxml"));
			Parent tela1FXML 	     = FXMLLoader.load(getClass().getResource("Tela1.fxml"));
			Parent tela2FXML 		 = FXMLLoader.load(getClass().getResource("Tela2.fxml"));
			Parent tela3FXML 		 = FXMLLoader.load(getClass().getResource("Tela3.fxml"));
			
			// seta todos os scenes 
			sceneTelaPrincipal = new Scene(telaPrincipalFXML,400,400);
			sceneTela1 = new Scene(tela1FXML,400,400);
			sceneTela2 = new Scene(tela2FXML,400,400);
			sceneTela3 = new Scene(tela3FXML,400,400);
			
			// monta a tela inicial
			sceneTelaPrincipal.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			myStage.setScene(sceneTelaPrincipal);
			myStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void trocaTela(String tela) {
		switch (tela) {
		case "tela1":
			myStage.setScene(sceneTela1);
			break;
		case "tela2":
			myStage.setScene(sceneTela2);
			break;
		case "tela3":
			myStage.setScene(sceneTela3);
			break;
		default:
			myStage.setScene(sceneTelaPrincipal);
			break;
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
