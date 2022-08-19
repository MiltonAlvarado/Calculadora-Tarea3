package com.calc.calculadora;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class PrimaryController {
    
    @FXML
    private Button btnC;

    @FXML
    private Button btnCE;

    @FXML
    private Button btnCero;

    @FXML
    private Button btnCinco;

    @FXML
    private Button btnCuatro;

    @FXML
    private Button btnDiv;

    @FXML
    private Button btnDos;

    @FXML
    private Button btnEntre;

    @FXML
    private Button btnIgual;

    @FXML
    private Button btnMasMenos;

    @FXML
    private Button btnMult;

    @FXML
    private Button btnNueve;

    @FXML
    private Button btnOcho;

    @FXML
    private Button btnPunto;

    @FXML
    private Button btnRes;

    @FXML
    private Button btnSeis;

    @FXML
    private Button btnSiete;

    @FXML
    private Button btnSum;

    @FXML
    private Button btnTres;

    @FXML
    private Button btnUno;

    @FXML
    private TextField mostrar;
    
    @FXML
    private TextField mostrarDos;
    
    @FXML
    private Button mostrarNombre;
    
    
    private double digitos1;
    private double digitos2;
    private int operacion;
    private double resultado;
    private int contadorDigitos=0;
    
    
   @FXML
      void handleAction(ActionEvent event) {
          
        if (event.getSource()== mostrarNombre){
            mostrarAdvertencia();
        }
          
        if (event.getSource()== btnUno ){
            mostrar.setText(mostrar.getText()+"1");
        }
        
        if (event.getSource()== btnDos ){
            mostrar.setText(mostrar.getText()+"2");
        }
        
        if (event.getSource()== btnTres ){
            mostrar.setText(mostrar.getText()+"3");
        }
        
        if (event.getSource()== btnCuatro ){
            mostrar.setText(mostrar.getText()+"4");
        }
        
        if (event.getSource()== btnCinco ){
            mostrar.setText(mostrar.getText()+"5");
        }
        
        if (event.getSource()== btnSeis ){
            mostrar.setText(mostrar.getText()+"6");
        }
        
        if (event.getSource()== btnSiete ){
            mostrar.setText(mostrar.getText()+"7");
        }
        
        if (event.getSource()== btnOcho ){
            mostrar.setText(mostrar.getText()+"8");
        }
        
        if (event.getSource()== btnNueve ){
            mostrar.setText(mostrar.getText()+"9");
        }
        
        if (event.getSource()== btnCero ){
            mostrar.setText(mostrar.getText()+"0");
        }
        
        if (event.getSource()== btnC ){
            mostrar.setText("");
            mostrarDos.setText("");
            digitos1=0;
        }
        
        if (event.getSource()== btnCE ){
            mostrar.setText("");
        }
        
        if (event.getSource() == btnPunto){
            mostrar.setText(mostrar.getText()+".");
        }
        
        if (event.getSource() == btnSum){
            digitos1 = Double.parseDouble(mostrar.getText());
            mostrar.setText("");
            this.operacion = 1;
            contadorDigitos++;
        }
        
        if (event.getSource() == btnRes){
            digitos1 = Double.parseDouble(mostrar.getText());
            mostrar.setText("");
            this.operacion = 2;
            contadorDigitos++;
        }
        
        if (event.getSource() == btnMult){
            digitos1 = Double.parseDouble(mostrar.getText());
            mostrar.setText("");
            this.operacion = 3;
            contadorDigitos++;
        }
        
        if (event.getSource() == btnDiv){
            digitos1 = Double.parseDouble(mostrar.getText());
            mostrar.setText("");
            this.operacion = 4;
            contadorDigitos++;
        }
        
        if (event.getSource() == btnEntre){
            digitos1 = Double.parseDouble(mostrar.getText());
            this.resultado = (double)1 / digitos1;
            mostrar.setText(String.valueOf(resultado));
            mostrarDos.setText(String.valueOf(resultado));
        }
        
        if (event.getSource() == btnMasMenos){
            if(contadorDigitos==0){
            digitos1 = Double.parseDouble(mostrar.getText());
            this.resultado = (double)-1 * digitos1;
            mostrar.setText(String.valueOf(resultado)); 
            
            }else if(contadorDigitos==1){
            digitos2 = Double.parseDouble(mostrar.getText());
            this.resultado = (double)-1 * digitos2;
            mostrar.setText(String.valueOf(resultado));
            }
        }
        
        
        
        if (event.getSource() == btnIgual){
            digitos2 = Double.parseDouble(mostrar.getText());
            
            switch(operacion){
                case 1: this.resultado = digitos1 + digitos2;
                    mostrar.setText(String.valueOf(resultado));
                    break;
                case 2: this.resultado = digitos1 - digitos2;
                    mostrar.setText(String.valueOf(resultado));
                    break;
                case 3: this.resultado = digitos1 * digitos2;
                    mostrar.setText(String.valueOf(resultado));
                    break;
                case 4: this.resultado = (double)digitos1 / digitos2;
                    mostrar.setText(String.valueOf(resultado));
                    break;
            }
            contadorDigitos = 0;
        }
        
        ///////////MOSTRAR OPERACIONES EN VIVO/////////////////
        
        if(contadorDigitos==1){
            
            digitos2 = Double.parseDouble(mostrar.getText());
            
            switch(operacion){
                case 1: this.resultado = digitos1 + digitos2;
                    mostrarDos.setText(String.valueOf(resultado));
                    break;
                case 2: this.resultado = digitos1 - digitos2;
                    mostrarDos.setText(String.valueOf(resultado));
                    break;
                case 3: this.resultado = digitos1 * digitos2;
                    mostrarDos.setText(String.valueOf(resultado));
                    break;
                case 4: this.resultado = (double)digitos1 / digitos2;
                    mostrarDos.setText(String.valueOf(resultado));
                    break;
        }
            
        }
        
        
    }
      
      
      
    private void mostrarAdvertencia(){
        Alert alert=new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Nombre del estudiante");
        alert.setHeaderText(null);
        alert.setContentText("Milton Alejandro Alvarado Fiallos");
        alert.showAndWait();
    }
          

}
