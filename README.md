#Esl Service Router
This project creates a web service entry point that acts as a facade to Esl AC/TH applications.  The initial goal is to allow fallback to existing, legacy Location Services (Eloc) whenever an error occurs.  

The application will be deployed as a Spring Boot jar file that when started will accept inbound Esl REST service requests and route (on normal execution) to Esl AC/TH.  If the normal execution path fails then fallback to legacy Location Service will take place.  

To start the router
---
`
java -jar target/esl-service-router-<version>.jar <args>
`

#Configuration
TODO - add configuration notes
1. AC/TH hosts/vip
2. Location Services hosts/vip
3. ???