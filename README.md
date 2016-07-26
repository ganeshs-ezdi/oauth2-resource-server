# Spring OAuth2 Resource Server

### Usage
Run with maven spring-boot plugin's run `mvn spring-boot:run`.
Once you have the access token from oauth2-server you can store it in `TOKEN`
and then use the following command to access the resource:
`curl -H "Authorization: Bearer $TOKEN" http://localhost:9999/`.
