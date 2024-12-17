### MyBatis를 이용하여 API 호출을 통한 users테이블에 CRUD 처리 방법
CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE
);

### getAllUsers 전체 조회
![image](https://github.com/user-attachments/assets/ad861b25-c834-4aa0-8e12-13423fd3f10e)

### getUserById 한건 조회
![image](https://github.com/user-attachments/assets/7e5c0a43-b89d-4ceb-a0db-af056467f111)

### addUser 사용자 추가
![image](https://github.com/user-attachments/assets/b6291573-56cb-45db-ba45-0221a436aaaa)

### updateUser 사용자 수정
![image](https://github.com/user-attachments/assets/b8ff8534-9fa2-47a5-a666-d407a0de5989)

### 주의 사항
mybatis 사용시 DTO를 넘겨서 처리 하거나 할때는 @Param과 user.name, user.email등 명확하게 처리 해야 오류가 없다.

다만 UserAPI_Mybatis1 에서는 리포지터리를 인터페이스로 만들었지만 UserAPI_Mybatis2번에서는 그냥 java class로 만들어서 하는 방법으로 할 예정이다.

