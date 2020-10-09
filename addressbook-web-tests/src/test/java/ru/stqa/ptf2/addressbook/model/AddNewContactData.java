package ru.stqa.ptf2.addressbook.model;

public class AddNewContactData {
    private final String firstName;
    private final String middleName;
    private final String lastName;
    private final String address;
    private final String mobile;
    private final String email;
    private final int bday;
    private final int bMonth;
    private final int bYear;


    public AddNewContactData(String middleName, String lastName, String address, String mobile, String email, int bday, int bMonth, int bYear, String firstName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.address = address;
        this.mobile = mobile;
        this.email = email;
        this.bday = bday;
        this.bMonth = bMonth;
        this.bYear = bYear;

    }
    public String getFirstName() {
        return firstName;
    }
    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getMobile() {
        return mobile;
    }

    public String getEmail() {
        return email;
    }

    public int getBday() {
        return bday;
    }

    public int getbMonth() {
        return bMonth;
    }

    public int getbYear() {
        return bYear;
    }


}
