# ms3_turner_alec
A simple API that takes parameters from the url and creates a range of numbers to check and see if each is a multiple of 3 or 7. 
Then, the flow outputs accordingly based on the results. Built with Mule and Java.

Testing:
Built in testing with the Anypoint Platform mocking service you can see various details about the API and test the API from within Studio.

Postman also works once you have the project running by calling: http://127.0.0.1:8081/api/numberRange/{floor}/{ceiling}
