# MapOfCulturalHeritage

https://www.erdcloud.com/d/NgmS4iWyRNXB3kFhi

### 기능

- 문화재 서비스
    - 문화재 검색
    - 시대별 문화재 보기
    - 문화재 설명 태그화
  
- 사용자 개인 서비스
    - 검색 이력
    - 열람 이력
    - 문화재 추천
  

- 구글 로그인
- 카카오맵 API
- Etri 형태소 분석 API

### 기술셋

- Spring Boot 2.6.7
- Java 11
- gradle
- Thymeleaf
- Spring Data JPA
- QueryDsl
- AOP
- Spring Security
- Spring Batch
- Spring Validation

### Tools
- Intellij
- Dbeaver

#### Repository 구성
SampleRepository extends JpaRepository, SampleRepositoryCustom // 인터페이스
SampleRepositoryImpl implements SampleRepositoryCustom // 구현클래스
- SampleRepository 가 JpaRepository, SampleRepositoryCustom 를 다중 상속하며 spring data jpa와 querydsl 용도 레포지토리로 나눈다.
- SampleRepositoryImpl는 SampleRepositoryCustom의 구현 클래스로 querydsl 용도이다.


http://localhost:8080/swagger-ui/index.html

TRACE  <  DEBUG  <  INFO  <  WARN  <  ERROR

AOP
- 로그 관리
- 로그인 관리

jwt 참고
https://webfirewood.tistory.com/115