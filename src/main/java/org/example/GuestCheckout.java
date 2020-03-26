package org.example;

import org.openqa.selenium.By;

public class GuestCheckout extends Utils {
    LoadProp loadProp = new LoadProp();

    private By _checkoutguest = By.xpath("//input[@value='Checkout as Guest']");
    private By _firstname = By.xpath("//input[@name='BillingNewAddress.FirstName']");
    private String FirstName = "Boris";
    private By _lastname = By.xpath("//input[@name='BillingNewAddress.LastName']");
    private String LastName = "Jhonson";
    private By _email = By.id("BillingNewAddress_Email");
    private By _dropdown = By.id("BillingNewAddress_CountryId");
    //private By _dropdown = By.xpath("//select[@name='BillingNewAddress.CountryId']");
    private String _country = "United Kingdom";
    private By _city = By.xpath("//input[@name = 'BillingNewAddress.City']");
    private String city = "London";
    private By _address = By.xpath("//input[@name='BillingNewAddress.Address1']");
    private String address = "15 Talbot Road";

    private By _postcode = By.xpath("//*[@id=\"BillingNewAddress_ZipPostalCode\"]");
    private String postcode = "AL10 9DW";
    private By _phonenum = By.xpath("//input[@name='BillingNewAddress.PhoneNumber']");
    private String phonenum = "07897665623";
    private By _continue = By.xpath("//input[@onclick='Billing.save()']");


    public void checkoutAsGuest(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickOnElement(_checkoutguest);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        sendText(_firstname,FirstName);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        sendText(_lastname,LastName);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        sendText(_email,"premchopda1@gmail.com");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        selectTextFromDropDown(_dropdown,"233");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        sendText(_city,city);
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        sendText(_address,address);
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        sendText(_phonenum,phonenum);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickOnElement(_continue);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public String get_country() {
        return _country;
    }

    public void set_country(String _country) {
        this._country = _country;
    }
}
