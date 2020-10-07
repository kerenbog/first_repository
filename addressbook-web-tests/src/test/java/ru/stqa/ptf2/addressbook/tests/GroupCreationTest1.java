package ru.stqa.ptf2.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.ptf2.addressbook.model.GroupData;

public class GroupCreationTest1 extends TestBase{


  @Test
  public void testGroupCreation() throws Exception {

    app.getGroupHelper().initGroupCreation();
    app.getGroupHelper().fillGroupForm(new GroupData("test1", "test2", "test3"));
    app.getGroupHelper().submitGroupCreation();
    app.getNavigationHelper().goToGroupPage();

  }



}
