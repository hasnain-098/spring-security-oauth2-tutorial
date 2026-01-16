# Spring Boot OAuth2 Demo

**Description:**  
A Spring Boot project exploring OAuth 2.0 authentication using Spring Security.  
Implemented as part of a learning exercise by following a YouTube tutorial.

## Features

- GitHub OAuth2 login
- Google OAuth2 login
- Secured and public endpoints
- Environment variable support for client secrets
- Spring Boot 3.5.x compatible

## Endpoints

- `/` → Public endpoint, accessible without login  
- `/secured` → Protected endpoint, requires OAuth2 login

## Setup

1. Clone the repository:

```bash
git clone https://github.com/hasnain-098/spring-security-oauth2-tutorial
cd spring-security-oauth2-tutorial
```

2. Create a `.env` file and add your secrets:
``` bash
GITHUB_CLIENT_SECRET=your_github_client_secret
GOOGLE_CLIENT_SECRET=your_google_client_secret
```

3. Run the application:
``` bash
./mvnw spring-boot:run
```

4. Open in browser:
 - Public: `http://localhost:8080/`
 - Secured: `http://localhost:8080/secured` → redirects to GitHub/Google login

## Notes

- Ensure your OAuth credentials are configured in the Google Cloud Console or GitHub Developer settings.
- For fresh sessions during development, use incognito mode or configure logout properly.

## License
This project is for **learning purposes only**, following the YouTube tutorial:   
[Youtube Tutorial](https://youtu.be/us0VjFiHogo?si=L6HmZzmg2kIPqLLy)
