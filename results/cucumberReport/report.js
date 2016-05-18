$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/caldb/caldb.GetSoftwareA2l.feature");
formatter.feature({
  "line": 1,
  "name": "CalDB extract certain Software Calibration Data",
  "description": "      As a user I should able to login into CalDB and extract certain Software Calibration Data.",
  "id": "caldb-extract-certain-software-calibration-data",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "I Navigate to CalDB",
  "description": "",
  "id": "caldb-extract-certain-software-calibration-data;i-navigate-to-caldb",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I navigate to Url \"http://caldb.getrag.com/CalDB/faces/application.jsp\"",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "http://caldb.getrag.com/CalDB/faces/application.jsp",
      "offset": 19
    }
  ],
  "location": "UserStepDefinitions.navigate_to_url(String)"
});
formatter.result({
  "duration": 22103934341,
  "status": "passed"
});
formatter.after({
  "duration": 210787,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "I Enter CalDB Authentication-Credentials",
  "description": "",
  "id": "caldb-extract-certain-software-calibration-data;i-enter-caldb-authentication-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "Authenication dialog with title \"Authentication Required\" is present",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I Enter Authenication Credentials \"username\",\"password\"",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Authentication dialog is dismissed",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I wait for 5 sec",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Authentication Required",
      "offset": 33
    }
  ],
  "location": "UserStepDefinitions.authenication_dialog_with_title_is_present(String)"
});
formatter.result({
  "duration": 155130,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "username",
      "offset": 35
    },
    {
      "val": "password",
      "offset": 46
    }
  ],
  "location": "UserStepDefinitions.i_Enter_Authenication_Credentials(String,String)"
});
formatter.result({
  "duration": 3605883335,
  "status": "passed"
});
formatter.match({
  "location": "UserStepDefinitions.authentication_dialog_is_dismissed()"
});
formatter.result({
  "duration": 4999747371,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 11
    }
  ],
  "location": "PredefinedStepDefinitions.wait(String)"
});
formatter.result({
  "duration": 5000448416,
  "status": "passed"
});
formatter.after({
  "duration": 99868,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "I dismiss different Browser than IE Alert",
  "description": "",
  "id": "caldb-extract-certain-software-calibration-data;i-dismiss-different-browser-than-ie-alert",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "I should see alert text contains \"This application has been developed and tested for Internet Explorer\"",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "I dismiss alert",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "This application has been developed and tested for Internet Explorer",
      "offset": 34
    }
  ],
  "location": "UserStepDefinitions.check_alert_text(String)"
});
formatter.result({
  "duration": 68339703,
  "status": "passed"
});
formatter.match({
  "location": "PredefinedStepDefinitions.dismiss_alert()"
});
formatter.result({
  "duration": 44643495,
  "status": "passed"
});
formatter.after({
  "duration": 93947,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "I Navigate to a certain Software-Version",
  "description": "",
  "id": "caldb-extract-certain-software-calibration-data;i-navigate-to-a-certain-software-version",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 18,
  "name": "Scenerio \"I Navigate to CalDB\" is passed",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "I switch to window having title \"CalDB\"",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "I switch to main content",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I switch to frame \"main\"",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I switch to frame \"treeframe\"",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I wait 10 seconds for element having xpath \"//a[contains(text(),\u0027xDCT150/300/500\u0027)]/../../td/a/img\" to be enabled",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I forcefully click on element having xpath \"//a[contains(text(),\u0027xDCT150/300/500\u0027)]/../../td/a/img\"",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I forcefully click on element having xpath \"//a[contains(text(),\u0027BM\u0027)]/../..//td/a/img\"",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I forcefully click on element having xpath \"//a[contains(text(),\u0027BN2020\u0027)]/../..//td/a/img\"",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I forcefully click on element having xpath \"//a[contains(text(),\u0027300BM_AA310X0_PD_BB2\u0027)]/../..//td/a/img\"",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "I forcefully click on element having xpath \"//a[contains(text(),\u0027V1 005B\u0027)]/../..//td/a/img\"",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "I forcefully click on element having xpath \"//a[contains(text(),\u0027V1.1 _01\u0027)]\"",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "I Navigate to CalDB",
      "offset": 10
    }
  ],
  "location": "UserStepDefinitions.scenario_is_passed(String)"
});
formatter.result({
  "duration": 173287,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "CalDB",
      "offset": 33
    }
  ],
  "location": "PredefinedStepDefinitions.switch_to_window_by_title(String)"
});
formatter.result({
  "duration": 76108045,
  "status": "passed"
});
formatter.match({
  "location": "PredefinedStepDefinitions.switch_to_default_content()"
});
formatter.result({
  "duration": 9774770,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "main",
      "offset": 19
    }
  ],
  "location": "UserStepDefinitions.i_switch_to_frame(String)"
});
formatter.result({
  "duration": 71147437,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "treeframe",
      "offset": 19
    }
  ],
  "location": "UserStepDefinitions.i_switch_to_frame(String)"
});
formatter.result({
  "duration": 21734780,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "10",
      "offset": 7
    },
    {
      "val": "xpath",
      "offset": 37
    },
    {
      "val": "//a[contains(text(),\u0027xDCT150/300/500\u0027)]/../../td/a/img",
      "offset": 44
    }
  ],
  "location": "PredefinedStepDefinitions.wait_for_ele_to_click(String,String,String)"
});
formatter.result({
  "duration": 35471088,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "xpath",
      "offset": 37
    },
    {
      "val": "//a[contains(text(),\u0027xDCT150/300/500\u0027)]/../../td/a/img",
      "offset": 44
    }
  ],
  "location": "PredefinedStepDefinitions.click_forcefully(String,String)"
});
formatter.result({
  "duration": 28134978,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "xpath",
      "offset": 37
    },
    {
      "val": "//a[contains(text(),\u0027BM\u0027)]/../..//td/a/img",
      "offset": 44
    }
  ],
  "location": "PredefinedStepDefinitions.click_forcefully(String,String)"
});
formatter.result({
  "duration": 35261880,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "xpath",
      "offset": 37
    },
    {
      "val": "//a[contains(text(),\u0027BN2020\u0027)]/../..//td/a/img",
      "offset": 44
    }
  ],
  "location": "PredefinedStepDefinitions.click_forcefully(String,String)"
});
formatter.result({
  "duration": 291738360,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "xpath",
      "offset": 37
    },
    {
      "val": "//a[contains(text(),\u0027300BM_AA310X0_PD_BB2\u0027)]/../..//td/a/img",
      "offset": 44
    }
  ],
  "location": "PredefinedStepDefinitions.click_forcefully(String,String)"
});
formatter.result({
  "duration": 70532443,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "xpath",
      "offset": 37
    },
    {
      "val": "//a[contains(text(),\u0027V1 005B\u0027)]/../..//td/a/img",
      "offset": 44
    }
  ],
  "location": "PredefinedStepDefinitions.click_forcefully(String,String)"
});
formatter.result({
  "duration": 32424540,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "xpath",
      "offset": 37
    },
    {
      "val": "//a[contains(text(),\u0027V1.1 _01\u0027)]",
      "offset": 44
    }
  ],
  "location": "PredefinedStepDefinitions.click_forcefully(String,String)"
});
formatter.result({
  "duration": 128888957,
  "status": "passed"
});
formatter.after({
  "duration": 105393,
  "status": "passed"
});
formatter.scenario({
  "line": 31,
  "name": "I Export a certain Software Calibration Data",
  "description": "",
  "id": "caldb-extract-certain-software-calibration-data;i-export-a-certain-software-calibration-data",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 32,
  "name": "Scenerio \"I Navigate to a certain Software-Version\" is passed",
  "keyword": "Given "
});
formatter.step({
  "line": 33,
  "name": "I switch to main content",
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "I switch to frame \"main\"",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "I switch to frame \"contentframe\"",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "I wait 10 seconds for element having xpath \"//input[contains(@title, \u0027Export as CSV file\u0027)]\" to display",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "I forcefully click on element having xpath \"//input[contains(@title, \u0027Export as CSV file\u0027)]\"",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "I wait for 10 sec",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "I Navigate to a certain Software-Version",
      "offset": 10
    }
  ],
  "location": "UserStepDefinitions.scenario_is_passed(String)"
});
formatter.result({
  "duration": 206445,
  "status": "passed"
});
formatter.match({
  "location": "PredefinedStepDefinitions.switch_to_default_content()"
});
formatter.result({
  "duration": 12508294,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "main",
      "offset": 19
    }
  ],
  "location": "UserStepDefinitions.i_switch_to_frame(String)"
});
formatter.result({
  "duration": 15872207,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "contentframe",
      "offset": 19
    }
  ],
  "location": "UserStepDefinitions.i_switch_to_frame(String)"
});
formatter.result({
  "duration": 15949181,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "10",
      "offset": 7
    },
    {
      "val": "xpath",
      "offset": 37
    },
    {
      "val": "//input[contains(@title, \u0027Export as CSV file\u0027)]",
      "offset": 44
    }
  ],
  "location": "PredefinedStepDefinitions.wait_for_ele_to_display(String,String,String)"
});
formatter.result({
  "duration": 3811757828,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "xpath",
      "offset": 37
    },
    {
      "val": "//input[contains(@title, \u0027Export as CSV file\u0027)]",
      "offset": 44
    }
  ],
  "location": "PredefinedStepDefinitions.click_forcefully(String,String)"
});
formatter.result({
  "duration": 153245947,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "10",
      "offset": 11
    }
  ],
  "location": "PredefinedStepDefinitions.wait(String)"
});
formatter.result({
  "duration": 10000090789,
  "status": "passed"
});
formatter.after({
  "duration": 119999,
  "status": "passed"
});
formatter.scenario({
  "line": 40,
  "name": "I Navigate to a certain Software A2l-File Download Area",
  "description": "",
  "id": "caldb-extract-certain-software-calibration-data;i-navigate-to-a-certain-software-a2l-file-download-area",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 41,
  "name": "Scenerio \"I Navigate to a certain Software-Version\" is passed",
  "keyword": "Given "
});
formatter.step({
  "line": 42,
  "name": "I switch to main content",
  "keyword": "When "
});
formatter.step({
  "line": 43,
  "name": "I switch to frame \"main\"",
  "keyword": "Then "
});
formatter.step({
  "line": 44,
  "name": "I switch to frame \"contentframe\"",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "I wait 10 seconds for element having xpath \"//input[contains(@title, \u0027Download hex- and a2l-file\u0027)]\" to display",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "I forcefully click on element having xpath \"//input[contains(@title, \u0027Download hex- and a2l-file\u0027)]\"",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "I wait for 10 sec",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "I wait 20 seconds for element having xpath \"//input[@id\u003d\u0027form1FrmCalDownload:bnA2lDwnldFrmCD\u0027]\" to display",
  "keyword": "And "
});
formatter.step({
  "line": 49,
  "name": "I wait 20 seconds for element having xpath \"//input[contains(@title, \u0027Download a2l file\u0027)]\" to be enabled",
  "keyword": "And "
});
formatter.step({
  "line": 50,
  "name": "I forcefully click on element having xpath \"//input[contains(@title, \u0027Download a2l file\u0027)]\"",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "I Navigate to a certain Software-Version",
      "offset": 10
    }
  ],
  "location": "UserStepDefinitions.scenario_is_passed(String)"
});
formatter.result({
  "duration": 193813,
  "status": "passed"
});
formatter.match({
  "location": "PredefinedStepDefinitions.switch_to_default_content()"
});
formatter.result({
  "duration": 14436564,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "main",
      "offset": 19
    }
  ],
  "location": "UserStepDefinitions.i_switch_to_frame(String)"
});
formatter.result({
  "duration": 18674021,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "contentframe",
      "offset": 19
    }
  ],
  "location": "UserStepDefinitions.i_switch_to_frame(String)"
});
formatter.result({
  "duration": 21845699,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "10",
      "offset": 7
    },
    {
      "val": "xpath",
      "offset": 37
    },
    {
      "val": "//input[contains(@title, \u0027Download hex- and a2l-file\u0027)]",
      "offset": 44
    }
  ],
  "location": "PredefinedStepDefinitions.wait_for_ele_to_display(String,String,String)"
});
formatter.result({
  "duration": 48174775,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "xpath",
      "offset": 37
    },
    {
      "val": "//input[contains(@title, \u0027Download hex- and a2l-file\u0027)]",
      "offset": 44
    }
  ],
  "location": "PredefinedStepDefinitions.click_forcefully(String,String)"
});
formatter.result({
  "duration": 78014604,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "10",
      "offset": 11
    }
  ],
  "location": "PredefinedStepDefinitions.wait(String)"
});
formatter.result({
  "duration": 10000503679,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "20",
      "offset": 7
    },
    {
      "val": "xpath",
      "offset": 37
    },
    {
      "val": "//input[@id\u003d\u0027form1FrmCalDownload:bnA2lDwnldFrmCD\u0027]",
      "offset": 44
    }
  ],
  "location": "PredefinedStepDefinitions.wait_for_ele_to_display(String,String,String)"
});
formatter.result({
  "duration": 54582079,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "20",
      "offset": 7
    },
    {
      "val": "xpath",
      "offset": 37
    },
    {
      "val": "//input[contains(@title, \u0027Download a2l file\u0027)]",
      "offset": 44
    }
  ],
  "location": "PredefinedStepDefinitions.wait_for_ele_to_click(String,String,String)"
});
formatter.result({
  "duration": 34676491,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "xpath",
      "offset": 37
    },
    {
      "val": "//input[contains(@title, \u0027Download a2l file\u0027)]",
      "offset": 44
    }
  ],
  "location": "PredefinedStepDefinitions.click_forcefully(String,String)"
});
formatter.result({
  "duration": 73041366,
  "status": "passed"
});
formatter.after({
  "duration": 63947,
  "status": "passed"
});
formatter.scenario({
  "line": 52,
  "name": "I accept Not released for public roads Alert",
  "description": "",
  "id": "caldb-extract-certain-software-calibration-data;i-accept-not-released-for-public-roads-alert",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 53,
  "name": "Scenerio \"I Navigate to a certain Software A2l-File Download Area\" is passed",
  "keyword": "Given "
});
formatter.step({
  "line": 54,
  "name": "I should see alert text contains \"Not released for public roads!\"",
  "keyword": "When "
});
formatter.step({
  "line": 55,
  "name": "I accept alert",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "I Navigate to a certain Software A2l-File Download Area",
      "offset": 10
    }
  ],
  "location": "UserStepDefinitions.scenario_is_passed(String)"
});
formatter.result({
  "duration": 97104,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Not released for public roads!",
      "offset": 34
    }
  ],
  "location": "UserStepDefinitions.check_alert_text(String)"
});
formatter.result({
  "duration": 58077043,
  "status": "passed"
});
formatter.match({
  "location": "PredefinedStepDefinitions.handle_alert()"
});
formatter.result({
  "duration": 55248782,
  "status": "passed"
});
formatter.after({
  "duration": 147235,
  "status": "passed"
});
formatter.scenario({
  "line": 57,
  "name": "Save CalDB A2l File",
  "description": "",
  "id": "caldb-extract-certain-software-calibration-data;save-caldb-a2l-file",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 58,
  "name": "Scenerio \"I Navigate to a certain Software A2l-File Download Area\" is passed",
  "keyword": "Given "
});
formatter.step({
  "line": 59,
  "name": "Save dialog with title \"Enter name of file to save to�\" is present",
  "keyword": "When "
});
formatter.step({
  "line": 60,
  "name": "I save file under \"c:/tools/variant.a2l\"",
  "keyword": "Then "
});
formatter.step({
  "line": 61,
  "name": "I wait for 5 sec",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "I Navigate to a certain Software A2l-File Download Area",
      "offset": 10
    }
  ],
  "location": "UserStepDefinitions.scenario_is_passed(String)"
});
formatter.result({
  "duration": 91578,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Enter name of file to save to�",
      "offset": 24
    }
  ],
  "location": "UserStepDefinitions.save_dialog_with_title_is_present(String)"
});
formatter.result({
  "duration": 58815,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "c:/tools/variant.a2l",
      "offset": 19
    }
  ],
  "location": "UserStepDefinitions.i_save_file_under(String)"
});
formatter.result({
  "duration": 10665149708,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 11
    }
  ],
  "location": "PredefinedStepDefinitions.wait(String)"
});
formatter.result({
  "duration": 5000167761,
  "status": "passed"
});
formatter.after({
  "duration": 4154169,
  "status": "passed"
});
formatter.scenario({
  "line": 63,
  "name": "I close CalDB",
  "description": "",
  "id": "caldb-extract-certain-software-calibration-data;i-close-caldb",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 64,
  "name": "I wait for 5 sec",
  "keyword": "Given "
});
formatter.step({
  "line": 65,
  "name": "I close browser",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 11
    }
  ],
  "location": "PredefinedStepDefinitions.wait(String)"
});
formatter.result({
  "duration": 5000785519,
  "status": "passed"
});
formatter.match({
  "location": "PredefinedStepDefinitions.close_browser()"
});
formatter.result({
  "duration": 1153131475,
  "status": "passed"
});
formatter.after({
  "duration": 76973,
  "status": "passed"
});
});