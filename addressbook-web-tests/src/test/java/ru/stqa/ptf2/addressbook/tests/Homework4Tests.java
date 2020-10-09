package ru.stqa.ptf2.addressbook.tests;

import org.testng.annotations.Test;

public class Homework4Tests extends TestBase{




  @Test
  public void testHomework4() throws Exception {
    app.getNavigationHelper().goToAddNewPage();
    app.getContactHelper().addNewRegistry( "aaa","bbb","ccc","balfur 1","123456789","mail@mail.com",15,02,1987);
    app.getContactHelper().submitNewContactAdding();
    app.getNavigationHelper().goToHomepage();
  }


}
