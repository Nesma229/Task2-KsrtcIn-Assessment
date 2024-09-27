public class Test extends BaseTest{

    @org.testng.annotations.Test
    public void validateReserveSeats() throws InterruptedException {


        homePage.fillLeavingFromAndGoingToFields1("CHIKKAMAGALURU","BENGALURU")
                .chooseArrivalDate()
                .clickSearchBuses()
                .clickSelectSeatsBtn()
                .selectSeat()
                .selectBoardingPointAndDroppingPoint()
                .clickProvidePassengerDetailsBtn()
                .fillCustomerDetails("6789125987","nesma@gmail.com")
                .clickProceedPassengerDetailsBtn()
                .fillPassengerDetails("Nesma","Female","25")
                .clickProceedToCheckOutBtn();



    }

}
