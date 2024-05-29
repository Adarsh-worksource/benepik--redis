# benepik--redis


Initialize the Project:

Use Spring Initializr to create a new Spring Boot project.
Add dependencies: Spring Web, Spring Security, Spring Data Redis, and Spring Boot DevTools.
Download and Open the Project:

Download the generated project, unzip it, and open it in your preferred IDE.
Step 2: Configure Redis
Add Redis Configuration:

Create a configuration class to set up the Redis connection factory and Redis template. This includes setting the serializers for key and value to StringRedisSerializer.
Configure Redis Properties:

Add the necessary Redis properties (host, port, etc.) to the application.properties or application.yml file.
Step 3: Implement Encryption and Decryption
Create a Utility Class for SHA-256 Encryption:
Implement a utility class to handle the encryption of data using the SHA-256 algorithm.
This class should provide a method to convert input strings to their SHA-256 hashed equivalents.
Step 4: Implement the REST Controller
Create the Controller Class:

Implement a REST controller with a POST endpoint that accepts encrypted payloads.
In the controller, handle the encryption of incoming data and store it in Redis with a 5-minute expiry.
Ensure proper error handling for decryption failures or invalid payloads.
Set Data Expiry:

Use the RedisTemplate to set an auto-expiry feature of 5 minutes for the stored data.
Step 5: Secure the API with Spring Security
Configure Spring Security:
Set up Spring Security to secure your REST endpoint.
Implement basic authentication, JWT, or any other preferred method of securing the API.
Create a security configuration class to define security rules, such as which endpoints require authentication.
Step 6: Implement Error Handling
Global Exception Handling:
Implement a global exception handler using @ControllerAdvice to handle any exceptions that may occur during the encryption, decryption, or storage process.
Provide meaningful error responses to the client in case of decryption failures or invalid payloads.
