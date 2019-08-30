1. 
select e.employee_id, e.first_name, d.department_name, m.first_name
from employees e, employees m, departments d
where e.manager_id = m.employee_id and e.department_id = d.department_id;


2.
select e.last_name, e.salary
from employees e, employees m
where e.manager_id = m.employee_id and e.salary > m.salary;


3.
select e.first_name, e.last_name, e.salary
from employees e, jobs j
where e.job_id = j.job_id
and j.job_title = 'Sales Representative'
and e.salary between 9000 and 10000;


4.
select e.employee_id, e.last_name, e.hire_date
from employees e, employees m
where e.manager_id = m.employee_id and e.hire_date < m.hire_date;


5.
select distinct j.job_title, d.department_name
from jobs j, job_history jh, departments d
where j.job_id = jh.job_id and jh.department_id = d.department_id;


6.
select hire_month as "월", count(*) as "입사자수"
from (select to_char(hire_date, 'mm') as hire_month from employees)
group by hire_month
order by hire_month;


7.
select e.first_name, e.hire_date, e.manager_id, m.first_name
from employees e, employees m
where e.manager_id = m.employee_id(+)
and to_char(e.hire_date, 'yy') = '08';


8.
select e.first_name, e.salary, d.department_name
from employees e, departments d
where e.department_id = d.department_id
and d.department_name = 'Sales';


9.
select e.hire_date, e.employee_id, e.first_name, e.last_name, nvl(d.department_name, '<NOT ASSIGNED>')
from employees e, departments d
where e.department_id = d.department_id(+)
and to_char(e.hire_date, 'yy') = '07';


10.
select e.first_name, e.hire_date, e.manager_id, m.first_name
from employees e, employees m
where e.manager_id = m.employee_id(+)
and e.hire_date between to_date('03/01/01', 'yy/mm/dd') and to_date('03/12/31', 'yy/mm/dd');





	  