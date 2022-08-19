module com.calc.calculadora {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.calc.calculadora to javafx.fxml;
    exports com.calc.calculadora;
}
