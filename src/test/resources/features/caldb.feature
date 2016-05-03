Feature: CalDB extract certain SW Calibration Data
        As a user I should able to login into CalDB and extract certain SW Calibration Data.
 
 Scenario: I login with valid credential
        Given I navigate to "http://caldb.getrag.com/CalDB/faces/application.jsp"
        Then I switch to frame "treeframe"
        Then I forcefully click on element having xpath "//a[contains(text(),'xDCT150/300/500')]/../../td/a/img"
		Then I forcefully click on element having xpath "//a[contains(text(),'BM')]/../../td/a/img"
		//img/following:://a[contains(text(),'xDCT150/300/500')]
		Then I forcefully click on element having xpath ".//*[@id='nodeIcon2']"        
        And I enter "test@gmail.com" into input field having id "Email"
        Then I click on element having id "next"
        Then element having class "error-msg" should be present
        And I wait for 15 sec
        Then I close browser