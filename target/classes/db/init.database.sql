CREATE DATABASE if not exists gym;
USE gym;

CREATE TABLE Customer
(
    customer_id INT NOT NULL
    ,customer_name VARCHAR(50)
    ,customer_surname VARCHAR(50)
    ,customer_card INT
    ,customer_age INT
    ,customer_sex VARCHAR(10)
    ,customer_priority VARCHAR (10)
    ,customer_company int not null unique
    ,start_date DATETIME
    ,exp_date DATETIME
    ,membership_id VARCHAR(40) not null unique
    ,activity_type  VARCHAR(40) not null unique
    ,extra VARCHAR(20) not null unique
    ,PRIMARY KEY customer_pk (customer_id)
    ,CONSTRAINT companies_customer_fk FOREIGN KEY (customer_company) REFERENCES Companies(company_id)
    ,CONSTRAINT membership_customer FOREIGN KEY (membership_id) REFERENCES membership(membership_id)


);

CREATE TABLE Companies
(   company_id int
    ,company_name varchar(70)
    ,reg_nr INT
    ,PRIMARY KEY companies_pk (company_id)
);

CREATE table Employees

(
    employee_id int
    ,employee_name VARCHAR(40)
    ,employee_surname VARCHAR(40)
    ,privilege_id INT not null unique
    ,manager_type VARCHAR(40) not null unique
    ,PRIMARY KEY Employees_pk (employee_id)
    ,CONSTRAINT employees_customer_id_pk FOREIGN KEY(employee_id) references Customer(customer_id)
);

CREATE TABLE membership
(
    membership_id int
    ,membership_type VARCHAR(40)
    ,price INT
    ,PRIMARY KEY membership_pk (membership_type)
);

CREATE TABLE activity_type
(
    activity_type VARCHAR(40)
    ,Trainer INT
    ,PRIMARY KEY activity_type_pk (activity_type)
    ,CONSTRAINT activity_type_customer_id_fk FOREIGN KEY (Trainer) REFERENCES Employees(employee_id)
    ,CONSTRAINT activity_type_customer_activity_type_fk FOREIGN KEY (activity_type) REFERENCES Customer(activity_type)
);

CREATE TABLE extra
(
    extra_id varchar(20)
    ,primary key extra_id_pk (extra_id)
    ,CONSTRAINT extra_customer_fk FOREIGN KEY (extra_id) REFERENCES Customer (extra)
);





