package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.Utils;

public class Homepage {

WebDriver driver;
Utils utils;
      By RegButton = By.className("ici-register");

      public void click(){
          utils = new Utils();
          Object regButton;
          utils.doclick(regButton);
      }

     public Homepage(WebDriver driver){
          this.driver = driver;
     }
}
