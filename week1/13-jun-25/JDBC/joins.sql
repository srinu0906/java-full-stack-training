create database admin1;
create table student(rollno int,fname varchar(20),age int,deptid int);
select * from student;
insert into student (rollno,fname,age,deptid) values (101,'om',35,2);
insert into student (rollno,fname,age,deptid) values (105,'amol',33,1);
insert into student (rollno,fname,age,deptid) values (109,'sai',32,3);
insert into student (rollno,fname,age,deptid) values (104,'sayali',29,1);
 
create table dept(deptid int,dname varchar(20),cname varchar(20));
select * from dept;
insert into dept (deptid,dname,cname) values (1,'Computer',"GEC");
insert into dept (deptid,dname,cname) values (2,'IT',"GEC");
insert into dept (deptid,dname,cname) values (3,'EnTC',"GEC");
 
select s.rollno,s.fname,d.dname from student as s inner join dept as d on s.deptid = d.deptid;

select s.rollno,s.fname,d.dname from student as s left join dept as d on s.deptid = d.deptid;
 
select s.rollno,s.fname,d.dname from student as s right join dept as d on s.deptid = d.deptid;
 
select s.rollno,s.fname,d.dname from student as s join dept as d on s.deptid = d.deptid;

