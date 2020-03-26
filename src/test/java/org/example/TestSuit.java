package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class TestSuit extends BaseTest {

    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationResultPage registrationResultPage = new RegistrationResultPage();
    DigitalDownload digitalDownloads = new DigitalDownload();
    ProductComparision productComparision = new ProductComparision();
    ProductDetailsPage productDetailsPage = new ProductDetailsPage();
    SoftAssert softAssert = new SoftAssert();
    JewelryPage jewelryPage = new JewelryPage();
    GuestCheckout guestCheckout = new GuestCheckout();
    ShippingAddress shippingAddress = new ShippingAddress();
    PaymentMethod paymentMethod = new PaymentMethod();
    Computers computers = new Computers();
    Categories categories = new Categories();
    NewsPage newsPage = new NewsPage();
    CheckOutResult checkOutResult = new CheckOutResult();
    ChangeCurrency changeCurrency = new ChangeCurrency();
    AddToCartButton addToCartButton = new AddToCartButton();


    @Test
    public void userShouldAbleToRegisterSuccessfully() {

        //click on register button
        homePage.clickOnRegisterButton();
        //fill up registration details
        registrationPage.verifyUserIsOnRegisterPage();
        registrationPage.userEntersRegistrationDetails();
        //verify registrations success message
        registrationResultPage.verifyUserSeeRegistrationSuccessMessage();
        browserSelector.quitBrowser();
    }

    @Test
    public void userShouldAbleToCompareTwoProducts() {
        homePage.clickOnDigitalDownloads();
        // digitalDownloads.verifyUserIsOnDigitalDownloadsPage();
        digitalDownloads.chooseProductsToCompare();
        productComparision.verifyUserOnProductComparisonPage();
    }

     @Test
       public void nonRegisterUserShouldNotBeAbleToReferAProductToAFriend() {
        homePage.ClickOnComputerCategory();
        productDetailsPage.VerifyUserIsOnComputerCatagoryPage();
        productDetailsPage.userClickOnNoteBook();
        productDetailsPage.userClickOnAppleMac();
        productDetailsPage.UserReferToFriend();
    }

//    @Test
//    public void RegisteredUserShouldBeAbleToReferAFriendSuccessfully() {
//        homePage.clickOnRegisterButton();
//        registrationPage.verifyUserIsOnRegisterPage();
//        registrationPage.userEntersRegistrationDetails();
//        registrationResultPage.verifyUserSeeRegistrationSuccessMessage();
//        homePage.ClickOnComputerCategory();
//        categories.verifyUserOnComputerCategoriesPage();
//        categories.userClickOnNoteBook();
//        categories.userClickOnAppleMac();
//        categories.userReferToFriend();
//    }

    @Test
    public void UserShouldBeAbleToSortProductHighToLowByPrice() {
        homePage.ClickOnComputerCategory();
        computers.UserClickOnNotebook();
        computers.SelectDropdownByVisibleText();
    }

//    @Test
//    public void verifyGetThePriceForEachProduct() {
//        List<WebElement> price = driver.findElements(By.xpath("//span[@class='price actual-price']"));
//        for (WebElement we : price) {
//            System.out.println(we.getText());
//            System.out.println("------------");
//            // will check just one line and comeout.
//            softAssert.assertTrue(we.getText().contains("$"), "£ not found in" + we.getText());
//        }
//        softAssert.assertAll();
//        System.out.println("My name is Dars");
//    }

//    @Test
//    public void verifyGuestUserShouldBeAbleToCheckOutSuccessfully() {
//    homePage.clickOnJewelryCategory();
//    jewelryPage.verifyUserIsOnJewelryPage();
//    jewelryPage.addToCartProduct();
//    guestCheckout.checkoutAsGuest();
//    shippingAddress.userShippingAddress();
//    paymentMethod.userChoosePaymentMethod();
//   }


//    @Test
//    public void guestUserShouldBeAbleToAddNewComment(){
//        newsPage.userClickOnDetails();
//        newsPage.verifysuccessmessageofcomment();
//    }

//    @Test
//    public void userShouldBeAbleToVerifyCurrency(){
//        changeCurrency.userselectcurrency();
//        changeCurrency.verifyCurrency();
//    }
//    @Test
//    public void verifyAddToCartButtonIsPresentOnAllFeaturedProduct(){
//        addToCartButton.verifyAddToCartButton();
//
//    }

}