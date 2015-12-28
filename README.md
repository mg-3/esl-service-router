#Service Router
This project creates a web service entry point for REST services to fallback to a legacy SOAP request
on failure.  The SOAP response is mapped to a REST response to maintain compatibility.

The application is deployed as a Spring Boot jar file and forward all inbound requests to
 a new REST service environment.  On failures the router will fallback to legacy SOAP requests.

To start the router
---
`
java -jar target/esl-service-router-<version>.jar <args>
`

#Configuration
TODO - add configuration notes
1. Hosts/vips
2. ???