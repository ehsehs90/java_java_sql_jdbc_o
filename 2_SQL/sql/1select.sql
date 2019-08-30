select * from DEPT;
select * from emp;


select ename as 사원명, job as 업무, sal as 급여 from emp;

insert into emp values
(9999, 'JAVA', 'CLERK', 7782, sysdate, 900, null, 10);

insert into emp values
(8888, 'JOVA', 'CLERK', 7782, sysdate, 900, null, 10);

insert into emp values
(9999, 'JAVA', 'CLERK', 7782, to_date('05/13/19', 'mm/dd/yy')
, 900, null, 10);