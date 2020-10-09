package ru.stqa.ptf2.addressbook.appManager;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationHelper extends HelperBase{

    public NavigationHelper(ChromeDriver wd) {
        super(wd);
    }

    public void goToGroupPage() {
        click(By.linkText("groups"));
    }

    public void goToHomepage() {
        click(By.linkText("home"));

    }


    public void goToAddNewPage() {
        click(By.linkText("add new"));
        wd.findElement(By.linkText("add new")).click();
    }
}
