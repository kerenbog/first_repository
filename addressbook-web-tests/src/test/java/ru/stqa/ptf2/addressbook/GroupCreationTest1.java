package ru.stqa.ptf2.addressbook;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class GroupCreationTest1 extends TestBase{


  @Test
  public void testGroupCreation() throws Exception {

    initGroupCreation();
    fillGroupForm(new GroupData("test1", "test2", "test3"));
    submitGroupCreation();
    goToGroupPage();
    wd.findElement(By.linkText("Logout")).click();
  }

}
