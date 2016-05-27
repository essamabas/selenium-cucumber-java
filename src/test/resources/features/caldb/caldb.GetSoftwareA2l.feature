Feature: CalDB extract certain Software Calibration Data
        As a user I should able to login into CalDB and extract certain Software Calibration Data.
 
 Scenario: I Navigate to CalDB
        Given I navigate to Url "http://caldb.getrag.com/CalDB/faces/application.jsp"

 Scenario: I Enter CalDB Authentication-Credentials        
        Given Authenication dialog with title "Authentication Required" is present
        #@Todo: Still need to modify AutoIt Script to read Credentials
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
        #Enter Transmission Name
        And I expand Tree element contains text "xDCT150/300/500"
        #Enter Cusomter Name        
        And I expand Tree element contains text "BM"
        #Enter Platform Name
        And I expand Tree element contains text "BN2020"
        #Enter Strategy Name
        And I expand Tree element contains text "300BM_AA310X0_PD_BB2"
        #Enter Application Name
        And I expand Tree element contains text "V1 005B"
        #Enter Calibration Name
        And I click Tree element contains text "V1.1 _01"


Scenario: I Export a certain Software Calibration Data
		Given Scenerio "I Navigate to a certain Software-Version" is passed
		When I switch to main content
        Then I switch to frame "main"
        And I switch to frame "contentframe"
		And I wait 10 seconds for element having xpath "//input[contains(@title, 'Export as CSV file')]" to display
		And I forcefully click on element having xpath "//input[contains(@title, 'Export as CSV file')]"
		And I wait for 10 sec

 Scenario: CalDB CSV File Save Dialog
 		Given Scenerio "I Export a certain Software Calibration Data" is passed
 		#@ToDo: Extend Save Dialog with RegExTitle - AuToIT
        When Save dialog with title "(?i).*?Opening.*(..)" is present
        Then I save file to workspace
        And I may see error alert text contains "Es trat ein Fehler bei der Datenbetragung auf."
        And I wait for 5 sec
                		
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

 Scenario: CalDB A2l File Save Dialog
 		Given Scenerio "I Navigate to a certain Software A2l-File Download Area" is passed
 		#@ToDo: Extend Save Dialog with RegExTitle - AuToIT
        When Save dialog with title "(?i).*?Opening.*(..)" is present
        Then I save file to workspace
        And I wait for 5 sec

 Scenario: Extract downloaded files from Workspace
 		Given Scenerio "CalDB A2l File Save Dialog" is passed
 		And Scenerio "CalDB CSV File Save Dialog" is passed
        Then I rename file in workspace "*.a2l" to "variant.a2l"
        And I rename file in workspace "*.csv" to "CalDB_Export.csv"
        And I wait for 5 sec
                        		        
Scenario: I close CalDB
        Given I wait for 5 sec
        Then I close browser