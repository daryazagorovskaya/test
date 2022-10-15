module com.example.saucedemo {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.seleniumhq.selenium.api;
    requires org.seleniumhq.selenium.chrome_driver;
    requires io.github.bonigarcia.webdrivermanager;
    requires junit;
    requires org.testng;


    opens com.example.saucedemo to javafx.fxml;
    exports com.example.saucedemo;
}