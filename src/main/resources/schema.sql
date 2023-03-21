DROP TABLE IF EXISTS USERS;
CREATE TABLE USERS (
                                 ID INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
                                 FIRST_NAME VARCHAR(16) NOT NULL,
                                 LAST_NAME VARCHAR(16) NOT NULL,
                                 EMAIL VARCHAR(50) NOT NULL,
                                 BIO VARCHAR(500) NOT NULL,
                                 CREATED_ON TIMESTAMP NOT NULL DEFAULT NOW(),
                                 UPDATED_ON TIMESTAMP
);