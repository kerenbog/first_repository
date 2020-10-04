package ru.stqa.ptf2.addressbook;

public class AddNewContactData {
    private final String firstName;
    private final String middleName;
    private final String lastName;
    private final String address;
    private final String mobile;
    private final String email;
    private final String bday;
    private final String bMonth;
    private final String bYear;


    public AddNewContactData(String middleName, String lastName, String address, String mobile, String email, String bday, String bMonth, String bYear, String firstName) {
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

    public String getBday() {
        return bday;
    }

    public String getbMonth() {
        return bMonth;
    }

    public String getbYear() {
        return bYear;
    }


}
