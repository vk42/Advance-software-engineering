/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airportcheck;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 *
 * @author Mohd Samir
 */

public class AirportCheckInSystem extends Application {
    
    private static final int JFXPANEL_WIDTH_INT = 300;
    private static final int JFXPANEL_HEIGHT_INT = 250;
    private static JFXPanel fxContainer;

    /**
     * @param args the command line arguments
     */
    public void start(Stage primaryStage) {
      primaryStage.setTitle("Airport Check In System");
        
        primaryStage.show();
        GridPane grid = new GridPane();
grid.setAlignment(Pos.CENTER);
grid.setHgap(20);
grid.setVgap(20);
grid.setPadding(new Insets(40, 40, 40, 40));

Scene scene = new Scene(grid, 1280, 780);
primaryStage.setScene(scene);
     Text scenetitle = new Text("Login");
scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
grid.add(scenetitle, 0, 0, 2, 1);

Label userName = new Label("User Name:");
grid.add(userName, 0, 1);

TextField userTextField = new TextField();
grid.add(userTextField, 1, 1);

Label pw = new Label("Password:");
grid.add(pw, 0, 2);

PasswordField pwBox = new PasswordField();
grid.add(pwBox, 1, 2);
Button btn = new Button("Login");

HBox hbBtn = new HBox(10);
hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
hbBtn.getChildren().add(btn);
grid.add(hbBtn, 1, 4);
final Text actiontarget = new Text();
        grid.add(actiontarget, 1, 6);
      
        btn.setOnAction(new EventHandler<ActionEvent>() {
 
    @Override
    public void handle(ActionEvent e) {
        
        String userName = userTextField.getText();
        String passWord = pwBox.getText();
        if(userName.trim().equals(""))
        {
            JOptionPane.showMessageDialog(fxContainer, "Enter Your Username or Password To Login");
        }
        else if(userName.equals("Admin")&&passWord.equals("Admin")){
            MainPage mpage = new MainPage();
            mpage.show();
            mpage.setVisible(true);
          
              
        }
        else{
           // actiontarget.setText("Incorrect Username Or Password");
            JOptionPane.showMessageDialog(fxContainer, "Incorrect Username Or Password");
        }
         
        }
    
    
});
    }
    public static void main(String[] args) {
        launch(args);               
}
}