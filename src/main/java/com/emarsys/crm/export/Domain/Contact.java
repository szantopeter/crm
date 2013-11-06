package com.emarsys.crm.export.Domain;

/**
 * Created by szantopeter on 05/11/13.
 */
public class Contact {

    private String email;
    private Boolean optIn;
    private Boolean hello;
    private String firstName;
    private String lastName;


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean isOptIn() {
        return optIn;
    }

    public void setOptIn(Boolean optIn) {
        this.optIn = optIn;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Boolean getHello() {
        return hello;
    }

    public void setHello(Boolean hello) {
        this.hello = hello;
    }
}
