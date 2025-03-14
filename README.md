# Spring Boot JWT Authentication Demo

Spring Boot와 JWT를 사용한 인증 시스템 데모 프로젝트입니다.

## 기술 스택

- Java 17
- Spring Boot 3.4.3
- Spring Security
- JWT (JSON Web Token)
- H2 Database
- Gradle

## 주요 기능

- 회원가입
- 로그인 (JWT 토큰 발급)
- JWT 토큰 기반 인증
- 보호된 API 엔드포인트

## 프로젝트 실행 방법

### 사전 요구사항

- JDK 17 이상
- Gradle

### 프로젝트 클론 및 실행

1. 프로젝트 클론
```cmd
git clone https://github.com/your-username/springboot-jwt-demo.git](https://github.com/wowDongHyeon/jwt.git
cd springboot-jwt-demo
```

2. 프로젝트 빌드
```cmd
gradlew.bat build
```

3. 애플리케이션 실행
```cmd
gradlew.bat bootRun
```

### API 테스트

1. 회원가입 (CMD)
```cmd
curl -X POST http://localhost:8080/api/auth/signup -H "Content-Type: application/json" -d "{\"username\":\"testuser\",\"email\":\"test@example.com\",\"password\":\"password123\"}"
```

2. 로그인 (CMD)
```cmd
curl -X POST http://localhost:8080/api/auth/signin -H "Content-Type: application/json" -d "{\"username\":\"testuser\",\"password\":\"password123\"}"
```

3. 보호된 엔드포인트 테스트 (CMD)
```cmd
curl -X GET http://localhost:8080/api/protected-endpoint -H "Authorization: Bearer {로그인_응답으로_받은_토큰}"
```


### H2 데이터베이스 콘솔

- URL: http://localhost:8080/h2-console
- JDBC URL: jdbc:h2:mem:testdb
- Username: sa
- Password: (비워두기)

## 프로젝트 구조

```
src/main/java/com/example/demo/
├── config/
│   └── SecurityConfig.java
├── controller/
│   ├── AuthController.java
│   └── TestController.java
├── model/
│   └── User.java
├── payload/
│   ├── LoginRequest.java
│   ├── SignUpRequest.java
│   └── JwtAuthenticationResponse.java
├── repository/
│   └── UserRepository.java
└── security/
    ├── JwtTokenProvider.java
    ├── JwtAuthenticationFilter.java
    ├── CustomUserDetailsService.java
    └── UserPrincipal.java
```

## 라이선스

이 프로젝트는 MIT 라이선스를 따릅니다.
