Feature:Login
Scenario: Sucessfully Login with valid credential

Given user launch chrome Browser
When user openurl "https://admin-demo.nopcommerce.com/login"
And user enter email as"admin@yourstore.com" and password as "admin"
And click on login
Then page Title should be "Dashboard/noCommerce administration"
And close browser