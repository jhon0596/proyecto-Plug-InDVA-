package Interfaz;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Interface implements Initializable {

	Image imgIconDVA = new Image(getClass().getResourceAsStream("/Image/IconDVA.png"));
	
	@FXML
	public void close(ActionEvent event){		
		try{
			Platform.exit();
			System.exit(0);
		}catch (Exception e){
			System.out.println("Error_Close");
		}
			
	}
	
	@FXML
	public void openInformation(ActionEvent event){			
		try{
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Information.fxml"));
			Parent root1 = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			stage.centerOnScreen();
			stage.getIcons().add(new Image("/Image/IconDVA.PNG"));
			stage.setTitle("PluginDVA");
			stage.setScene(new Scene(root1));
			stage.show();			
		}catch (Exception e){
			System.out.println("Error_Window Infotmation");
		}			
		}
	
	@Override
	public void initialize(URL url, ResourceBundle rb){
		
	}
}

