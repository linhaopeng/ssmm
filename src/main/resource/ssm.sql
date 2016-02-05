drop database if exists ssm;
create database ssm;
use ssm;

-- 用户表
DROP TABLE IF EXISTS t_user;
create table t_user(
	id int not null auto_increment,
	/* 用户名 */
	name varchar(10) NOT NULL UNIQUE,
	/* 密码 */
	password varchar(40),
    primary key(id)
);
create table test(
    id int PRIMARY KEY auto_increment,
    text varchar(100) 
);
insert into t_user(id,name,password) values (1,'测试','123456');
insert into test(text) values ("adsfadsf");