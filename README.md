# Notes:
This loan generates the payback plan for a houseloan. 
Input parameters:
- Loan amount
- Length of payment in terms of year
  Months is represented as decimal
  1 year and 6 months = 1.5
- Payment Scheme which is set to Monthly only
- Interest rate - no need to add the the percent
  1% = 1

Output:
- Payment plan that shows the amount 
  and interest that will be paid for the given month.The remaining balance is also shown.
- The user has the option to retry the 
  calculation again and again

# Technology used
Java was used as the back-end side
Spring Boot framework was used alongside Java
Thymeleaf was used for the front-end side

# To run
Go to HouseLoan > loancalc > src > main > java > com > example 
Run LoanCalcApplication.java
Go to localhost of the browser

Alternatively, go to link below to see the live website:
https://houseloan.herokuapp.com/