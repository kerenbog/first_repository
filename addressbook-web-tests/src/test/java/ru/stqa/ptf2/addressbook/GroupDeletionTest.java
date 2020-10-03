package ru.stqa.ptf2.addressbook;

import org.testng.annotations.Test;

public class GroupDeletionTest extends TestBase{

  @Test
  public void testGroupDeletion() throws Exception {

    selectGroup();
    deleteSelectedGroups();
    goToGroupPage();
  }


}


