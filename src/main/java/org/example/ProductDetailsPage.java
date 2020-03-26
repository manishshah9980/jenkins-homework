package org.example;

import org.openqa.selenium.By;

public class ProductDetailsPage extends Utils {

    private By _friendEmail = By.xpath("//input[@class='friend-email']");
    private By _yourEmail = By.xpath("//input[@class='your-email']");
    private By _noteBooks = By.linkText("Notebooks");
    private By _appleMac = By.linkText("Apple MacBook Pro 13-inch");
    private By _email = By.xpath("//input[contains(@onclick,'/productemailafriend/')]");
    // private By _friendEmail = By.xpath("//input[@class='friend-email']");
    //private By _yourEmail = By.xpath("//input[@class='your-email']");
    private By _writeInTextBox = By.xpath("//*[@id='PersonalMessage']");
    private By _sendEmail = By.xpath("//input[@name = 'send-email']");

    public void VerifyUserIsOnComputerCatagoryPage() {
        assertURL("computers");
    }
    // user click on notebooks
    public void userClickOnNoteBook() {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        clickOnElement(_noteBooks);
    }

    // user click on apple mac
    public void userClickOnAppleMac() {

        clickOnElement(_appleMac);
    }

    //Refer to friend
    public void UserReferToFriend() {
        //click email refer
        clickOnElement(_email);
        //Enter friend email id
        EnterText(_friendEmail, "abc@gmail.com");
        //enter your email id
        EnterText(_yourEmail, "def@test1.com");
        //click send email button
        clickOnElement(_sendEmail);
    }

}