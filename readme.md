Check list for Authorization https://profile.esto.ee/login/password


| No  |                                         Check name                                         |   Status   | 
|-----|:------------------------------------------------------------------------------------------:|:----------:|
| 1   |                       Opportunity to select any authorization method                       |    Pass    |
| 2   | Additional required fields appear after pressing on methods: Mobile ID, Smart ID, Password |    Pass    |
| 3   |                After pressing on "ID card" button, informative text appears                |    Pass    |
| 4   |                                  Every field is editable                                   |    Pass    |
| 5   |                    Notification when trying to login with empty fields                     |    Pass    |
| 6   |             When you click on the fields, the color of the frame becomes black             |    Pass    |
| 7   |                            Log in button is visible and active                             |    Pass    |
| 8   |            Login with correct data for Mobile ID method(mobile number, ID code)            |  Skipped   |
| 9   |                    Login with correct data for Smart ID method(ID code)                    |  Skipped   |
| 10  |              Login with correct data for Password method(Username, Password)               |  Skipped   |
| 11  |                                    Login using ID card                                     |  Skipped   |
| 12  |           Error pop-up if login with incorrect credentials for Mobile ID  method           |    Pass    |
| 13  |               Error POP-up message if login without card for ID Card method                |    Pass    |
| 14  |            Error message if login with incorrect credentials for login/password            |    Pass    |
| 15  |     Error message when user enter incorrect ID code for Smart ID authorization method      |    Pass    |


Check list for automation tests 

| No  |                             Check name                              |    Status    | 
|-----|:-------------------------------------------------------------------:|:------------:|
| 1   |     Every method is visible. User is able to select any method.     |     Pass     |
| 2   |             Every method have additional fields of text             |     Pass     |
|     |                                                                     |     Pass     |
| 4   |         Notification when trying to login with empty fields         |     Pass     |
| 5   | When you click on the fields, the color of the frame becomes black  |     Pass     |
| 6   |                 Log in button is visible and active                 |     Pass     |