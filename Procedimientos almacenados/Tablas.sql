create database prueba;
use prueba;
create table GENDERS(  
  Id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(50) NOT NULL,
  salary VARCHAR(50) NOT NULL);


create table JOBS(  
  Id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(50) NOT NULL,
  salary VARCHAR(50) NOT NULL);

create table EMPLOYEES(  
  Id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  GENDER_ID int not null ,
  JOB_ID int not null ,
  FOREIGN KEY(GENDER_ID) REFERENCES GENDERS(Id),
  FOREIGN KEY(JOB_ID) REFERENCES JOBS(Id),
  NAME VARCHAR(50) NOT NULL,
  LASTNAME VARCHAR(50) NOT NULL,
  BIRTHDATE DATE
);
create table EMPLOYEE_WORKED_HOURS(  
  Id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  EMPLOYEE_ID int not null ,
  FOREIGN KEY(EMPLOYEE_ID) REFERENCES EMPLOYEES(Id),
  WORKED_HOURS INT NOT NULL,
  WORKED_DATE DATE);
