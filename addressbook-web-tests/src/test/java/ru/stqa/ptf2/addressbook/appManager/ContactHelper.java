package ru.stqa.ptf2.addressbook.appManager;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContactHelper extends HelperBase {

    public ContactHelper(ChromeDriver wd) {
        super(wd);
    }

    public void addNewRegistry(String firstName, String middleName, String lastName, String address, String mobile, String email, int bday, int bmonth, int byear) {
        type(By.name("firstname"),firstName);
        type(By.name("middlename"),middleName);
        type(By.name("lastname"),lastName);
        type(By.name("address"),address);
        type(By.name("mobile"),mobile);
        type(By.name("email"),email);
        //type(By.name("bday"),bday);
        //type(By.name("bmonth"),bmonth);
        //type(By.name("byear"),byear);

    }
    public void submitNewContactAdding() {
        click(By.name("submit"));

    }

}



