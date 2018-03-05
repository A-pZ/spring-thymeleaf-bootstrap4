# spring-thymeleaf-bootstrap4
spring-boot 1.5.x with bootstrap4.0

This project made by SpringBoot 1.5.10 with several components and minimum settings.

* Thymeleaf 3.0.9
* Bootstrap 4.0.0
* H2DB
* flyway 5.0.3

First: Set up Flyway from maven. 

mvn flyway:clean flyway:migrate 

This command create table definition and datas into H2DB, database file output 'target' directory.

Next, SpringBoot Applicaion run, access http://127.0.0.1:8080

