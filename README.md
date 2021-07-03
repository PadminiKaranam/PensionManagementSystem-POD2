# PensionManagementSystem-POD2
Pension Management System - IJ016

Different Micro services are:
1. Process Pension MicroService
2. Pensioner Detail MicroService
3. Pension Disbursement MicroService
4. Authorization MicroService
5. Pension Management Portal

1. Authorization MicroSevice:
    This MicroService is to generate and validate the JWT token.
    a. To authenticate User:
         Step-1 : Select the POST method 
         Step-2 : Paste the URL  http://localhost:8084/authenticate
         Step-3 : Select Body and then select raw. Now, choose JSON and paste the JSON object given below in the body.
                   {
                       "username" : "admin",
                       "password" : "admin"
                   }
         Step-4 : Click on Send. A JWT token will be generated. Now, copy that token and paste it in the Bearer token.
    b. To Validate the token generated:
         Step-1 : Select the POST method 
         Step-2 : Paste the URL http://localhost:8084/validate 
         Step-3 : Select Body and then select raw. Now, choose JSON and paste the JSON object given below in the body.
                   {
                       "token": " "    // Paste the token within " " 
                   }
         Step-4 : Click on Send. If the token is valid then it will return true.
         
2. Pensioner Detail MicroService:
    This MicroService stores 20 Pensioner details in a CSV file. It will return the pensioner details based on AadharNumber.
    
    
    

