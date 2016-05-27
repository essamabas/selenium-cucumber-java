Feature: CalDB extract certain Software Calibration Data
        As a user I should able to login into CalDB and extract certain Software Calibration Data.
 
 Scenario: I Navigate to CalDB
        Given I navigate to Url "http://caldb.getrag.com/CalDB/faces/application.jsp"

 Scenario: I Enter CalDB Authentication-Credentials        
        Given Authenication dialog with title "Authentication Required" is present
        When I Enter Authenication Credentials "username","password"
        Then Authentication dialog is dismissed
        And I wait for 5 sec
        
 Scenario: I dismiss different Browser than IE Alert                
        Given I should see alert text contains "This application has been developed and tested for Internet Explorer"
        Then I dismiss alert
 
Scenario: I Navigate to a certain Software-Version
		Given Scenerio "I Navigate to CalDB" is passed
		Then I switch to window having title "CalDB"
        And I switch to main content
        And I switch to frame "main"
        And I switch to frame "treeframe"
		And I wait 10 seconds for element having xpath "//a[contains(text(),'xDCT150/300/500')]/../../td/a/img" to be enabled        
        And I forcefully click on element having xpath "//a[contains(text(),'xDCT150/300/500')]/../../td/a/img"
		And I forcefully click on element having xpath "//a[contains(text(),'BM')]/../..//td/a/img"
		And I forcefully click on element having xpath "//a[contains(text(),'BN2020')]/../..//td/a/img"
		And I forcefully click on element having xpath "//a[contains(text(),'300BM_AA310X0_PD_BB2')]/../..//td/a/img"
		And I forcefully click on element having xpath "//a[contains(text(),'V1 005B')]/../..//td/a/img"
		And I forcefully click on element having xpath "//a[contains(text(),'V1.1 _01')]"

Scenario: I Export a certain Software Calibration Data
		Given Scenerio "I Navigate to a certain Software-Version" is passed
		When I switch to main content
        Then I switch to frame "main"
        And I switch to frame "contentframe"
		And I wait 10 seconds for element having xpath "//input[contains(@title, 'Export as CSV file')]" to display
		And I forcefully click on element having xpath "//input[contains(@title, 'Export as CSV file')]"
		And I wait for 10 sec
		
Scenario: I Navigate to a certain Software A2l-File Download Area
		Given Scenerio "I Navigate to a certain Software-Version" is passed
		When I switch to main content
        Then I switch to frame "main"
        And I switch to frame "contentframe"
		And I wait 10 seconds for element having xpath "//input[contains(@title, 'Download hex- and a2l-file')]" to display
		And I forcefully click on element having xpath "//input[contains(@title, 'Download hex- and a2l-file')]"
		And I wait for 10 sec
		And I wait 20 seconds for element having xpath "//input[@id='form1FrmCalDownload:bnA2lDwnldFrmCD']" to display
		And I wait 20 seconds for element having xpath "//input[contains(@title, 'Download a2l file')]" to be enabled
		And I forcefully click on element having xpath "//input[contains(@title, 'Download a2l file')]"
		        
 Scenario: I accept Not released for public roads Alert
 		Given Scenerio "I Navigate to a certain Software A2l-File Download Area" is passed                
        When I should see alert text contains "Not released for public roads!"
        Then I accept alert


 Scenario: CalDB A2l File Save As Dialog
 		Given Scenerio "I Navigate to a certain Software A2l-File Download Area" is passed        
        When Save dialog with title "Enter name of file to save to…" is present
        Then I save file under "c:/tools/variant.a2l"
        And I wait for 5 sec
                        		        
Scenario: I close CalDB
        Given I wait for 5 sec
        Then I close browser