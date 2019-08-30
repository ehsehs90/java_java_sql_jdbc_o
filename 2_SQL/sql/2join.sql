select * from emp;
select ename, hiredate, to_char(hiredate, 'yyyy') from emp;

select ename, hiredate, substr(hiredate, 1, 2) as year from emp;

select round(sal) from emp;

select ename, deptno, sal, decode(deptno, 10, sal*1.1,
										  20, sal*1.2,
										  30, sal*1.3) as decode from emp;
										  
select ename, nvl2(mgr, 'o', 'x') as exst 
from emp;										

select ename, job, d.deptno, dname, loc
from emp e, dept d
where e.deptno = d.deptno;


select ename, job, dname, sal
from emp e inner join dept d
on e.deptno = d.deptno
where e.sal >=2000;

select ename, job, dname, sal
from emp e, dept d
where e.deptno = d.deptno and sal > 2000;

select ename, job, d.deptno, dname, loc
from emp e, dept d
where e.deptno(+) = d.deptno;

select ename, job, d.deptno, dname, loc
from emp e right outer join dept d
on e.deptno = d.deptno;

select * from SALGRADE;

select ename, sal, grade
from emp, SALGRADE
where sal between losal and hisal;

select ename, sal, grade
from emp join SALGRADE
on sal between losal and hisal;

select e1.ename as ename, nvl(e2.ename, 'null') as mgr
from emp e1 left outer join emp e2
on e1.mgr = e2.empno;

select e1.ename as ename, nvl(e2.ename, 'null') as mgr
from emp e1 right outer join emp e2
on e1.mgr = e2.empno;

select e1.ename as ename, nvl(e2.ename, '<<CEO>>') as mgr
from emp e1, emp e2
where e1.mgr = e2.empno(+);

select ename
from emp
where mgr is null;

select e1.ename, e1.hiredate, e2.ename, e2.hiredate
from emp e1 left join emp e2
on e1.mgr = e2.empno
where e1.hiredate < e2.hiredate;

select e1.ename, e1.hiredate, e2.ename, e2.hiredate
from emp e1 left join emp e2
on e1.mgr = e2.empno
where e1.sal > e2.sal; 

select deptno, sum(sal), count(*), round(avg(sal), 2) as avg
from emp
group by deptno;

select emp.deptno, dname, count(*), avg(sal) as avl
from emp, dept
where emp.deptno = dept.deptno and sal >= 2000
group by emp.deptno, dname
order by avl;

select emp.deptno, dname, count(*), avg(sal) as avg
from emp, dept
where emp.deptno = dept.deptno
group by emp.deptno, dname
having avg(sal) > 2000
order by avg;

select ename, dname, sal, grade
from emp, dept, salgrade sg
where emp.deptno = dept.deptno and (sal between sg.losal and sg.hisal);

select e.ename, d.dname, e.sal, sg.grade
from emp e 
	join dept d on e.deptno = d.deptno
	join salgrade sg on e.sal between sg.losal and sg.hisal;

select *
from emp
where sal > (select sal
			from emp
			where ename = 'FORD');
			
select deptno, ename, sal
from emp e
where sal < (select avg(sal) from emp where deptno = e.deptno);
			
select rownum, ename, job, sal
from (select * from emp order by sal)
where rownum < 4;

select deptno, ename, sal 
from emp e
where sal = (select max(sal) from emp where deptno = e.deptno)
order by deptno;

select deptno, ename, sal
from emp e
where sal = (select max from (select deptno, max(sal) as max from emp group by deptno) where deptno = e.deptno);



insert into emp values(
9999, 'JAVA', 'CLERK', 7934, to_date('80/09/17', 'yy-mm-dd'), null, null, 20);


select * from emp where lower(ename) like lower('%j%');



